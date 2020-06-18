package com.nendrasys.core.customPriceIndexing;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.order.exceptions.CalculationException;
import de.hybris.platform.order.strategies.calculation.pdt.criteria.DiscountValueInfoCriteria;
import de.hybris.platform.order.strategies.calculation.pdt.criteria.PDTCriteriaFactory;
import de.hybris.platform.order.strategies.calculation.pdt.criteria.PriceValueInfoCriteria;
import de.hybris.platform.order.strategies.calculation.pdt.criteria.TaxValueInfoCriteria;
import de.hybris.platform.order.strategies.calculation.pdt.criteria.impl.DefaultPDTCriteriaFactory;
import de.hybris.platform.order.strategies.calculation.pdt.criteria.impl.DefaultPriceValueInfoCriteria;
import de.hybris.platform.order.strategies.calculation.pdt.impl.PDTEnumGroupsHelper;
import de.hybris.platform.product.BaseCriteria;
import de.hybris.platform.servicelayer.internal.i18n.I18NConstants;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.user.UserService;

public class CustomPDTCriteriaFactory extends DefaultPDTCriteriaFactory{
    public PDTEnumGroupsHelper getCustomPdtEnumGroupsHelper() {
        return customPdtEnumGroupsHelper;
    }

    public void setCustomPdtEnumGroupsHelper(PDTEnumGroupsHelper customPdtEnumGroupsHelper ){
        this.customPdtEnumGroupsHelper = customPdtEnumGroupsHelper;
    }

    public UserService getCustomUserService() {
        return customUserService;
    }

    public void setCustomUserService(UserService CustomUserService) {
        this.customUserService = CustomUserService;
    }

    public SessionService getCustomsessionService() {
        return CustomsessionService;
    }

    public void setCustomsessionService(SessionService CustomsessionService) {
        this.CustomsessionService = CustomsessionService;
    }

    private PDTEnumGroupsHelper customPdtEnumGroupsHelper;
    private UserService customUserService;
    private SessionService CustomsessionService;


    @Override
    public PriceValueInfoCriteria priceInfoCriteriaFromBaseCriteria(BaseCriteria baseCriteria) throws CalculationException {
        UserPriceGroup userPriceGroup=CustomsessionService.getAttribute("Europe1PriceFactory_UPG");

            return DefaultPriceValueInfoCriteria.buildForInfo() //
                    .withProduct(baseCriteria.getProduct()) //
                    .withProductPriceGroup(customPdtEnumGroupsHelper.getPPG(baseCriteria.getProduct())) //
                    .withUser(customUserService.getCurrentUser()) //
                    .withUserPriceGroup(userPriceGroup)
                    .withCurrency(CustomsessionService.getAttribute(I18NConstants.CURRENCY_SESSION_ATTR_KEY))//

                    .withNet(baseCriteria.isNet()) //
                    .withDate(baseCriteria.getDate()) //
                    .build();


    }
}
