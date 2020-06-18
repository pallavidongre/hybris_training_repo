package com.nendrasys.core.manufacturedao.impl;

import com.nendrasys.core.jalo.ManufactureDetails;
import com.nendrasys.core.manufacturedao.ManufactureDetailsDao;
import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

/**
 * This class will get the ManufactureDetails from database using
 * flexible search query and returns list of ManufactureDetails
 */
public class DefaultManufactureDetailsDao extends AbstractItemDao implements ManufactureDetailsDao {


    /**
     * @param companyCode
     * @return List<ManufactureDetailsModel>
     */
    @Override
    public ManufactureDetailsModel findManufactureDetails(String companyCode) {
        System.out.println("MD dao");
        validateParameterNotNull(companyCode, "Company code must not be null!");
        StringBuilder query = new StringBuilder();
        query.append(" SELECT {").append(ManufactureDetailsModel.PK).append("} ");
        query.append(" FROM {").append(ManufactureDetailsModel._TYPECODE).append("} ");
        query.append(" WHERE {").append(ManufactureDetailsModel.COMPANY).append("} =?company");
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        searchQuery.addQueryParameter(ManufactureDetailsModel.COMPANY, companyCode);
        SearchResult<ManufactureDetailsModel> result = getFlexibleSearchService().search(searchQuery);
        System.out.println("MD Dao size::"+result.getResult().size());
        int resultCount = result.getTotalCount();
        if (resultCount == 0) {
            throw new UnknownIdentifierException("Manufacturer with code '" + companyCode + "' not found!");
        } else if (resultCount > 1) {
            throw new AmbiguousIdentifierException(
                    "Manufacturer code '" + companyCode + "' is not unique, " + resultCount + " Manufacturers found!");
        }
        return result.getResult().get(0);
    }

    /**
     * @param productCode
     * @return ManufactureDetailsModel first Instance
     */
    @Override
    public ManufactureDetailsModel findManufactureDetailsByProduct(String productCode) {
        validateParameterNotNull(productCode, "Product code must not be null!");
        StringBuilder query = new StringBuilder();
        query.append(" SELECT { md: ").append(ManufactureDetailsModel.PK).append(" } ");
        query.append(" FROM { ").append(ManufactureDetailsModel._TYPECODE).append(" as md ");
        query.append(" JOIN ").append(ManufactureDetailsModel._MDETAILSRELATION).append(" as rel ");
        query.append(" ON { md: ").append(ManufactureDetailsModel.PK).append(" } ").append(" = { rel:target }");
        query.append(" JOIN ").append(ProductModel._TYPECODE).append(" as p ");
        query.append(" ON  { rel:source }  = { p: ").append(ProductModel.PK).append(" } } ");
        query.append(" WHERE { p: ").append(ProductModel.CODE).append(" } =?code ");
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        searchQuery.addQueryParameter(ProductModel.CODE, productCode);
        SearchResult<ManufactureDetailsModel> result = getFlexibleSearchService().search(searchQuery);
        int resultCount = result.getTotalCount();
        if (resultCount == 0) {
            throw new UnknownIdentifierException("Product with code '" + productCode + "' not found!");
        } else if (resultCount > 1) {
            throw new AmbiguousIdentifierException(
                    "Product code '" + productCode + "' is not unique, " + result.getTotalCount() + " Product found!");
        }
        return result.getResult().get(0);

    }

    @Override
    public List<ManufactureDetailsModel> DefaultManufactureDetailsDaoList() {
        StringBuilder query = new StringBuilder();
        query.append(" SELECT { ").append(ManufactureDetailsModel.PK).append(" } ");
        query.append(" FROM { ").append(ManufactureDetailsModel._TYPECODE).append(" } ");
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        SearchResult<ManufactureDetailsModel> searchResult = getFlexibleSearchService().search(searchQuery);
        List<ManufactureDetailsModel> manufactureDetailsModelList= searchResult.getResult();
        return manufactureDetailsModelList;
    }
    public List<ManufactureDetailsModel> DefaultManufactureDetailsDaoPage(int start, int range){
        StringBuilder query = new StringBuilder();
        query.append(" SELECT { ").append(ManufactureDetailsModel.PK).append(" } ");
        query.append(" FROM { ").append(ManufactureDetailsModel._TYPECODE).append(" } ");

        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        searchQuery .setStart(start);
        searchQuery .setCount(range);
        SearchResult<ManufactureDetailsModel> searchResult = getFlexibleSearchService().search(searchQuery);
        List<ManufactureDetailsModel> manufactureDetailsModelList= searchResult.getResult();

        return manufactureDetailsModelList;
    }
}
