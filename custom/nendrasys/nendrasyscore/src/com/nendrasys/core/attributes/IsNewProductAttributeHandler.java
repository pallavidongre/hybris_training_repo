package com.nendrasys.core.attributes;

import com.nendrasys.core.model.ElectronicsColorVariantProductModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class IsNewProductAttributeHandler implements DynamicAttributeHandler<Boolean, ElectronicsColorVariantProductModel> {
    @Override
    public Boolean get(final ElectronicsColorVariantProductModel model) {
        Date creationTime = model.getCreationtime();
        Date currentTime = new Date();
        final long difference =currentTime.getTime() - creationTime.getTime();
        final long days = TimeUnit.MILLISECONDS.toDays(difference);
        if(days<10){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void set(ElectronicsColorVariantProductModel model, Boolean aBoolean) {
    }
}