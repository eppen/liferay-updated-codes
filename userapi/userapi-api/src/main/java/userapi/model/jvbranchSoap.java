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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.jvbranchServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.jvbranchServiceSoap
 * @generated
 */
@ProviderType
public class jvbranchSoap implements Serializable {
	public static jvbranchSoap toSoapModel(jvbranch model) {
		jvbranchSoap soapModel = new jvbranchSoap();

		soapModel.setJvbranch_id(model.getJvbranch_id());
		soapModel.setJvbranch(model.getJvbranch());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static jvbranchSoap[] toSoapModels(jvbranch[] models) {
		jvbranchSoap[] soapModels = new jvbranchSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static jvbranchSoap[][] toSoapModels(jvbranch[][] models) {
		jvbranchSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new jvbranchSoap[models.length][models[0].length];
		}
		else {
			soapModels = new jvbranchSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static jvbranchSoap[] toSoapModels(List<jvbranch> models) {
		List<jvbranchSoap> soapModels = new ArrayList<jvbranchSoap>(models.size());

		for (jvbranch model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new jvbranchSoap[soapModels.size()]);
	}

	public jvbranchSoap() {
	}

	public int getPrimaryKey() {
		return _jvbranch_id;
	}

	public void setPrimaryKey(int pk) {
		setJvbranch_id(pk);
	}

	public int getJvbranch_id() {
		return _jvbranch_id;
	}

	public void setJvbranch_id(int jvbranch_id) {
		_jvbranch_id = jvbranch_id;
	}

	public String getJvbranch() {
		return _jvbranch;
	}

	public void setJvbranch(String jvbranch) {
		_jvbranch = jvbranch;
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

	private int _jvbranch_id;
	private String _jvbranch;
	private int _business_id;
	private int _isactive;
}