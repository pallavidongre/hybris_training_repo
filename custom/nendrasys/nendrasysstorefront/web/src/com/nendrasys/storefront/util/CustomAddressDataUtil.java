package com.nendrasys.storefront.util;

import com.nendrasys.storefront.forms.CustomAddressForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;
import de.hybris.platform.acceleratorstorefrontcommons.util.AddressDataUtil;
import de.hybris.platform.commercefacades.user.data.AddressData;
import org.springframework.stereotype.Component;

@Component("customAddressDataUtil")
public class CustomAddressDataUtil extends AddressDataUtil {

    public AddressData convertToAddressData(CustomAddressForm addressForm) {

        AddressForm addressForm1 = (AddressForm) addressForm;
        AddressData addressData = super.convertToAddressData(addressForm1);
        final CustomAddressForm form=(CustomAddressForm) addressForm;
        addressData.setVatNumber(form.getVatNumber());
        return addressData;
    }
}
