/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.nendrasys.storefront.controllers.pages;

import com.google.common.collect.Maps;
import com.nendrasys.core.model.ManufactureDetailsModel;
import com.nendrasys.facades.manufacturer.facade.ManufactureDetailsFacade;
import com.nendrasys.facades.manufacturer.facade.data.ManufactureDetailsData;
import com.nendrasys.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorfacades.futurestock.FutureStockFacade;
import de.hybris.platform.acceleratorservices.controllers.page.PageType;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.impl.ProductBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.FutureStockForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.ReviewForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.ReviewValidator;
import de.hybris.platform.acceleratorstorefrontcommons.util.MetaSanitizerUtil;
import de.hybris.platform.acceleratorstorefrontcommons.util.XSSFilterUtil;
import de.hybris.platform.acceleratorstorefrontcommons.variants.VariantSortStrategy;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.servicelayer.services.CMSPageService;
import de.hybris.platform.commercefacades.order.data.ConfigurationInfoData;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.*;
import de.hybris.platform.commerceservices.url.UrlResolver;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.util.Config;
import javassist.NotFoundException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.*;


/**
 * Controller for product details page
 */
@Controller
@RequestMapping(value = "/**/p")
public class ProductPageController extends AbstractPageController {
    @SuppressWarnings("unused")
    private static final Logger LOG = Logger.getLogger(ProductPageController.class);

    /**
     * We use this suffix pattern because of an issue with Spring 3.1 where a Uri value is incorrectly extracted if it
     * contains one or more '.' characters. Please see https://jira.springsource.org/browse/SPR-6164 for a discussion on
     * the issue and future resolution.
     */
    private static final String PRODUCT_CODE_PATH_VARIABLE_PATTERN = "/{productCode:.*}";
    private static final String REVIEWS_PATH_VARIABLE_PATTERN = "{numberOfReviews:.*}";

    private static final String FUTURE_STOCK_ENABLED = "storefront.products.futurestock.enabled";
    private static final String STOCK_SERVICE_UNAVAILABLE = "basket.page.viewFuture.unavailable";
    private static final String NOT_MULTISKU_ITEM_ERROR = "basket.page.viewFuture.not.multisku";

    @Resource(name = "productDataUrlResolver")
    private UrlResolver<ProductData> productDataUrlResolver;

    @Resource(name = "productVariantFacade")
    private ProductFacade productFacade;

    @Resource(name = "productService")
    private ProductService productService;

    @Resource(name = "productBreadcrumbBuilder")
    private ProductBreadcrumbBuilder productBreadcrumbBuilder;

    @Resource(name = "cmsPageService")
    private CMSPageService cmsPageService;

    @Resource(name = "variantSortStrategy")
    private VariantSortStrategy variantSortStrategy;

    @Resource(name = "reviewValidator")
    private ReviewValidator reviewValidator;

    @Resource(name = "futureStockFacade")
    private FutureStockFacade futureStockFacade;

    @Resource(name = "defaultManufacureDetailsFacade")
    private ManufactureDetailsFacade manufactureDetailsFacade;

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
    public String productDetail(@PathVariable("productCode") String encodedProductCode, Model model,
                                HttpServletRequest request, HttpServletResponse response)
            throws CMSItemNotFoundException, UnsupportedEncodingException {
        System.out.println("Inside product Detail method///////////////");
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        List<ProductOption> extraOptions = Arrays.asList(ProductOption.VARIANT_MATRIX_BASE, ProductOption.VARIANT_MATRIX_URL,
                ProductOption.VARIANT_MATRIX_MEDIA);

        ProductData productData = productFacade.getProductForCodeAndOptions(productCode, extraOptions);
        String redirection = checkRequestUrl(request, response, productDataUrlResolver.resolve(productData));
        if (StringUtils.isNotEmpty(redirection)) {
            return redirection;
        }

        updatePageTitle(productCode, model);


        populateProductDetailForDisplay(productCode, model, request, extraOptions);

        model.addAttribute(new ReviewForm());
        model.addAttribute("pageType", PageType.PRODUCT.name());
        model.addAttribute("futureStockEnabled", Boolean.valueOf(Config.getBoolean(FUTURE_STOCK_ENABLED, false)));

        String metaKeywords = MetaSanitizerUtil.sanitizeKeywords(productData.getKeywords());
        String metaDescription = MetaSanitizerUtil.sanitizeDescription(productData.getDescription());
        setUpMetaData(model, metaKeywords, metaDescription);
        return getViewForPage(model);
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/orderForm", method = RequestMethod.GET)
    public String productOrderForm(@PathVariable("productCode") String encodedProductCode, Model model,
                                   HttpServletRequest request, HttpServletResponse response) throws CMSItemNotFoundException {
        System.out.println("Inside product order form method///////////////");
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        List<ProductOption> extraOptions = Arrays.asList(ProductOption.VARIANT_MATRIX_BASE,
                ProductOption.VARIANT_MATRIX_PRICE, ProductOption.VARIANT_MATRIX_MEDIA, ProductOption.VARIANT_MATRIX_STOCK,
                ProductOption.URL);

        ProductData productData = productFacade.getProductForCodeAndOptions(productCode, extraOptions);
        updatePageTitle(productCode, model);

        populateProductDetailForDisplay(productCode, model, request, extraOptions);

        if (!model.containsAttribute(WebConstants.MULTI_DIMENSIONAL_PRODUCT)) {
            return REDIRECT_PREFIX + productDataUrlResolver.resolve(productData);
        }

        return ControllerConstants.Views.Pages.Product.OrderForm;
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/zoomImages", method = RequestMethod.GET)
    public String showZoomImages(@PathVariable("productCode") String encodedProductCode,
                                 @RequestParam(value = "galleryPosition", required = false) String galleryPosition, Model model) {
        System.out.println("Inside showZoomImages method///////////////");
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        ProductData productData = productFacade.getProductForCodeAndOptions(productCode,
                Collections.singleton(ProductOption.GALLERY));
        List<Map<String, ImageData>> images = getGalleryImages(productData);
        populateProductData(productData, model);
        if (galleryPosition != null) {
            try {
                model.addAttribute("zoomImageUrl", images.get(Integer.parseInt(galleryPosition)).get("zoom").getUrl());
            } catch (IndexOutOfBoundsException | NumberFormatException ex) {
                if (LOG.isDebugEnabled()) {
                    LOG.debug(ex);
                }
                model.addAttribute("zoomImageUrl", "");
            }
        }
        return ControllerConstants.Views.Fragments.Product.ZoomImagesPopup;
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/quickView", method = RequestMethod.GET)
    public String showQuickView(@PathVariable("productCode") String encodedProductCode, Model model,
                                HttpServletRequest request) {
        System.out.println(encodedProductCode + "////////////////////............//////////");
        System.out.println("isndie showQuickView Method");
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        ProductModel productModel = productService.getProductForCode(productCode);
        ProductData productData = productFacade.getProductForCodeAndOptions(productCode,
                Arrays.asList(ProductOption.BASIC, ProductOption.PRICE, ProductOption.SUMMARY, ProductOption.DESCRIPTION,
                        ProductOption.CATEGORIES, ProductOption.PROMOTIONS, ProductOption.STOCK, ProductOption.REVIEW,
                        ProductOption.VARIANT_FULL, ProductOption.DELIVERY_MODE_AVAILABILITY, ProductOption.FLAGS /*ProductOption.MANUFACTUREDETAILS*/));

        sortVariantOptionData(productData);
        populateProductData(productData, model);
        getRequestContextData(request).setProduct(productModel);

        return ControllerConstants.Views.Fragments.Product.QuickViewPopup;
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/review", method =
            {RequestMethod.GET, RequestMethod.POST})
    public String postReview(@PathVariable("productCode") String encodedProductCode, ReviewForm form,
                             BindingResult result, Model model, HttpServletRequest request, RedirectAttributes redirectAttrs)
            throws CMSItemNotFoundException {
        System.out.println("Inside postReview method///////////////");
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        getReviewValidator().validate(form, result);

        ProductData productData = productFacade.getProductForCodeAndOptions(productCode, null);
        if (result.hasErrors()) {
            updatePageTitle(productCode, model);
            GlobalMessages.addErrorMessage(model, "review.general.error");
            model.addAttribute("showReviewForm", Boolean.TRUE);
            populateProductDetailForDisplay(productCode, model, request, Collections.emptyList());
            storeCmsPageInModel(model, getPageForProduct(productCode));
            return getViewForPage(model);
        }

        ReviewData review = new ReviewData();
        review.setHeadline(XSSFilterUtil.filter(form.getHeadline()));
        review.setComment(XSSFilterUtil.filter(form.getComment()));
        review.setRating(form.getRating());
        review.setAlias(XSSFilterUtil.filter(form.getAlias()));
        productFacade.postReview(productCode, review);
        GlobalMessages.addFlashMessage(redirectAttrs, GlobalMessages.CONF_MESSAGES_HOLDER, "review.confirmation.thank.you.title");

        return REDIRECT_PREFIX + productDataUrlResolver.resolve(productData);
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/reviewhtml/"
            + REVIEWS_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
    public String reviewHtml(@PathVariable("productCode") String encodedProductCode,
                             @PathVariable("numberOfReviews") String numberOfReviews, Model model, HttpServletRequest request) {
        System.out.println("Inside reviewHtml method///////////////");
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        ProductModel productModel = productService.getProductForCode(productCode);
        List<ReviewData> reviews;
        ProductData productData = productFacade.getProductForCodeAndOptions(productCode,
                Arrays.asList(ProductOption.BASIC, ProductOption.REVIEW));

        if ("all".equals(numberOfReviews)) {
            reviews = productFacade.getReviews(productCode);
        } else {
            int reviewCount = Math.min(Integer.parseInt(numberOfReviews),
                    productData.getNumberOfReviews() == null ? 0 : productData.getNumberOfReviews().intValue());
            reviews = productFacade.getReviews(productCode, Integer.valueOf(reviewCount));
        }

        getRequestContextData(request).setProduct(productModel);
        model.addAttribute("reviews", reviews);
        model.addAttribute("reviewsTotal", productData.getNumberOfReviews());
        model.addAttribute(new ReviewForm());

        return ControllerConstants.Views.Fragments.Product.ReviewsTab;
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/writeReview", method = RequestMethod.GET)
    public String writeReview(@PathVariable("productCode") String encodedProductCode, Model model)
            throws CMSItemNotFoundException {
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        model.addAttribute(new ReviewForm());
        setUpReviewPage(model, productCode);
        return ControllerConstants.Views.Pages.Product.WriteReview;
    }

    protected void setUpReviewPage(Model model, String productCode) throws CMSItemNotFoundException {
        ProductData productData = productFacade.getProductForCodeAndOptions(productCode, null);
        String metaKeywords = MetaSanitizerUtil.sanitizeKeywords(productData.getKeywords());
        String metaDescription = MetaSanitizerUtil.sanitizeDescription(productData.getDescription());
        setUpMetaData(model, metaKeywords, metaDescription);
        storeCmsPageInModel(model, getPageForProduct(productCode));
        model.addAttribute("product", productFacade.getProductForCodeAndOptions(productCode, Arrays.asList(ProductOption.BASIC)));
        updatePageTitle(productCode, model);
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/writeReview", method = RequestMethod.POST)
    public String writeReview(@PathVariable("productCode") String encodedProductCode, ReviewForm form,
                              BindingResult result, Model model, HttpServletRequest request, RedirectAttributes redirectAttrs)
            throws CMSItemNotFoundException {
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        getReviewValidator().validate(form, result);

        ProductData productData = productFacade.getProductForCodeAndOptions(productCode, null);

        if (result.hasErrors()) {
            GlobalMessages.addErrorMessage(model, "review.general.error");
            populateProductDetailForDisplay(productCode, model, request, Collections.emptyList());
            setUpReviewPage(model, productCode);
            return ControllerConstants.Views.Pages.Product.WriteReview;
        }

        ReviewData review = new ReviewData();
        review.setHeadline(XSSFilterUtil.filter(form.getHeadline()));
        review.setComment(XSSFilterUtil.filter(form.getComment()));
        review.setRating(form.getRating());
        review.setAlias(XSSFilterUtil.filter(form.getAlias()));
        productFacade.postReview(productCode, review);
        GlobalMessages.addFlashMessage(redirectAttrs, GlobalMessages.CONF_MESSAGES_HOLDER, "review.confirmation.thank.you.title");

        return REDIRECT_PREFIX + productDataUrlResolver.resolve(productData);
    }

    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/futureStock", method = RequestMethod.GET)
    public String productFutureStock(@PathVariable("productCode") String encodedProductCode, Model model,
                                     HttpServletRequest request, HttpServletResponse response) throws CMSItemNotFoundException {
        String productCode = decodeWithScheme(encodedProductCode, UTF_8);
        boolean futureStockEnabled = Config.getBoolean(FUTURE_STOCK_ENABLED, false);
        if (futureStockEnabled) {
            List<FutureStockData> futureStockList = futureStockFacade.getFutureAvailability(productCode);
            if (futureStockList == null) {
                GlobalMessages.addErrorMessage(model, STOCK_SERVICE_UNAVAILABLE);
            } else if (futureStockList.isEmpty()) {
                GlobalMessages.addInfoMessage(model, "product.product.details.future.nostock");
            }

            populateProductDetailForDisplay(productCode, model, request, Collections.emptyList());
            model.addAttribute("futureStocks", futureStockList);

            return ControllerConstants.Views.Fragments.Product.FutureStockPopup;
        } else {
            return ControllerConstants.Views.Pages.Error.ErrorNotFoundPage;
        }
    }

    @ResponseBody
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/grid/skusFutureStock", method =
            {RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    public final Map<String, Object> productSkusFutureStock(FutureStockForm form, Model model) {
        String productCode = form.getProductCode();
        List<String> skus = form.getSkus();
        boolean futureStockEnabled = Config.getBoolean(FUTURE_STOCK_ENABLED, false);

        Map<String, Object> result = new HashMap<>();
        if (futureStockEnabled && CollectionUtils.isNotEmpty(skus) && StringUtils.isNotBlank(productCode)) {
            Map<String, List<FutureStockData>> futureStockData = futureStockFacade
                    .getFutureAvailabilityForSelectedVariants(productCode, skus);

            if (futureStockData == null) {
                // future availability service is down, we show this to the user
                result = Maps.newHashMap();
                String errorMessage = getMessageSource().getMessage(NOT_MULTISKU_ITEM_ERROR, null,
                        getI18nService().getCurrentLocale());
                result.put(NOT_MULTISKU_ITEM_ERROR, errorMessage);
            } else {
                for (Map.Entry<String, List<FutureStockData>> entry : futureStockData.entrySet()) {
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return result;
    }

    @ExceptionHandler(UnknownIdentifierException.class)
    public String handleUnknownIdentifierException(UnknownIdentifierException exception, HttpServletRequest request) {
        request.setAttribute("message", exception.getMessage());
        return FORWARD_PREFIX + "/404";
    }

    protected void updatePageTitle(String productCode, Model model) {
        storeContentPageTitleInModel(model, getPageTitleResolver().resolveProductPageTitle(productCode));
    }

    protected void populateProductDetailForDisplay(String productCode, Model model, HttpServletRequest request,
                                                   List<ProductOption> extraOptions) throws CMSItemNotFoundException {
        ProductModel productModel = productService.getProductForCode(productCode);

        getRequestContextData(request).setProduct(productModel);

        List<ProductOption> options = new ArrayList<>(Arrays.asList(ProductOption.VARIANT_FIRST_VARIANT, ProductOption.BASIC,
                ProductOption.URL, ProductOption.PRICE, ProductOption.SUMMARY, ProductOption.DESCRIPTION, ProductOption.GALLERY,
                ProductOption.CATEGORIES, ProductOption.REVIEW, ProductOption.PROMOTIONS, ProductOption.CLASSIFICATION,
                ProductOption.VARIANT_FULL, ProductOption.STOCK, ProductOption.VOLUME_PRICES, ProductOption.PRICE_RANGE,
                ProductOption.DELIVERY_MODE_AVAILABILITY));

        options.addAll(extraOptions);

        ProductData productData = productFacade.getProductForCodeAndOptions(productCode, options);

        sortVariantOptionData(productData);
        storeCmsPageInModel(model, getPageForProduct(productCode));
        populateProductData(productData, model);
        model.addAttribute(WebConstants.BREADCRUMBS_KEY, productBreadcrumbBuilder.getBreadcrumbs(productCode));

        if (CollectionUtils.isNotEmpty(productData.getVariantMatrix())) {
            model.addAttribute(WebConstants.MULTI_DIMENSIONAL_PRODUCT,
                    Boolean.valueOf(CollectionUtils.isNotEmpty(productData.getVariantMatrix())));
        }
    }

    protected void populateProductData(ProductData productData, Model model) {
        model.addAttribute("galleryImages", getGalleryImages(productData));
        model.addAttribute("product", productData);
        if (productData.getConfigurable()) {
            List<ConfigurationInfoData> configurations = productFacade.getConfiguratorSettingsForCode(productData.getCode());
            if (CollectionUtils.isNotEmpty(configurations)) {
                model.addAttribute("configuratorType", configurations.get(0).getConfiguratorType());
            }
        }
    }

    protected void sortVariantOptionData(ProductData productData) {
        if (CollectionUtils.isNotEmpty(productData.getBaseOptions())) {
            for (BaseOptionData baseOptionData : productData.getBaseOptions()) {
                if (CollectionUtils.isNotEmpty(baseOptionData.getOptions())) {
                    Collections.sort(baseOptionData.getOptions(), variantSortStrategy);
                }
            }
        }

        if (CollectionUtils.isNotEmpty(productData.getVariantOptions())) {
            Collections.sort(productData.getVariantOptions(), variantSortStrategy);
        }
    }

    protected List<Map<String, ImageData>> getGalleryImages(ProductData productData) {
        List<Map<String, ImageData>> galleryImages = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(productData.getImages())) {
            List<ImageData> images = new ArrayList<>();
            for (ImageData image : productData.getImages()) {
                if (ImageDataType.GALLERY.equals(image.getImageType())) {
                    images.add(image);
                }
            }
            Collections.sort(images, new Comparator<ImageData>() {
                @Override
                public int compare(ImageData image1, ImageData image2) {
                    return image1.getGalleryIndex().compareTo(image2.getGalleryIndex());
                }
            });

            if (CollectionUtils.isNotEmpty(images)) {
                addFormatsToGalleryImages(galleryImages, images);
            }
        }
        return galleryImages;
    }

    protected void addFormatsToGalleryImages(List<Map<String, ImageData>> galleryImages, List<ImageData> images) {
        int currentIndex = images.get(0).getGalleryIndex().intValue();
        Map<String, ImageData> formats = new HashMap<String, ImageData>();
        for (ImageData image : images) {
            if (currentIndex != image.getGalleryIndex().intValue()) {
                galleryImages.add(formats);
                formats = new HashMap<>();
                currentIndex = image.getGalleryIndex().intValue();
            }
            formats.put(image.getFormat(), image);
        }
        if (!formats.isEmpty()) {
            galleryImages.add(formats);
        }
    }

    protected ReviewValidator getReviewValidator() {
        return reviewValidator;
    }

    protected AbstractPageModel getPageForProduct(String productCode) throws CMSItemNotFoundException {
        ProductModel productModel = productService.getProductForCode(productCode);
        return cmsPageService.getPageForProduct(productModel, getCmsPreviewService().getPagePreviewCriteria());
    }


    /**
     * @param companyCode
     * @return ManufactureDetailsData in Json Format
     */
//
    @ResponseBody
    @RequestMapping(value = "/company/{companyCode}", method = RequestMethod.GET, produces = "application/json")
    public ManufactureDetailsData showManufactureDetails(@PathVariable String companyCode) {
        return  manufactureDetailsFacade.getForManufactureDetails(companyCode);
    }

    @ResponseBody
    @RequestMapping(value = "/company/manufactureDetailsList/data", method = RequestMethod.GET,produces = "application/json" )
    public List<ManufactureDetailsData> showManufactureDetailsList() {
        System.out.println("in controller");
        return manufactureDetailsFacade.manufactureDetailsModelListF();
    }
    @ResponseBody
    @RequestMapping(value = "/company/manufactureDetailsList/{start}/{range}", method = RequestMethod.GET,produces = "application/json" )
    public List<ManufactureDetailsData> showManufactureDetailsPages(@PathVariable("start") int start,@PathVariable("range") int range) {
        System.out.println("in controller abc");
        System.out.println(start+" abcdd"+range);
        return manufactureDetailsFacade.manufactureDetailsModelPage(start,range);
    }

}
