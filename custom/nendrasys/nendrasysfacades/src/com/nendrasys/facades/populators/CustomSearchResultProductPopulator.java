package com.nendrasys.facades.populators;

import com.nendrasys.core.search.solrfacetsearch.provider.impl.CustomerCurrencyQualifierprovider;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;
import java.util.List;

public class CustomSearchResultProductPopulator<SearchResultValueData, ProductData> extends SearchResultProductPopulator{
    CustomerCurrencyQualifierprovider qualifierprovider;

    public CustomerCurrencyQualifierprovider getQualifierprovider() {
        return qualifierprovider;
    }

    public void setQualifierprovider(CustomerCurrencyQualifierprovider qualifierprovider) {
        this.qualifierprovider = qualifierprovider;
    }

    protected void populatePrices(final de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData source, final de.hybris.platform.commercefacades.product.data.ProductData target)
    {
        // Pull the volume prices flag
        final Boolean volumePrices = this.<Boolean> getValue(source, "volumePrices");
        target.setVolumePricesFlag(volumePrices == null ? Boolean.FALSE : volumePrices);
        //String property= getQualifierprovider().getUserService().getCurrentUser().getEurope1PriceFactory_UPG().getCode().toLowerCase();
        //newUser_usd_newgroup_string_mv
        // Pull the price value for the current currency
        final List<Double> priceValue = getValue(source, "newUser");
        if (priceValue != null)
        {
            Double price = priceValue.get(0);
            final PriceData priceData = getPriceDataFactory().create(PriceDataType.BUY, BigDecimal.valueOf(price.doubleValue()),
                    getCommonI18NService().getCurrentCurrency());
            target.setPrice(priceData);
        }
    }




}
