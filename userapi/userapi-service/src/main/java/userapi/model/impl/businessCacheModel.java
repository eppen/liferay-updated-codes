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

import userapi.model.business;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing business in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see business
 * @generated
 */
@ProviderType
public class businessCacheModel implements CacheModel<business>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businessCacheModel)) {
			return false;
		}

		businessCacheModel businessCacheModel = (businessCacheModel)obj;

		if (business_id == businessCacheModel.business_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, business_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{business_id=");
		sb.append(business_id);
		sb.append(", business=");
		sb.append(business);
		sb.append(", short_name=");
		sb.append(short_name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public business toEntityModel() {
		businessImpl businessImpl = new businessImpl();

		businessImpl.setBusiness_id(business_id);

		if (business == null) {
			businessImpl.setBusiness(StringPool.BLANK);
		}
		else {
			businessImpl.setBusiness(business);
		}

		if (short_name == null) {
			businessImpl.setShort_name(StringPool.BLANK);
		}
		else {
			businessImpl.setShort_name(short_name);
		}

		businessImpl.resetOriginalValues();

		return businessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		business_id = objectInput.readInt();
		business = objectInput.readUTF();
		short_name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(business_id);

		if (business == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(business);
		}

		if (short_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(short_name);
		}
	}

	public int business_id;
	public String business;
	public String short_name;
}