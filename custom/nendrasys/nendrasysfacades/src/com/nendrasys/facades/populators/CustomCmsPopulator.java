package com.nendrasys.facades.populators;

import com.nendrasys.core.model.ManufactureDetailsModel;
import com.nendrasys.facades.manufacturer.facade.data.ManufactureDetailsData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class CustomCmsPopulator implements Populator<ProductModel, ProductData> {

    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {

        if(productModel.getDetail()!=null)
        {
            productData.setCode(productModel.getCode());
            productData.setDescription(productModel.getDescription());
            productData.setName(productModel.getName());

        }

    }

}


