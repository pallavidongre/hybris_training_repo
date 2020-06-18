package com.nendrasys.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.provider.Qualifier;
import de.hybris.platform.solrfacetsearch.provider.QualifierProvider;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.*;

public class CustomerCurrencyQualifierprovider implements QualifierProvider{
    private CommonI18NService commonI18NService;
    private SessionService sessionService;
    private UserService userService;


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public SessionService getSessionService() {
        return sessionService;
    }

    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }





    private final Set<Class<?>> supportedTypes = Collections.singleton(CurrencyModel.class);
    IndexedType indexedType_user;
    public CustomerCurrencyQualifierprovider() {
        final Set<Class<?>> setType=new HashSet<>();
        setType.add(CurrencyModel.class);
        setType.add(UserPriceGroup.class);
    }

    public CommonI18NService getCommonI18NService() {
        return this.commonI18NService;
    }

    public void setCommonI18NService(CommonI18NService commonI18NService) {
        this.commonI18NService = commonI18NService;
    }

    public Set<Class<?>> getSupportedTypes() {
        return this.supportedTypes;
    }

    public Collection<Qualifier> getAvailableQualifiers(FacetSearchConfig facetSearchConfig, IndexedType indexedType) {
        Objects.requireNonNull(facetSearchConfig, "facetSearchConfig is null");
        Objects.requireNonNull(indexedType, "indexedType is null");
        List<Qualifier> qualifiers = new ArrayList();
        Iterator var5 = facetSearchConfig.getIndexConfig().getCurrencies().iterator();
        List<UserGroupModel> var6 = facetSearchConfig.getIndexConfig().getUserGroup();

        while(var5.hasNext()) {
            CurrencyModel currency = (CurrencyModel)var5.next();
            if(var6!=null)
            {
                var6.forEach( userGroupModel ->
                        {
                           Qualifier qualifier = new CustomerCurrencyQualifierprovider.CurrencyQualifier1(currency, userGroupModel.getUserPriceGroup());
                            qualifiers.add(qualifier);
                        }
                );


                }

            }




        return Collections.unmodifiableList(qualifiers);
    }

    public boolean canApply(IndexedProperty indexedProperty) {
        Objects.requireNonNull(indexedProperty, "indexedProperty is null");
        return indexedProperty.isCurrency();
    }

    public void applyQualifier(Qualifier qualifier) {
        Objects.requireNonNull(qualifier, "qualifier is null");
        if (!(qualifier instanceof CustomerCurrencyQualifierprovider.CurrencyQualifier1)) {
            throw new IllegalArgumentException("provided qualifier is not of expected type");
        } else {
            this.commonI18NService.setCurrentCurrency(((CustomerCurrencyQualifierprovider.CurrencyQualifier1)qualifier).getCurrency());
//           ((JaloSession)this.sessionService.getRawSession(this.sessionService.getCurrentSession())).
//                    getSessionContext().setAttribute("Europe1PriceFactory_UPG",((CustomerCurrencyQualifierprovider.CurrencyQualifier1)qualifier).getUserPriceGroup());
           this.sessionService.setAttribute("Europe1PriceFactory_UPG",((CurrencyQualifier1) qualifier).getUserPriceGroup());
        }
    }

    @Override
    public Qualifier getCurrentQualifier() {
        final CurrencyModel currency = getCommonI18NService().getCurrentCurrency();
        final UserPriceGroup userPriceGroup = getUserService().getCurrentUser().getEurope1PriceFactory_UPG();
        return currency == null ? null : new CustomerCurrencyQualifierprovider.CurrencyQualifier1(currency, userPriceGroup);

    }



    protected static class CurrencyQualifier1 implements Qualifier {
        private final CurrencyModel currency;
    private UserPriceGroup userPriceGroup;

        public UserPriceGroup getUserPriceGroup() {
            return userPriceGroup;
        }

        public CurrencyQualifier1(final CurrencyModel currency, final UserPriceGroup userPriceGroup) {
            this.userPriceGroup =  userPriceGroup;
            Objects.requireNonNull(currency, "currency is null");
            this.currency = currency;
        }

        public CurrencyModel getCurrency() {
            return this.currency;
        }

        public <U> U getValueForType(Class<U> type) {
            Objects.requireNonNull(type, "type is null");
            if (Objects.equals(type, CurrencyModel.class)) {
                return (U) this.currency;
            }
            else if (Objects.equals(type, UserPriceGroup.class)){
                return (U) this.userPriceGroup;
            }

            else
             {
                throw new IllegalArgumentException("type not supported");
            }
        }

        public String toFieldQualifier() {

                final String fieldQualifier;
                if (userPriceGroup != null) {
                    fieldQualifier = currency.getIsocode() + "_" + userPriceGroup.getCode();
                    return fieldQualifier;
                } else {
                    fieldQualifier = currency.getIsocode();
                    return fieldQualifier;
                }
            }

        }





}


