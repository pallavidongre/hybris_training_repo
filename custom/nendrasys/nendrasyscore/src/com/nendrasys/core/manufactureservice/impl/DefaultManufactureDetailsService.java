package com.nendrasys.core.manufactureservice.impl;

import com.nendrasys.core.manufacturedao.ManufactureDetailsDao;
import com.nendrasys.core.manufacturedao.impl.DefaultManufactureDetailsDao;
import com.nendrasys.core.manufactureservice.ManufactureDetailsService;
import com.nendrasys.core.model.ManufactureDetailsModel;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class DefaultManufactureDetailsService<list> implements ManufactureDetailsService {

    private ManufactureDetailsDao manufactureDetailsDao;
    /**
     * @param companyCode
     * @return ManufactureDetailsModel first instance
     */
    @Override
    public ManufactureDetailsModel getManufactureDetails(String companyCode) {

        validateParameterNotNull(companyCode, "company code must not be null");
        ManufactureDetailsModel manufactureDetailsModels = getManufactureDetailsDao().findManufactureDetails(companyCode);

        return manufactureDetailsModels;
    }

    /**
     * @param code
     * @return ManufactureDetailsModel
     */
    @Override
    public ManufactureDetailsModel getManufactureDetailsByProduct(String code) {
        validateParameterNotNull(code, "company code must not be null");
        ManufactureDetailsModel manufactureDetailsModels = getManufactureDetailsDao().findManufactureDetailsByProduct(code);
        return manufactureDetailsModels;
    }

    @Required
    public void setManufactureDetailsDao(ManufactureDetailsDao manufactureDetailsDao) {
        this.manufactureDetailsDao = manufactureDetailsDao;
    }

    public List<ManufactureDetailsModel> manufactureDetailsModellistService(){
        return getManufactureDetailsDao().DefaultManufactureDetailsDaoList();
    }
    public List<ManufactureDetailsModel> manufactureDetailsModellistPageService(int start, int range){
        return getManufactureDetailsDao().DefaultManufactureDetailsDaoPage(start,range);
    }

    protected ManufactureDetailsDao getManufactureDetailsDao() {
        return manufactureDetailsDao;
    }

}
