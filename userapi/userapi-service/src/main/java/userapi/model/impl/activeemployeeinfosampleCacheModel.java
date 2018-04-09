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

import userapi.model.activeemployeeinfosample;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing activeemployeeinfosample in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see activeemployeeinfosample
 * @generated
 */
@ProviderType
public class activeemployeeinfosampleCacheModel implements CacheModel<activeemployeeinfosample>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof activeemployeeinfosampleCacheModel)) {
			return false;
		}

		activeemployeeinfosampleCacheModel activeemployeeinfosampleCacheModel = (activeemployeeinfosampleCacheModel)obj;

		if (srno == activeemployeeinfosampleCacheModel.srno) {
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
		StringBundler sb = new StringBundler(59);

		sb.append("{srno=");
		sb.append(srno);
		sb.append(", Milestone=");
		sb.append(Milestone);
		sb.append(", EmpId=");
		sb.append(EmpId);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", Emailid=");
		sb.append(Emailid);
		sb.append(", Reason=");
		sb.append(Reason);
		sb.append(", Photo=");
		sb.append(Photo);
		sb.append(", DOJ=");
		sb.append(DOJ);
		sb.append(", ExitOn=");
		sb.append(ExitOn);
		sb.append(", Birthday=");
		sb.append(Birthday);
		sb.append(", Anniversary=");
		sb.append(Anniversary);
		sb.append(", Business=");
		sb.append(Business);
		sb.append(", Unit=");
		sb.append(Unit);
		sb.append(", GradeGroup=");
		sb.append(GradeGroup);
		sb.append(", Grade=");
		sb.append(Grade);
		sb.append(", FunctionName=");
		sb.append(FunctionName);
		sb.append(", Department=");
		sb.append(Department);
		sb.append(", Designation=");
		sb.append(Designation);
		sb.append(", Zone=");
		sb.append(Zone);
		sb.append(", Region=");
		sb.append(Region);
		sb.append(", Location=");
		sb.append(Location);
		sb.append(", Product=");
		sb.append(Product);
		sb.append(", JVBranch=");
		sb.append(JVBranch);
		sb.append(", Branch=");
		sb.append(Branch);
		sb.append(", Costcenter=");
		sb.append(Costcenter);
		sb.append(", AreaHandled=");
		sb.append(AreaHandled);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", FirstName=");
		sb.append(FirstName);
		sb.append(", LastName=");
		sb.append(LastName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public activeemployeeinfosample toEntityModel() {
		activeemployeeinfosampleImpl activeemployeeinfosampleImpl = new activeemployeeinfosampleImpl();

		activeemployeeinfosampleImpl.setSrno(srno);

		if (Milestone == null) {
			activeemployeeinfosampleImpl.setMilestone(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setMilestone(Milestone);
		}

		if (EmpId == null) {
			activeemployeeinfosampleImpl.setEmpId(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setEmpId(EmpId);
		}

		if (Name == null) {
			activeemployeeinfosampleImpl.setName(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setName(Name);
		}

		if (Emailid == null) {
			activeemployeeinfosampleImpl.setEmailid(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setEmailid(Emailid);
		}

		if (Reason == null) {
			activeemployeeinfosampleImpl.setReason(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setReason(Reason);
		}

		if (Photo == null) {
			activeemployeeinfosampleImpl.setPhoto(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setPhoto(Photo);
		}

		if (DOJ == null) {
			activeemployeeinfosampleImpl.setDOJ(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setDOJ(DOJ);
		}

		if (ExitOn == null) {
			activeemployeeinfosampleImpl.setExitOn(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setExitOn(ExitOn);
		}

		if (Birthday == null) {
			activeemployeeinfosampleImpl.setBirthday(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setBirthday(Birthday);
		}

		if (Anniversary == null) {
			activeemployeeinfosampleImpl.setAnniversary(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setAnniversary(Anniversary);
		}

		if (Business == null) {
			activeemployeeinfosampleImpl.setBusiness(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setBusiness(Business);
		}

		if (Unit == null) {
			activeemployeeinfosampleImpl.setUnit(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setUnit(Unit);
		}

		if (GradeGroup == null) {
			activeemployeeinfosampleImpl.setGradeGroup(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setGradeGroup(GradeGroup);
		}

		if (Grade == null) {
			activeemployeeinfosampleImpl.setGrade(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setGrade(Grade);
		}

		if (FunctionName == null) {
			activeemployeeinfosampleImpl.setFunctionName(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setFunctionName(FunctionName);
		}

		if (Department == null) {
			activeemployeeinfosampleImpl.setDepartment(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setDepartment(Department);
		}

		if (Designation == null) {
			activeemployeeinfosampleImpl.setDesignation(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setDesignation(Designation);
		}

		if (Zone == null) {
			activeemployeeinfosampleImpl.setZone(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setZone(Zone);
		}

		if (Region == null) {
			activeemployeeinfosampleImpl.setRegion(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setRegion(Region);
		}

		if (Location == null) {
			activeemployeeinfosampleImpl.setLocation(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setLocation(Location);
		}

		if (Product == null) {
			activeemployeeinfosampleImpl.setProduct(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setProduct(Product);
		}

		if (JVBranch == null) {
			activeemployeeinfosampleImpl.setJVBranch(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setJVBranch(JVBranch);
		}

		if (Branch == null) {
			activeemployeeinfosampleImpl.setBranch(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setBranch(Branch);
		}

		if (Costcenter == null) {
			activeemployeeinfosampleImpl.setCostcenter(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setCostcenter(Costcenter);
		}

		if (AreaHandled == null) {
			activeemployeeinfosampleImpl.setAreaHandled(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setAreaHandled(AreaHandled);
		}

		if (gender == null) {
			activeemployeeinfosampleImpl.setGender(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setGender(gender);
		}

		if (FirstName == null) {
			activeemployeeinfosampleImpl.setFirstName(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setFirstName(FirstName);
		}

		if (LastName == null) {
			activeemployeeinfosampleImpl.setLastName(StringPool.BLANK);
		}
		else {
			activeemployeeinfosampleImpl.setLastName(LastName);
		}

		activeemployeeinfosampleImpl.resetOriginalValues();

		return activeemployeeinfosampleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		srno = objectInput.readInt();
		Milestone = objectInput.readUTF();
		EmpId = objectInput.readUTF();
		Name = objectInput.readUTF();
		Emailid = objectInput.readUTF();
		Reason = objectInput.readUTF();
		Photo = objectInput.readUTF();
		DOJ = objectInput.readUTF();
		ExitOn = objectInput.readUTF();
		Birthday = objectInput.readUTF();
		Anniversary = objectInput.readUTF();
		Business = objectInput.readUTF();
		Unit = objectInput.readUTF();
		GradeGroup = objectInput.readUTF();
		Grade = objectInput.readUTF();
		FunctionName = objectInput.readUTF();
		Department = objectInput.readUTF();
		Designation = objectInput.readUTF();
		Zone = objectInput.readUTF();
		Region = objectInput.readUTF();
		Location = objectInput.readUTF();
		Product = objectInput.readUTF();
		JVBranch = objectInput.readUTF();
		Branch = objectInput.readUTF();
		Costcenter = objectInput.readUTF();
		AreaHandled = objectInput.readUTF();
		gender = objectInput.readUTF();
		FirstName = objectInput.readUTF();
		LastName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(srno);

		if (Milestone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Milestone);
		}

		if (EmpId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EmpId);
		}

		if (Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Name);
		}

		if (Emailid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Emailid);
		}

		if (Reason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Reason);
		}

		if (Photo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Photo);
		}

		if (DOJ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DOJ);
		}

		if (ExitOn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ExitOn);
		}

		if (Birthday == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Birthday);
		}

		if (Anniversary == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Anniversary);
		}

		if (Business == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Business);
		}

		if (Unit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Unit);
		}

		if (GradeGroup == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GradeGroup);
		}

		if (Grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Grade);
		}

		if (FunctionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FunctionName);
		}

		if (Department == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Department);
		}

		if (Designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Designation);
		}

		if (Zone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Zone);
		}

		if (Region == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Region);
		}

		if (Location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Location);
		}

		if (Product == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Product);
		}

		if (JVBranch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(JVBranch);
		}

		if (Branch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Branch);
		}

		if (Costcenter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Costcenter);
		}

		if (AreaHandled == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AreaHandled);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (FirstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FirstName);
		}

		if (LastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LastName);
		}
	}

	public int srno;
	public String Milestone;
	public String EmpId;
	public String Name;
	public String Emailid;
	public String Reason;
	public String Photo;
	public String DOJ;
	public String ExitOn;
	public String Birthday;
	public String Anniversary;
	public String Business;
	public String Unit;
	public String GradeGroup;
	public String Grade;
	public String FunctionName;
	public String Department;
	public String Designation;
	public String Zone;
	public String Region;
	public String Location;
	public String Product;
	public String JVBranch;
	public String Branch;
	public String Costcenter;
	public String AreaHandled;
	public String gender;
	public String FirstName;
	public String LastName;
}