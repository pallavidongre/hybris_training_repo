package com.nendrasys.core.customCmsComponent;

import com.nendrasys.core.model.ProductRegistrationModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public class CustomCmsComponentDao {
  private   FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

       List<ProductModel> customerDetails()
    {

     StringBuilder query=new StringBuilder();
        query.append(" SELECT { ").append(ProductModel.PK).append(" } ");
        query.append(" FROM { ").append(ProductModel._TYPECODE).append(" } ");
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        SearchResult<ProductModel> productModelList = getFlexibleSearchService().search(searchQuery);
        return productModelList.getResult();
    }
}
