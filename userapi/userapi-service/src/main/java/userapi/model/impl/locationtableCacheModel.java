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

import userapi.model.locationtable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing locationtable in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see locationtable
 * @generated
 */
@ProviderType
public class locationtableCacheModel implements CacheModel<locationtable>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof locationtableCacheModel)) {
			return false;
		}

		locationtableCacheModel locationtableCacheModel = (locationtableCacheModel)obj;

		if (loc_id == locationtableCacheModel.loc_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, loc_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{loc_id=");
		sb.append(loc_id);
		sb.append(", location=");
		sb.append(location);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public locationtable toEntityModel() {
		locationtableImpl locationtableImpl = new locationtableImpl();

		locationtableImpl.setLoc_id(loc_id);

		if (location == null) {
			locationtableImpl.setLocation(StringPool.BLANK);
		}
		else {
			locationtableImpl.setLocation(location);
		}

		locationtableImpl.setBusiness_id(business_id);
		locationtableImpl.setIsactive(isactive);

		locationtableImpl.resetOriginalValues();

		return locationtableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loc_id = objectInput.readInt();
		location = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(loc_id);

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int loc_id;
	public String location;
	public int business_id;
	public int isactive;
}