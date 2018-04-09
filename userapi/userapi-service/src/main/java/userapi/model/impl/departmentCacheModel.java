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

import userapi.model.department;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing department in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see department
 * @generated
 */
@ProviderType
public class departmentCacheModel implements CacheModel<department>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof departmentCacheModel)) {
			return false;
		}

		departmentCacheModel departmentCacheModel = (departmentCacheModel)obj;

		if (dept_id == departmentCacheModel.dept_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dept_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{dept_id=");
		sb.append(dept_id);
		sb.append(", department=");
		sb.append(department);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public department toEntityModel() {
		departmentImpl departmentImpl = new departmentImpl();

		departmentImpl.setDept_id(dept_id);

		if (department == null) {
			departmentImpl.setDepartment(StringPool.BLANK);
		}
		else {
			departmentImpl.setDepartment(department);
		}

		departmentImpl.setBusiness_id(business_id);
		departmentImpl.setIsactive(isactive);

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dept_id = objectInput.readInt();
		department = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(dept_id);

		if (department == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(department);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int dept_id;
	public String department;
	public int business_id;
	public int isactive;
}