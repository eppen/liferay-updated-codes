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
 * This class is a wrapper for {@link business}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see business
 * @generated
 */
@ProviderType
public class businessWrapper implements business, ModelWrapper<business> {
	public businessWrapper(business business) {
		_business = business;
	}

	@Override
	public Class<?> getModelClass() {
		return business.class;
	}

	@Override
	public String getModelClassName() {
		return business.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("business_id", getBusiness_id());
		attributes.put("business", getBusiness());
		attributes.put("short_name", getShort_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer business_id = (Integer)attributes.get("business_id");

		if (business_id != null) {
			setBusiness_id(business_id);
		}

		String business = (String)attributes.get("business");

		if (business != null) {
			setBusiness(business);
		}

		String short_name = (String)attributes.get("short_name");

		if (short_name != null) {
			setShort_name(short_name);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _business.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _business.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _business.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _business.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.business> toCacheModel() {
		return _business.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.business business) {
		return _business.compareTo(business);
	}

	/**
	* Returns the business_id of this business.
	*
	* @return the business_id of this business
	*/
	@Override
	public int getBusiness_id() {
		return _business.getBusiness_id();
	}

	/**
	* Returns the primary key of this business.
	*
	* @return the primary key of this business
	*/
	@Override
	public int getPrimaryKey() {
		return _business.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _business.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _business.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businessWrapper((business)_business.clone());
	}

	/**
	* Returns the business of this business.
	*
	* @return the business of this business
	*/
	@Override
	public java.lang.String getBusiness() {
		return _business.getBusiness();
	}

	/**
	* Returns the short_name of this business.
	*
	* @return the short_name of this business
	*/
	@Override
	public java.lang.String getShort_name() {
		return _business.getShort_name();
	}

	@Override
	public java.lang.String toString() {
		return _business.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _business.toXmlString();
	}

	@Override
	public userapi.model.business toEscapedModel() {
		return new businessWrapper(_business.toEscapedModel());
	}

	@Override
	public userapi.model.business toUnescapedModel() {
		return new businessWrapper(_business.toUnescapedModel());
	}

	@Override
	public void persist() {
		_business.persist();
	}

	/**
	* Sets the business of this business.
	*
	* @param business the business of this business
	*/
	@Override
	public void setBusiness(java.lang.String business) {
		_business.setBusiness(business);
	}

	/**
	* Sets the business_id of this business.
	*
	* @param business_id the business_id of this business
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_business.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_business.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_business.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_business.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_business.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_business.setNew(n);
	}

	/**
	* Sets the primary key of this business.
	*
	* @param primaryKey the primary key of this business
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_business.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_business.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the short_name of this business.
	*
	* @param short_name the short_name of this business
	*/
	@Override
	public void setShort_name(java.lang.String short_name) {
		_business.setShort_name(short_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businessWrapper)) {
			return false;
		}

		businessWrapper businessWrapper = (businessWrapper)obj;

		if (Objects.equals(_business, businessWrapper._business)) {
			return true;
		}

		return false;
	}

	@Override
	public business getWrappedModel() {
		return _business;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _business.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _business.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_business.resetOriginalValues();
	}

	private final business _business;
}