package com.nendrasys.facades.productRegistration;


import com.nendrasys.core.model.ProductRegistrationModel;
import com.nendrasys.core.productRegistration.ProductRegistrationSercive;
import com.nendrasys.storefront.productRegistration.ProductRegistrationData;
import com.sun.tools.xjc.model.Model;
import de.hybris.platform.servicelayer.model.ModelService;

public class ProductRegisterationFacade implements ProductRegister{
    ModelService modelService;

    public ProductRegistrationSercive getProductRegistrationSercive() {
        return productRegistrationSercive;
    }

    public void setProductRegistrationSercive(ProductRegistrationSercive productRegistrationSercive) {
        this.productRegistrationSercive = productRegistrationSercive;
    }

    ProductRegistrationSercive productRegistrationSercive;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public void  register(ProductRegistrationData productRegisterdata) {
        ProductRegistrationModel productRegistrationModel = getModelService().create(ProductRegistrationModel.class);
        productRegistrationModel.setCompanyName(productRegisterdata.getCompanyName());
        productRegistrationModel.setProductId(productRegisterdata.getProductId());
        productRegistrationModel.setQuantityNeeded(productRegisterdata.getQuantityNeeded());
        getProductRegistrationSercive().register(productRegistrationModel);

    }
}
