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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.functiontableServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.functiontableServiceSoap
 * @generated
 */
@ProviderType
public class functiontableSoap implements Serializable {
	public static functiontableSoap toSoapModel(functiontable model) {
		functiontableSoap soapModel = new functiontableSoap();

		soapModel.setFunction_id(model.getFunction_id());
		soapModel.setFunction(model.getFunction());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static functiontableSoap[] toSoapModels(functiontable[] models) {
		functiontableSoap[] soapModels = new functiontableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static functiontableSoap[][] toSoapModels(functiontable[][] models) {
		functiontableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new functiontableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new functiontableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static functiontableSoap[] toSoapModels(List<functiontable> models) {
		List<functiontableSoap> soapModels = new ArrayList<functiontableSoap>(models.size());

		for (functiontable model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new functiontableSoap[soapModels.size()]);
	}

	public functiontableSoap() {
	}

	public int getPrimaryKey() {
		return _function_id;
	}

	public void setPrimaryKey(int pk) {
		setFunction_id(pk);
	}

	public int getFunction_id() {
		return _function_id;
	}

	public void setFunction_id(int function_id) {
		_function_id = function_id;
	}

	public String getFunction() {
		return _function;
	}

	public void setFunction(String function) {
		_function = function;
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

	private int _function_id;
	private String _function;
	private int _business_id;
	private int _isactive;
}