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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.departmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.departmentServiceSoap
 * @generated
 */
@ProviderType
public class departmentSoap implements Serializable {
	public static departmentSoap toSoapModel(department model) {
		departmentSoap soapModel = new departmentSoap();

		soapModel.setDept_id(model.getDept_id());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static departmentSoap[] toSoapModels(department[] models) {
		departmentSoap[] soapModels = new departmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static departmentSoap[][] toSoapModels(department[][] models) {
		departmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new departmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new departmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static departmentSoap[] toSoapModels(List<department> models) {
		List<departmentSoap> soapModels = new ArrayList<departmentSoap>(models.size());

		for (department model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new departmentSoap[soapModels.size()]);
	}

	public departmentSoap() {
	}

	public int getPrimaryKey() {
		return _dept_id;
	}

	public void setPrimaryKey(int pk) {
		setDept_id(pk);
	}

	public int getDept_id() {
		return _dept_id;
	}

	public void setDept_id(int dept_id) {
		_dept_id = dept_id;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public int getBusiness_id() {
		return _business_id;
	}

	public void setBusiness_id(int business_id) {
		_business_id = business_id;
	}

	public int getIsactive() {
		return _isactive;
	}

	public void setIsactive(int isactive) {
		_isactive = isactive;
	}

	private int _dept_id;
	private String _department;
	private int _business_id;
	private int _isactive;
}