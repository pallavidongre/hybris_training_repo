package com.nendrasys.core.newCustomerCronJobService;

import com.nendrasys.core.customCmsComponent.CustomCmsComponentDao;
import com.nendrasys.core.newCustomerCronJobDao.NewCustomerCustomerCronJobDao;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.StrictMath.abs;

@Service
public class NewCustomerCronJobService {


    NewCustomerCustomerCronJobDao newCustomerCustomerCronJobDao;
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public List<CustomerModel> gettingDetails(Date endTime) {
        List<CustomerModel> newCustomerModelList = new ArrayList<CustomerModel>();
        List<CustomerModel> customerModelList = newCustomerCustomerCronJobDao.customerDetails();
        int count=0;
        for (CustomerModel i : customerModelList) {
            Date creationTime = i.getCreationtime();
            Date currentTime = new Date();

          long days=0L;
            if(endTime==null)
               days = TimeUnit.MILLISECONDS.toDays(currentTime.getTime() - creationTime.getTime());
            else
                days = abs(TimeUnit.MILLISECONDS.toDays( endTime.getTime()- creationTime.getTime()));
            if (days <2 ) {
                i.setNewCustomer(true);
                modelService.save(i);

            }
            else
            {
                i.setNewCustomer(false);
                modelService.save(i);
            }
        }
        return newCustomerModelList;
    }

    public NewCustomerCustomerCronJobDao getNewCustomerCustomerCronJobDao() {
        return newCustomerCustomerCronJobDao;
    }

    public void setNewCustomerCustomerCronJobDao(NewCustomerCustomerCronJobDao newCustomerCustomerCronJobDao) {
        this.newCustomerCustomerCronJobDao = newCustomerCustomerCronJobDao;
    }
}
