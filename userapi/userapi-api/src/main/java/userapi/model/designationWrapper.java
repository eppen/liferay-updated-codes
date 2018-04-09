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
 * This class is a wrapper for {@link designation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see designation
 * @generated
 */
@ProviderType
public class designationWrapper implements designation,
	ModelWrapper<designation> {
	public designationWrapper(designation designation) {
		_designation = designation;
	}

	@Override
	public Class<?> getModelClass() {
		return designation.class;
	}

	@Override
	public String getModelClassName() {
		return designation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("desig_id", getDesig_id());
		attributes.put("designation", getDesignation());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer desig_id = (Integer)attributes.get("desig_id");

		if (desig_id != null) {
			setDesig_id(desig_id);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
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
		return _designation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _designation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _designation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _designation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.designation> toCacheModel() {
		return _designation.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.designation designation) {
		return _designation.compareTo(designation);
	}

	/**
	* Returns the business_id of this designation.
	*
	* @return the business_id of this designation
	*/
	@Override
	public int getBusiness_id() {
		return _designation.getBusiness_id();
	}

	/**
	* Returns the desig_id of this designation.
	*
	* @return the desig_id of this designation
	*/
	@Override
	public int getDesig_id() {
		return _designation.getDesig_id();
	}

	/**
	* Returns the isactive of this designation.
	*
	* @return the isactive of this designation
	*/
	@Override
	public int getIsactive() {
		return _designation.getIsactive();
	}

	/**
	* Returns the primary key of this designation.
	*
	* @return the primary key of this designation
	*/
	@Override
	public int getPrimaryKey() {
		return _designation.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _designation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _designation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new designationWrapper((designation)_designation.clone());
	}

	/**
	* Returns the designation of this designation.
	*
	* @return the designation of this designation
	*/
	@Override
	public java.lang.String getDesignation() {
		return _designation.getDesignation();
	}

	@Override
	public java.lang.String toString() {
		return _designation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _designation.toXmlString();
	}

	@Override
	public userapi.model.designation toEscapedModel() {
		return new designationWrapper(_designation.toEscapedModel());
	}

	@Override
	public userapi.model.designation toUnescapedModel() {
		return new designationWrapper(_designation.toUnescapedModel());
	}

	@Override
	public void persist() {
		_designation.persist();
	}

	/**
	* Sets the business_id of this designation.
	*
	* @param business_id the business_id of this designation
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_designation.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_designation.setCachedModel(cachedModel);
	}

	/**
	* Sets the desig_id of this designation.
	*
	* @param desig_id the desig_id of this designation
	*/
	@Override
	public void setDesig_id(int desig_id) {
		_designation.setDesig_id(desig_id);
	}

	/**
	* Sets the designation of this designation.
	*
	* @param designation the designation of this designation
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_designation.setDesignation(designation);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_designation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_designation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_designation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this designation.
	*
	* @param isactive the isactive of this designation
	*/
	@Override
	public void setIsactive(int isactive) {
		_designation.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_designation.setNew(n);
	}

	/**
	* Sets the primary key of this designation.
	*
	* @param primaryKey the primary key of this designation
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_designation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_designation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof designationWrapper)) {
			return false;
		}

		designationWrapper designationWrapper = (designationWrapper)obj;

		if (Objects.equals(_designation, designationWrapper._designation)) {
			return true;
		}

		return false;
	}

	@Override
	public designation getWrappedModel() {
		return _designation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _designation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _designation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_designation.resetOriginalValues();
	}

	private final designation _designation;
}