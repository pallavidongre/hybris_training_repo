package com.nendrasys.core.customCmsComponent;


import de.hybris.platform.core.model.product.ProductModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class CustomCmsComponentService {
    public CustomCmsComponentDao getCustomCmsComponentDao() {
        return customCmsComponentDao;
    }

    public void setCustomCmsComponentDao(CustomCmsComponentDao customCmsComponentDao) {
        this.customCmsComponentDao = customCmsComponentDao;
    }

    CustomCmsComponentDao customCmsComponentDao;
    public List<ProductModel> gettingDetails() {
        List<ProductModel> newProductModelList = new ArrayList<ProductModel>();
      List<ProductModel>  productModelList= customCmsComponentDao.customerDetails();
      for(ProductModel i:productModelList)
      {
          Date creationTime = i.getCreationtime();
          Date currentTime = new Date();
          final long days = TimeUnit.MILLISECONDS.toDays(currentTime.getTime() - creationTime.getTime());
          if(days<100 && newProductModelList.size()<5)
          {
              newProductModelList.add(i);
          }
      }
      return newProductModelList;
    }



}
