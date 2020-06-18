package com.nendrasys.storefront.controllers.latestProductCms;

import com.nendrasys.core.model.LatestProductCmsComponentModel;
import com.nendrasys.facades.customCmsComponent.CustomCmsComponentFacade;
import com.nendrasys.storefront.controllers.ControllerConstants;
import com.nendrasys.storefront.controllers.cms.AbstractAcceleratorCMSComponentController;
import de.hybris.platform.commercefacades.product.data.ProductData;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller("LatestProductCmsComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.LatestProducts)

public class LatestProductCmsComponentController  extends AbstractAcceleratorCMSComponentController<LatestProductCmsComponentModel> {

    @Resource(description = "customCmsComponentFacade")
    CustomCmsComponentFacade customCmsComponentFacade;

    @Override
    protected void fillModel(HttpServletRequest request, Model model, LatestProductCmsComponentModel component) {
        List<ProductData> productData = customCmsComponentFacade.gettingDetails();
        model.addAttribute("data", productData);
    }
//  @Resource(description = "customCmsComponentFacade")
}