package com.nendrasys.core.productRegistrationRestriction;

import de.hybris.platform.cms2.model.restrictions.ProductRegistrationRestritionModel;
import de.hybris.platform.cms2.servicelayer.data.RestrictionData;
import de.hybris.platform.cms2.servicelayer.services.evaluator.CMSRestrictionEvaluator;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class ProductRegistrationEvaluator implements CMSRestrictionEvaluator<ProductRegistrationRestritionModel> {
    @Autowired
    private UserService userService;
    @Required
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    @Override
    public boolean evaluate(ProductRegistrationRestritionModel productRegistrationRestritionModel, RestrictionData restrictionData) {
        UserModel userModel=getUserService().getCurrentUser();

        if(getUserService().isAnonymousUser(userModel) )
        {
            return false;
        }
        return true;



    }
}
