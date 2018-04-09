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

package userapi.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link locationtable}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see locationtable
 * @generated
 */
@ProviderType
public class locationtableWrapper implements locationtable,
	ModelWrapper<locationtable> {
	public locationtableWrapper(locationtable locationtable) {
		_locationtable = locationtable;
	}

	@Override
	public Class<?> getModelClass() {
		return locationtable.class;
	}

	@Override
	public String getModelClassName() {
		return locationtable.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loc_id", getLoc_id());
		attributes.put("location", getLocation());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer loc_id = (Integer)attributes.get("loc_id");

		if (loc_id != null) {
			setLoc_id(loc_id);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Integer business_id = (Integer)attributes.get("business_id");

		if (business_id != null) {
			setBusiness_id(business_id);
		}

		Integer isactive = (Integer)attributes.get("isactive");

		if (isactive != null) {
			setIsactive(isactive);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _locationtable.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _locationtable.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _locationtable.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _locationtable.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.locationtable> toCacheModel() {
		return _locationtable.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.locationtable locationtable) {
		return _locationtable.compareTo(locationtable);
	}

	/**
	* Returns the business_id of this locationtable.
	*
	* @return the business_id of this locationtable
	*/
	@Override
	public int getBusiness_id() {
		return _locationtable.getBusiness_id();
	}

	/**
	* Returns the isactive of this locationtable.
	*
	* @return the isactive of this locationtable
	*/
	@Override
	public int getIsactive() {
		return _locationtable.getIsactive();
	}

	/**
	* Returns the loc_id of this locationtable.
	*
	* @return the loc_id of this locationtable
	*/
	@Override
	public int getLoc_id() {
		return _locationtable.getLoc_id();
	}

	/**
	* Returns the primary key of this locationtable.
	*
	* @return the primary key of this locationtable
	*/
	@Override
	public int getPrimaryKey() {
		return _locationtable.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _locationtable.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _locationtable.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new locationtableWrapper((locationtable)_locationtable.clone());
	}

	/**
	* Returns the location of this locationtable.
	*
	* @return the location of this locationtable
	*/
	@Override
	public java.lang.String getLocation() {
		return _locationtable.getLocation();
	}

	@Override
	public java.lang.String toString() {
		return _locationtable.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _locationtable.toXmlString();
	}

	@Override
	public userapi.model.locationtable toEscapedModel() {
		return new locationtableWrapper(_locationtable.toEscapedModel());
	}

	@Override
	public userapi.model.locationtable toUnescapedModel() {
		return new locationtableWrapper(_locationtable.toUnescapedModel());
	}

	@Override
	public void persist() {
		_locationtable.persist();
	}

	/**
	* Sets the business_id of this locationtable.
	*
	* @param business_id the business_id of this locationtable
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_locationtable.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_locationtable.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_locationtable.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_locationtable.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_locationtable.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this locationtable.
	*
	* @param isactive the isactive of this locationtable
	*/
	@Override
	public void setIsactive(int isactive) {
		_locationtable.setIsactive(isactive);
	}

	/**
	* Sets the loc_id of this locationtable.
	*
	* @param loc_id the loc_id of this locationtable
	*/
	@Override
	public void setLoc_id(int loc_id) {
		_locationtable.setLoc_id(loc_id);
	}

	/**
	* Sets the location of this locationtable.
	*
	* @param location the location of this locationtable
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_locationtable.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_locationtable.setNew(n);
	}

	/**
	* Sets the primary key of this locationtable.
	*
	* @param primaryKey the primary key of this locationtable
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_locationtable.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_locationtable.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof locationtableWrapper)) {
			return false;
		}

		locationtableWrapper locationtableWrapper = (locationtableWrapper)obj;

		if (Objects.equals(_locationtable, locationtableWrapper._locationtable)) {
			return true;
		}

		return false;
	}

	@Override
	public locationtable getWrappedModel() {
		return _locationtable;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _locationtable.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _locationtable.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_locationtable.resetOriginalValues();
	}

	private final locationtable _locationtable;
}