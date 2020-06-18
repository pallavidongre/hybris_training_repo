package com.nendrasys.storefront.controllers.CustomerRegistrationIsBussinessuser;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

public class CustomerRegistrationForm extends RegisterForm {
    private boolean isBussinessUser;

    public boolean isIsBussinessUser() {
        return isBussinessUser;
    }

    public void setIsBussinessUser(boolean bussinessUser) {
        isBussinessUser = bussinessUser;
    }

}
