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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.activeemployeeinfosampleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.activeemployeeinfosampleServiceSoap
 * @generated
 */
@ProviderType
public class activeemployeeinfosampleSoap implements Serializable {
	public static activeemployeeinfosampleSoap toSoapModel(
		activeemployeeinfosample model) {
		activeemployeeinfosampleSoap soapModel = new activeemployeeinfosampleSoap();

		soapModel.setSrno(model.getSrno());
		soapModel.setMilestone(model.getMilestone());
		soapModel.setEmpId(model.getEmpId());
		soapModel.setName(model.getName());
		soapModel.setEmailid(model.getEmailid());
		soapModel.setReason(model.getReason());
		soapModel.setPhoto(model.getPhoto());
		soapModel.setDOJ(model.getDOJ());
		soapModel.setExitOn(model.getExitOn());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setAnniversary(model.getAnniversary());
		soapModel.setBusiness(model.getBusiness());
		soapModel.setUnit(model.getUnit());
		soapModel.setGradeGroup(model.getGradeGroup());
		soapModel.setGrade(model.getGrade());
		soapModel.setFunctionName(model.getFunctionName());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setZone(model.getZone());
		soapModel.setRegion(model.getRegion());
		soapModel.setLocation(model.getLocation());
		soapModel.setProduct(model.getProduct());
		soapModel.setJVBranch(model.getJVBranch());
		soapModel.setBranch(model.getBranch());
		soapModel.setCostcenter(model.getCostcenter());
		soapModel.setAreaHandled(model.getAreaHandled());
		soapModel.setGender(model.getGender());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());

		return soapModel;
	}

	public static activeemployeeinfosampleSoap[] toSoapModels(
		activeemployeeinfosample[] models) {
		activeemployeeinfosampleSoap[] soapModels = new activeemployeeinfosampleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static activeemployeeinfosampleSoap[][] toSoapModels(
		activeemployeeinfosample[][] models) {
		activeemployeeinfosampleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new activeemployeeinfosampleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new activeemployeeinfosampleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static activeemployeeinfosampleSoap[] toSoapModels(
		List<activeemployeeinfosample> models) {
		List<activeemployeeinfosampleSoap> soapModels = new ArrayList<activeemployeeinfosampleSoap>(models.size());

		for (activeemployeeinfosample model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new activeemployeeinfosampleSoap[soapModels.size()]);
	}

	public activeemployeeinfosampleSoap() {
	}

	public int getPrimaryKey() {
		return _srno;
	}

	public void setPrimaryKey(int pk) {
		setSrno(pk);
	}

	public int getSrno() {
		return _srno;
	}

	public void setSrno(int srno) {
		_srno = srno;
	}

	public String getMilestone() {
		return _Milestone;
	}

	public void setMilestone(String Milestone) {
		_Milestone = Milestone;
	}

	public String getEmpId() {
		return _EmpId;
	}

	public void setEmpId(String EmpId) {
		_EmpId = EmpId;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getEmailid() {
		return _Emailid;
	}

	public void setEmailid(String Emailid) {
		_Emailid = Emailid;
	}

	public String getReason() {
		return _Reason;
	}

	public void setReason(String Reason) {
		_Reason = Reason;
	}

	public String getPhoto() {
		return _Photo;
	}

	public void setPhoto(String Photo) {
		_Photo = Photo;
	}

	public String getDOJ() {
		return _DOJ;
	}

	public void setDOJ(String DOJ) {
		_DOJ = DOJ;
	}

	public String getExitOn() {
		return _ExitOn;
	}

	public void setExitOn(String ExitOn) {
		_ExitOn = ExitOn;
	}

	public String getBirthday() {
		return _Birthday;
	}

	public void setBirthday(String Birthday) {
		_Birthday = Birthday;
	}

	public String getAnniversary() {
		return _Anniversary;
	}

	public void setAnniversary(String Anniversary) {
		_Anniversary = Anniversary;
	}

	public String getBusiness() {
		return _Business;
	}

	public void setBusiness(String Business) {
		_Business = Business;
	}

	public String getUnit() {
		return _Unit;
	}

	public void setUnit(String Unit) {
		_Unit = Unit;
	}

	public String getGradeGroup() {
		return _GradeGroup;
	}

	public void setGradeGroup(String GradeGroup) {
		_GradeGroup = GradeGroup;
	}

	public String getGrade() {
		return _Grade;
	}

	public void setGrade(String Grade) {
		_Grade = Grade;
	}

	public String getFunctionName() {
		return _FunctionName;
	}

	public void setFunctionName(String FunctionName) {
		_FunctionName = FunctionName;
	}

	public String getDepartment() {
		return _Department;
	}

	public void setDepartment(String Department) {
		_Department = Department;
	}

	public String getDesignation() {
		return _Designation;
	}

	public void setDesignation(String Designation) {
		_Designation = Designation;
	}

	public String getZone() {
		return _Zone;
	}

	public void setZone(String Zone) {
		_Zone = Zone;
	}

	public String getRegion() {
		return _Region;
	}

	public void setRegion(String Region) {
		_Region = Region;
	}

	public String getLocation() {
		return _Location;
	}

	public void setLocation(String Location) {
		_Location = Location;
	}

	public String getProduct() {
		return _Product;
	}

	public void setProduct(String Product) {
		_Product = Product;
	}

	public String getJVBranch() {
		return _JVBranch;
	}

	public void setJVBranch(String JVBranch) {
		_JVBranch = JVBranch;
	}

	public String getBranch() {
		return _Branch;
	}

	public void setBranch(String Branch) {
		_Branch = Branch;
	}

	public String getCostcenter() {
		return _Costcenter;
	}

	public void setCostcenter(String Costcenter) {
		_Costcenter = Costcenter;
	}

	public String getAreaHandled() {
		return _AreaHandled;
	}

	public void setAreaHandled(String AreaHandled) {
		_AreaHandled = AreaHandled;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getFirstName() {
		return _FirstName;
	}

	public void setFirstName(String FirstName) {
		_FirstName = FirstName;
	}

	public String getLastName() {
		return _LastName;
	}

	public void setLastName(String LastName) {
		_LastName = LastName;
	}

	private int _srno;
	private String _Milestone;
	private String _EmpId;
	private String _Name;
	private String _Emailid;
	private String _Reason;
	private String _Photo;
	private String _DOJ;
	private String _ExitOn;
	private String _Birthday;
	private String _Anniversary;
	private String _Business;
	private String _Unit;
	private String _GradeGroup;
	private String _Grade;
	private String _FunctionName;
	private String _Department;
	private String _Designation;
	private String _Zone;
	private String _Region;
	private String _Location;
	private String _Product;
	private String _JVBranch;
	private String _Branch;
	private String _Costcenter;
	private String _AreaHandled;
	private String _gender;
	private String _FirstName;
	private String _LastName;
}