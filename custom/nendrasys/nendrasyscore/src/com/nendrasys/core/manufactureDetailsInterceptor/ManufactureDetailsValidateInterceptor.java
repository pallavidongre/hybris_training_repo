package com.nendrasys.core.manufactureDetailsInterceptor;

import com.nendrasys.core.model.ManufactureDetailsModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class ManufactureDetailsValidateInterceptor implements ValidateInterceptor <ManufactureDetailsModel>{
    @Override
    public void onValidate(ManufactureDetailsModel manufactureDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {
        System.out.println("in validator class");
        if(manufactureDetailsModel.getRating()>0)
        {
           // System.out.println("in validator");
            manufactureDetailsModel.setRating(manufactureDetailsModel.getRating());
        }
        else {
            throw new InterceptorException("rating can't be -ve number ");
        }
    }
}
