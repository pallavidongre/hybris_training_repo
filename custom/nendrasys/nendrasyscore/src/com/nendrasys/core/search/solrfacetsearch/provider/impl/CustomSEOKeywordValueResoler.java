package com.nendrasys.core.search.solrfacetsearch.provider.impl;

import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;

public class CustomSEOKeywordValueResoler extends AbstractValueResolver<ProductModel, Object,Object> {
    @Override
    protected void addFieldValues(InputDocument inputDocument, IndexerBatchContext indexerBatchContext, IndexedProperty indexedProperty, ProductModel productModel, ValueResolverContext<Object, Object> valueResolverContext) throws FieldValueProviderException {
        if(productModel.getCustomSEOKeyword()!=null)
        {
              //System.out.println("productModel.getManufacturedetails::::::::::"+productModel.getManufactureDetails());
                inputDocument.addField(indexedProperty,productModel.getCustomSEOKeyword(),valueResolverContext.getFieldQualifier());

        }
    }
}
