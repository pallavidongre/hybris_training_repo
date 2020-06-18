package com.nendrasys.core.manufactureservice;

import com.nendrasys.core.model.ManufactureDetailsModel;

import java.util.List;


public interface ManufactureDetailsService {

    ManufactureDetailsModel getManufactureDetails(String companyCode);
    ManufactureDetailsModel getManufactureDetailsByProduct(String code);
    List<ManufactureDetailsModel> manufactureDetailsModellistService();
    public List<ManufactureDetailsModel> manufactureDetailsModellistPageService(int start, int range);
}
