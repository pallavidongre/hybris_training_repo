package com.nendrasys.core.customProductRegistartionCronJobDao;

import com.nendrasys.core.model.ManufactureDetailsModel;
import com.nendrasys.core.model.ProductRegistrationModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.search.*;
import de.hybris.platform.servicelayer.search.impl.DefaultFlexibleSearchService;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Map;

public class CustomCronJobDao {
    StringBuilder query = new StringBuilder();
    public List<ProductRegistrationModel>querryInProductRegistration()
    {
        query.append(" SELECT {").append(ProductRegistrationModel.PRODUCTID).append("} ");
        query.append(" FROM {").append(ProductRegistrationModel._TYPECODE).append("} ");
        query.append(" WHERE {").append(ProductRegistrationModel.QUANTITYNEEDED).append("}>50");
        FlexibleSearchService flexibleSearchService = new DefaultFlexibleSearchService();

       FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        SearchResult<ProductRegistrationModel> searchResult = flexibleSearchService.search(searchQuery);
        List<ProductRegistrationModel> list= searchResult.getResult();
        return list;
    }

}
