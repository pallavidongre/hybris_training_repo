/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 24, 2020, 3:14:03 PM                    ---
 * ----------------------------------------------------------------
 */
package com.nendrasys.core.jalo;

import com.nendrasys.core.constants.NendrasysCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem AuditManufactureEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAuditManufactureEntry extends GenericItem
{
	/** Qualifier of the <code>AuditManufactureEntry.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>AuditManufactureEntry.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>AuditManufactureEntry.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>AuditManufactureEntry.yearsInMarket</code> attribute **/
	public static final String YEARSINMARKET = "yearsInMarket";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(YEARSINMARKET, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.company</code> attribute.
	 * @return the company
	 */
	public String getCompany(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.company</code> attribute.
	 * @return the company
	 */
	public String getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final String value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.rating</code> attribute.
	 * @return the rating
	 */
	public Integer getRating(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.rating</code> attribute.
	 * @return the rating
	 */
	public Integer getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.rating</code> attribute. 
	 * @return the rating
	 */
	public int getRatingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRating( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.rating</code> attribute. 
	 * @return the rating
	 */
	public int getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final Integer value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final int value)
	{
		setRating( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final int value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute.
	 * @return the yearsInMarket
	 */
	public Integer getYearsInMarket(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEARSINMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute.
	 * @return the yearsInMarket
	 */
	public Integer getYearsInMarket()
	{
		return getYearsInMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute. 
	 * @return the yearsInMarket
	 */
	public int getYearsInMarketAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYearsInMarket( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute. 
	 * @return the yearsInMarket
	 */
	public int getYearsInMarketAsPrimitive()
	{
		return getYearsInMarketAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEARSINMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final Integer value)
	{
		setYearsInMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final SessionContext ctx, final int value)
	{
		setYearsInMarket( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AuditManufactureEntry.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final int value)
	{
		setYearsInMarket( getSession().getSessionContext(), value );
	}
	
}
