/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 8, 2018 8:50:07 AM                      ---
 * ----------------------------------------------------------------
 */
package org.training.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedTrainingConstants
{
	public static final String EXTENSIONNAME = "training";
	public static class TC
	{
		public static final String FAQARTICLE = "FaqArticle".intern();
		public static final String FAQARTICLESTATUS = "FaqArticleStatus".intern();
		public static final String FAQTOPIC = "FaqTopic".intern();
	}
	public static class Attributes
	{
		public static class Keyword
		{
			public static final String FAQARTICLES = "faqArticles".intern();
		}
	}
	public static class Enumerations
	{
		public static class FaqArticleStatus
		{
			public static final String NEW = "NEW".intern();
			public static final String CHECK = "CHECK".intern();
			public static final String APPROVED = "APPROVED".intern();
			public static final String REJECTED = "REJECTED".intern();
		}
	}
	public static class Relations
	{
		public static final String FAQARTICLETOKEYWORDREL = "FaqArticleToKeywordRel".intern();
		public static final String FAQTOPICTOARTICLEREL = "FaqTopicToArticleRel".intern();
	}
	
	protected GeneratedTrainingConstants()
	{
		// private constructor
	}
	
	
}
