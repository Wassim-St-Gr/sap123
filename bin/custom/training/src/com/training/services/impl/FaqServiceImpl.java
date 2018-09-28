/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2018 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.training.services.impl;

import de.hybris.platform.catalog.model.KeywordModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.training.enums.FaqArticleStatus;

import com.training.model.FaqArticleModel;
import com.training.model.FaqTopicModel;
import com.training.services.FaqService;


/**
 *
 */
public class FaqServiceImpl implements FaqService
{

	private FlexibleSearchService flexibleSearchService;

	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	@Override
	public FaqTopicModel getFaqTopic(final String code)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery("SELECT {PK} FROM {FaqTopic} WHERE {code} = ?code ");
		query.addQueryParameter("code", code);

		return flexibleSearchService.searchUnique(query);
	}

	@Override
	public List<FaqArticleModel> getFaqAnswers(final FaqArticleStatus status)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(
				"SELECT {art.PK} FROM {FaqArticle AS art} WHERE {art.status} = ?status ");
		query.addQueryParameter("status", status);

		final SearchResult<FaqArticleModel> res = flexibleSearchService.search(query);

		return res.getResult();
	}

	@Override
	public List<FaqArticleModel> getFaqAnswers(final String keyword)
	{
		final StringBuilder queryString = new StringBuilder("SELECT {art.");
		queryString.append(ItemModel.PK).append("} FROM {").append(FaqArticleModel._TYPECODE);
		queryString.append(" AS art JOIN ").append(KeywordModel._FAQARTICLETOKEYWORDREL);
		queryString.append(" AS rel ON {art.").append(ItemModel.PK);
		queryString.append("}={rel.source} JOIN ").append(KeywordModel._TYPECODE);
		queryString.append(" as k ON {rel.target}={k.");
		queryString.append(ItemModel.PK).append("} JOIN ").append(FaqArticleStatus._TYPECODE);
		queryString.append(" AS artStat ON {art.");
		queryString.append(FaqArticleModel.STATUS).append("}={artStat.").append(ItemModel.PK);
		queryString.append("}} where {k.").append(KeywordModel.KEYWORD).append("} = ?keyword AND {art.");
		queryString.append(FaqArticleModel.STATUS).append("} = ?status");

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString.toString());

		// Fetching only Approved Faq Articles
		query.addQueryParameter("status", FaqArticleStatus.APPROVED);
		query.addQueryParameter("keyword", keyword);
		final SearchResult<FaqArticleModel> res = flexibleSearchService.search(query);
		return res.getResult();
	}
}