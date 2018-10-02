/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 2, 2018 12:01:49 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import com.training.jalo.FaqArticle;
import com.training.jalo.FaqTopic;
import de.hybris.platform.catalog.jalo.Keyword;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.training.constants.TrainingConstants;

/**
 * Generated class for type <code>TrainingManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingManager extends Extension
{
	/** Relation ordering override parameter constants for FaqArticleToKeywordRel from ((training))*/
	protected static String FAQARTICLETOKEYWORDREL_SRC_ORDERED = "relation.FaqArticleToKeywordRel.source.ordered";
	protected static String FAQARTICLETOKEYWORDREL_TGT_ORDERED = "relation.FaqArticleToKeywordRel.target.ordered";
	/** Relation disable markmodifed parameter constants for FaqArticleToKeywordRel from ((training))*/
	protected static String FAQARTICLETOKEYWORDREL_MARKMODIFIED = "relation.FaqArticleToKeywordRel.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	
	public FaqArticle createFaqArticle(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingConstants.TC.FAQARTICLE );
			return (FaqArticle)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FaqArticle : "+e.getMessage(), 0 );
		}
	}
	
	public FaqArticle createFaqArticle(final Map attributeValues)
	{
		return createFaqArticle( getSession().getSessionContext(), attributeValues );
	}
	
	public FaqTopic createFaqTopic(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingConstants.TC.FAQTOPIC );
			return (FaqTopic)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FaqTopic : "+e.getMessage(), 0 );
		}
	}
	
	public FaqTopic createFaqTopic(final Map attributeValues)
	{
		return createFaqTopic( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Keyword.faqArticles</code> attribute.
	 * @return the faqArticles
	 */
	public Set<FaqArticle> getFaqArticles(final SessionContext ctx, final Keyword item)
	{
		final List<FaqArticle> items = item.getLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			"FaqArticle",
			null,
			false,
			false
		);
		return new LinkedHashSet<FaqArticle>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Keyword.faqArticles</code> attribute.
	 * @return the faqArticles
	 */
	public Set<FaqArticle> getFaqArticles(final Keyword item)
	{
		return getFaqArticles( getSession().getSessionContext(), item );
	}
	
	public long getFaqArticlesCount(final SessionContext ctx, final Keyword item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			"FaqArticle",
			null
		);
	}
	
	public long getFaqArticlesCount(final Keyword item)
	{
		return getFaqArticlesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Keyword.faqArticles</code> attribute. 
	 * @param value the faqArticles
	 */
	public void setFaqArticles(final SessionContext ctx, final Keyword item, final Set<FaqArticle> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(FAQARTICLETOKEYWORDREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Keyword.faqArticles</code> attribute. 
	 * @param value the faqArticles
	 */
	public void setFaqArticles(final Keyword item, final Set<FaqArticle> value)
	{
		setFaqArticles( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to faqArticles. 
	 * @param value the item to add to faqArticles
	 */
	public void addToFaqArticles(final SessionContext ctx, final Keyword item, final FaqArticle value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FAQARTICLETOKEYWORDREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to faqArticles. 
	 * @param value the item to add to faqArticles
	 */
	public void addToFaqArticles(final Keyword item, final FaqArticle value)
	{
		addToFaqArticles( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from faqArticles. 
	 * @param value the item to remove from faqArticles
	 */
	public void removeFromFaqArticles(final SessionContext ctx, final Keyword item, final FaqArticle value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.FAQARTICLETOKEYWORDREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FAQARTICLETOKEYWORDREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from faqArticles. 
	 * @param value the item to remove from faqArticles
	 */
	public void removeFromFaqArticles(final Keyword item, final FaqArticle value)
	{
		removeFromFaqArticles( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingConstants.EXTENSIONNAME;
	}
	
}
