package com.nendrasys.facades.manufacturer.facade;

import com.nendrasys.facades.manufacturer.facade.data.ManufactureDetailsData;

import java.util.List;

public interface ManufactureDetailsFacade {

    ManufactureDetailsData getForManufactureDetails(String companyCode);
    ManufactureDetailsData fetchManufactureDetailsByProduct(String code);
    List<ManufactureDetailsData> manufactureDetailsModelListF();
    public List<ManufactureDetailsData> manufactureDetailsModelPage(int start, int range);
}
