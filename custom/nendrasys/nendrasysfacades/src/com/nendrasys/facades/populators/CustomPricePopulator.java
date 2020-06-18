package com.nendrasys.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.jalo.config.SolrIndexConfig;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexConfigModel;

public class CustomPricePopulator implements Populator<SolrFacetSearchConfigModel, IndexConfig> {
    @Override
    public void populate(SolrFacetSearchConfigModel solrIndexConfigModel, IndexConfig indexConfig) throws ConversionException {
                   indexConfig.setUserGroup(solrIndexConfigModel.getUserGroup());
    }
}
