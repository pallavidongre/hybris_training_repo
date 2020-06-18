package com.nendrasys.facades.manufacturer.facade.impl;

import com.nendrasys.core.manufactureservice.ManufactureDetailsService;
import com.nendrasys.core.model.ManufactureDetailsModel;
import com.nendrasys.facades.manufacturer.facade.ManufactureDetailsFacade;
import com.nendrasys.facades.manufacturer.facade.data.ManufactureDetailsData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * This class calls ManufactureDetailsService to get the ManufactureDetailsModel
 *  and converts that ManufactureModel to ManufactureData and return it to
 *  the ProductPageController
 */
public class DefaultManufactureDetailsFacade implements ManufactureDetailsFacade {

    private ManufactureDetailsService manufactureDetailsService;

    private Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsDataConverter;

    /**
     * @param companyCode gets the ManufactureModel from the service and converts
     *                    that model to data using ManufactureDetailsDataConverter
     * @return ManufactureDetailsData
     */
    @Override
    public ManufactureDetailsData getForManufactureDetails(String companyCode) {
        ManufactureDetailsModel manufactureDetailsModel = getManufactureDetailsService().getManufactureDetails(companyCode);
        return getManufactureDetailsDataConverter().convert(manufactureDetailsModel);
    }


    /**
     * @param code
     * @return ManufactureDetailsdata
     */
    @Override
    public ManufactureDetailsData fetchManufactureDetailsByProduct(String code)  {
        ManufactureDetailsModel manufactureDetailsModel = getManufactureDetailsService().getManufactureDetailsByProduct(code);
        return getManufactureDetailsDataConverter().convert(manufactureDetailsModel);
    }

    public Converter<ManufactureDetailsModel, ManufactureDetailsData> getManufactureDetailsDataConverter() {
        return manufactureDetailsDataConverter;
    }

    @Required
    public void setManufactureDetailsDataConverter(Converter<ManufactureDetailsModel, ManufactureDetailsData> manufactureDetailsDataConverter) {
        this.manufactureDetailsDataConverter = manufactureDetailsDataConverter;
    }

    protected ManufactureDetailsService getManufactureDetailsService() {
        return manufactureDetailsService;
    }


    @Required
    public void setManufactureDetailsService(ManufactureDetailsService manufactureDetailsService) {
        this.manufactureDetailsService = manufactureDetailsService;
    }

    public List<ManufactureDetailsData> manufactureDetailsModelListF()
    {
        List<ManufactureDetailsModel> manufactureDetailsModel =  getManufactureDetailsService().manufactureDetailsModellistService();
        return getManufactureDetailsDataConverter().convertAll(manufactureDetailsModel);
    }
    public List<ManufactureDetailsData> manufactureDetailsModelPage(int start, int range)
    {
        List<ManufactureDetailsModel> manufactureDetailsModel =  getManufactureDetailsService().manufactureDetailsModellistPageService(start,range);
        return getManufactureDetailsDataConverter().convertAll(manufactureDetailsModel);
    }
}
