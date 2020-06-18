package com.nendrasys.core.newCustomerCronJobDao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public class NewCustomerCustomerCronJobDao {

    private FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public List<CustomerModel> customerDetails()
    {

        StringBuilder query=new StringBuilder();
        query.append(" SELECT { ").append(CustomerModel.PK).append(" } ");
        query.append(" FROM { ").append(CustomerModel._TYPECODE).append(" } ");
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        SearchResult<CustomerModel> CustomerModelList = getFlexibleSearchService().search(searchQuery);
        return CustomerModelList.getResult();
    }
}
