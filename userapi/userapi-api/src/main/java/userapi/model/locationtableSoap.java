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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.locationtableServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.locationtableServiceSoap
 * @generated
 */
@ProviderType
public class locationtableSoap implements Serializable {
	public static locationtableSoap toSoapModel(locationtable model) {
		locationtableSoap soapModel = new locationtableSoap();

		soapModel.setLoc_id(model.getLoc_id());
		soapModel.setLocation(model.getLocation());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static locationtableSoap[] toSoapModels(locationtable[] models) {
		locationtableSoap[] soapModels = new locationtableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static locationtableSoap[][] toSoapModels(locationtable[][] models) {
		locationtableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new locationtableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new locationtableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static locationtableSoap[] toSoapModels(List<locationtable> models) {
		List<locationtableSoap> soapModels = new ArrayList<locationtableSoap>(models.size());

		for (locationtable model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new locationtableSoap[soapModels.size()]);
	}

	public locationtableSoap() {
	}

	public int getPrimaryKey() {
		return _loc_id;
	}

	public void setPrimaryKey(int pk) {
		setLoc_id(pk);
	}

	public int getLoc_id() {
		return _loc_id;
	}

	public void setLoc_id(int loc_id) {
		_loc_id = loc_id;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
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

	private int _loc_id;
	private String _location;
	private int _business_id;
	private int _isactive;
}