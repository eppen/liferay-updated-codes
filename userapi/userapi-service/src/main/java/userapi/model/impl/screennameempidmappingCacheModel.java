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

import userapi.model.screennameempidmapping;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing screennameempidmapping in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see screennameempidmapping
 * @generated
 */
@ProviderType
public class screennameempidmappingCacheModel implements CacheModel<screennameempidmapping>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof screennameempidmappingCacheModel)) {
			return false;
		}

		screennameempidmappingCacheModel screennameempidmappingCacheModel = (screennameempidmappingCacheModel)obj;

		if (srno == screennameempidmappingCacheModel.srno) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, srno);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{srno=");
		sb.append(srno);
		sb.append(", screenname=");
		sb.append(screenname);
		sb.append(", empid=");
		sb.append(empid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public screennameempidmapping toEntityModel() {
		screennameempidmappingImpl screennameempidmappingImpl = new screennameempidmappingImpl();

		screennameempidmappingImpl.setSrno(srno);

		if (screenname == null) {
			screennameempidmappingImpl.setScreenname(StringPool.BLANK);
		}
		else {
			screennameempidmappingImpl.setScreenname(screenname);
		}

		if (empid == null) {
			screennameempidmappingImpl.setEmpid(StringPool.BLANK);
		}
		else {
			screennameempidmappingImpl.setEmpid(empid);
		}

		screennameempidmappingImpl.resetOriginalValues();

		return screennameempidmappingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		srno = objectInput.readInt();
		screenname = objectInput.readUTF();
		empid = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(srno);

		if (screenname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(screenname);
		}

		if (empid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empid);
		}
	}

	public int srno;
	public String screenname;
	public String empid;
}