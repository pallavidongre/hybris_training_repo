package com.nendrasys.facades.populators;


import com.nendrasys.core.model.ManufactureDetailsModel;
import com.nendrasys.facades.manufacturer.facade.data.ManufactureDetailsData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class ProductManufactureDetailsPopulator implements Populator<ProductModel, ProductData> {


    private Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsConverter;

    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        if(CollectionUtils.isNotEmpty(source.getManufactureDetails()))
        {
            List<ManufactureDetailsData> data = getManufactureDetailsConverter().convertAll(source.getManufactureDetails());
            System.out.println(data + "Data inside manufacture Details");
            target.setManafactureDetailsList(data);
        }
    }

    protected Converter<ManufactureDetailsModel, ManufactureDetailsData> getManufactureDetailsConverter() {
        return manufactureDetailsConverter;
    }

    @Required
    public void setManufactureDetailsConverter(Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsConverter) {
        this.manufactureDetailsConverter = manufactureDetailsConverter;
    }


}