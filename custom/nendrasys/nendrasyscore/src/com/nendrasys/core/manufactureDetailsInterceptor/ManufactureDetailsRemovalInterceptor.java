package com.nendrasys.core.manufactureDetailsInterceptor;


import com.nendrasys.core.model.AuditManufactureEntryModel;
import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

public class ManufactureDetailsRemovalInterceptor implements RemoveInterceptor<ManufactureDetailsModel> {
    @Override
    public void onRemove(ManufactureDetailsModel manufactureDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {
       /* if (interceptorContext.isNew(manufactureDetailsModel)) {*/
          //  System.out.println("in removeInterceptor");
            final AuditManufactureEntryModel auditEntryModel = interceptorContext.getModelService().create(AuditManufactureEntryModel.class);
            auditEntryModel.setCompany(manufactureDetailsModel.getCompany());
            auditEntryModel.setCountry(manufactureDetailsModel.getCountry());
            auditEntryModel.setYearsInMarket(manufactureDetailsModel.getYearsInMarket());
        interceptorContext.registerElementFor(auditEntryModel, PersistenceOperation.SAVE);


    }
}

