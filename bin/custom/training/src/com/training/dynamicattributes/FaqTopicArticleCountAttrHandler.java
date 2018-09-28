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
package com.training.dynamicattributes;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import com.training.model.FaqTopicModel;


/**
 *
 */

public class FaqTopicArticleCountAttrHandler implements DynamicAttributeHandler<Integer, FaqTopicModel>
{

	@Override
	public Integer get(final FaqTopicModel faqTopicModel)
	{

		if (faqTopicModel.getFaqArticles() == null)
		{
			return Integer.valueOf(0);
		}

		return Integer.valueOf(faqTopicModel.getFaqArticles().size());
	}

	@Override
	public void set(final FaqTopicModel model, final Integer value)
	{
		throw new UnsupportedOperationException();
	}

}