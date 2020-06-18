/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.nendrasys.controller;

import static com.nendrasys.constants.NendrasysPaymentConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nendrasys.service.NendrasysPaymentService;


@Controller
public class NendrasysPaymentHelloController
{
	@Autowired
	private NendrasysPaymentService nendrasysPaymentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", nendrasysPaymentService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}