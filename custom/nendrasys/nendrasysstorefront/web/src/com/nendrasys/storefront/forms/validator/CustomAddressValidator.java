package com.nendrasys.storefront.forms.validator;

import com.nendrasys.storefront.forms.CustomAddressForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.AddressValidator;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component("customAddressValidator")
public class CustomAddressValidator extends AddressValidator {
    @Override
    public void validate(Object object, Errors errors) {
        super.validate(object, errors);
        CustomAddressForm customAddressForm = (CustomAddressForm)object;
        validateVatNumber(customAddressForm,errors);
    }

    protected void validateVatNumber(CustomAddressForm customAddressForm,Errors errors){
        if(customAddressForm.getVatNumber() != null){
            if(!(StringUtils.isAlphanumeric(customAddressForm.getVatNumber()))){
                errors.rejectValue("vatNumber","vatNumber.invalid");
            }
        }
    }
}
