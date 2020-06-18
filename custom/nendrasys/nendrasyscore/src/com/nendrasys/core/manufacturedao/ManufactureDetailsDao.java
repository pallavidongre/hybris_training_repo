package com.nendrasys.core.manufacturedao;

import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;


public interface ManufactureDetailsDao extends Dao {

    ManufactureDetailsModel findManufactureDetails(String companyCode);

    ManufactureDetailsModel findManufactureDetailsByProduct(String productCode);
    public List<ManufactureDetailsModel> DefaultManufactureDetailsDaoList();

    List<ManufactureDetailsModel> DefaultManufactureDetailsDaoPage(int start, int range);
}
