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

import userapi.model.zone;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing zone in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see zone
 * @generated
 */
@ProviderType
public class zoneCacheModel implements CacheModel<zone>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof zoneCacheModel)) {
			return false;
		}

		zoneCacheModel zoneCacheModel = (zoneCacheModel)obj;

		if (zone_id == zoneCacheModel.zone_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, zone_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{zone_id=");
		sb.append(zone_id);
		sb.append(", zone=");
		sb.append(zone);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public zone toEntityModel() {
		zoneImpl zoneImpl = new zoneImpl();

		zoneImpl.setZone_id(zone_id);

		if (zone == null) {
			zoneImpl.setZone(StringPool.BLANK);
		}
		else {
			zoneImpl.setZone(zone);
		}

		zoneImpl.setBusiness_id(business_id);
		zoneImpl.setIsactive(isactive);

		zoneImpl.resetOriginalValues();

		return zoneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		zone_id = objectInput.readInt();
		zone = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(zone_id);

		if (zone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zone);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int zone_id;
	public String zone;
	public int business_id;
	public int isactive;
}