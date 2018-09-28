/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 28, 2018 8:53:44 AM                     ---
 * ----------------------------------------------------------------
 */
package com.training.jalo;

import com.training.jalo.FaqArticle;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.training.constants.TrainingConstants;

/**
 * Generated class for type {@link com.training.jalo.FaqTopic FaqTopic}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFaqTopic extends GenericItem
{
	/** Qualifier of the <code>FaqTopic.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>FaqTopic.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>FaqTopic.faqArticles</code> attribute **/
	public static final String FAQARTICLES = "faqArticles";
	/**
	* {@link OneToManyHandler} for handling 1:n FAQARTICLES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FaqArticle> FAQARTICLESHANDLER = new OneToManyHandler<FaqArticle>(
	TrainingConstants.TC.FAQARTICLE,
	false,
	"faqTopic",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.code</code> attribute. 
	 * @param value the code
	 */
	protected void setCode(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CODE+"' is not changeable", 0 );
		}
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.code</code> attribute. 
	 * @param value the code
	 */
	protected void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.faqArticles</code> attribute.
	 * @return the faqArticles
	 */
	public Set<FaqArticle> getFaqArticles(final SessionContext ctx)
	{
		return (Set<FaqArticle>)FAQARTICLESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.faqArticles</code> attribute.
	 * @return the faqArticles
	 */
	public Set<FaqArticle> getFaqArticles()
	{
		return getFaqArticles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.faqArticles</code> attribute. 
	 * @param value the faqArticles
	 */
	public void setFaqArticles(final SessionContext ctx, final Set<FaqArticle> value)
	{
		FAQARTICLESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.faqArticles</code> attribute. 
	 * @param value the faqArticles
	 */
	public void setFaqArticles(final Set<FaqArticle> value)
	{
		setFaqArticles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to faqArticles. 
	 * @param value the item to add to faqArticles
	 */
	public void addToFaqArticles(final SessionContext ctx, final FaqArticle value)
	{
		FAQARTICLESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to faqArticles. 
	 * @param value the item to add to faqArticles
	 */
	public void addToFaqArticles(final FaqArticle value)
	{
		addToFaqArticles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from faqArticles. 
	 * @param value the item to remove from faqArticles
	 */
	public void removeFromFaqArticles(final SessionContext ctx, final FaqArticle value)
	{
		FAQARTICLESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from faqArticles. 
	 * @param value the item to remove from faqArticles
	 */
	public void removeFromFaqArticles(final FaqArticle value)
	{
		removeFromFaqArticles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFaqTopic.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqTopic.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFaqTopic.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqTopic.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
