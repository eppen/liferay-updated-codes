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

import userapi.model.branch;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing branch in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see branch
 * @generated
 */
@ProviderType
public class branchCacheModel implements CacheModel<branch>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof branchCacheModel)) {
			return false;
		}

		branchCacheModel branchCacheModel = (branchCacheModel)obj;

		if (branch_id == branchCacheModel.branch_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, branch_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{branch_id=");
		sb.append(branch_id);
		sb.append(", branch=");
		sb.append(branch);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public branch toEntityModel() {
		branchImpl branchImpl = new branchImpl();

		branchImpl.setBranch_id(branch_id);

		if (branch == null) {
			branchImpl.setBranch(StringPool.BLANK);
		}
		else {
			branchImpl.setBranch(branch);
		}

		branchImpl.setBusiness_id(business_id);
		branchImpl.setIsactive(isactive);

		branchImpl.resetOriginalValues();

		return branchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		branch_id = objectInput.readInt();
		branch = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(branch_id);

		if (branch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(branch);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int branch_id;
	public String branch;
	public int business_id;
	public int isactive;
}