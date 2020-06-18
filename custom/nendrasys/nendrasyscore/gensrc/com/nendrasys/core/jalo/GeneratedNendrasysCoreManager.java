/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 24, 2020, 3:14:03 PM                    ---
 * ----------------------------------------------------------------
 */
package com.nendrasys.core.jalo;

import com.nendrasys.core.constants.NendrasysCoreConstants;
import com.nendrasys.core.jalo.ApparelProduct;
import com.nendrasys.core.jalo.ApparelSizeVariantProduct;
import com.nendrasys.core.jalo.ApparelStyleVariantProduct;
import com.nendrasys.core.jalo.AuditManufactureEntry;
import com.nendrasys.core.jalo.ElectronicsColorVariantProduct;
import com.nendrasys.core.jalo.LatestProductCmsComponent;
import com.nendrasys.core.jalo.ManufactureDetails;
import com.nendrasys.core.jalo.NewCustomerCronJob;
import com.nendrasys.core.jalo.ProductRegistration;
import com.nendrasys.core.productRegistrationCronJob.ProductRegistrationCronJob;
import de.hybris.platform.cms2.jalo.restrictions.ProductRegistrationRestrition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.PrincipalGroup;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.solrfacetsearch.jalo.config.SolrFacetSearchConfig;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>NendrasysCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNendrasysCoreManager extends Extension
{
	/** Relation ordering override parameter constants for MDetailsRelation from ((nendrasyscore))*/
	protected static String MDETAILSRELATION_SRC_ORDERED = "relation.MDetailsRelation.source.ordered";
	protected static String MDETAILSRELATION_TGT_ORDERED = "relation.MDetailsRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for MDetailsRelation from ((nendrasyscore))*/
	protected static String MDETAILSRELATION_MARKMODIFIED = "relation.MDetailsRelation.markmodified";
	/** Relation ordering override parameter constants for CustomPriceRelation from ((nendrasyscore))*/
	protected static String CUSTOMPRICERELATION_SRC_ORDERED = "relation.CustomPriceRelation.source.ordered";
	protected static String CUSTOMPRICERELATION_TGT_ORDERED = "relation.CustomPriceRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for CustomPriceRelation from ((nendrasyscore))*/
	protected static String CUSTOMPRICERELATION_MARKMODIFIED = "relation.CustomPriceRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("customSEO", AttributeMode.INITIAL);
		tmp.put("customSEOKeyword", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("newCustomer", AttributeMode.INITIAL);
		tmp.put("isBusinessUser", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("vatNumber", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AuditManufactureEntry createAuditManufactureEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.AUDITMANUFACTUREENTRY );
			return (AuditManufactureEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AuditManufactureEntry : "+e.getMessage(), 0 );
		}
	}
	
	public AuditManufactureEntry createAuditManufactureEntry(final Map attributeValues)
	{
		return createAuditManufactureEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public LatestProductCmsComponent createLatestProductCmsComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.LATESTPRODUCTCMSCOMPONENT );
			return (LatestProductCmsComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LatestProductCmsComponent : "+e.getMessage(), 0 );
		}
	}
	
	public LatestProductCmsComponent createLatestProductCmsComponent(final Map attributeValues)
	{
		return createLatestProductCmsComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufactureDetails createManufactureDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.MANUFACTUREDETAILS );
			return (ManufactureDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufactureDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ManufactureDetails createManufactureDetails(final Map attributeValues)
	{
		return createManufactureDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public NewCustomerCronJob createNewCustomerCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.NEWCUSTOMERCRONJOB );
			return (NewCustomerCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NewCustomerCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public NewCustomerCronJob createNewCustomerCronJob(final Map attributeValues)
	{
		return createNewCustomerCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductRegistration createProductRegistration(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.PRODUCTREGISTRATION );
			return (ProductRegistration)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductRegistration : "+e.getMessage(), 0 );
		}
	}
	
	public ProductRegistration createProductRegistration(final Map attributeValues)
	{
		return createProductRegistration( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductRegistrationCronJob createProductRegistrationRemovalCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.PRODUCTREGISTRATIONREMOVALCRONJOB );
			return (ProductRegistrationCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductRegistrationRemovalCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public ProductRegistrationCronJob createProductRegistrationRemovalCronJob(final Map attributeValues)
	{
		return createProductRegistrationRemovalCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductRegistrationRestrition createProductRegistrationRestrition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NendrasysCoreConstants.TC.PRODUCTREGISTRATIONRESTRITION );
			return (ProductRegistrationRestrition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductRegistrationRestrition : "+e.getMessage(), 0 );
		}
	}
	
	public ProductRegistrationRestrition createProductRegistrationRestrition(final Map attributeValues)
	{
		return createProductRegistrationRestrition( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEO</code> attribute.
	 * @return the customSEO
	 */
	public String getCustomSEO(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, NendrasysCoreConstants.Attributes.Product.CUSTOMSEO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEO</code> attribute.
	 * @return the customSEO
	 */
	public String getCustomSEO(final Product item)
	{
		return getCustomSEO( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEO</code> attribute. 
	 * @param value the customSEO
	 */
	public void setCustomSEO(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, NendrasysCoreConstants.Attributes.Product.CUSTOMSEO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEO</code> attribute. 
	 * @param value the customSEO
	 */
	public void setCustomSEO(final Product item, final String value)
	{
		setCustomSEO( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEOKeyword</code> attribute.
	 * @return the customSEOKeyword
	 */
	public String getCustomSEOKeyword(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, NendrasysCoreConstants.Attributes.Product.CUSTOMSEOKEYWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEOKeyword</code> attribute.
	 * @return the customSEOKeyword
	 */
	public String getCustomSEOKeyword(final Product item)
	{
		return getCustomSEOKeyword( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEOKeyword</code> attribute. 
	 * @param value the customSEOKeyword
	 */
	public void setCustomSEOKeyword(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, NendrasysCoreConstants.Attributes.Product.CUSTOMSEOKEYWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEOKeyword</code> attribute. 
	 * @param value the customSEOKeyword
	 */
	public void setCustomSEOKeyword(final Product item, final String value)
	{
		setCustomSEOKeyword( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return NendrasysCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isBusinessUser</code> attribute.
	 * @return the isBusinessUser
	 */
	public Boolean isIsBusinessUser(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, NendrasysCoreConstants.Attributes.Customer.ISBUSINESSUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isBusinessUser</code> attribute.
	 * @return the isBusinessUser
	 */
	public Boolean isIsBusinessUser(final Customer item)
	{
		return isIsBusinessUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isBusinessUser</code> attribute. 
	 * @return the isBusinessUser
	 */
	public boolean isIsBusinessUserAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsBusinessUser( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isBusinessUser</code> attribute. 
	 * @return the isBusinessUser
	 */
	public boolean isIsBusinessUserAsPrimitive(final Customer item)
	{
		return isIsBusinessUserAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isBusinessUser</code> attribute. 
	 * @param value the isBusinessUser
	 */
	public void setIsBusinessUser(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, NendrasysCoreConstants.Attributes.Customer.ISBUSINESSUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isBusinessUser</code> attribute. 
	 * @param value the isBusinessUser
	 */
	public void setIsBusinessUser(final Customer item, final Boolean value)
	{
		setIsBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isBusinessUser</code> attribute. 
	 * @param value the isBusinessUser
	 */
	public void setIsBusinessUser(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsBusinessUser( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isBusinessUser</code> attribute. 
	 * @param value the isBusinessUser
	 */
	public void setIsBusinessUser(final Customer item, final boolean value)
	{
		setIsBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufactureDetails</code> attribute.
	 * @return the manufactureDetails
	 */
	public List<ManufactureDetails> getManufactureDetails(final SessionContext ctx, final Product item)
	{
		final List<ManufactureDetails> items = item.getLinkedItems( 
			ctx,
			true,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			"ManufactureDetails",
			null,
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufactureDetails</code> attribute.
	 * @return the manufactureDetails
	 */
	public List<ManufactureDetails> getManufactureDetails(final Product item)
	{
		return getManufactureDetails( getSession().getSessionContext(), item );
	}
	
	public long getManufactureDetailsCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			"ManufactureDetails",
			null
		);
	}
	
	public long getManufactureDetailsCount(final Product item)
	{
		return getManufactureDetailsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufactureDetails</code> attribute. 
	 * @param value the manufactureDetails
	 */
	public void setManufactureDetails(final SessionContext ctx, final Product item, final List<ManufactureDetails> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MDETAILSRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufactureDetails</code> attribute. 
	 * @param value the manufactureDetails
	 */
	public void setManufactureDetails(final Product item, final List<ManufactureDetails> value)
	{
		setManufactureDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufactureDetails. 
	 * @param value the item to add to manufactureDetails
	 */
	public void addToManufactureDetails(final SessionContext ctx, final Product item, final ManufactureDetails value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MDETAILSRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufactureDetails. 
	 * @param value the item to add to manufactureDetails
	 */
	public void addToManufactureDetails(final Product item, final ManufactureDetails value)
	{
		addToManufactureDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufactureDetails. 
	 * @param value the item to remove from manufactureDetails
	 */
	public void removeFromManufactureDetails(final SessionContext ctx, final Product item, final ManufactureDetails value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			NendrasysCoreConstants.Relations.MDETAILSRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MDETAILSRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MDETAILSRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufactureDetails. 
	 * @param value the item to remove from manufactureDetails
	 */
	public void removeFromManufactureDetails(final Product item, final ManufactureDetails value)
	{
		removeFromManufactureDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, NendrasysCoreConstants.Attributes.Customer.NEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer(final Customer item)
	{
		return isNewCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isNewCustomer( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive(final Customer item)
	{
		return isNewCustomerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, NendrasysCoreConstants.Attributes.Customer.NEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final Customer item, final Boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final Customer item, final boolean value)
	{
		setNewCustomer( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final Customer item, final boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.solrFacetSearchConfig</code> attribute.
	 * @return the solrFacetSearchConfig
	 */
	public List<SolrFacetSearchConfig> getSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item)
	{
		final List<SolrFacetSearchConfig> items = item.getLinkedItems( 
			ctx,
			true,
			NendrasysCoreConstants.Relations.CUSTOMPRICERELATION,
			"SolrFacetSearchConfig",
			null,
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.solrFacetSearchConfig</code> attribute.
	 * @return the solrFacetSearchConfig
	 */
	public List<SolrFacetSearchConfig> getSolrFacetSearchConfig(final UserGroup item)
	{
		return getSolrFacetSearchConfig( getSession().getSessionContext(), item );
	}
	
	public long getSolrFacetSearchConfigCount(final SessionContext ctx, final UserGroup item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			NendrasysCoreConstants.Relations.CUSTOMPRICERELATION,
			"SolrFacetSearchConfig",
			null
		);
	}
	
	public long getSolrFacetSearchConfigCount(final UserGroup item)
	{
		return getSolrFacetSearchConfigCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public List<UserGroup> getUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item)
	{
		final List<UserGroup> items = item.getLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.CUSTOMPRICERELATION,
			"UserGroup",
			null,
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public List<UserGroup> getUserGroup(final SolrFacetSearchConfig item)
	{
		return getUserGroup( getSession().getSessionContext(), item );
	}
	
	public long getUserGroupCount(final SessionContext ctx, final SolrFacetSearchConfig item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			NendrasysCoreConstants.Relations.CUSTOMPRICERELATION,
			"UserGroup",
			null
		);
	}
	
	public long getUserGroupCount(final SolrFacetSearchConfig item)
	{
		return getUserGroupCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final List<UserGroup> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.CUSTOMPRICERELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CUSTOMPRICERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final SolrFacetSearchConfig item, final List<UserGroup> value)
	{
		setUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to userGroup. 
	 * @param value the item to add to userGroup
	 */
	public void addToUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final UserGroup value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.CUSTOMPRICERELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CUSTOMPRICERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to userGroup. 
	 * @param value the item to add to userGroup
	 */
	public void addToUserGroup(final SolrFacetSearchConfig item, final UserGroup value)
	{
		addToUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from userGroup. 
	 * @param value the item to remove from userGroup
	 */
	public void removeFromUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final UserGroup value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			NendrasysCoreConstants.Relations.CUSTOMPRICERELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CUSTOMPRICERELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CUSTOMPRICERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from userGroup. 
	 * @param value the item to remove from userGroup
	 */
	public void removeFromUserGroup(final SolrFacetSearchConfig item, final UserGroup value)
	{
		removeFromUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.vatNumber</code> attribute.
	 * @return the vatNumber
	 */
	public String getVatNumber(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, NendrasysCoreConstants.Attributes.Address.VATNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.vatNumber</code> attribute.
	 * @return the vatNumber
	 */
	public String getVatNumber(final Address item)
	{
		return getVatNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.vatNumber</code> attribute. 
	 * @param value the vatNumber
	 */
	public void setVatNumber(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, NendrasysCoreConstants.Attributes.Address.VATNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.vatNumber</code> attribute. 
	 * @param value the vatNumber
	 */
	public void setVatNumber(final Address item, final String value)
	{
		setVatNumber( getSession().getSessionContext(), item, value );
	}
	
}
