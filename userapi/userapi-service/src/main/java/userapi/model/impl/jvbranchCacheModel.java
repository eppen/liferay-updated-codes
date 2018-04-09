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

import userapi.model.jvbranch;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing jvbranch in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see jvbranch
 * @generated
 */
@ProviderType
public class jvbranchCacheModel implements CacheModel<jvbranch>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof jvbranchCacheModel)) {
			return false;
		}

		jvbranchCacheModel jvbranchCacheModel = (jvbranchCacheModel)obj;

		if (jvbranch_id == jvbranchCacheModel.jvbranch_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jvbranch_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{jvbranch_id=");
		sb.append(jvbranch_id);
		sb.append(", jvbranch=");
		sb.append(jvbranch);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public jvbranch toEntityModel() {
		jvbranchImpl jvbranchImpl = new jvbranchImpl();

		jvbranchImpl.setJvbranch_id(jvbranch_id);

		if (jvbranch == null) {
			jvbranchImpl.setJvbranch(StringPool.BLANK);
		}
		else {
			jvbranchImpl.setJvbranch(jvbranch);
		}

		jvbranchImpl.setBusiness_id(business_id);
		jvbranchImpl.setIsactive(isactive);

		jvbranchImpl.resetOriginalValues();

		return jvbranchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jvbranch_id = objectInput.readInt();
		jvbranch = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(jvbranch_id);

		if (jvbranch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jvbranch);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int jvbranch_id;
	public String jvbranch;
	public int business_id;
	public int isactive;
}