/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.nendrasys.service;

public interface NendrasysPaymentService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}