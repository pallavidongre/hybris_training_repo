/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 18, 2020, 10:54:42 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.Map;

public  class CatalogData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogData.catalogId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>CatalogData.name</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String, String> name;
	
	public CatalogData()
	{
		// default constructor
	}
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCatalogId() 
	{
		return catalogId;
	}
	
	public void setName(final Map<String, String> name)
	{
		this.name = name;
	}

	public Map<String, String> getName() 
	{
		return name;
	}
	


}
