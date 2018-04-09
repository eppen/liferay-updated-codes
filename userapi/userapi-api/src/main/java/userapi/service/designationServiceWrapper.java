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
 * Provides a wrapper for {@link designationService}.
 *
 * @author Brian Wing Shun Chan
 * @see designationService
 * @generated
 */
@ProviderType
public class designationServiceWrapper implements designationService,
	ServiceWrapper<designationService> {
	public designationServiceWrapper(designationService designationService) {
		_designationService = designationService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _designationService.getOSGiServiceIdentifier();
	}

	@Override
	public designationService getWrappedService() {
		return _designationService;
	}

	@Override
	public void setWrappedService(designationService designationService) {
		_designationService = designationService;
	}

	private designationService _designationService;
}