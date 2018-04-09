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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.regiontableServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.regiontableServiceSoap
 * @generated
 */
@ProviderType
public class regiontableSoap implements Serializable {
	public static regiontableSoap toSoapModel(regiontable model) {
		regiontableSoap soapModel = new regiontableSoap();

		soapModel.setRegion_id(model.getRegion_id());
		soapModel.setRegion(model.getRegion());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static regiontableSoap[] toSoapModels(regiontable[] models) {
		regiontableSoap[] soapModels = new regiontableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static regiontableSoap[][] toSoapModels(regiontable[][] models) {
		regiontableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new regiontableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new regiontableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static regiontableSoap[] toSoapModels(List<regiontable> models) {
		List<regiontableSoap> soapModels = new ArrayList<regiontableSoap>(models.size());

		for (regiontable model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new regiontableSoap[soapModels.size()]);
	}

	public regiontableSoap() {
	}

	public int getPrimaryKey() {
		return _region_id;
	}

	public void setPrimaryKey(int pk) {
		setRegion_id(pk);
	}

	public int getRegion_id() {
		return _region_id;
	}

	public void setRegion_id(int region_id) {
		_region_id = region_id;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
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

	private int _region_id;
	private String _region;
	private int _business_id;
	private int _isactive;
}