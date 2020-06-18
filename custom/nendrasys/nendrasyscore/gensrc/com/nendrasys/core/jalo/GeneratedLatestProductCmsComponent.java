/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 24, 2020, 3:14:03 PM                    ---
 * ----------------------------------------------------------------
 */
package com.nendrasys.core.jalo;

import com.nendrasys.core.constants.NendrasysCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.nendrasys.core.jalo.LatestProductCmsComponent LatestProductCmsComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedLatestProductCmsComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute **/
	public static final String NOOFDAYSTOCONSIDERNEWCUSTOMER = "noOfdaystoConsiderNewCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFDAYSTOCONSIDERNEWCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute.
	 * @return the noOfdaystoConsiderNewCustomer
	 */
	public Integer getNoOfdaystoConsiderNewCustomer(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFDAYSTOCONSIDERNEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute.
	 * @return the noOfdaystoConsiderNewCustomer
	 */
	public Integer getNoOfdaystoConsiderNewCustomer()
	{
		return getNoOfdaystoConsiderNewCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute. 
	 * @return the noOfdaystoConsiderNewCustomer
	 */
	public int getNoOfdaystoConsiderNewCustomerAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfdaystoConsiderNewCustomer( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute. 
	 * @return the noOfdaystoConsiderNewCustomer
	 */
	public int getNoOfdaystoConsiderNewCustomerAsPrimitive()
	{
		return getNoOfdaystoConsiderNewCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute. 
	 * @param value the noOfdaystoConsiderNewCustomer
	 */
	public void setNoOfdaystoConsiderNewCustomer(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFDAYSTOCONSIDERNEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute. 
	 * @param value the noOfdaystoConsiderNewCustomer
	 */
	public void setNoOfdaystoConsiderNewCustomer(final Integer value)
	{
		setNoOfdaystoConsiderNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute. 
	 * @param value the noOfdaystoConsiderNewCustomer
	 */
	public void setNoOfdaystoConsiderNewCustomer(final SessionContext ctx, final int value)
	{
		setNoOfdaystoConsiderNewCustomer( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductCmsComponent.noOfdaystoConsiderNewCustomer</code> attribute. 
	 * @param value the noOfdaystoConsiderNewCustomer
	 */
	public void setNoOfdaystoConsiderNewCustomer(final int value)
	{
		setNoOfdaystoConsiderNewCustomer( getSession().getSessionContext(), value );
	}
	
}
