package com.nendrasys.storefront.controllers.productRegistrationValidator;

import com.nendrasys.storefront.register.ProductRegistrationForm;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import java.io.IOException;
@Component("productRegistrationValidator")
public class ProductRegistrationValidator implements Validator
{

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        System.out.println("in validator class method");
        ProductRegistrationForm registrationForm=( ProductRegistrationForm)o;
        validateProductId(registrationForm.getProductId(), errors);
        validateCompanyName(registrationForm.getCompanyName(), errors);
        validateQuantityNeeded(registrationForm.getQuantityNeeded(), errors);
        System.out.println("in validator class method end");
    }

    protected void validateQuantityNeeded(int quantityNeeded, Errors errors) {
        if(quantityNeeded==0 || quantityNeeded>100)
        {
            errors.rejectValue("quantityNeeded","quantityNeeded.invalid ");
        }

    }

    protected void validateCompanyName(String companyName, Errors errors) {
        if(StringUtils.isEmpty(companyName) || companyName.length()<3)
        errors.rejectValue("companyName","companyName.invalid");
    }

    protected void validateProductId(String productId, Errors errors) {
        if(productId.length()<2 || StringUtils.isEmpty(productId))
        {
            errors.rejectValue("productId","productId.invalid");
        }
    }

}

