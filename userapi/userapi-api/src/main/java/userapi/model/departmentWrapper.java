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
 * This class is a wrapper for {@link department}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see department
 * @generated
 */
@ProviderType
public class departmentWrapper implements department, ModelWrapper<department> {
	public departmentWrapper(department department) {
		_department = department;
	}

	@Override
	public Class<?> getModelClass() {
		return department.class;
	}

	@Override
	public String getModelClassName() {
		return department.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dept_id", getDept_id());
		attributes.put("department", getDepartment());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer dept_id = (Integer)attributes.get("dept_id");

		if (dept_id != null) {
			setDept_id(dept_id);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
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
		return _department.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _department.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _department.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _department.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.department> toCacheModel() {
		return _department.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.department department) {
		return _department.compareTo(department);
	}

	/**
	* Returns the business_id of this department.
	*
	* @return the business_id of this department
	*/
	@Override
	public int getBusiness_id() {
		return _department.getBusiness_id();
	}

	/**
	* Returns the dept_id of this department.
	*
	* @return the dept_id of this department
	*/
	@Override
	public int getDept_id() {
		return _department.getDept_id();
	}

	/**
	* Returns the isactive of this department.
	*
	* @return the isactive of this department
	*/
	@Override
	public int getIsactive() {
		return _department.getIsactive();
	}

	/**
	* Returns the primary key of this department.
	*
	* @return the primary key of this department
	*/
	@Override
	public int getPrimaryKey() {
		return _department.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _department.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _department.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new departmentWrapper((department)_department.clone());
	}

	/**
	* Returns the department of this department.
	*
	* @return the department of this department
	*/
	@Override
	public java.lang.String getDepartment() {
		return _department.getDepartment();
	}

	@Override
	public java.lang.String toString() {
		return _department.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _department.toXmlString();
	}

	@Override
	public userapi.model.department toEscapedModel() {
		return new departmentWrapper(_department.toEscapedModel());
	}

	@Override
	public userapi.model.department toUnescapedModel() {
		return new departmentWrapper(_department.toUnescapedModel());
	}

	@Override
	public void persist() {
		_department.persist();
	}

	/**
	* Sets the business_id of this department.
	*
	* @param business_id the business_id of this department
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_department.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_department.setCachedModel(cachedModel);
	}

	/**
	* Sets the department of this department.
	*
	* @param department the department of this department
	*/
	@Override
	public void setDepartment(java.lang.String department) {
		_department.setDepartment(department);
	}

	/**
	* Sets the dept_id of this department.
	*
	* @param dept_id the dept_id of this department
	*/
	@Override
	public void setDept_id(int dept_id) {
		_department.setDept_id(dept_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_department.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_department.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_department.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this department.
	*
	* @param isactive the isactive of this department
	*/
	@Override
	public void setIsactive(int isactive) {
		_department.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_department.setNew(n);
	}

	/**
	* Sets the primary key of this department.
	*
	* @param primaryKey the primary key of this department
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_department.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_department.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof departmentWrapper)) {
			return false;
		}

		departmentWrapper departmentWrapper = (departmentWrapper)obj;

		if (Objects.equals(_department, departmentWrapper._department)) {
			return true;
		}

		return false;
	}

	@Override
	public department getWrappedModel() {
		return _department;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _department.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _department.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_department.resetOriginalValues();
	}

	private final department _department;
}