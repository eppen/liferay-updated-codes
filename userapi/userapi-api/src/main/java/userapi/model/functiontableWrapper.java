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
 * This class is a wrapper for {@link functiontable}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see functiontable
 * @generated
 */
@ProviderType
public class functiontableWrapper implements functiontable,
	ModelWrapper<functiontable> {
	public functiontableWrapper(functiontable functiontable) {
		_functiontable = functiontable;
	}

	@Override
	public Class<?> getModelClass() {
		return functiontable.class;
	}

	@Override
	public String getModelClassName() {
		return functiontable.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("function_id", getFunction_id());
		attributes.put("function", getFunction());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer function_id = (Integer)attributes.get("function_id");

		if (function_id != null) {
			setFunction_id(function_id);
		}

		String function = (String)attributes.get("function");

		if (function != null) {
			setFunction(function);
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
		return _functiontable.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _functiontable.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _functiontable.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _functiontable.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.functiontable> toCacheModel() {
		return _functiontable.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.functiontable functiontable) {
		return _functiontable.compareTo(functiontable);
	}

	/**
	* Returns the business_id of this functiontable.
	*
	* @return the business_id of this functiontable
	*/
	@Override
	public int getBusiness_id() {
		return _functiontable.getBusiness_id();
	}

	/**
	* Returns the function_id of this functiontable.
	*
	* @return the function_id of this functiontable
	*/
	@Override
	public int getFunction_id() {
		return _functiontable.getFunction_id();
	}

	/**
	* Returns the isactive of this functiontable.
	*
	* @return the isactive of this functiontable
	*/
	@Override
	public int getIsactive() {
		return _functiontable.getIsactive();
	}

	/**
	* Returns the primary key of this functiontable.
	*
	* @return the primary key of this functiontable
	*/
	@Override
	public int getPrimaryKey() {
		return _functiontable.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _functiontable.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _functiontable.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new functiontableWrapper((functiontable)_functiontable.clone());
	}

	/**
	* Returns the function of this functiontable.
	*
	* @return the function of this functiontable
	*/
	@Override
	public java.lang.String getFunction() {
		return _functiontable.getFunction();
	}

	@Override
	public java.lang.String toString() {
		return _functiontable.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _functiontable.toXmlString();
	}

	@Override
	public userapi.model.functiontable toEscapedModel() {
		return new functiontableWrapper(_functiontable.toEscapedModel());
	}

	@Override
	public userapi.model.functiontable toUnescapedModel() {
		return new functiontableWrapper(_functiontable.toUnescapedModel());
	}

	@Override
	public void persist() {
		_functiontable.persist();
	}

	/**
	* Sets the business_id of this functiontable.
	*
	* @param business_id the business_id of this functiontable
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_functiontable.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_functiontable.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_functiontable.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_functiontable.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_functiontable.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the function of this functiontable.
	*
	* @param function the function of this functiontable
	*/
	@Override
	public void setFunction(java.lang.String function) {
		_functiontable.setFunction(function);
	}

	/**
	* Sets the function_id of this functiontable.
	*
	* @param function_id the function_id of this functiontable
	*/
	@Override
	public void setFunction_id(int function_id) {
		_functiontable.setFunction_id(function_id);
	}

	/**
	* Sets the isactive of this functiontable.
	*
	* @param isactive the isactive of this functiontable
	*/
	@Override
	public void setIsactive(int isactive) {
		_functiontable.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_functiontable.setNew(n);
	}

	/**
	* Sets the primary key of this functiontable.
	*
	* @param primaryKey the primary key of this functiontable
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_functiontable.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_functiontable.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof functiontableWrapper)) {
			return false;
		}

		functiontableWrapper functiontableWrapper = (functiontableWrapper)obj;

		if (Objects.equals(_functiontable, functiontableWrapper._functiontable)) {
			return true;
		}

		return false;
	}

	@Override
	public functiontable getWrappedModel() {
		return _functiontable;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _functiontable.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _functiontable.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_functiontable.resetOriginalValues();
	}

	private final functiontable _functiontable;
}