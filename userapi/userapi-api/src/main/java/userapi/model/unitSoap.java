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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.unitServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.unitServiceSoap
 * @generated
 */
@ProviderType
public class unitSoap implements Serializable {
	public static unitSoap toSoapModel(unit model) {
		unitSoap soapModel = new unitSoap();

		soapModel.setUnit_id(model.getUnit_id());
		soapModel.setUnit(model.getUnit());
		soapModel.setShort_name(model.getShort_name());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static unitSoap[] toSoapModels(unit[] models) {
		unitSoap[] soapModels = new unitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static unitSoap[][] toSoapModels(unit[][] models) {
		unitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new unitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new unitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static unitSoap[] toSoapModels(List<unit> models) {
		List<unitSoap> soapModels = new ArrayList<unitSoap>(models.size());

		for (unit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new unitSoap[soapModels.size()]);
	}

	public unitSoap() {
	}

	public int getPrimaryKey() {
		return _unit_id;
	}

	public void setPrimaryKey(int pk) {
		setUnit_id(pk);
	}

	public int getUnit_id() {
		return _unit_id;
	}

	public void setUnit_id(int unit_id) {
		_unit_id = unit_id;
	}

	public String getUnit() {
		return _unit;
	}

	public void setUnit(String unit) {
		_unit = unit;
	}

	public String getShort_name() {
		return _short_name;
	}

	public void setShort_name(String short_name) {
		_short_name = short_name;
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

	private int _unit_id;
	private String _unit;
	private String _short_name;
	private int _business_id;
	private int _isactive;
}