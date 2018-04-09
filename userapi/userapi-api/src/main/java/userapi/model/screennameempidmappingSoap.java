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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.screennameempidmappingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.screennameempidmappingServiceSoap
 * @generated
 */
@ProviderType
public class screennameempidmappingSoap implements Serializable {
	public static screennameempidmappingSoap toSoapModel(
		screennameempidmapping model) {
		screennameempidmappingSoap soapModel = new screennameempidmappingSoap();

		soapModel.setSrno(model.getSrno());
		soapModel.setScreenname(model.getScreenname());
		soapModel.setEmpid(model.getEmpid());

		return soapModel;
	}

	public static screennameempidmappingSoap[] toSoapModels(
		screennameempidmapping[] models) {
		screennameempidmappingSoap[] soapModels = new screennameempidmappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static screennameempidmappingSoap[][] toSoapModels(
		screennameempidmapping[][] models) {
		screennameempidmappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new screennameempidmappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new screennameempidmappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static screennameempidmappingSoap[] toSoapModels(
		List<screennameempidmapping> models) {
		List<screennameempidmappingSoap> soapModels = new ArrayList<screennameempidmappingSoap>(models.size());

		for (screennameempidmapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new screennameempidmappingSoap[soapModels.size()]);
	}

	public screennameempidmappingSoap() {
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

	public String getScreenname() {
		return _screenname;
	}

	public void setScreenname(String screenname) {
		_screenname = screenname;
	}

	public String getEmpid() {
		return _empid;
	}

	public void setEmpid(String empid) {
		_empid = empid;
	}

	private int _srno;
	private String _screenname;
	private String _empid;
}