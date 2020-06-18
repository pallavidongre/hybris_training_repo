package com.nendrasys.facades.populators;


import com.nendrasys.core.jalo.ElectronicsColorVariantProduct;
import com.nendrasys.core.model.ApparelProductModel;
import com.nendrasys.core.model.ElectronicsColorVariantProductModel;
import com.nendrasys.facades.product.data.GenderData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.enums.Gender;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.variants.model.VariantProductModel;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductFlagPopulator implements Populator<ProductModel, ProductData>{


    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        if(source instanceof ElectronicsColorVariantProductModel){
            ElectronicsColorVariantProductModel product = (ElectronicsColorVariantProductModel) source;
            target.setFlags(product.getIsNewProduct());
        }
    }
}