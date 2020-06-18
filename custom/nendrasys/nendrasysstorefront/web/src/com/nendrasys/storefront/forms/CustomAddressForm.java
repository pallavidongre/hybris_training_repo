package com.nendrasys.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;

public class CustomAddressForm extends AddressForm {
    private String vatNumber;

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }
}
