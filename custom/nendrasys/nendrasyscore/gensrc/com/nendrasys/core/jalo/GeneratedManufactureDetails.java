/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 24, 2020, 3:14:03 PM                    ---
 * ----------------------------------------------------------------
 */
package com.nendrasys.core.jalo;

import com.nendrasys.core.constants.NendrasysCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManufactureDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManufactureDetails extends GenericItem
{
	/** Qualifier of the <code>ManufactureDetails.canBeSold</code> attribute **/
	public static final String CANBESOLD = "canBeSold";
	/** Qualifier of the <code>ManufactureDetails.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>ManufactureDetails.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>ManufactureDetails.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>ManufactureDetails.yearsInMarket</code> attribute **/
	public static final String YEARSINMARKET = "yearsInMarket";
	/** Qualifier of the <code>ManufactureDetails.productDetails</code> attribute **/
	public static final String PRODUCTDETAILS = "productDetails";
	/** Relation ordering override parameter constants for MDetailsRelation from ((nendrasyscore))*/
	protected static String MDETAILSRELATION_SRC_ORDERED = "relation.MDetailsRelation.source.ordered";
	protected static String MDETAILSRELATION_TGT_ORDERED = "relation.MDetailsRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for MDetailsRelation from ((nendrasyscore))*/
	protected static String MDETAILSRELATION_MARKMODIFIED = "relation.MDetailsRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CANBESOLD, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.canBeSold</code> attribute.
	 * @return the canBeSold
	 */
	public Boolean isCanBeSold(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CANBESOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.canBeSold</code> attribute.
	 * @return the canBeSold
	 */
	public Boolean isCanBeSold()
	{
		return isCanBeSold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.canBeSold</code> attribute. 
	 * @return the canBeSold
	 */
	public boolean isCanBeSoldAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCanBeSold( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.canBeSold</code> attribute. 
	 * @return the canBeSold
	 */
	public boolean isCanBeSoldAsPrimitive()
	{
		return isCanBeSoldAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CANBESOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final Boolean value)
	{
		setCanBeSold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final SessionContext ctx, final boolean value)
	{
		setCanBeSold( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final boolean value)
	{
		setCanBeSold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.company</code> attribute.
	 * @return the company
	 */
	public String getCompany(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.company</code> attribute.
	 * @return the company
	 */
	public String getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final String value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Product");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(MDETAILSRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.productDetails</code> attribute.
	 * @return the productDetails
	 */
	public List<Product> getProductDetails(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			"Product",
			null,
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.productDetails</code> attribute.
	 * @return the productDetails
	 */
	public List<Product> getProductDetails()
	{
		return getProductDetails( getSession().getSessionContext() );
	}
	
	public long getProductDetailsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			"Product",
			null
		);
	}
	
	public long getProductDetailsCount()
	{
		return getProductDetailsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.productDetails</code> attribute. 
	 * @param value the productDetails
	 */
	public void setProductDetails(final SessionContext ctx, final List<Product> value)
	{
		setLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MDETAILSRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.productDetails</code> attribute. 
	 * @param value the productDetails
	 */
	public void setProductDetails(final List<Product> value)
	{
		setProductDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDetails. 
	 * @param value the item to add to productDetails
	 */
	public void addToProductDetails(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MDETAILSRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDetails. 
	 * @param value the item to add to productDetails
	 */
	public void addToProductDetails(final Product value)
	{
		addToProductDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDetails. 
	 * @param value the item to remove from productDetails
	 */
	public void removeFromProductDetails(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MDETAILSRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDetails. 
	 * @param value the item to remove from productDetails
	 */
	public void removeFromProductDetails(final Product value)
	{
		removeFromProductDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.rating</code> attribute.
	 * @return the rating
	 */
	public Integer getRating(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.rating</code> attribute.
	 * @return the rating
	 */
	public Integer getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.rating</code> attribute. 
	 * @return the rating
	 */
	public int getRatingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRating( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.rating</code> attribute. 
	 * @return the rating
	 */
	public int getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final Integer value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final int value)
	{
		setRating( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final int value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.yearsInMarket</code> attribute.
	 * @return the yearsInMarket
	 */
	public Integer getYearsInMarket(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEARSINMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.yearsInMarket</code> attribute.
	 * @return the yearsInMarket
	 */
	public Integer getYearsInMarket()
	{
		return getYearsInMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.yearsInMarket</code> attribute. 
	 * @return the yearsInMarket
	 */
	public int getYearsInMarketAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYearsInMarket( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetails.yearsInMarket</code> attribute. 
	 * @return the yearsInMarket
	 */
	public int getYearsInMarketAsPrimitive()
	{
		return getYearsInMarketAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEARSINMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final Integer value)
	{
		setYearsInMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final SessionContext ctx, final int value)
	{
		setYearsInMarket( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetails.yearsInMarket</code> attribute. 
	 * @param value the yearsInMarket
	 */
	public void setYearsInMarket(final int value)
	{
		setYearsInMarket( getSession().getSessionContext(), value );
	}
	
}
