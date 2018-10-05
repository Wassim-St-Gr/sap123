/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 5, 2018 1:17:29 PM                      ---
 * ----------------------------------------------------------------
 */
package com.training.model;

import com.training.model.FaqTopicModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.KeywordModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;
import java.util.Set;
import org.training.enums.FaqArticleStatus;

/**
 * Generated model class for type FaqArticle first defined at extension training.
 * <p>
 * FAQ article what contains questions and answers.
 */
@SuppressWarnings("all")
public class FaqArticleModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "FaqArticle";
	
	/**<i>Generated relation code constant for relation <code>FaqTopicToArticleRel</code> defining source attribute <code>faqTopic</code> in extension <code>training</code>.</i>*/
	public static final String _FAQTOPICTOARTICLEREL = "FaqTopicToArticleRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqArticle.code</code> attribute defined at extension <code>training</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqArticle.question</code> attribute defined at extension <code>training</code>. */
	public static final String QUESTION = "question";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqArticle.answer</code> attribute defined at extension <code>training</code>. */
	public static final String ANSWER = "answer";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqArticle.priority</code> attribute defined at extension <code>training</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqArticle.status</code> attribute defined at extension <code>training</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqArticle.faqTopic</code> attribute defined at extension <code>training</code>. */
	public static final String FAQTOPIC = "faqTopic";
	
	/** <i>Generated constant</i> - Attribute key of <code>FaqArticle.keywords</code> attribute defined at extension <code>training</code>. */
	public static final String KEYWORDS = "keywords";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public FaqArticleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public FaqArticleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>FaqArticle</code> at extension <code>training</code>
	 * @param _faqTopic initial attribute declared by type <code>FaqArticle</code> at extension <code>training</code>
	 */
	@Deprecated
	public FaqArticleModel(final String _code, final FaqTopicModel _faqTopic)
	{
		super();
		setCode(_code);
		setFaqTopic(_faqTopic);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>FaqArticle</code> at extension <code>training</code>
	 * @param _faqTopic initial attribute declared by type <code>FaqArticle</code> at extension <code>training</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public FaqArticleModel(final String _code, final FaqTopicModel _faqTopic, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setFaqTopic(_faqTopic);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.answer</code> attribute defined at extension <code>training</code>. 
	 * @return the answer
	 */
	@Accessor(qualifier = "answer", type = Accessor.Type.GETTER)
	public String getAnswer()
	{
		return getAnswer(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.answer</code> attribute defined at extension <code>training</code>. 
	 * @param loc the value localization key 
	 * @return the answer
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "answer", type = Accessor.Type.GETTER)
	public String getAnswer(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(ANSWER, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.code</code> attribute defined at extension <code>training</code>. 
	 * @return the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.faqTopic</code> attribute defined at extension <code>training</code>. 
	 * @return the faqTopic
	 */
	@Accessor(qualifier = "faqTopic", type = Accessor.Type.GETTER)
	public FaqTopicModel getFaqTopic()
	{
		return getPersistenceContext().getPropertyValue(FAQTOPIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.keywords</code> attribute defined at extension <code>training</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the keywords
	 */
	@Accessor(qualifier = "keywords", type = Accessor.Type.GETTER)
	public Set<KeywordModel> getKeywords()
	{
		return getPersistenceContext().getPropertyValue(KEYWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.priority</code> attribute defined at extension <code>training</code>. 
	 * @return the priority
	 */
	@Accessor(qualifier = "priority", type = Accessor.Type.GETTER)
	public Integer getPriority()
	{
		return getPersistenceContext().getPropertyValue(PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.question</code> attribute defined at extension <code>training</code>. 
	 * @return the question
	 */
	@Accessor(qualifier = "question", type = Accessor.Type.GETTER)
	public String getQuestion()
	{
		return getQuestion(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.question</code> attribute defined at extension <code>training</code>. 
	 * @param loc the value localization key 
	 * @return the question
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "question", type = Accessor.Type.GETTER)
	public String getQuestion(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(QUESTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FaqArticle.status</code> attribute defined at extension <code>training</code>. 
	 * @return the status
	 */
	@Accessor(qualifier = "status", type = Accessor.Type.GETTER)
	public FaqArticleStatus getStatus()
	{
		return getPersistenceContext().getPropertyValue(STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FaqArticle.answer</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the answer
	 */
	@Accessor(qualifier = "answer", type = Accessor.Type.SETTER)
	public void setAnswer(final String value)
	{
		setAnswer(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>FaqArticle.answer</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the answer
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "answer", type = Accessor.Type.SETTER)
	public void setAnswer(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(ANSWER, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FaqArticle.code</code> attribute defined at extension <code>training</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>FaqArticle.faqTopic</code> attribute defined at extension <code>training</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the faqTopic
	 */
	@Accessor(qualifier = "faqTopic", type = Accessor.Type.SETTER)
	public void setFaqTopic(final FaqTopicModel value)
	{
		getPersistenceContext().setPropertyValue(FAQTOPIC, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FaqArticle.keywords</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the keywords
	 */
	@Accessor(qualifier = "keywords", type = Accessor.Type.SETTER)
	public void setKeywords(final Set<KeywordModel> value)
	{
		getPersistenceContext().setPropertyValue(KEYWORDS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FaqArticle.priority</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the priority
	 */
	@Accessor(qualifier = "priority", type = Accessor.Type.SETTER)
	public void setPriority(final Integer value)
	{
		getPersistenceContext().setPropertyValue(PRIORITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FaqArticle.question</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the question
	 */
	@Accessor(qualifier = "question", type = Accessor.Type.SETTER)
	public void setQuestion(final String value)
	{
		setQuestion(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>FaqArticle.question</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the question
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "question", type = Accessor.Type.SETTER)
	public void setQuestion(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(QUESTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>FaqArticle.status</code> attribute defined at extension <code>training</code>. 
	 *  
	 * @param value the status
	 */
	@Accessor(qualifier = "status", type = Accessor.Type.SETTER)
	public void setStatus(final FaqArticleStatus value)
	{
		getPersistenceContext().setPropertyValue(STATUS, value);
	}
	
}
