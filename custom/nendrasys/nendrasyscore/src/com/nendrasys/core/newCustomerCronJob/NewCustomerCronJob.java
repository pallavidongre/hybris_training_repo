package com.nendrasys.core.newCustomerCronJob;

import com.nendrasys.core.model.NewCustomerCronJobModel;
import com.nendrasys.core.newCustomerCronJobService.NewCustomerCronJobService;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;


import java.util.Date;
import java.util.List;


public class NewCustomerCronJob extends AbstractJobPerformable<NewCustomerCronJobModel> {
    Logger logger=Logger.getLogger(NewCustomerCronJob.class);


    @Override
    public PerformResult perform(NewCustomerCronJobModel newCustomerCronJobModel) {
        //logger.debug("*********1111NewCustomerCronJob111**************");
        if(newCustomerCronJobModel.getCronJobHistoryEntries()!=null)
        newCustomerCronJobService.gettingDetails(newCustomerCronJobModel.getCronJobHistoryEntries().get( newCustomerCronJobModel.getCronJobHistoryEntries().size()-2).getEndTime());
        else
            newCustomerCronJobService.gettingDetails(null);
      //  logger.debug("*********NewCustomerCronJob**************");
        return  new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED) ;
    }

    public NewCustomerCronJobService getNewCustomerCronJobService() {
        return newCustomerCronJobService;
    }

    public void setNewCustomerCronJobService(NewCustomerCronJobService newCustomerCronJobService) {
        this.newCustomerCronJobService = newCustomerCronJobService;
    }

    NewCustomerCronJobService newCustomerCronJobService;
}
