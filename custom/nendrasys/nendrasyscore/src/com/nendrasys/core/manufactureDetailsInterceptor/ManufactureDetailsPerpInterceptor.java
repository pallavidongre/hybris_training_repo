package com.nendrasys.core.manufactureDetailsInterceptor;

import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

public class ManufactureDetailsPerpInterceptor implements PrepareInterceptor<ManufactureDetailsModel> {


    @Override
    public void onPrepare(ManufactureDetailsModel manufactureDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {

        //System.out.println("in interceptor");
//        ManufactureDetailsModel manufactureDetailsModel1 = interceptorContext.getModelService().create(ManufactureDetailsModel.class);
        if(interceptorContext.isNew(manufactureDetailsModel) || interceptorContext.isModified(manufactureDetailsModel) )
            manufactureDetailsModel.setCompany(manufactureDetailsModel.getCompany().toUpperCase());

        /*else {
            throw new InterceptorException("The Model is already existing in the database");
        }*/


    }
}

