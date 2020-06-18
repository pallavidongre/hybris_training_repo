package com.nendrasys.storefront.controllers.productRegistration;

import com.nendrasys.facades.productRegistration.ProductRegisterationFacade;
import com.nendrasys.storefront.controllers.ControllerConstants;
import com.nendrasys.storefront.controllers.productRegistrationValidator.ProductRegistrationValidator;
import com.nendrasys.storefront.productRegistration.ProductRegistrationData;
import com.nendrasys.storefront.register.ProductRegistrationForm;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


@Controller
@RequestMapping("/product/register")
public class ProductRegistrationConroller extends AbstractPageController {
    @Resource(name = "productRegisterationFacade")
    ProductRegisterationFacade productRegisteration;
    @Resource(name = "productRegistrationValidator")
    ProductRegistrationValidator productRegistrationValidator;

    @RequestMapping(value = "/registrationForm", method = RequestMethod.GET)
    public String getRegistrationForm(final Model model) throws CMSItemNotFoundException {
        model.addAttribute(new ProductRegistrationForm());
        final ContentPageModel importCsvSavedCartPage = getContentPageForLabelOrId("registerProduct");
        storeCmsPageInModel(model, importCsvSavedCartPage);
        setUpMetaDataForContentPage(model, importCsvSavedCartPage);
        return getViewForPage(model);
    }


    @RequestMapping(value = "/submitRegistrationpage", method = RequestMethod.POST)
    public String getDetailsProdectRegistration(ProductRegistrationForm form, BindingResult bindingResult, final Model model) {
        System.out.println("above validator");
        productRegistrationValidator.validate(form, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute(form);
            return ControllerConstants.Views.Pages.Product.ProductRegistrationForm;
        }
        System.out.println("below validator");
        ProductRegistrationData productRegistrationData = new ProductRegistrationData();

        productRegistrationData.setCompanyName(form.getCompanyName());
        productRegistrationData.setProductId(form.getProductId());
        productRegistrationData.setQuantityNeeded(form.getQuantityNeeded());

        productRegisteration.register(productRegistrationData);

        return ControllerConstants.Views.Pages.Product.ProductRegistrationForm;

    }
}
