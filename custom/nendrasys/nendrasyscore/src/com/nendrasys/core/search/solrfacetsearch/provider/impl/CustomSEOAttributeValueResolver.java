package com.nendrasys.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;
import org.apache.poi.util.StringUtil;

public class CustomSEOAttributeValueResolver extends AbstractValueResolver<ProductModel,Object,Object> {
    @Override
    protected void addFieldValues(InputDocument inputDocument, IndexerBatchContext indexerBatchContext, IndexedProperty indexedProperty, ProductModel productModel, ValueResolverContext<Object, Object> valueResolverContext) throws FieldValueProviderException {
        String customSEO = productModel.getCustomSEO();
        if(customSEO != null)
        {
            inputDocument.addField(indexedProperty,customSEO,valueResolverContext.getFieldQualifier());
        }
    }
}
