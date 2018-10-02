/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 2, 2018 9:23:49 AM                      ---
 * ----------------------------------------------------------------
 */
package com.training.jalo;

import com.training.jalo.FaqTopic;
import de.hybris.platform.catalog.jalo.Keyword;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.training.constants.TrainingConstants;

/**
 * Generated class for type {@link com.training.jalo.FaqArticle FaqArticle}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFaqArticle extends GenericItem
{
	/** Qualifier of the <code>FaqArticle.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>FaqArticle.question</code> attribute **/
	public static final String QUESTION = "question";
	/** Qualifier of the <code>FaqArticle.answer</code> attribute **/
	public static final String ANSWER = "answer";
	/** Qualifier of the <code>FaqArticle.priority</code> attribute **/
	public static final String PRIORITY = "priority";
	/** Qualifier of the <code>FaqArticle.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>FaqArticle.faqTopic</code> attribute **/
	public static final String FAQTOPIC = "faqTopic";
	/** Qualifier of the <code>FaqArticle.keywords</code> attribute **/
	public static final String KEYWORDS = "keywords";
	/** Relation ordering override parameter constants for FaqArticleToKeywordRel from ((training))*/
	protected static String FAQARTICLETOKEYWORDREL_SRC_ORDERED = "relation.FaqArticleToKeywordRel.source.ordered";
	protected static String FAQARTICLETOKEYWORDREL_TGT_ORDERED = "relation.FaqArticleToKeywordRel.target.ordered";
	/** Relation disable markmodifed parameter constants for FaqArticleToKeywordRel from ((training))*/
	protected static String FAQARTICLETOKEYWORDREL_MARKMODIFIED = "relation.FaqArticleToKeywordRel.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FAQTOPIC's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFaqArticle> FAQTOPICHANDLER = new BidirectionalOneToManyHandler<GeneratedFaqArticle>(
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
		tmp.put(QUESTION, AttributeMode.INITIAL);
		tmp.put(ANSWER, AttributeMode.INITIAL);
		tmp.put(PRIORITY, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(FAQTOPIC, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.answer</code> attribute.
	 * @return the answer
	 */
	public String getAnswer(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFaqArticle.getAnswer requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ANSWER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.answer</code> attribute.
	 * @return the answer
	 */
	public String getAnswer()
	{
		return getAnswer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.answer</code> attribute. 
	 * @return the localized answer
	 */
	public Map<Language,String> getAllAnswer(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ANSWER,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.answer</code> attribute. 
	 * @return the localized answer
	 */
	public Map<Language,String> getAllAnswer()
	{
		return getAllAnswer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAnswer(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFaqArticle.setAnswer requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ANSWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAnswer(final String value)
	{
		setAnswer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAllAnswer(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ANSWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAllAnswer(final Map<Language,String> value)
	{
		setAllAnswer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.code</code> attribute. 
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
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.code</code> attribute. 
	 * @param value the code
	 */
	protected void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FAQTOPICHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.faqTopic</code> attribute.
	 * @return the faqTopic
	 */
	public FaqTopic getFaqTopic(final SessionContext ctx)
	{
		return (FaqTopic)getProperty( ctx, FAQTOPIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.faqTopic</code> attribute.
	 * @return the faqTopic
	 */
	public FaqTopic getFaqTopic()
	{
		return getFaqTopic( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.faqTopic</code> attribute. 
	 * @param value the faqTopic
	 */
	protected void setFaqTopic(final SessionContext ctx, final FaqTopic value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+FAQTOPIC+"' is not changeable", 0 );
		}
		FAQTOPICHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.faqTopic</code> attribute. 
	 * @param value the faqTopic
	 */
	protected void setFaqTopic(final FaqTopic value)
	{
		setFaqTopic( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Keyword");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(FAQARTICLETOKEYWORDREL_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.keywords</code> attribute.
	 * @return the keywords
	 */
	public Set<Keyword> getKeywords(final SessionContext ctx)
	{
		final List<Keyword> items = getLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			"Keyword",
			null,
			false,
			false
		);
		return new LinkedHashSet<Keyword>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.keywords</code> attribute.
	 * @return the keywords
	 */
	public Set<Keyword> getKeywords()
	{
		return getKeywords( getSession().getSessionContext() );
	}
	
	public long getKeywordsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			"Keyword",
			null
		);
	}
	
	public long getKeywordsCount()
	{
		return getKeywordsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final SessionContext ctx, final Set<Keyword> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(FAQARTICLETOKEYWORDREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final Set<Keyword> value)
	{
		setKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to keywords. 
	 * @param value the item to add to keywords
	 */
	public void addToKeywords(final SessionContext ctx, final Keyword value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FAQARTICLETOKEYWORDREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to keywords. 
	 * @param value the item to add to keywords
	 */
	public void addToKeywords(final Keyword value)
	{
		addToKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from keywords. 
	 * @param value the item to remove from keywords
	 */
	public void removeFromKeywords(final SessionContext ctx, final Keyword value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FAQARTICLETOKEYWORDREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from keywords. 
	 * @param value the item to remove from keywords
	 */
	public void removeFromKeywords(final Keyword value)
	{
		removeFromKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.priority</code> attribute.
	 * @return the priority
	 */
	public Integer getPriority(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.priority</code> attribute.
	 * @return the priority
	 */
	public Integer getPriority()
	{
		return getPriority( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.priority</code> attribute. 
	 * @return the priority
	 */
	public int getPriorityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPriority( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.priority</code> attribute. 
	 * @return the priority
	 */
	public int getPriorityAsPrimitive()
	{
		return getPriorityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final Integer value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final int value)
	{
		setPriority( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final int value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.question</code> attribute.
	 * @return the question
	 */
	public String getQuestion(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFaqArticle.getQuestion requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, QUESTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.question</code> attribute.
	 * @return the question
	 */
	public String getQuestion()
	{
		return getQuestion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.question</code> attribute. 
	 * @return the localized question
	 */
	public Map<Language,String> getAllQuestion(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,QUESTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.question</code> attribute. 
	 * @return the localized question
	 */
	public Map<Language,String> getAllQuestion()
	{
		return getAllQuestion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.question</code> attribute. 
	 * @param value the question
	 */
	public void setQuestion(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFaqArticle.setQuestion requires a session language", 0 );
		}
		setLocalizedProperty(ctx, QUESTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.question</code> attribute. 
	 * @param value the question
	 */
	public void setQuestion(final String value)
	{
		setQuestion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.question</code> attribute. 
	 * @param value the question
	 */
	public void setAllQuestion(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,QUESTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.question</code> attribute. 
	 * @param value the question
	 */
	public void setAllQuestion(final Map<Language,String> value)
	{
		setAllQuestion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FaqArticle.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
