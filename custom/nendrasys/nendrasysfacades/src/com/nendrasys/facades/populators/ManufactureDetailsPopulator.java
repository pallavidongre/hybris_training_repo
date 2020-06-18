package com.nendrasys.facades.populators;

import com.nendrasys.core.model.ManufactureDetailsModel;
import com.nendrasys.facades.manufacturer.facade.data.ManufactureDetailsData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Required;

public class ManufactureDetailsPopulator implements Populator<ManufactureDetailsModel, ManufactureDetailsData> {

    private Converter<CountryModel, CountryData> countryDataConverter;
    @Override
    public void populate(ManufactureDetailsModel source, ManufactureDetailsData target) throws ConversionException {
        target.setCompany(source.getCompany());
        target.setCanBeSold(source.getCanBeSold());
        if(source.getCountry()!=null)
        {
            target.setCountry(countryDataConverter.convert(source.getCountry()));
        }
        target.setRating(source.getRating());
        target.setYearsInMarket(source.getYearsInMarket());
    }

    public Converter<CountryModel, CountryData> getCountryDataConverter() {
        return countryDataConverter;
    }

    @Required
    public void setCountryDataConverter(Converter<CountryModel, CountryData> countryDataConverter) {
        this.countryDataConverter = countryDataConverter;
    }
}
