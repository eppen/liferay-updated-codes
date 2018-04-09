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

package userapi.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import userapi.model.functiontable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing functiontable in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see functiontable
 * @generated
 */
@ProviderType
public class functiontableCacheModel implements CacheModel<functiontable>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof functiontableCacheModel)) {
			return false;
		}

		functiontableCacheModel functiontableCacheModel = (functiontableCacheModel)obj;

		if (function_id == functiontableCacheModel.function_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, function_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{function_id=");
		sb.append(function_id);
		sb.append(", function=");
		sb.append(function);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public functiontable toEntityModel() {
		functiontableImpl functiontableImpl = new functiontableImpl();

		functiontableImpl.setFunction_id(function_id);

		if (function == null) {
			functiontableImpl.setFunction(StringPool.BLANK);
		}
		else {
			functiontableImpl.setFunction(function);
		}

		functiontableImpl.setBusiness_id(business_id);
		functiontableImpl.setIsactive(isactive);

		functiontableImpl.resetOriginalValues();

		return functiontableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		function_id = objectInput.readInt();
		function = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(function_id);

		if (function == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(function);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int function_id;
	public String function;
	public int business_id;
	public int isactive;
}