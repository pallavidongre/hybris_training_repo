package com.nendrasys.facades.customCmsComponent;

import com.nendrasys.core.customCmsComponent.CustomCmsComponentDao;
import com.nendrasys.core.customCmsComponent.CustomCmsComponentService;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomCmsComponentFacade {
    private Converter<ProductModel, ProductData> productDataConverter;

    public Converter<ProductModel, ProductData> getProductDataConverter() {
        return productDataConverter;
    }

    public void setProductDataConverter(Converter<ProductModel, ProductData> productDataConverter) {
        this.productDataConverter = productDataConverter;
    }

    @Autowired
    CustomCmsComponentService customCmsComponentService;
    public List<ProductData> gettingDetails()
    {
      List<ProductModel> productModelList= customCmsComponentService.gettingDetails();

      return  getProductDataConverter().convertAll(productModelList);
    }

}
