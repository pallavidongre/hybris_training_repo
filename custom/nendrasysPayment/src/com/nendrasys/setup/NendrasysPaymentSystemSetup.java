/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.nendrasys.setup;

import static com.nendrasys.constants.NendrasysPaymentConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.nendrasys.constants.NendrasysPaymentConstants;
import com.nendrasys.service.NendrasysPaymentService;


@SystemSetup(extension = NendrasysPaymentConstants.EXTENSIONNAME)
public class NendrasysPaymentSystemSetup
{
	private final NendrasysPaymentService nendrasysPaymentService;

	public NendrasysPaymentSystemSetup(final NendrasysPaymentService nendrasysPaymentService)
	{
		this.nendrasysPaymentService = nendrasysPaymentService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		nendrasysPaymentService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return NendrasysPaymentSystemSetup.class.getResourceAsStream("/nendrasysPayment/sap-hybris-platform.png");
	}
}
