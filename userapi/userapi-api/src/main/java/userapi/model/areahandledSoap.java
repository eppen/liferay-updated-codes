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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.areahandledServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.areahandledServiceSoap
 * @generated
 */
@ProviderType
public class areahandledSoap implements Serializable {
	public static areahandledSoap toSoapModel(areahandled model) {
		areahandledSoap soapModel = new areahandledSoap();

		soapModel.setArea_id(model.getArea_id());
		soapModel.setArea(model.getArea());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static areahandledSoap[] toSoapModels(areahandled[] models) {
		areahandledSoap[] soapModels = new areahandledSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static areahandledSoap[][] toSoapModels(areahandled[][] models) {
		areahandledSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new areahandledSoap[models.length][models[0].length];
		}
		else {
			soapModels = new areahandledSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static areahandledSoap[] toSoapModels(List<areahandled> models) {
		List<areahandledSoap> soapModels = new ArrayList<areahandledSoap>(models.size());

		for (areahandled model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new areahandledSoap[soapModels.size()]);
	}

	public areahandledSoap() {
	}

	public int getPrimaryKey() {
		return _area_id;
	}

	public void setPrimaryKey(int pk) {
		setArea_id(pk);
	}

	public int getArea_id() {
		return _area_id;
	}

	public void setArea_id(int area_id) {
		_area_id = area_id;
	}

	public String getArea() {
		return _area;
	}

	public void setArea(String area) {
		_area = area;
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

	private int _area_id;
	private String _area;
	private int _business_id;
	private int _isactive;
}