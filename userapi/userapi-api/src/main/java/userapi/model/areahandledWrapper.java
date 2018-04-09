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
 * This class is a wrapper for {@link areahandled}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see areahandled
 * @generated
 */
@ProviderType
public class areahandledWrapper implements areahandled,
	ModelWrapper<areahandled> {
	public areahandledWrapper(areahandled areahandled) {
		_areahandled = areahandled;
	}

	@Override
	public Class<?> getModelClass() {
		return areahandled.class;
	}

	@Override
	public String getModelClassName() {
		return areahandled.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("area_id", getArea_id());
		attributes.put("area", getArea());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer area_id = (Integer)attributes.get("area_id");

		if (area_id != null) {
			setArea_id(area_id);
		}

		String area = (String)attributes.get("area");

		if (area != null) {
			setArea(area);
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
		return _areahandled.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _areahandled.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _areahandled.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _areahandled.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.areahandled> toCacheModel() {
		return _areahandled.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.areahandled areahandled) {
		return _areahandled.compareTo(areahandled);
	}

	/**
	* Returns the area_id of this areahandled.
	*
	* @return the area_id of this areahandled
	*/
	@Override
	public int getArea_id() {
		return _areahandled.getArea_id();
	}

	/**
	* Returns the business_id of this areahandled.
	*
	* @return the business_id of this areahandled
	*/
	@Override
	public int getBusiness_id() {
		return _areahandled.getBusiness_id();
	}

	/**
	* Returns the isactive of this areahandled.
	*
	* @return the isactive of this areahandled
	*/
	@Override
	public int getIsactive() {
		return _areahandled.getIsactive();
	}

	/**
	* Returns the primary key of this areahandled.
	*
	* @return the primary key of this areahandled
	*/
	@Override
	public int getPrimaryKey() {
		return _areahandled.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _areahandled.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _areahandled.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new areahandledWrapper((areahandled)_areahandled.clone());
	}

	/**
	* Returns the area of this areahandled.
	*
	* @return the area of this areahandled
	*/
	@Override
	public java.lang.String getArea() {
		return _areahandled.getArea();
	}

	@Override
	public java.lang.String toString() {
		return _areahandled.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _areahandled.toXmlString();
	}

	@Override
	public userapi.model.areahandled toEscapedModel() {
		return new areahandledWrapper(_areahandled.toEscapedModel());
	}

	@Override
	public userapi.model.areahandled toUnescapedModel() {
		return new areahandledWrapper(_areahandled.toUnescapedModel());
	}

	@Override
	public void persist() {
		_areahandled.persist();
	}

	/**
	* Sets the area of this areahandled.
	*
	* @param area the area of this areahandled
	*/
	@Override
	public void setArea(java.lang.String area) {
		_areahandled.setArea(area);
	}

	/**
	* Sets the area_id of this areahandled.
	*
	* @param area_id the area_id of this areahandled
	*/
	@Override
	public void setArea_id(int area_id) {
		_areahandled.setArea_id(area_id);
	}

	/**
	* Sets the business_id of this areahandled.
	*
	* @param business_id the business_id of this areahandled
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_areahandled.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_areahandled.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_areahandled.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_areahandled.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_areahandled.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this areahandled.
	*
	* @param isactive the isactive of this areahandled
	*/
	@Override
	public void setIsactive(int isactive) {
		_areahandled.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_areahandled.setNew(n);
	}

	/**
	* Sets the primary key of this areahandled.
	*
	* @param primaryKey the primary key of this areahandled
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_areahandled.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_areahandled.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof areahandledWrapper)) {
			return false;
		}

		areahandledWrapper areahandledWrapper = (areahandledWrapper)obj;

		if (Objects.equals(_areahandled, areahandledWrapper._areahandled)) {
			return true;
		}

		return false;
	}

	@Override
	public areahandled getWrappedModel() {
		return _areahandled;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _areahandled.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _areahandled.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_areahandled.resetOriginalValues();
	}

	private final areahandled _areahandled;
}