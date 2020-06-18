package com.nendrasys.core.productRegistration;

import com.nendrasys.core.model.ProductRegistrationModel;
import de.hybris.platform.servicelayer.model.ModelService;

public class ProductRegistrationSercive implements ProductRegister {
    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    ModelService modelService;
    @Override
    public void register(ProductRegistrationModel productRegistrationModel) {
        getModelService().save(productRegistrationModel);
    }
}
