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
 * This class is a wrapper for {@link unit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see unit
 * @generated
 */
@ProviderType
public class unitWrapper implements unit, ModelWrapper<unit> {
	public unitWrapper(unit unit) {
		_unit = unit;
	}

	@Override
	public Class<?> getModelClass() {
		return unit.class;
	}

	@Override
	public String getModelClassName() {
		return unit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("unit_id", getUnit_id());
		attributes.put("unit", getUnit());
		attributes.put("short_name", getShort_name());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer unit_id = (Integer)attributes.get("unit_id");

		if (unit_id != null) {
			setUnit_id(unit_id);
		}

		String unit = (String)attributes.get("unit");

		if (unit != null) {
			setUnit(unit);
		}

		String short_name = (String)attributes.get("short_name");

		if (short_name != null) {
			setShort_name(short_name);
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
		return _unit.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _unit.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _unit.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _unit.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.unit> toCacheModel() {
		return _unit.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.unit unit) {
		return _unit.compareTo(unit);
	}

	/**
	* Returns the business_id of this unit.
	*
	* @return the business_id of this unit
	*/
	@Override
	public int getBusiness_id() {
		return _unit.getBusiness_id();
	}

	/**
	* Returns the isactive of this unit.
	*
	* @return the isactive of this unit
	*/
	@Override
	public int getIsactive() {
		return _unit.getIsactive();
	}

	/**
	* Returns the primary key of this unit.
	*
	* @return the primary key of this unit
	*/
	@Override
	public int getPrimaryKey() {
		return _unit.getPrimaryKey();
	}

	/**
	* Returns the unit_id of this unit.
	*
	* @return the unit_id of this unit
	*/
	@Override
	public int getUnit_id() {
		return _unit.getUnit_id();
	}

	@Override
	public int hashCode() {
		return _unit.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _unit.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new unitWrapper((unit)_unit.clone());
	}

	/**
	* Returns the short_name of this unit.
	*
	* @return the short_name of this unit
	*/
	@Override
	public java.lang.String getShort_name() {
		return _unit.getShort_name();
	}

	/**
	* Returns the unit of this unit.
	*
	* @return the unit of this unit
	*/
	@Override
	public java.lang.String getUnit() {
		return _unit.getUnit();
	}

	@Override
	public java.lang.String toString() {
		return _unit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _unit.toXmlString();
	}

	@Override
	public userapi.model.unit toEscapedModel() {
		return new unitWrapper(_unit.toEscapedModel());
	}

	@Override
	public userapi.model.unit toUnescapedModel() {
		return new unitWrapper(_unit.toUnescapedModel());
	}

	@Override
	public void persist() {
		_unit.persist();
	}

	/**
	* Sets the business_id of this unit.
	*
	* @param business_id the business_id of this unit
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_unit.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_unit.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_unit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_unit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_unit.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this unit.
	*
	* @param isactive the isactive of this unit
	*/
	@Override
	public void setIsactive(int isactive) {
		_unit.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_unit.setNew(n);
	}

	/**
	* Sets the primary key of this unit.
	*
	* @param primaryKey the primary key of this unit
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_unit.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_unit.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the short_name of this unit.
	*
	* @param short_name the short_name of this unit
	*/
	@Override
	public void setShort_name(java.lang.String short_name) {
		_unit.setShort_name(short_name);
	}

	/**
	* Sets the unit of this unit.
	*
	* @param unit the unit of this unit
	*/
	@Override
	public void setUnit(java.lang.String unit) {
		_unit.setUnit(unit);
	}

	/**
	* Sets the unit_id of this unit.
	*
	* @param unit_id the unit_id of this unit
	*/
	@Override
	public void setUnit_id(int unit_id) {
		_unit.setUnit_id(unit_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof unitWrapper)) {
			return false;
		}

		unitWrapper unitWrapper = (unitWrapper)obj;

		if (Objects.equals(_unit, unitWrapper._unit)) {
			return true;
		}

		return false;
	}

	@Override
	public unit getWrappedModel() {
		return _unit;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _unit.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _unit.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_unit.resetOriginalValues();
	}

	private final unit _unit;
}