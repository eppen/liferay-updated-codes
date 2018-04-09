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
 * This class is used by SOAP remote services, specifically {@link userapi.service.http.branchServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.http.branchServiceSoap
 * @generated
 */
@ProviderType
public class branchSoap implements Serializable {
	public static branchSoap toSoapModel(branch model) {
		branchSoap soapModel = new branchSoap();

		soapModel.setBranch_id(model.getBranch_id());
		soapModel.setBranch(model.getBranch());
		soapModel.setBusiness_id(model.getBusiness_id());
		soapModel.setIsactive(model.getIsactive());

		return soapModel;
	}

	public static branchSoap[] toSoapModels(branch[] models) {
		branchSoap[] soapModels = new branchSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static branchSoap[][] toSoapModels(branch[][] models) {
		branchSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new branchSoap[models.length][models[0].length];
		}
		else {
			soapModels = new branchSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static branchSoap[] toSoapModels(List<branch> models) {
		List<branchSoap> soapModels = new ArrayList<branchSoap>(models.size());

		for (branch model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new branchSoap[soapModels.size()]);
	}

	public branchSoap() {
	}

	public int getPrimaryKey() {
		return _branch_id;
	}

	public void setPrimaryKey(int pk) {
		setBranch_id(pk);
	}

	public int getBranch_id() {
		return _branch_id;
	}

	public void setBranch_id(int branch_id) {
		_branch_id = branch_id;
	}

	public String getBranch() {
		return _branch;
	}

	public void setBranch(String branch) {
		_branch = branch;
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

	private int _branch_id;
	private String _branch;
	private int _business_id;
	private int _isactive;
}