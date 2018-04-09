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

import userapi.model.grade;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing grade in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see grade
 * @generated
 */
@ProviderType
public class gradeCacheModel implements CacheModel<grade>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof gradeCacheModel)) {
			return false;
		}

		gradeCacheModel gradeCacheModel = (gradeCacheModel)obj;

		if (grade_id == gradeCacheModel.grade_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, grade_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{grade_id=");
		sb.append(grade_id);
		sb.append(", grade=");
		sb.append(grade);
		sb.append(", business_id=");
		sb.append(business_id);
		sb.append(", isactive=");
		sb.append(isactive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public grade toEntityModel() {
		gradeImpl gradeImpl = new gradeImpl();

		gradeImpl.setGrade_id(grade_id);

		if (grade == null) {
			gradeImpl.setGrade(StringPool.BLANK);
		}
		else {
			gradeImpl.setGrade(grade);
		}

		gradeImpl.setBusiness_id(business_id);
		gradeImpl.setIsactive(isactive);

		gradeImpl.resetOriginalValues();

		return gradeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		grade_id = objectInput.readInt();
		grade = objectInput.readUTF();

		business_id = objectInput.readInt();

		isactive = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(grade_id);

		if (grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grade);
		}

		objectOutput.writeInt(business_id);

		objectOutput.writeInt(isactive);
	}

	public int grade_id;
	public String grade;
	public int business_id;
	public int isactive;
}