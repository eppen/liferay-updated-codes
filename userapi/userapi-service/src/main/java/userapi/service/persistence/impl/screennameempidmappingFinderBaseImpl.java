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

package userapi.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import userapi.model.screennameempidmapping;

import userapi.service.persistence.screennameempidmappingPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class screennameempidmappingFinderBaseImpl extends BasePersistenceImpl<screennameempidmapping> {
	public screennameempidmappingFinderBaseImpl() {
		setModelClass(screennameempidmapping.class);
	}

	/**
	 * Returns the screennameempidmapping persistence.
	 *
	 * @return the screennameempidmapping persistence
	 */
	public screennameempidmappingPersistence getscreennameempidmappingPersistence() {
		return screennameempidmappingPersistence;
	}

	/**
	 * Sets the screennameempidmapping persistence.
	 *
	 * @param screennameempidmappingPersistence the screennameempidmapping persistence
	 */
	public void setscreennameempidmappingPersistence(
		screennameempidmappingPersistence screennameempidmappingPersistence) {
		this.screennameempidmappingPersistence = screennameempidmappingPersistence;
	}

	@BeanReference(type = screennameempidmappingPersistence.class)
	protected screennameempidmappingPersistence screennameempidmappingPersistence;
}