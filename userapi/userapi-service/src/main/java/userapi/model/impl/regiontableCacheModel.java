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

import userapi.model.regiontable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing regiontable in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see regiontable
 * @generated
 */
@ProviderType
public class regiontableCacheModel implements CacheModel<regiontable>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof regiontableCacheModel)) {
			return false;
		}

		regiontableCacheModel regiontableCacheModel = (regiontableCacheModel)obj;

		if (region_id == regiontableCacheModel.region_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, region_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{region_id=");
		sb.append(region_id);
		sb.append(", region=");
		sb.append(region);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public regiontable toEntityModel() {
		regiontableImpl regiontableImpl = new regiontableImpl();

		regiontableImpl.setRegion_id(region_id);

		if (region == null) {
			regiontableImpl.setRegion(StringPool.BLANK);
		}
		else {
			regiontableImpl.setRegion(region);
		}

		regiontableImpl.setBusiness_id(business_id);
		regiontableImpl.setIsactive(isactive);

		regiontableImpl.resetOriginalValues();

		return regiontableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		region_id = objectInput.readInt();
		region = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(region_id);

		if (region == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(region);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int region_id;
	public String region;
	public int business_id;
	public int isactive;
}