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
 * This class is a wrapper for {@link screennameempidmapping}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see screennameempidmapping
 * @generated
 */
@ProviderType
public class screennameempidmappingWrapper implements screennameempidmapping,
	ModelWrapper<screennameempidmapping> {
	public screennameempidmappingWrapper(
		screennameempidmapping screennameempidmapping) {
		_screennameempidmapping = screennameempidmapping;
	}

	@Override
	public Class<?> getModelClass() {
		return screennameempidmapping.class;
	}

	@Override
	public String getModelClassName() {
		return screennameempidmapping.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("srno", getSrno());
		attributes.put("screenname", getScreenname());
		attributes.put("empid", getEmpid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer srno = (Integer)attributes.get("srno");

		if (srno != null) {
			setSrno(srno);
		}

		String screenname = (String)attributes.get("screenname");

		if (screenname != null) {
			setScreenname(screenname);
		}

		String empid = (String)attributes.get("empid");

		if (empid != null) {
			setEmpid(empid);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _screennameempidmapping.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _screennameempidmapping.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _screennameempidmapping.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _screennameempidmapping.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.screennameempidmapping> toCacheModel() {
		return _screennameempidmapping.toCacheModel();
	}

	@Override
	public int compareTo(
		userapi.model.screennameempidmapping screennameempidmapping) {
		return _screennameempidmapping.compareTo(screennameempidmapping);
	}

	/**
	* Returns the primary key of this screennameempidmapping.
	*
	* @return the primary key of this screennameempidmapping
	*/
	@Override
	public int getPrimaryKey() {
		return _screennameempidmapping.getPrimaryKey();
	}

	/**
	* Returns the srno of this screennameempidmapping.
	*
	* @return the srno of this screennameempidmapping
	*/
	@Override
	public int getSrno() {
		return _screennameempidmapping.getSrno();
	}

	@Override
	public int hashCode() {
		return _screennameempidmapping.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _screennameempidmapping.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new screennameempidmappingWrapper((screennameempidmapping)_screennameempidmapping.clone());
	}

	/**
	* Returns the empid of this screennameempidmapping.
	*
	* @return the empid of this screennameempidmapping
	*/
	@Override
	public java.lang.String getEmpid() {
		return _screennameempidmapping.getEmpid();
	}

	/**
	* Returns the screenname of this screennameempidmapping.
	*
	* @return the screenname of this screennameempidmapping
	*/
	@Override
	public java.lang.String getScreenname() {
		return _screennameempidmapping.getScreenname();
	}

	@Override
	public java.lang.String toString() {
		return _screennameempidmapping.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _screennameempidmapping.toXmlString();
	}

	@Override
	public userapi.model.screennameempidmapping toEscapedModel() {
		return new screennameempidmappingWrapper(_screennameempidmapping.toEscapedModel());
	}

	@Override
	public userapi.model.screennameempidmapping toUnescapedModel() {
		return new screennameempidmappingWrapper(_screennameempidmapping.toUnescapedModel());
	}

	@Override
	public void persist() {
		_screennameempidmapping.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_screennameempidmapping.setCachedModel(cachedModel);
	}

	/**
	* Sets the empid of this screennameempidmapping.
	*
	* @param empid the empid of this screennameempidmapping
	*/
	@Override
	public void setEmpid(java.lang.String empid) {
		_screennameempidmapping.setEmpid(empid);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_screennameempidmapping.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_screennameempidmapping.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_screennameempidmapping.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_screennameempidmapping.setNew(n);
	}

	/**
	* Sets the primary key of this screennameempidmapping.
	*
	* @param primaryKey the primary key of this screennameempidmapping
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_screennameempidmapping.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_screennameempidmapping.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the screenname of this screennameempidmapping.
	*
	* @param screenname the screenname of this screennameempidmapping
	*/
	@Override
	public void setScreenname(java.lang.String screenname) {
		_screennameempidmapping.setScreenname(screenname);
	}

	/**
	* Sets the srno of this screennameempidmapping.
	*
	* @param srno the srno of this screennameempidmapping
	*/
	@Override
	public void setSrno(int srno) {
		_screennameempidmapping.setSrno(srno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof screennameempidmappingWrapper)) {
			return false;
		}

		screennameempidmappingWrapper screennameempidmappingWrapper = (screennameempidmappingWrapper)obj;

		if (Objects.equals(_screennameempidmapping,
					screennameempidmappingWrapper._screennameempidmapping)) {
			return true;
		}

		return false;
	}

	@Override
	public screennameempidmapping getWrappedModel() {
		return _screennameempidmapping;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _screennameempidmapping.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _screennameempidmapping.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_screennameempidmapping.resetOriginalValues();
	}

	private final screennameempidmapping _screennameempidmapping;
}