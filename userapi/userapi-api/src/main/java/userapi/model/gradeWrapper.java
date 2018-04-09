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
 * This class is a wrapper for {@link grade}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see grade
 * @generated
 */
@ProviderType
public class gradeWrapper implements grade, ModelWrapper<grade> {
	public gradeWrapper(grade grade) {
		_grade = grade;
	}

	@Override
	public Class<?> getModelClass() {
		return grade.class;
	}

	@Override
	public String getModelClassName() {
		return grade.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("grade_id", getGrade_id());
		attributes.put("grade", getGrade());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer grade_id = (Integer)attributes.get("grade_id");

		if (grade_id != null) {
			setGrade_id(grade_id);
		}

		String grade = (String)attributes.get("grade");

		if (grade != null) {
			setGrade(grade);
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
		return _grade.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _grade.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _grade.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _grade.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.grade> toCacheModel() {
		return _grade.toCacheModel();
	}

	@Override
	public int compareTo(userapi.model.grade grade) {
		return _grade.compareTo(grade);
	}

	/**
	* Returns the business_id of this grade.
	*
	* @return the business_id of this grade
	*/
	@Override
	public int getBusiness_id() {
		return _grade.getBusiness_id();
	}

	/**
	* Returns the grade_id of this grade.
	*
	* @return the grade_id of this grade
	*/
	@Override
	public int getGrade_id() {
		return _grade.getGrade_id();
	}

	/**
	* Returns the isactive of this grade.
	*
	* @return the isactive of this grade
	*/
	@Override
	public int getIsactive() {
		return _grade.getIsactive();
	}

	/**
	* Returns the primary key of this grade.
	*
	* @return the primary key of this grade
	*/
	@Override
	public int getPrimaryKey() {
		return _grade.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _grade.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _grade.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new gradeWrapper((grade)_grade.clone());
	}

	/**
	* Returns the grade of this grade.
	*
	* @return the grade of this grade
	*/
	@Override
	public java.lang.String getGrade() {
		return _grade.getGrade();
	}

	@Override
	public java.lang.String toString() {
		return _grade.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _grade.toXmlString();
	}

	@Override
	public userapi.model.grade toEscapedModel() {
		return new gradeWrapper(_grade.toEscapedModel());
	}

	@Override
	public userapi.model.grade toUnescapedModel() {
		return new gradeWrapper(_grade.toUnescapedModel());
	}

	@Override
	public void persist() {
		_grade.persist();
	}

	/**
	* Sets the business_id of this grade.
	*
	* @param business_id the business_id of this grade
	*/
	@Override
	public void setBusiness_id(int business_id) {
		_grade.setBusiness_id(business_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_grade.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_grade.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_grade.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_grade.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the grade of this grade.
	*
	* @param grade the grade of this grade
	*/
	@Override
	public void setGrade(java.lang.String grade) {
		_grade.setGrade(grade);
	}

	/**
	* Sets the grade_id of this grade.
	*
	* @param grade_id the grade_id of this grade
	*/
	@Override
	public void setGrade_id(int grade_id) {
		_grade.setGrade_id(grade_id);
	}

	/**
	* Sets the isactive of this grade.
	*
	* @param isactive the isactive of this grade
	*/
	@Override
	public void setIsactive(int isactive) {
		_grade.setIsactive(isactive);
	}

	@Override
	public void setNew(boolean n) {
		_grade.setNew(n);
	}

	/**
	* Sets the primary key of this grade.
	*
	* @param primaryKey the primary key of this grade
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_grade.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_grade.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof gradeWrapper)) {
			return false;
		}

		gradeWrapper gradeWrapper = (gradeWrapper)obj;

		if (Objects.equals(_grade, gradeWrapper._grade)) {
			return true;
		}

		return false;
	}

	@Override
	public grade getWrappedModel() {
		return _grade;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _grade.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _grade.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_grade.resetOriginalValues();
	}

	private final grade _grade;
}