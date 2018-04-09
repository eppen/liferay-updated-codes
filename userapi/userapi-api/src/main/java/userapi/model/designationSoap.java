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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.designationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.designationServiceSoap
 * @generated
 */
@ProviderType
public class designationSoap implements Serializable {
	public static designationSoap toSoapModel(designation model) {
		designationSoap soapModel = new designationSoap();

		soapModel.setDesig_id(model.getDesig_id());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static designationSoap[] toSoapModels(designation[] models) {
		designationSoap[] soapModels = new designationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static designationSoap[][] toSoapModels(designation[][] models) {
		designationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new designationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new designationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static designationSoap[] toSoapModels(List<designation> models) {
		List<designationSoap> soapModels = new ArrayList<designationSoap>(models.size());

		for (designation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new designationSoap[soapModels.size()]);
	}

	public designationSoap() {
	}

	public int getPrimaryKey() {
		return _desig_id;
	}

	public void setPrimaryKey(int pk) {
		setDesig_id(pk);
	}

	public int getDesig_id() {
		return _desig_id;
	}

	public void setDesig_id(int desig_id) {
		_desig_id = desig_id;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
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

	private int _desig_id;
	private String _designation;
	private int _business_id;
	private int _isactive;
}