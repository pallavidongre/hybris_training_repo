package com.nendrasys.core.search.solrfacetsearch.provider.impl;

import com.nendrasys.core.jalo.ElectronicsColorVariantProduct;
import com.nendrasys.core.manufactureservice.ManufactureDetailsService;
import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.classification.features.Feature;
import de.hybris.platform.classification.features.FeatureList;
import de.hybris.platform.classification.features.FeatureValue;
import de.hybris.platform.classification.features.LocalizedFeature;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.Qualifier;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;

import java.util.List;
import java.util.Locale;



public class CustomManufactureValueResolver extends AbstractValueResolver<ProductModel, Object,Object> {
    public ManufactureDetailsService getManufactureDetailsService() {
        return manufactureDetailsService;
    }

    public void setManufactureDetailsService(ManufactureDetailsService manufactureDetailsService) {
        this.manufactureDetailsService = manufactureDetailsService;
    }

    ManufactureDetailsService manufactureDetailsService;
    @Override
    protected void addFieldValues(InputDocument inputDocument, IndexerBatchContext indexerBatchContext, IndexedProperty indexedProperty,
                                  ProductModel productModel, ValueResolverContext<Object, Object> valueResolverContext) throws FieldValueProviderException {
        //List<ManufactureDetailsModel> list = productModel.getManufactureDetails();

            if(!productModel.getManufactureDetails().isEmpty())
            {
                for(ManufactureDetailsModel list1:productModel.getManufactureDetails())
                {
                        //System.out.println("productModel.getManufacturedetails::::::::::"+productModel.getManufactureDetails());
                        inputDocument.addField(indexedProperty,list1.getCompany(),valueResolverContext.getFieldQualifier());
                }

            }

        }
    }

