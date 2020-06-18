package com.nendrasys.facades.storefinder.populators;

import de.hybris.platform.commercefacades.user.converters.populator.AddressPopulator;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.core.model.user.AddressModel;

public class CustomAddressPopulator extends AddressPopulator {
    @Override
    public void populate(AddressModel source, AddressData target) {
        super.populate(source, target);
        target.setVatNumber(source.getVatNumber());
    }
}
