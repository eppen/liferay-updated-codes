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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the activeemployeeinfosample service. Represents a row in the &quot;activeemployeeinfosample&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link userapi.model.impl.activeemployeeinfosampleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link userapi.model.impl.activeemployeeinfosampleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see activeemployeeinfosample
 * @see userapi.model.impl.activeemployeeinfosampleImpl
 * @see userapi.model.impl.activeemployeeinfosampleModelImpl
 * @generated
 */
@ProviderType
public interface activeemployeeinfosampleModel extends BaseModel<activeemployeeinfosample> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a activeemployeeinfosample model instance should use the {@link activeemployeeinfosample} interface instead.
	 */

	/**
	 * Returns the primary key of this activeemployeeinfosample.
	 *
	 * @return the primary key of this activeemployeeinfosample
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this activeemployeeinfosample.
	 *
	 * @param primaryKey the primary key of this activeemployeeinfosample
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the srno of this activeemployeeinfosample.
	 *
	 * @return the srno of this activeemployeeinfosample
	 */
	public int getSrno();

	/**
	 * Sets the srno of this activeemployeeinfosample.
	 *
	 * @param srno the srno of this activeemployeeinfosample
	 */
	public void setSrno(int srno);

	/**
	 * Returns the milestone of this activeemployeeinfosample.
	 *
	 * @return the milestone of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getMilestone();

	/**
	 * Sets the milestone of this activeemployeeinfosample.
	 *
	 * @param Milestone the milestone of this activeemployeeinfosample
	 */
	public void setMilestone(String Milestone);

	/**
	 * Returns the emp ID of this activeemployeeinfosample.
	 *
	 * @return the emp ID of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getEmpId();

	/**
	 * Sets the emp ID of this activeemployeeinfosample.
	 *
	 * @param EmpId the emp ID of this activeemployeeinfosample
	 */
	public void setEmpId(String EmpId);

	/**
	 * Returns the name of this activeemployeeinfosample.
	 *
	 * @return the name of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this activeemployeeinfosample.
	 *
	 * @param Name the name of this activeemployeeinfosample
	 */
	public void setName(String Name);

	/**
	 * Returns the emailid of this activeemployeeinfosample.
	 *
	 * @return the emailid of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getEmailid();

	/**
	 * Sets the emailid of this activeemployeeinfosample.
	 *
	 * @param Emailid the emailid of this activeemployeeinfosample
	 */
	public void setEmailid(String Emailid);

	/**
	 * Returns the reason of this activeemployeeinfosample.
	 *
	 * @return the reason of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getReason();

	/**
	 * Sets the reason of this activeemployeeinfosample.
	 *
	 * @param Reason the reason of this activeemployeeinfosample
	 */
	public void setReason(String Reason);

	/**
	 * Returns the photo of this activeemployeeinfosample.
	 *
	 * @return the photo of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getPhoto();

	/**
	 * Sets the photo of this activeemployeeinfosample.
	 *
	 * @param Photo the photo of this activeemployeeinfosample
	 */
	public void setPhoto(String Photo);

	/**
	 * Returns the doj of this activeemployeeinfosample.
	 *
	 * @return the doj of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getDOJ();

	/**
	 * Sets the doj of this activeemployeeinfosample.
	 *
	 * @param DOJ the doj of this activeemployeeinfosample
	 */
	public void setDOJ(String DOJ);

	/**
	 * Returns the exit on of this activeemployeeinfosample.
	 *
	 * @return the exit on of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getExitOn();

	/**
	 * Sets the exit on of this activeemployeeinfosample.
	 *
	 * @param ExitOn the exit on of this activeemployeeinfosample
	 */
	public void setExitOn(String ExitOn);

	/**
	 * Returns the birthday of this activeemployeeinfosample.
	 *
	 * @return the birthday of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getBirthday();

	/**
	 * Sets the birthday of this activeemployeeinfosample.
	 *
	 * @param Birthday the birthday of this activeemployeeinfosample
	 */
	public void setBirthday(String Birthday);

	/**
	 * Returns the anniversary of this activeemployeeinfosample.
	 *
	 * @return the anniversary of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getAnniversary();

	/**
	 * Sets the anniversary of this activeemployeeinfosample.
	 *
	 * @param Anniversary the anniversary of this activeemployeeinfosample
	 */
	public void setAnniversary(String Anniversary);

	/**
	 * Returns the business of this activeemployeeinfosample.
	 *
	 * @return the business of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getBusiness();

	/**
	 * Sets the business of this activeemployeeinfosample.
	 *
	 * @param Business the business of this activeemployeeinfosample
	 */
	public void setBusiness(String Business);

	/**
	 * Returns the unit of this activeemployeeinfosample.
	 *
	 * @return the unit of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getUnit();

	/**
	 * Sets the unit of this activeemployeeinfosample.
	 *
	 * @param Unit the unit of this activeemployeeinfosample
	 */
	public void setUnit(String Unit);

	/**
	 * Returns the grade group of this activeemployeeinfosample.
	 *
	 * @return the grade group of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getGradeGroup();

	/**
	 * Sets the grade group of this activeemployeeinfosample.
	 *
	 * @param GradeGroup the grade group of this activeemployeeinfosample
	 */
	public void setGradeGroup(String GradeGroup);

	/**
	 * Returns the grade of this activeemployeeinfosample.
	 *
	 * @return the grade of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getGrade();

	/**
	 * Sets the grade of this activeemployeeinfosample.
	 *
	 * @param Grade the grade of this activeemployeeinfosample
	 */
	public void setGrade(String Grade);

	/**
	 * Returns the function name of this activeemployeeinfosample.
	 *
	 * @return the function name of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getFunctionName();

	/**
	 * Sets the function name of this activeemployeeinfosample.
	 *
	 * @param FunctionName the function name of this activeemployeeinfosample
	 */
	public void setFunctionName(String FunctionName);

	/**
	 * Returns the department of this activeemployeeinfosample.
	 *
	 * @return the department of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getDepartment();

	/**
	 * Sets the department of this activeemployeeinfosample.
	 *
	 * @param Department the department of this activeemployeeinfosample
	 */
	public void setDepartment(String Department);

	/**
	 * Returns the designation of this activeemployeeinfosample.
	 *
	 * @return the designation of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getDesignation();

	/**
	 * Sets the designation of this activeemployeeinfosample.
	 *
	 * @param Designation the designation of this activeemployeeinfosample
	 */
	public void setDesignation(String Designation);

	/**
	 * Returns the zone of this activeemployeeinfosample.
	 *
	 * @return the zone of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getZone();

	/**
	 * Sets the zone of this activeemployeeinfosample.
	 *
	 * @param Zone the zone of this activeemployeeinfosample
	 */
	public void setZone(String Zone);

	/**
	 * Returns the region of this activeemployeeinfosample.
	 *
	 * @return the region of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getRegion();

	/**
	 * Sets the region of this activeemployeeinfosample.
	 *
	 * @param Region the region of this activeemployeeinfosample
	 */
	public void setRegion(String Region);

	/**
	 * Returns the location of this activeemployeeinfosample.
	 *
	 * @return the location of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this activeemployeeinfosample.
	 *
	 * @param Location the location of this activeemployeeinfosample
	 */
	public void setLocation(String Location);

	/**
	 * Returns the product of this activeemployeeinfosample.
	 *
	 * @return the product of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getProduct();

	/**
	 * Sets the product of this activeemployeeinfosample.
	 *
	 * @param Product the product of this activeemployeeinfosample
	 */
	public void setProduct(String Product);

	/**
	 * Returns the jv branch of this activeemployeeinfosample.
	 *
	 * @return the jv branch of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getJVBranch();

	/**
	 * Sets the jv branch of this activeemployeeinfosample.
	 *
	 * @param JVBranch the jv branch of this activeemployeeinfosample
	 */
	public void setJVBranch(String JVBranch);

	/**
	 * Returns the branch of this activeemployeeinfosample.
	 *
	 * @return the branch of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getBranch();

	/**
	 * Sets the branch of this activeemployeeinfosample.
	 *
	 * @param Branch the branch of this activeemployeeinfosample
	 */
	public void setBranch(String Branch);

	/**
	 * Returns the costcenter of this activeemployeeinfosample.
	 *
	 * @return the costcenter of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getCostcenter();

	/**
	 * Sets the costcenter of this activeemployeeinfosample.
	 *
	 * @param Costcenter the costcenter of this activeemployeeinfosample
	 */
	public void setCostcenter(String Costcenter);

	/**
	 * Returns the area handled of this activeemployeeinfosample.
	 *
	 * @return the area handled of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getAreaHandled();

	/**
	 * Sets the area handled of this activeemployeeinfosample.
	 *
	 * @param AreaHandled the area handled of this activeemployeeinfosample
	 */
	public void setAreaHandled(String AreaHandled);

	/**
	 * Returns the gender of this activeemployeeinfosample.
	 *
	 * @return the gender of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getGender();

	/**
	 * Sets the gender of this activeemployeeinfosample.
	 *
	 * @param gender the gender of this activeemployeeinfosample
	 */
	public void setGender(String gender);

	/**
	 * Returns the first name of this activeemployeeinfosample.
	 *
	 * @return the first name of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this activeemployeeinfosample.
	 *
	 * @param FirstName the first name of this activeemployeeinfosample
	 */
	public void setFirstName(String FirstName);

	/**
	 * Returns the last name of this activeemployeeinfosample.
	 *
	 * @return the last name of this activeemployeeinfosample
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this activeemployeeinfosample.
	 *
	 * @param LastName the last name of this activeemployeeinfosample
	 */
	public void setLastName(String LastName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		userapi.model.activeemployeeinfosample activeemployeeinfosample);

	@Override
	public int hashCode();

	@Override
	public CacheModel<userapi.model.activeemployeeinfosample> toCacheModel();

	@Override
	public userapi.model.activeemployeeinfosample toEscapedModel();

	@Override
	public userapi.model.activeemployeeinfosample toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}