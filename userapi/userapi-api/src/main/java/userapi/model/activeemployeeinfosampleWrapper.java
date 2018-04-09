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
 * This class is a wrapper for {@link activeemployeeinfosample}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see activeemployeeinfosample
 * @generated
 */
@ProviderType
public class activeemployeeinfosampleWrapper implements activeemployeeinfosample,
	ModelWrapper<activeemployeeinfosample> {
	public activeemployeeinfosampleWrapper(
		activeemployeeinfosample activeemployeeinfosample) {
		_activeemployeeinfosample = activeemployeeinfosample;
	}

	@Override
	public Class<?> getModelClass() {
		return activeemployeeinfosample.class;
	}

	@Override
	public String getModelClassName() {
		return activeemployeeinfosample.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("srno", getSrno());
		attributes.put("Milestone", getMilestone());
		attributes.put("EmpId", getEmpId());
		attributes.put("Name", getName());
		attributes.put("Emailid", getEmailid());
		attributes.put("Reason", getReason());
		attributes.put("Photo", getPhoto());
		attributes.put("DOJ", getDOJ());
		attributes.put("ExitOn", getExitOn());
		attributes.put("Birthday", getBirthday());
		attributes.put("Anniversary", getAnniversary());
		attributes.put("Business", getBusiness());
		attributes.put("Unit", getUnit());
		attributes.put("GradeGroup", getGradeGroup());
		attributes.put("Grade", getGrade());
		attributes.put("FunctionName", getFunctionName());
		attributes.put("Department", getDepartment());
		attributes.put("Designation", getDesignation());
		attributes.put("Zone", getZone());
		attributes.put("Region", getRegion());
		attributes.put("Location", getLocation());
		attributes.put("Product", getProduct());
		attributes.put("JVBranch", getJVBranch());
		attributes.put("Branch", getBranch());
		attributes.put("Costcenter", getCostcenter());
		attributes.put("AreaHandled", getAreaHandled());
		attributes.put("gender", getGender());
		attributes.put("FirstName", getFirstName());
		attributes.put("LastName", getLastName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer srno = (Integer)attributes.get("srno");

		if (srno != null) {
			setSrno(srno);
		}

		String Milestone = (String)attributes.get("Milestone");

		if (Milestone != null) {
			setMilestone(Milestone);
		}

		String EmpId = (String)attributes.get("EmpId");

		if (EmpId != null) {
			setEmpId(EmpId);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String Emailid = (String)attributes.get("Emailid");

		if (Emailid != null) {
			setEmailid(Emailid);
		}

		String Reason = (String)attributes.get("Reason");

		if (Reason != null) {
			setReason(Reason);
		}

		String Photo = (String)attributes.get("Photo");

		if (Photo != null) {
			setPhoto(Photo);
		}

		String DOJ = (String)attributes.get("DOJ");

		if (DOJ != null) {
			setDOJ(DOJ);
		}

		String ExitOn = (String)attributes.get("ExitOn");

		if (ExitOn != null) {
			setExitOn(ExitOn);
		}

		String Birthday = (String)attributes.get("Birthday");

		if (Birthday != null) {
			setBirthday(Birthday);
		}

		String Anniversary = (String)attributes.get("Anniversary");

		if (Anniversary != null) {
			setAnniversary(Anniversary);
		}

		String Business = (String)attributes.get("Business");

		if (Business != null) {
			setBusiness(Business);
		}

		String Unit = (String)attributes.get("Unit");

		if (Unit != null) {
			setUnit(Unit);
		}

		String GradeGroup = (String)attributes.get("GradeGroup");

		if (GradeGroup != null) {
			setGradeGroup(GradeGroup);
		}

		String Grade = (String)attributes.get("Grade");

		if (Grade != null) {
			setGrade(Grade);
		}

		String FunctionName = (String)attributes.get("FunctionName");

		if (FunctionName != null) {
			setFunctionName(FunctionName);
		}

		String Department = (String)attributes.get("Department");

		if (Department != null) {
			setDepartment(Department);
		}

		String Designation = (String)attributes.get("Designation");

		if (Designation != null) {
			setDesignation(Designation);
		}

		String Zone = (String)attributes.get("Zone");

		if (Zone != null) {
			setZone(Zone);
		}

		String Region = (String)attributes.get("Region");

		if (Region != null) {
			setRegion(Region);
		}

		String Location = (String)attributes.get("Location");

		if (Location != null) {
			setLocation(Location);
		}

		String Product = (String)attributes.get("Product");

		if (Product != null) {
			setProduct(Product);
		}

		String JVBranch = (String)attributes.get("JVBranch");

		if (JVBranch != null) {
			setJVBranch(JVBranch);
		}

		String Branch = (String)attributes.get("Branch");

		if (Branch != null) {
			setBranch(Branch);
		}

		String Costcenter = (String)attributes.get("Costcenter");

		if (Costcenter != null) {
			setCostcenter(Costcenter);
		}

		String AreaHandled = (String)attributes.get("AreaHandled");

		if (AreaHandled != null) {
			setAreaHandled(AreaHandled);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String FirstName = (String)attributes.get("FirstName");

		if (FirstName != null) {
			setFirstName(FirstName);
		}

		String LastName = (String)attributes.get("LastName");

		if (LastName != null) {
			setLastName(LastName);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _activeemployeeinfosample.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _activeemployeeinfosample.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _activeemployeeinfosample.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _activeemployeeinfosample.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<userapi.model.activeemployeeinfosample> toCacheModel() {
		return _activeemployeeinfosample.toCacheModel();
	}

	@Override
	public int compareTo(
		userapi.model.activeemployeeinfosample activeemployeeinfosample) {
		return _activeemployeeinfosample.compareTo(activeemployeeinfosample);
	}

	/**
	* Returns the primary key of this activeemployeeinfosample.
	*
	* @return the primary key of this activeemployeeinfosample
	*/
	@Override
	public int getPrimaryKey() {
		return _activeemployeeinfosample.getPrimaryKey();
	}

	/**
	* Returns the srno of this activeemployeeinfosample.
	*
	* @return the srno of this activeemployeeinfosample
	*/
	@Override
	public int getSrno() {
		return _activeemployeeinfosample.getSrno();
	}

	@Override
	public int hashCode() {
		return _activeemployeeinfosample.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _activeemployeeinfosample.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new activeemployeeinfosampleWrapper((activeemployeeinfosample)_activeemployeeinfosample.clone());
	}

	/**
	* Returns the anniversary of this activeemployeeinfosample.
	*
	* @return the anniversary of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getAnniversary() {
		return _activeemployeeinfosample.getAnniversary();
	}

	/**
	* Returns the area handled of this activeemployeeinfosample.
	*
	* @return the area handled of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getAreaHandled() {
		return _activeemployeeinfosample.getAreaHandled();
	}

	/**
	* Returns the birthday of this activeemployeeinfosample.
	*
	* @return the birthday of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getBirthday() {
		return _activeemployeeinfosample.getBirthday();
	}

	/**
	* Returns the branch of this activeemployeeinfosample.
	*
	* @return the branch of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getBranch() {
		return _activeemployeeinfosample.getBranch();
	}

	/**
	* Returns the business of this activeemployeeinfosample.
	*
	* @return the business of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getBusiness() {
		return _activeemployeeinfosample.getBusiness();
	}

	/**
	* Returns the costcenter of this activeemployeeinfosample.
	*
	* @return the costcenter of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getCostcenter() {
		return _activeemployeeinfosample.getCostcenter();
	}

	/**
	* Returns the doj of this activeemployeeinfosample.
	*
	* @return the doj of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getDOJ() {
		return _activeemployeeinfosample.getDOJ();
	}

	/**
	* Returns the department of this activeemployeeinfosample.
	*
	* @return the department of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getDepartment() {
		return _activeemployeeinfosample.getDepartment();
	}

	/**
	* Returns the designation of this activeemployeeinfosample.
	*
	* @return the designation of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getDesignation() {
		return _activeemployeeinfosample.getDesignation();
	}

	/**
	* Returns the emailid of this activeemployeeinfosample.
	*
	* @return the emailid of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getEmailid() {
		return _activeemployeeinfosample.getEmailid();
	}

	/**
	* Returns the emp ID of this activeemployeeinfosample.
	*
	* @return the emp ID of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getEmpId() {
		return _activeemployeeinfosample.getEmpId();
	}

	/**
	* Returns the exit on of this activeemployeeinfosample.
	*
	* @return the exit on of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getExitOn() {
		return _activeemployeeinfosample.getExitOn();
	}

	/**
	* Returns the first name of this activeemployeeinfosample.
	*
	* @return the first name of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getFirstName() {
		return _activeemployeeinfosample.getFirstName();
	}

	/**
	* Returns the function name of this activeemployeeinfosample.
	*
	* @return the function name of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getFunctionName() {
		return _activeemployeeinfosample.getFunctionName();
	}

	/**
	* Returns the gender of this activeemployeeinfosample.
	*
	* @return the gender of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getGender() {
		return _activeemployeeinfosample.getGender();
	}

	/**
	* Returns the grade of this activeemployeeinfosample.
	*
	* @return the grade of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getGrade() {
		return _activeemployeeinfosample.getGrade();
	}

	/**
	* Returns the grade group of this activeemployeeinfosample.
	*
	* @return the grade group of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getGradeGroup() {
		return _activeemployeeinfosample.getGradeGroup();
	}

	/**
	* Returns the jv branch of this activeemployeeinfosample.
	*
	* @return the jv branch of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getJVBranch() {
		return _activeemployeeinfosample.getJVBranch();
	}

	/**
	* Returns the last name of this activeemployeeinfosample.
	*
	* @return the last name of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getLastName() {
		return _activeemployeeinfosample.getLastName();
	}

	/**
	* Returns the location of this activeemployeeinfosample.
	*
	* @return the location of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getLocation() {
		return _activeemployeeinfosample.getLocation();
	}

	/**
	* Returns the milestone of this activeemployeeinfosample.
	*
	* @return the milestone of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getMilestone() {
		return _activeemployeeinfosample.getMilestone();
	}

	/**
	* Returns the name of this activeemployeeinfosample.
	*
	* @return the name of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getName() {
		return _activeemployeeinfosample.getName();
	}

	/**
	* Returns the photo of this activeemployeeinfosample.
	*
	* @return the photo of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getPhoto() {
		return _activeemployeeinfosample.getPhoto();
	}

	/**
	* Returns the product of this activeemployeeinfosample.
	*
	* @return the product of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getProduct() {
		return _activeemployeeinfosample.getProduct();
	}

	/**
	* Returns the reason of this activeemployeeinfosample.
	*
	* @return the reason of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getReason() {
		return _activeemployeeinfosample.getReason();
	}

	/**
	* Returns the region of this activeemployeeinfosample.
	*
	* @return the region of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getRegion() {
		return _activeemployeeinfosample.getRegion();
	}

	/**
	* Returns the unit of this activeemployeeinfosample.
	*
	* @return the unit of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getUnit() {
		return _activeemployeeinfosample.getUnit();
	}

	/**
	* Returns the zone of this activeemployeeinfosample.
	*
	* @return the zone of this activeemployeeinfosample
	*/
	@Override
	public java.lang.String getZone() {
		return _activeemployeeinfosample.getZone();
	}

	@Override
	public java.lang.String toString() {
		return _activeemployeeinfosample.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _activeemployeeinfosample.toXmlString();
	}

	@Override
	public userapi.model.activeemployeeinfosample toEscapedModel() {
		return new activeemployeeinfosampleWrapper(_activeemployeeinfosample.toEscapedModel());
	}

	@Override
	public userapi.model.activeemployeeinfosample toUnescapedModel() {
		return new activeemployeeinfosampleWrapper(_activeemployeeinfosample.toUnescapedModel());
	}

	@Override
	public void persist() {
		_activeemployeeinfosample.persist();
	}

	/**
	* Sets the anniversary of this activeemployeeinfosample.
	*
	* @param Anniversary the anniversary of this activeemployeeinfosample
	*/
	@Override
	public void setAnniversary(java.lang.String Anniversary) {
		_activeemployeeinfosample.setAnniversary(Anniversary);
	}

	/**
	* Sets the area handled of this activeemployeeinfosample.
	*
	* @param AreaHandled the area handled of this activeemployeeinfosample
	*/
	@Override
	public void setAreaHandled(java.lang.String AreaHandled) {
		_activeemployeeinfosample.setAreaHandled(AreaHandled);
	}

	/**
	* Sets the birthday of this activeemployeeinfosample.
	*
	* @param Birthday the birthday of this activeemployeeinfosample
	*/
	@Override
	public void setBirthday(java.lang.String Birthday) {
		_activeemployeeinfosample.setBirthday(Birthday);
	}

	/**
	* Sets the branch of this activeemployeeinfosample.
	*
	* @param Branch the branch of this activeemployeeinfosample
	*/
	@Override
	public void setBranch(java.lang.String Branch) {
		_activeemployeeinfosample.setBranch(Branch);
	}

	/**
	* Sets the business of this activeemployeeinfosample.
	*
	* @param Business the business of this activeemployeeinfosample
	*/
	@Override
	public void setBusiness(java.lang.String Business) {
		_activeemployeeinfosample.setBusiness(Business);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_activeemployeeinfosample.setCachedModel(cachedModel);
	}

	/**
	* Sets the costcenter of this activeemployeeinfosample.
	*
	* @param Costcenter the costcenter of this activeemployeeinfosample
	*/
	@Override
	public void setCostcenter(java.lang.String Costcenter) {
		_activeemployeeinfosample.setCostcenter(Costcenter);
	}

	/**
	* Sets the doj of this activeemployeeinfosample.
	*
	* @param DOJ the doj of this activeemployeeinfosample
	*/
	@Override
	public void setDOJ(java.lang.String DOJ) {
		_activeemployeeinfosample.setDOJ(DOJ);
	}

	/**
	* Sets the department of this activeemployeeinfosample.
	*
	* @param Department the department of this activeemployeeinfosample
	*/
	@Override
	public void setDepartment(java.lang.String Department) {
		_activeemployeeinfosample.setDepartment(Department);
	}

	/**
	* Sets the designation of this activeemployeeinfosample.
	*
	* @param Designation the designation of this activeemployeeinfosample
	*/
	@Override
	public void setDesignation(java.lang.String Designation) {
		_activeemployeeinfosample.setDesignation(Designation);
	}

	/**
	* Sets the emailid of this activeemployeeinfosample.
	*
	* @param Emailid the emailid of this activeemployeeinfosample
	*/
	@Override
	public void setEmailid(java.lang.String Emailid) {
		_activeemployeeinfosample.setEmailid(Emailid);
	}

	/**
	* Sets the emp ID of this activeemployeeinfosample.
	*
	* @param EmpId the emp ID of this activeemployeeinfosample
	*/
	@Override
	public void setEmpId(java.lang.String EmpId) {
		_activeemployeeinfosample.setEmpId(EmpId);
	}

	/**
	* Sets the exit on of this activeemployeeinfosample.
	*
	* @param ExitOn the exit on of this activeemployeeinfosample
	*/
	@Override
	public void setExitOn(java.lang.String ExitOn) {
		_activeemployeeinfosample.setExitOn(ExitOn);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_activeemployeeinfosample.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_activeemployeeinfosample.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_activeemployeeinfosample.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the first name of this activeemployeeinfosample.
	*
	* @param FirstName the first name of this activeemployeeinfosample
	*/
	@Override
	public void setFirstName(java.lang.String FirstName) {
		_activeemployeeinfosample.setFirstName(FirstName);
	}

	/**
	* Sets the function name of this activeemployeeinfosample.
	*
	* @param FunctionName the function name of this activeemployeeinfosample
	*/
	@Override
	public void setFunctionName(java.lang.String FunctionName) {
		_activeemployeeinfosample.setFunctionName(FunctionName);
	}

	/**
	* Sets the gender of this activeemployeeinfosample.
	*
	* @param gender the gender of this activeemployeeinfosample
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_activeemployeeinfosample.setGender(gender);
	}

	/**
	* Sets the grade of this activeemployeeinfosample.
	*
	* @param Grade the grade of this activeemployeeinfosample
	*/
	@Override
	public void setGrade(java.lang.String Grade) {
		_activeemployeeinfosample.setGrade(Grade);
	}

	/**
	* Sets the grade group of this activeemployeeinfosample.
	*
	* @param GradeGroup the grade group of this activeemployeeinfosample
	*/
	@Override
	public void setGradeGroup(java.lang.String GradeGroup) {
		_activeemployeeinfosample.setGradeGroup(GradeGroup);
	}

	/**
	* Sets the jv branch of this activeemployeeinfosample.
	*
	* @param JVBranch the jv branch of this activeemployeeinfosample
	*/
	@Override
	public void setJVBranch(java.lang.String JVBranch) {
		_activeemployeeinfosample.setJVBranch(JVBranch);
	}

	/**
	* Sets the last name of this activeemployeeinfosample.
	*
	* @param LastName the last name of this activeemployeeinfosample
	*/
	@Override
	public void setLastName(java.lang.String LastName) {
		_activeemployeeinfosample.setLastName(LastName);
	}

	/**
	* Sets the location of this activeemployeeinfosample.
	*
	* @param Location the location of this activeemployeeinfosample
	*/
	@Override
	public void setLocation(java.lang.String Location) {
		_activeemployeeinfosample.setLocation(Location);
	}

	/**
	* Sets the milestone of this activeemployeeinfosample.
	*
	* @param Milestone the milestone of this activeemployeeinfosample
	*/
	@Override
	public void setMilestone(java.lang.String Milestone) {
		_activeemployeeinfosample.setMilestone(Milestone);
	}

	/**
	* Sets the name of this activeemployeeinfosample.
	*
	* @param Name the name of this activeemployeeinfosample
	*/
	@Override
	public void setName(java.lang.String Name) {
		_activeemployeeinfosample.setName(Name);
	}

	@Override
	public void setNew(boolean n) {
		_activeemployeeinfosample.setNew(n);
	}

	/**
	* Sets the photo of this activeemployeeinfosample.
	*
	* @param Photo the photo of this activeemployeeinfosample
	*/
	@Override
	public void setPhoto(java.lang.String Photo) {
		_activeemployeeinfosample.setPhoto(Photo);
	}

	/**
	* Sets the primary key of this activeemployeeinfosample.
	*
	* @param primaryKey the primary key of this activeemployeeinfosample
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_activeemployeeinfosample.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_activeemployeeinfosample.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product of this activeemployeeinfosample.
	*
	* @param Product the product of this activeemployeeinfosample
	*/
	@Override
	public void setProduct(java.lang.String Product) {
		_activeemployeeinfosample.setProduct(Product);
	}

	/**
	* Sets the reason of this activeemployeeinfosample.
	*
	* @param Reason the reason of this activeemployeeinfosample
	*/
	@Override
	public void setReason(java.lang.String Reason) {
		_activeemployeeinfosample.setReason(Reason);
	}

	/**
	* Sets the region of this activeemployeeinfosample.
	*
	* @param Region the region of this activeemployeeinfosample
	*/
	@Override
	public void setRegion(java.lang.String Region) {
		_activeemployeeinfosample.setRegion(Region);
	}

	/**
	* Sets the srno of this activeemployeeinfosample.
	*
	* @param srno the srno of this activeemployeeinfosample
	*/
	@Override
	public void setSrno(int srno) {
		_activeemployeeinfosample.setSrno(srno);
	}

	/**
	* Sets the unit of this activeemployeeinfosample.
	*
	* @param Unit the unit of this activeemployeeinfosample
	*/
	@Override
	public void setUnit(java.lang.String Unit) {
		_activeemployeeinfosample.setUnit(Unit);
	}

	/**
	* Sets the zone of this activeemployeeinfosample.
	*
	* @param Zone the zone of this activeemployeeinfosample
	*/
	@Override
	public void setZone(java.lang.String Zone) {
		_activeemployeeinfosample.setZone(Zone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof activeemployeeinfosampleWrapper)) {
			return false;
		}

		activeemployeeinfosampleWrapper activeemployeeinfosampleWrapper = (activeemployeeinfosampleWrapper)obj;

		if (Objects.equals(_activeemployeeinfosample,
					activeemployeeinfosampleWrapper._activeemployeeinfosample)) {
			return true;
		}

		return false;
	}

	@Override
	public activeemployeeinfosample getWrappedModel() {
		return _activeemployeeinfosample;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _activeemployeeinfosample.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _activeemployeeinfosample.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_activeemployeeinfosample.resetOriginalValues();
	}

	private final activeemployeeinfosample _activeemployeeinfosample;
}