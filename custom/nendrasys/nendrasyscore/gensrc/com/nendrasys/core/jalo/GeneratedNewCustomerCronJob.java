/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 24, 2020, 3:14:03 PM                    ---
 * ----------------------------------------------------------------
 */
package com.nendrasys.core.jalo;

import com.nendrasys.core.constants.NendrasysCoreConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.nendrasys.core.jalo.NewCustomerCronJob NewCustomerCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNewCustomerCronJob extends CronJob
{
	/** Qualifier of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute **/
	public static final String NOOFDAYSTOBECONSIDERED = "noOfDaysToBeConsidered";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFDAYSTOBECONSIDERED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute.
	 * @return the noOfDaysToBeConsidered
	 */
	public Integer getNoOfDaysToBeConsidered(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFDAYSTOBECONSIDERED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute.
	 * @return the noOfDaysToBeConsidered
	 */
	public Integer getNoOfDaysToBeConsidered()
	{
		return getNoOfDaysToBeConsidered( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute. 
	 * @return the noOfDaysToBeConsidered
	 */
	public int getNoOfDaysToBeConsideredAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfDaysToBeConsidered( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute. 
	 * @return the noOfDaysToBeConsidered
	 */
	public int getNoOfDaysToBeConsideredAsPrimitive()
	{
		return getNoOfDaysToBeConsideredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute. 
	 * @param value the noOfDaysToBeConsidered
	 */
	public void setNoOfDaysToBeConsidered(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFDAYSTOBECONSIDERED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute. 
	 * @param value the noOfDaysToBeConsidered
	 */
	public void setNoOfDaysToBeConsidered(final Integer value)
	{
		setNoOfDaysToBeConsidered( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute. 
	 * @param value the noOfDaysToBeConsidered
	 */
	public void setNoOfDaysToBeConsidered(final SessionContext ctx, final int value)
	{
		setNoOfDaysToBeConsidered( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToBeConsidered</code> attribute. 
	 * @param value the noOfDaysToBeConsidered
	 */
	public void setNoOfDaysToBeConsidered(final int value)
	{
		setNoOfDaysToBeConsidered( getSession().getSessionContext(), value );
	}
	
}
