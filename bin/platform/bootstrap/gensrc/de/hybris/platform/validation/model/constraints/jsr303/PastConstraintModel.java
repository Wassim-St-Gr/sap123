/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 8, 2018 10:13:58 AM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.validation.model.constraints.jsr303;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.validation.model.constraints.AttributeConstraintModel;

/**
 * Generated model class for type PastConstraint first defined at extension validation.
 * <p>
 * Past JSR 303 compatible constraint class.
 */
@SuppressWarnings("all")
public class PastConstraintModel extends AttributeConstraintModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "PastConstraint";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PastConstraintModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PastConstraintModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _annotation initial attribute declared by type <code>PastConstraint</code> at extension <code>validation</code>
	 * @param _id initial attribute declared by type <code>AbstractConstraint</code> at extension <code>validation</code>
	 */
	@Deprecated
	public PastConstraintModel(final Class _annotation, final String _id)
	{
		super();
		setAnnotation(_annotation);
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _annotation initial attribute declared by type <code>PastConstraint</code> at extension <code>validation</code>
	 * @param _id initial attribute declared by type <code>AbstractConstraint</code> at extension <code>validation</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PastConstraintModel(final Class _annotation, final String _id, final ItemModel _owner)
	{
		super();
		setAnnotation(_annotation);
		setId(_id);
		setOwner(_owner);
	}
	
	
}
