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
 * This class is a wrapper for {@link branch}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see branch
 * @generated
 */
@ProviderType
public class branchWrapper implements branch, ModelWrapper<branch> {
	public branchWrapper(branch branch) {
		_branch = branch;
	}

	@Override
	public Class<?> getModelClass() {
		return branch.class;
	}

	@Override
	public String getModelClassName() {
		return branch.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("branch_id", getBranch_id());
		attributes.put("branch", getBranch());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer branch_id = (Integer)attributes.get("branch_id");

		if (branch_id != null) {
			setBranch_id(branch_id);
		}

		String branch = (String)attributes.get("branch");

		if (branch != null) {
			setBranch(branch);
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
		return _branch.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _branch.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _branch.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _branch.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.branch> toCacheModel() {
		return _branch.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.branch branch) {
		return _branch.compareTo(branch);
	}

	/**
	* Returns the branch_id of this branch.
	*
	* @return the branch_id of this branch
	*/
	@Override
	public int getBranch_id() {
		return _branch.getBranch_id();
	}

	/**
	* Returns the business_id of this branch.
	*
	* @return the business_id of this branch
	*/
	@Override
	public int getBusiness_id() {
		return _branch.getBusiness_id();
	}

	/**
	* Returns the isactive of this branch.
	*
	* @return the isactive of this branch
	*/
	@Override
	public int getIsactive() {
		return _branch.getIsactive();
	}

	/**
	* Returns the primary key of this branch.
	*
	* @return the primary key of this branch
	*/
	@Override
	public int getPrimaryKey() {
		return _branch.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _branch.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _branch.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new branchWrapper((branch)_branch.clone());
	}

	/**
	* Returns the branch of this branch.
	*
	* @return the branch of this branch
	*/
	@Override
	public java.lang.String getBranch() {
		return _branch.getBranch();
	}

	@Override
	public java.lang.String toString() {
		return _branch.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _branch.toXmlString();
	}

	@Override
	public userapi.model.branch toEscapedModel() {
		return new branchWrapper(_branch.toEscapedModel());
	}

	@Override
	public userapi.model.branch toUnescapedModel() {
		return new branchWrapper(_branch.toUnescapedModel());
	}

	@Override
	public void persist() {
		_branch.persist();
	}

	/**
	* Sets the branch of this branch.
	*
	* @param branch the branch of this branch
	*/
	@Override
	public void setBranch(java.lang.String branch) {
		_branch.setBranch(branch);
	}

	/**
	* Sets the branch_id of this branch.
	*
	* @param branch_id the branch_id of this branch
	*/
	@Override
	public void setBranch_id(int branch_id) {
		_branch.setBranch_id(branch_id);
	}

	/**
	* Sets the business_id of this branch.
	*
	* @param business_id the business_id of this branch
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_branch.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_branch.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_branch.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_branch.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_branch.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the isactive of this branch.
	*
	* @param isactive the isactive of this branch
	*/
	@Override
	public void setIsactive(int isactive) {
		_branch.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_branch.setNew(n);
	}

	/**
	* Sets the primary key of this branch.
	*
	* @param primaryKey the primary key of this branch
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_branch.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_branch.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof branchWrapper)) {
			return false;
		}

		branchWrapper branchWrapper = (branchWrapper)obj;

		if (Objects.equals(_branch, branchWrapper._branch)) {
			return true;
		}

		return false;
	}

	@Override
	public branch getWrappedModel() {
		return _branch;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _branch.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _branch.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_branch.resetOriginalValues();
	}

	private final branch _branch;
}