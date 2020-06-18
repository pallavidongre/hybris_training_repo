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
package de.hybris.platform.samlsinglesignon.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.TypeModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type SamlUserGroup first defined at extension samlsinglesignon.
 */
@SuppressWarnings("all")
public class SamlUserGroupModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SamlUserGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>SamlUserGroup.samlUserGroup</code> attribute defined at extension <code>samlsinglesignon</code>. */
	public static final String SAMLUSERGROUP = "samlUserGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>SamlUserGroup.userType</code> attribute defined at extension <code>samlsinglesignon</code>. */
	public static final String USERTYPE = "userType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SamlUserGroup.userGroups</code> attribute defined at extension <code>samlsinglesignon</code>. */
	public static final String USERGROUPS = "userGroups";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SamlUserGroupModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SamlUserGroupModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _samlUserGroup initial attribute declared by type <code>SamlUserGroup</code> at extension <code>samlsinglesignon</code>
	 * @param _userGroups initial attribute declared by type <code>SamlUserGroup</code> at extension <code>samlsinglesignon</code>
	 * @param _userType initial attribute declared by type <code>SamlUserGroup</code> at extension <code>samlsinglesignon</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SamlUserGroupModel(final String _samlUserGroup, final Set<UserGroupModel> _userGroups, final TypeModel _userType)
	{
		super();
		setSamlUserGroup(_samlUserGroup);
		setUserGroups(_userGroups);
		setUserType(_userType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _samlUserGroup initial attribute declared by type <code>SamlUserGroup</code> at extension <code>samlsinglesignon</code>
	 * @param _userGroups initial attribute declared by type <code>SamlUserGroup</code> at extension <code>samlsinglesignon</code>
	 * @param _userType initial attribute declared by type <code>SamlUserGroup</code> at extension <code>samlsinglesignon</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SamlUserGroupModel(final ItemModel _owner, final String _samlUserGroup, final Set<UserGroupModel> _userGroups, final TypeModel _userType)
	{
		super();
		setOwner(_owner);
		setSamlUserGroup(_samlUserGroup);
		setUserGroups(_userGroups);
		setUserType(_userType);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SamlUserGroup.samlUserGroup</code> attribute defined at extension <code>samlsinglesignon</code>. 
	 * @return the samlUserGroup
	 */
	@Accessor(qualifier = "samlUserGroup", type = Accessor.Type.GETTER)
	public String getSamlUserGroup()
	{
		return getPersistenceContext().getPropertyValue(SAMLUSERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SamlUserGroup.userGroups</code> attribute defined at extension <code>samlsinglesignon</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the userGroups
	 */
	@Accessor(qualifier = "userGroups", type = Accessor.Type.GETTER)
	public Set<UserGroupModel> getUserGroups()
	{
		return getPersistenceContext().getPropertyValue(USERGROUPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SamlUserGroup.userType</code> attribute defined at extension <code>samlsinglesignon</code>. 
	 * @return the userType
	 */
	@Accessor(qualifier = "userType", type = Accessor.Type.GETTER)
	public TypeModel getUserType()
	{
		return getPersistenceContext().getPropertyValue(USERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SamlUserGroup.samlUserGroup</code> attribute defined at extension <code>samlsinglesignon</code>. 
	 *  
	 * @param value the samlUserGroup
	 */
	@Accessor(qualifier = "samlUserGroup", type = Accessor.Type.SETTER)
	public void setSamlUserGroup(final String value)
	{
		getPersistenceContext().setPropertyValue(SAMLUSERGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SamlUserGroup.userGroups</code> attribute defined at extension <code>samlsinglesignon</code>. 
	 *  
	 * @param value the userGroups
	 */
	@Accessor(qualifier = "userGroups", type = Accessor.Type.SETTER)
	public void setUserGroups(final Set<UserGroupModel> value)
	{
		getPersistenceContext().setPropertyValue(USERGROUPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SamlUserGroup.userType</code> attribute defined at extension <code>samlsinglesignon</code>. 
	 *  
	 * @param value the userType
	 */
	@Accessor(qualifier = "userType", type = Accessor.Type.SETTER)
	public void setUserType(final TypeModel value)
	{
		getPersistenceContext().setPropertyValue(USERTYPE, value);
	}
	
}
