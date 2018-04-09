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
 * This class is a wrapper for {@link zone}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zone
 * @generated
 */
@ProviderType
public class zoneWrapper implements zone, ModelWrapper<zone> {
	public zoneWrapper(zone zone) {
		_zone = zone;
	}

	@Override
	public Class<?> getModelClass() {
		return zone.class;
	}

	@Override
	public String getModelClassName() {
		return zone.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("zone_id", getZone_id());
		attributes.put("zone", getZone());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer zone_id = (Integer)attributes.get("zone_id");

		if (zone_id != null) {
			setZone_id(zone_id);
		}

		String zone = (String)attributes.get("zone");

		if (zone != null) {
			setZone(zone);
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
		return _zone.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _zone.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _zone.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _zone.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.zone> toCacheModel() {
		return _zone.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.zone zone) {
		return _zone.compareTo(zone);
	}

	/**
	* Returns the business_id of this zone.
	*
	* @return the business_id of this zone
	*/
	@Override
	public int getBusiness_id() {
		return _zone.getBusiness_id();
	}

	/**
	* Returns the isactive of this zone.
	*
	* @return the isactive of this zone
	*/
	@Override
	public int getIsactive() {
		return _zone.getIsactive();
	}

	/**
	* Returns the primary key of this zone.
	*
	* @return the primary key of this zone
	*/
	@Override
	public int getPrimaryKey() {
		return _zone.getPrimaryKey();
	}

	/**
	* Returns the zone_id of this zone.
	*
	* @return the zone_id of this zone
	*/
	@Override
	public int getZone_id() {
		return _zone.getZone_id();
	}

	@Override
	public int hashCode() {
		return _zone.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _zone.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new zoneWrapper((zone)_zone.clone());
	}

	/**
	* Returns the zone of this zone.
	*
	* @return the zone of this zone
	*/
	@Override
	public java.lang.String getZone() {
		return _zone.getZone();
	}

	@Override
	public java.lang.String toString() {
		return _zone.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _zone.toXmlString();
	}

	@Override
	public userapi.model.zone toEscapedModel() {
		return new zoneWrapper(_zone.toEscapedModel());
	}

	@Override
	public userapi.model.zone toUnescapedModel() {
		return new zoneWrapper(_zone.toUnescapedModel());
	}

	@Override
	public void persist() {
		_zone.persist();
	}

	/**
	* Sets the business_id of this zone.
	*
	* @param business_id the business_id of this zone
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_zone.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_zone.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_zone.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_zone.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_zone.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this zone.
	*
	* @param isactive the isactive of this zone
	*/
	@Override
	public void setIsactive(int isactive) {
		_zone.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_zone.setNew(n);
	}

	/**
	* Sets the primary key of this zone.
	*
	* @param primaryKey the primary key of this zone
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_zone.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_zone.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zone of this zone.
	*
	* @param zone the zone of this zone
	*/
	@Override
	public void setZone(java.lang.String zone) {
		_zone.setZone(zone);
	}

	/**
	* Sets the zone_id of this zone.
	*
	* @param zone_id the zone_id of this zone
	*/
	@Override
	public void setZone_id(int zone_id) {
		_zone.setZone_id(zone_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof zoneWrapper)) {
			return false;
		}

		zoneWrapper zoneWrapper = (zoneWrapper)obj;

		if (Objects.equals(_zone, zoneWrapper._zone)) {
			return true;
		}

		return false;
	}

	@Override
	public zone getWrappedModel() {
		return _zone;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _zone.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _zone.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_zone.resetOriginalValues();
	}

	private final zone _zone;
}