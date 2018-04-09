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

package userapi.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link jvbranchService}.
 *
 * @author Brian Wing Shun Chan
 * @see jvbranchService
 * @generated
 */
@ProviderType
public class jvbranchServiceWrapper implements jvbranchService,
	ServiceWrapper<jvbranchService> {
	public jvbranchServiceWrapper(jvbranchService jvbranchService) {
		_jvbranchService = jvbranchService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _jvbranchService.getOSGiServiceIdentifier();
	}

	@Override
	public jvbranchService getWrappedService() {
		return _jvbranchService;
	}

	@Override
	public void setWrappedService(jvbranchService jvbranchService) {
		_jvbranchService = jvbranchService;
	}

	private jvbranchService _jvbranchService;
}