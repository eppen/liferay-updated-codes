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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.zoneServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.zoneServiceSoap
 * @generated
 */
@ProviderType
public class zoneSoap implements Serializable {
	public static zoneSoap toSoapModel(zone model) {
		zoneSoap soapModel = new zoneSoap();

		soapModel.setZone_id(model.getZone_id());
		soapModel.setZone(model.getZone());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static zoneSoap[] toSoapModels(zone[] models) {
		zoneSoap[] soapModels = new zoneSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static zoneSoap[][] toSoapModels(zone[][] models) {
		zoneSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new zoneSoap[models.length][models[0].length];
		}
		else {
			soapModels = new zoneSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static zoneSoap[] toSoapModels(List<zone> models) {
		List<zoneSoap> soapModels = new ArrayList<zoneSoap>(models.size());

		for (zone model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new zoneSoap[soapModels.size()]);
	}

	public zoneSoap() {
	}

	public int getPrimaryKey() {
		return _zone_id;
	}

	public void setPrimaryKey(int pk) {
		setZone_id(pk);
	}

	public int getZone_id() {
		return _zone_id;
	}

	public void setZone_id(int zone_id) {
		_zone_id = zone_id;
	}

	public String getZone() {
		return _zone;
	}

	public void setZone(String zone) {
		_zone = zone;
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

	private int _zone_id;
	private String _zone;
	private int _business_id;
	private int _isactive;
}