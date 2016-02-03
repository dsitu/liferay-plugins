/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.samplealloymvc.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.samplealloymvc.model.Checkout;
import com.liferay.samplealloymvc.service.CheckoutLocalServiceUtil;

/**
 * The extended model base implementation for the Checkout service. Represents a row in the &quot;SAMVC_Checkout&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CheckoutImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CheckoutImpl
 * @see Checkout
 * @generated
 */
@ProviderType
public abstract class CheckoutBaseImpl extends CheckoutModelImpl
	implements Checkout {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a checkout model instance should use the {@link Checkout} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CheckoutLocalServiceUtil.addCheckout(this);
		}
		else {
			CheckoutLocalServiceUtil.updateCheckout(this);
		}
	}
}