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
 * This class is a wrapper for {@link jvbranch}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see jvbranch
 * @generated
 */
@ProviderType
public class jvbranchWrapper implements jvbranch, ModelWrapper<jvbranch> {
	public jvbranchWrapper(jvbranch jvbranch) {
		_jvbranch = jvbranch;
	}

	@Override
	public Class<?> getModelClass() {
		return jvbranch.class;
	}

	@Override
	public String getModelClassName() {
		return jvbranch.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jvbranch_id", getJvbranch_id());
		attributes.put("jvbranch", getJvbranch());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer jvbranch_id = (Integer)attributes.get("jvbranch_id");

		if (jvbranch_id != null) {
			setJvbranch_id(jvbranch_id);
		}

		String jvbranch = (String)attributes.get("jvbranch");

		if (jvbranch != null) {
			setJvbranch(jvbranch);
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
		return _jvbranch.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _jvbranch.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _jvbranch.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _jvbranch.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.jvbranch> toCacheModel() {
		return _jvbranch.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.jvbranch jvbranch) {
		return _jvbranch.compareTo(jvbranch);
	}

	/**
	* Returns the business_id of this jvbranch.
	*
	* @return the business_id of this jvbranch
	*/
	@Override
	public int getBusiness_id() {
		return _jvbranch.getBusiness_id();
	}

	/**
	* Returns the isactive of this jvbranch.
	*
	* @return the isactive of this jvbranch
	*/
	@Override
	public int getIsactive() {
		return _jvbranch.getIsactive();
	}

	/**
	* Returns the jvbranch_id of this jvbranch.
	*
	* @return the jvbranch_id of this jvbranch
	*/
	@Override
	public int getJvbranch_id() {
		return _jvbranch.getJvbranch_id();
	}

	/**
	* Returns the primary key of this jvbranch.
	*
	* @return the primary key of this jvbranch
	*/
	@Override
	public int getPrimaryKey() {
		return _jvbranch.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _jvbranch.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jvbranch.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new jvbranchWrapper((jvbranch)_jvbranch.clone());
	}

	/**
	* Returns the jvbranch of this jvbranch.
	*
	* @return the jvbranch of this jvbranch
	*/
	@Override
	public java.lang.String getJvbranch() {
		return _jvbranch.getJvbranch();
	}

	@Override
	public java.lang.String toString() {
		return _jvbranch.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jvbranch.toXmlString();
	}

	@Override
	public userapi.model.jvbranch toEscapedModel() {
		return new jvbranchWrapper(_jvbranch.toEscapedModel());
	}

	@Override
	public userapi.model.jvbranch toUnescapedModel() {
		return new jvbranchWrapper(_jvbranch.toUnescapedModel());
	}

	@Override
	public void persist() {
		_jvbranch.persist();
	}

	/**
	* Sets the business_id of this jvbranch.
	*
	* @param business_id the business_id of this jvbranch
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_jvbranch.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jvbranch.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_jvbranch.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_jvbranch.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_jvbranch.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this jvbranch.
	*
	* @param isactive the isactive of this jvbranch
	*/
	@Override
	public void setIsactive(int isactive) {
		_jvbranch.setIsactive(isactive);
	}

	/**
	* Sets the jvbranch of this jvbranch.
	*
	* @param jvbranch the jvbranch of this jvbranch
	*/
	@Override
	public void setJvbranch(java.lang.String jvbranch) {
		_jvbranch.setJvbranch(jvbranch);
	}

	/**
	* Sets the jvbranch_id of this jvbranch.
	*
	* @param jvbranch_id the jvbranch_id of this jvbranch
	*/
	@Override
	public void setJvbranch_id(int jvbranch_id) {
		_jvbranch.setJvbranch_id(jvbranch_id);
	}

	@Override
	public void setNew(boolean n) {
		_jvbranch.setNew(n);
	}

	/**
	* Sets the primary key of this jvbranch.
	*
	* @param primaryKey the primary key of this jvbranch
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_jvbranch.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_jvbranch.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof jvbranchWrapper)) {
			return false;
		}

		jvbranchWrapper jvbranchWrapper = (jvbranchWrapper)obj;

		if (Objects.equals(_jvbranch, jvbranchWrapper._jvbranch)) {
			return true;
		}

		return false;
	}

	@Override
	public jvbranch getWrappedModel() {
		return _jvbranch;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _jvbranch.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _jvbranch.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_jvbranch.resetOriginalValues();
	}

	private final jvbranch _jvbranch;
}