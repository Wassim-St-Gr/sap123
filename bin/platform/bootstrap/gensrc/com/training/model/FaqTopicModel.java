/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 5, 2018 4:14:38 PM                      ---
 * ----------------------------------------------------------------
 */
package com.training.model;

import com.training.model.FaqArticleModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type FaqTopic first defined at extension training.
 * <p>
 * FAQ topic like "checkout".
 */
@SuppressWarnings("all")
public class FaqTopicModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "FaqTopic";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqTopic.code</code> attribute defined at extension <code>training</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqTopic.name</code> attribute defined at extension <code>training</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqTopic.articleCount</code> attribute defined at extension <code>training</code>. */
	public static final String ARTICLECOUNT = "articleCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqTopic.faqArticles</code> attribute defined at extension <code>training</code>. */
	public static final String FAQARTICLES = "faqArticles";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public FaqTopicModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public FaqTopicModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>FaqTopic</code> at extension <code>training</code>
	 */
	@Deprecated
	public FaqTopicModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>FaqTopic</code> at extension <code>training</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public FaqTopicModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.articleCount</code> dynamic attribute defined at extension <code>training</code>. 
	 * @return the articleCount
	 */
	@Accessor(qualifier = "articleCount", type = Accessor.Type.GETTER)
	public Integer getArticleCount()
	{
		return getPersistenceContext().getDynamicValue(this,ARTICLECOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.code</code> attribute defined at extension <code>training</code>. 
	 * @return the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.faqArticles</code> attribute defined at extension <code>training</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the faqArticles
	 */
	@Accessor(qualifier = "faqArticles", type = Accessor.Type.GETTER)
	public Set<FaqArticleModel> getFaqArticles()
	{
		return getPersistenceContext().getPropertyValue(FAQARTICLES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.name</code> attribute defined at extension <code>training</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.name</code> attribute defined at extension <code>training</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FaqTopic.code</code> attribute defined at extension <code>training</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FaqTopic.faqArticles</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the faqArticles
	 */
	@Accessor(qualifier = "faqArticles", type = Accessor.Type.SETTER)
	public void setFaqArticles(final Set<FaqArticleModel> value)
	{
		getPersistenceContext().setPropertyValue(FAQARTICLES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FaqTopic.name</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>FaqTopic.name</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
}
