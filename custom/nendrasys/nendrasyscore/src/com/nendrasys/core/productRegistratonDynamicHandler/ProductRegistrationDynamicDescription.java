package com.nendrasys.core.productRegistratonDynamicHandler;

import de.hybris.platform.cms2.model.restrictions.ProductRegistrationRestritionModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import de.hybris.platform.util.localization.Localization;

public class ProductRegistrationDynamicDescription implements DynamicAttributeHandler<String,ProductRegistrationRestritionModel> {

    @Override
    public String get(ProductRegistrationRestritionModel model) {
        String localizedString = Localization.getLocalizedString("type.ProductRegistrationRestriction.description.text");
        return localizedString;
    }

    @Override
    public void set(ProductRegistrationRestritionModel model, String s) {

    }

}
