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

import userapi.model.areahandled;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing areahandled in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see areahandled
 * @generated
 */
@ProviderType
public class areahandledCacheModel implements CacheModel<areahandled>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof areahandledCacheModel)) {
			return false;
		}

		areahandledCacheModel areahandledCacheModel = (areahandledCacheModel)obj;

		if (area_id == areahandledCacheModel.area_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, area_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{area_id=");
		sb.append(area_id);
		sb.append(", area=");
		sb.append(area);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public areahandled toEntityModel() {
		areahandledImpl areahandledImpl = new areahandledImpl();

		areahandledImpl.setArea_id(area_id);

		if (area == null) {
			areahandledImpl.setArea(StringPool.BLANK);
		}
		else {
			areahandledImpl.setArea(area);
		}

		areahandledImpl.setBusiness_id(business_id);
		areahandledImpl.setIsactive(isactive);

		areahandledImpl.resetOriginalValues();

		return areahandledImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		area_id = objectInput.readInt();
		area = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(area_id);

		if (area == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(area);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int area_id;
	public String area;
	public int business_id;
	public int isactive;
}