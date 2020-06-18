package com.nendrasys.facades.storefinder.populators;

import de.hybris.platform.commercefacades.user.converters.populator.AddressReversePopulator;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class ReverseAddressDataPopulator extends AddressReversePopulator {
    @Override
    public void populate(AddressData addressData, AddressModel addressModel) throws ConversionException {
        super.populate(addressData, addressModel);
        addressModel.setVatNumber(addressData.getVatNumber());
    }
}
