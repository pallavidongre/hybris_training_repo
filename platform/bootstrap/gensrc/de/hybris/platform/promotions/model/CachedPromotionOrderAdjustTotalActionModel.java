/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 18, 2020, 10:54:41 AM                   ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.promotions.model.PromotionOrderAdjustTotalActionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CachedPromotionOrderAdjustTotalAction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class CachedPromotionOrderAdjustTotalActionModel extends PromotionOrderAdjustTotalActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "CachedPromotionOrderAdjustTotalAction";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CachedPromotionOrderAdjustTotalActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CachedPromotionOrderAdjustTotalActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CachedPromotionOrderAdjustTotalActionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
}