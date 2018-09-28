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

package com.training.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;

import com.training.model.FaqTopicModel;


/**
 *
 */

public class FaqTopicPrepareInterceptor implements PrepareInterceptor
{

	/* injected key generator (Number Series) */
	private KeyGenerator keyGenerator;


	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		// first lets check if model is new and is of proper type (you can configure interceptor later on to any type by configuration)
		if (ctx.isNew(model) && model instanceof FaqTopicModel)
		{
			final FaqTopicModel faqTopic = (FaqTopicModel) model;
			if (StringUtils.isEmpty(faqTopic.getCode()))
			{
				faqTopic.setCode(keyGenerator.generate().toString());
			}
		}

	}

	@Required
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
