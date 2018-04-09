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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.gradeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.gradeServiceSoap
 * @generated
 */
@ProviderType
public class gradeSoap implements Serializable {
	public static gradeSoap toSoapModel(grade model) {
		gradeSoap soapModel = new gradeSoap();

		soapModel.setGrade_id(model.getGrade_id());
		soapModel.setGrade(model.getGrade());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static gradeSoap[] toSoapModels(grade[] models) {
		gradeSoap[] soapModels = new gradeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static gradeSoap[][] toSoapModels(grade[][] models) {
		gradeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new gradeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new gradeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static gradeSoap[] toSoapModels(List<grade> models) {
		List<gradeSoap> soapModels = new ArrayList<gradeSoap>(models.size());

		for (grade model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new gradeSoap[soapModels.size()]);
	}

	public gradeSoap() {
	}

	public int getPrimaryKey() {
		return _grade_id;
	}

	public void setPrimaryKey(int pk) {
		setGrade_id(pk);
	}

	public int getGrade_id() {
		return _grade_id;
	}

	public void setGrade_id(int grade_id) {
		_grade_id = grade_id;
	}

	public String getGrade() {
		return _grade;
	}

	public void setGrade(String grade) {
		_grade = grade;
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

	private int _grade_id;
	private String _grade;
	private int _business_id;
	private int _isactive;
}