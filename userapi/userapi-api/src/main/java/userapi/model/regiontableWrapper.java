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
 * This class is a wrapper for {@link regiontable}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see regiontable
 * @generated
 */
@ProviderType
public class regiontableWrapper implements regiontable,
	ModelWrapper<regiontable> {
	public regiontableWrapper(regiontable regiontable) {
		_regiontable = regiontable;
	}

	@Override
	public Class<?> getModelClass() {
		return regiontable.class;
	}

	@Override
	public String getModelClassName() {
		return regiontable.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("region_id", getRegion_id());
		attributes.put("region", getRegion());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer region_id = (Integer)attributes.get("region_id");

		if (region_id != null) {
			setRegion_id(region_id);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
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
		return _regiontable.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _regiontable.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _regiontable.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _regiontable.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.regiontable> toCacheModel() {
		return _regiontable.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.regiontable regiontable) {
		return _regiontable.compareTo(regiontable);
	}

	/**
	* Returns the business_id of this regiontable.
	*
	* @return the business_id of this regiontable
	*/
	@Override
	public int getBusiness_id() {
		return _regiontable.getBusiness_id();
	}

	/**
	* Returns the isactive of this regiontable.
	*
	* @return the isactive of this regiontable
	*/
	@Override
	public int getIsactive() {
		return _regiontable.getIsactive();
	}

	/**
	* Returns the primary key of this regiontable.
	*
	* @return the primary key of this regiontable
	*/
	@Override
	public int getPrimaryKey() {
		return _regiontable.getPrimaryKey();
	}

	/**
	* Returns the region_id of this regiontable.
	*
	* @return the region_id of this regiontable
	*/
	@Override
	public int getRegion_id() {
		return _regiontable.getRegion_id();
	}

	@Override
	public int hashCode() {
		return _regiontable.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _regiontable.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new regiontableWrapper((regiontable)_regiontable.clone());
	}

	/**
	* Returns the region of this regiontable.
	*
	* @return the region of this regiontable
	*/
	@Override
	public java.lang.String getRegion() {
		return _regiontable.getRegion();
	}

	@Override
	public java.lang.String toString() {
		return _regiontable.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _regiontable.toXmlString();
	}

	@Override
	public userapi.model.regiontable toEscapedModel() {
		return new regiontableWrapper(_regiontable.toEscapedModel());
	}

	@Override
	public userapi.model.regiontable toUnescapedModel() {
		return new regiontableWrapper(_regiontable.toUnescapedModel());
	}

	@Override
	public void persist() {
		_regiontable.persist();
	}

	/**
	* Sets the business_id of this regiontable.
	*
	* @param business_id the business_id of this regiontable
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_regiontable.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_regiontable.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_regiontable.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_regiontable.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_regiontable.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this regiontable.
	*
	* @param isactive the isactive of this regiontable
	*/
	@Override
	public void setIsactive(int isactive) {
		_regiontable.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_regiontable.setNew(n);
	}

	/**
	* Sets the primary key of this regiontable.
	*
	* @param primaryKey the primary key of this regiontable
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_regiontable.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_regiontable.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the region of this regiontable.
	*
	* @param region the region of this regiontable
	*/
	@Override
	public void setRegion(java.lang.String region) {
		_regiontable.setRegion(region);
	}

	/**
	* Sets the region_id of this regiontable.
	*
	* @param region_id the region_id of this regiontable
	*/
	@Override
	public void setRegion_id(int region_id) {
		_regiontable.setRegion_id(region_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof regiontableWrapper)) {
			return false;
		}

		regiontableWrapper regiontableWrapper = (regiontableWrapper)obj;

		if (Objects.equals(_regiontable, regiontableWrapper._regiontable)) {
			return true;
		}

		return false;
	}

	@Override
	public regiontable getWrappedModel() {
		return _regiontable;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _regiontable.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _regiontable.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_regiontable.resetOriginalValues();
	}

	private final regiontable _regiontable;
}