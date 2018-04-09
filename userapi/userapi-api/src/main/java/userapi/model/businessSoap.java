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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.businessServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.businessServiceSoap
 * @generated
 */
@ProviderType
public class businessSoap implements Serializable {
	public static businessSoap toSoapModel(business model) {
		businessSoap soapModel = new businessSoap();

		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setBusiness(model.getBusiness());
		soapModel.setShort_name(model.getShort_name());

		return soapModel;
	}

	public static businessSoap[] toSoapModels(business[] models) {
		businessSoap[] soapModels = new businessSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static businessSoap[][] toSoapModels(business[][] models) {
		businessSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new businessSoap[models.length][models[0].length];
		}
		else {
			soapModels = new businessSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static businessSoap[] toSoapModels(List<business> models) {
		List<businessSoap> soapModels = new ArrayList<businessSoap>(models.size());

		for (business model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new businessSoap[soapModels.size()]);
	}

	public businessSoap() {
	}

	public int getPrimaryKey() {
		return _business_id;
	}

	public void setPrimaryKey(int pk) {
		setBusiness_id(pk);
	}

	public int getBusiness_id() {
		return _business_id;
	}

	public void setBusiness_id(int business_id) {
		_business_id = business_id;
	}

	public String getBusiness() {
		return _business;
	}

	public void setBusiness(String business) {
		_business = business;
	}

	public String getShort_name() {
		return _short_name;
	}

	public void setShort_name(String short_name) {
		_short_name = short_name;
	}

	private int _business_id;
	private String _business;
	private String _short_name;
}