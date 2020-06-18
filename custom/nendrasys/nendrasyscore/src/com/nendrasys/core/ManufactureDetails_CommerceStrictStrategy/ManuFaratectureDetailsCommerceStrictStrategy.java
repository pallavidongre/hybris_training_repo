package com.nendrasys.core.ManufactureDetails_CommerceStrictStrategy;

import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.impl.CommerceAddToCartStrictStrategy;
import de.hybris.platform.commerceservices.order.impl.DefaultCommerceAddToCartStrategy;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;

public class ManuFaratectureDetailsCommerceStrictStrategy extends DefaultCommerceAddToCartStrategy {
    ManufactureDetailsModel model;
    @Override

    protected void validateAddToCart(CommerceCartParameter parameters) throws CommerceCartModificationException {
        super.validateAddToCart(parameters);
        if(!model.getCanBeSold())
        {
            throw new CommerceCartModificationException("Insufficient stock level");
        }



    }
}
