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

import userapi.model.unit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing unit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see unit
 * @generated
 */
@ProviderType
public class unitCacheModel implements CacheModel<unit>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof unitCacheModel)) {
			return false;
		}

		unitCacheModel unitCacheModel = (unitCacheModel)obj;

		if (unit_id == unitCacheModel.unit_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, unit_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{unit_id=");
		sb.append(unit_id);
		sb.append(", unit=");
		sb.append(unit);
		sb.append(", short_name=");
		sb.append(short_name);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public unit toEntityModel() {
		unitImpl unitImpl = new unitImpl();

		unitImpl.setUnit_id(unit_id);

		if (unit == null) {
			unitImpl.setUnit(StringPool.BLANK);
		}
		else {
			unitImpl.setUnit(unit);
		}

		if (short_name == null) {
			unitImpl.setShort_name(StringPool.BLANK);
		}
		else {
			unitImpl.setShort_name(short_name);
		}

		unitImpl.setBusiness_id(business_id);
		unitImpl.setIsactive(isactive);

		unitImpl.resetOriginalValues();

		return unitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		unit_id = objectInput.readInt();
		unit = objectInput.readUTF();
		short_name = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(unit_id);

		if (unit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unit);
		}

		if (short_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(short_name);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int unit_id;
	public String unit;
	public String short_name;
	public int business_id;
	public int isactive;
}