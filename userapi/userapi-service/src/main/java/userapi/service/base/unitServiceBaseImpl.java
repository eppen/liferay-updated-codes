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

package userapi.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import userapi.model.unit;

import userapi.service.persistence.activeemployeeinfosamplePersistence;
import userapi.service.persistence.areahandledPersistence;
import userapi.service.persistence.branchPersistence;
import userapi.service.persistence.businessPersistence;
import userapi.service.persistence.departmentPersistence;
import userapi.service.persistence.designationPersistence;
import userapi.service.persistence.functiontablePersistence;
import userapi.service.persistence.gradePersistence;
import userapi.service.persistence.jvbranchPersistence;
import userapi.service.persistence.locationtablePersistence;
import userapi.service.persistence.regiontablePersistence;
import userapi.service.persistence.screennameempidmappingFinder;
import userapi.service.persistence.screennameempidmappingPersistence;
import userapi.service.persistence.unitPersistence;
import userapi.service.persistence.zonePersistence;

import userapi.service.unitService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the unit remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link userapi.service.impl.unitServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.impl.unitServiceImpl
 * @see userapi.service.unitServiceUtil
 * @generated
 */
public abstract class unitServiceBaseImpl extends BaseServiceImpl
	implements unitService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link userapi.service.unitServiceUtil} to access the unit remote service.
	 */

	/**
	 * Returns the activeemployeeinfosample local service.
	 *
	 * @return the activeemployeeinfosample local service
	 */
	public userapi.service.activeemployeeinfosampleLocalService getactiveemployeeinfosampleLocalService() {
		return activeemployeeinfosampleLocalService;
	}

	/**
	 * Sets the activeemployeeinfosample local service.
	 *
	 * @param activeemployeeinfosampleLocalService the activeemployeeinfosample local service
	 */
	public void setactiveemployeeinfosampleLocalService(
		userapi.service.activeemployeeinfosampleLocalService activeemployeeinfosampleLocalService) {
		this.activeemployeeinfosampleLocalService = activeemployeeinfosampleLocalService;
	}

	/**
	 * Returns the activeemployeeinfosample remote service.
	 *
	 * @return the activeemployeeinfosample remote service
	 */
	public userapi.service.activeemployeeinfosampleService getactiveemployeeinfosampleService() {
		return activeemployeeinfosampleService;
	}

	/**
	 * Sets the activeemployeeinfosample remote service.
	 *
	 * @param activeemployeeinfosampleService the activeemployeeinfosample remote service
	 */
	public void setactiveemployeeinfosampleService(
		userapi.service.activeemployeeinfosampleService activeemployeeinfosampleService) {
		this.activeemployeeinfosampleService = activeemployeeinfosampleService;
	}

	/**
	 * Returns the activeemployeeinfosample persistence.
	 *
	 * @return the activeemployeeinfosample persistence
	 */
	public activeemployeeinfosamplePersistence getactiveemployeeinfosamplePersistence() {
		return activeemployeeinfosamplePersistence;
	}

	/**
	 * Sets the activeemployeeinfosample persistence.
	 *
	 * @param activeemployeeinfosamplePersistence the activeemployeeinfosample persistence
	 */
	public void setactiveemployeeinfosamplePersistence(
		activeemployeeinfosamplePersistence activeemployeeinfosamplePersistence) {
		this.activeemployeeinfosamplePersistence = activeemployeeinfosamplePersistence;
	}

	/**
	 * Returns the areahandled local service.
	 *
	 * @return the areahandled local service
	 */
	public userapi.service.areahandledLocalService getareahandledLocalService() {
		return areahandledLocalService;
	}

	/**
	 * Sets the areahandled local service.
	 *
	 * @param areahandledLocalService the areahandled local service
	 */
	public void setareahandledLocalService(
		userapi.service.areahandledLocalService areahandledLocalService) {
		this.areahandledLocalService = areahandledLocalService;
	}

	/**
	 * Returns the areahandled remote service.
	 *
	 * @return the areahandled remote service
	 */
	public userapi.service.areahandledService getareahandledService() {
		return areahandledService;
	}

	/**
	 * Sets the areahandled remote service.
	 *
	 * @param areahandledService the areahandled remote service
	 */
	public void setareahandledService(
		userapi.service.areahandledService areahandledService) {
		this.areahandledService = areahandledService;
	}

	/**
	 * Returns the areahandled persistence.
	 *
	 * @return the areahandled persistence
	 */
	public areahandledPersistence getareahandledPersistence() {
		return areahandledPersistence;
	}

	/**
	 * Sets the areahandled persistence.
	 *
	 * @param areahandledPersistence the areahandled persistence
	 */
	public void setareahandledPersistence(
		areahandledPersistence areahandledPersistence) {
		this.areahandledPersistence = areahandledPersistence;
	}

	/**
	 * Returns the branch local service.
	 *
	 * @return the branch local service
	 */
	public userapi.service.branchLocalService getbranchLocalService() {
		return branchLocalService;
	}

	/**
	 * Sets the branch local service.
	 *
	 * @param branchLocalService the branch local service
	 */
	public void setbranchLocalService(
		userapi.service.branchLocalService branchLocalService) {
		this.branchLocalService = branchLocalService;
	}

	/**
	 * Returns the branch remote service.
	 *
	 * @return the branch remote service
	 */
	public userapi.service.branchService getbranchService() {
		return branchService;
	}

	/**
	 * Sets the branch remote service.
	 *
	 * @param branchService the branch remote service
	 */
	public void setbranchService(userapi.service.branchService branchService) {
		this.branchService = branchService;
	}

	/**
	 * Returns the branch persistence.
	 *
	 * @return the branch persistence
	 */
	public branchPersistence getbranchPersistence() {
		return branchPersistence;
	}

	/**
	 * Sets the branch persistence.
	 *
	 * @param branchPersistence the branch persistence
	 */
	public void setbranchPersistence(branchPersistence branchPersistence) {
		this.branchPersistence = branchPersistence;
	}

	/**
	 * Returns the business local service.
	 *
	 * @return the business local service
	 */
	public userapi.service.businessLocalService getbusinessLocalService() {
		return businessLocalService;
	}

	/**
	 * Sets the business local service.
	 *
	 * @param businessLocalService the business local service
	 */
	public void setbusinessLocalService(
		userapi.service.businessLocalService businessLocalService) {
		this.businessLocalService = businessLocalService;
	}

	/**
	 * Returns the business remote service.
	 *
	 * @return the business remote service
	 */
	public userapi.service.businessService getbusinessService() {
		return businessService;
	}

	/**
	 * Sets the business remote service.
	 *
	 * @param businessService the business remote service
	 */
	public void setbusinessService(
		userapi.service.businessService businessService) {
		this.businessService = businessService;
	}

	/**
	 * Returns the business persistence.
	 *
	 * @return the business persistence
	 */
	public businessPersistence getbusinessPersistence() {
		return businessPersistence;
	}

	/**
	 * Sets the business persistence.
	 *
	 * @param businessPersistence the business persistence
	 */
	public void setbusinessPersistence(businessPersistence businessPersistence) {
		this.businessPersistence = businessPersistence;
	}

	/**
	 * Returns the department local service.
	 *
	 * @return the department local service
	 */
	public userapi.service.departmentLocalService getdepartmentLocalService() {
		return departmentLocalService;
	}

	/**
	 * Sets the department local service.
	 *
	 * @param departmentLocalService the department local service
	 */
	public void setdepartmentLocalService(
		userapi.service.departmentLocalService departmentLocalService) {
		this.departmentLocalService = departmentLocalService;
	}

	/**
	 * Returns the department remote service.
	 *
	 * @return the department remote service
	 */
	public userapi.service.departmentService getdepartmentService() {
		return departmentService;
	}

	/**
	 * Sets the department remote service.
	 *
	 * @param departmentService the department remote service
	 */
	public void setdepartmentService(
		userapi.service.departmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * Returns the department persistence.
	 *
	 * @return the department persistence
	 */
	public departmentPersistence getdepartmentPersistence() {
		return departmentPersistence;
	}

	/**
	 * Sets the department persistence.
	 *
	 * @param departmentPersistence the department persistence
	 */
	public void setdepartmentPersistence(
		departmentPersistence departmentPersistence) {
		this.departmentPersistence = departmentPersistence;
	}

	/**
	 * Returns the designation local service.
	 *
	 * @return the designation local service
	 */
	public userapi.service.designationLocalService getdesignationLocalService() {
		return designationLocalService;
	}

	/**
	 * Sets the designation local service.
	 *
	 * @param designationLocalService the designation local service
	 */
	public void setdesignationLocalService(
		userapi.service.designationLocalService designationLocalService) {
		this.designationLocalService = designationLocalService;
	}

	/**
	 * Returns the designation remote service.
	 *
	 * @return the designation remote service
	 */
	public userapi.service.designationService getdesignationService() {
		return designationService;
	}

	/**
	 * Sets the designation remote service.
	 *
	 * @param designationService the designation remote service
	 */
	public void setdesignationService(
		userapi.service.designationService designationService) {
		this.designationService = designationService;
	}

	/**
	 * Returns the designation persistence.
	 *
	 * @return the designation persistence
	 */
	public designationPersistence getdesignationPersistence() {
		return designationPersistence;
	}

	/**
	 * Sets the designation persistence.
	 *
	 * @param designationPersistence the designation persistence
	 */
	public void setdesignationPersistence(
		designationPersistence designationPersistence) {
		this.designationPersistence = designationPersistence;
	}

	/**
	 * Returns the functiontable local service.
	 *
	 * @return the functiontable local service
	 */
	public userapi.service.functiontableLocalService getfunctiontableLocalService() {
		return functiontableLocalService;
	}

	/**
	 * Sets the functiontable local service.
	 *
	 * @param functiontableLocalService the functiontable local service
	 */
	public void setfunctiontableLocalService(
		userapi.service.functiontableLocalService functiontableLocalService) {
		this.functiontableLocalService = functiontableLocalService;
	}

	/**
	 * Returns the functiontable remote service.
	 *
	 * @return the functiontable remote service
	 */
	public userapi.service.functiontableService getfunctiontableService() {
		return functiontableService;
	}

	/**
	 * Sets the functiontable remote service.
	 *
	 * @param functiontableService the functiontable remote service
	 */
	public void setfunctiontableService(
		userapi.service.functiontableService functiontableService) {
		this.functiontableService = functiontableService;
	}

	/**
	 * Returns the functiontable persistence.
	 *
	 * @return the functiontable persistence
	 */
	public functiontablePersistence getfunctiontablePersistence() {
		return functiontablePersistence;
	}

	/**
	 * Sets the functiontable persistence.
	 *
	 * @param functiontablePersistence the functiontable persistence
	 */
	public void setfunctiontablePersistence(
		functiontablePersistence functiontablePersistence) {
		this.functiontablePersistence = functiontablePersistence;
	}

	/**
	 * Returns the grade local service.
	 *
	 * @return the grade local service
	 */
	public userapi.service.gradeLocalService getgradeLocalService() {
		return gradeLocalService;
	}

	/**
	 * Sets the grade local service.
	 *
	 * @param gradeLocalService the grade local service
	 */
	public void setgradeLocalService(
		userapi.service.gradeLocalService gradeLocalService) {
		this.gradeLocalService = gradeLocalService;
	}

	/**
	 * Returns the grade remote service.
	 *
	 * @return the grade remote service
	 */
	public userapi.service.gradeService getgradeService() {
		return gradeService;
	}

	/**
	 * Sets the grade remote service.
	 *
	 * @param gradeService the grade remote service
	 */
	public void setgradeService(userapi.service.gradeService gradeService) {
		this.gradeService = gradeService;
	}

	/**
	 * Returns the grade persistence.
	 *
	 * @return the grade persistence
	 */
	public gradePersistence getgradePersistence() {
		return gradePersistence;
	}

	/**
	 * Sets the grade persistence.
	 *
	 * @param gradePersistence the grade persistence
	 */
	public void setgradePersistence(gradePersistence gradePersistence) {
		this.gradePersistence = gradePersistence;
	}

	/**
	 * Returns the jvbranch local service.
	 *
	 * @return the jvbranch local service
	 */
	public userapi.service.jvbranchLocalService getjvbranchLocalService() {
		return jvbranchLocalService;
	}

	/**
	 * Sets the jvbranch local service.
	 *
	 * @param jvbranchLocalService the jvbranch local service
	 */
	public void setjvbranchLocalService(
		userapi.service.jvbranchLocalService jvbranchLocalService) {
		this.jvbranchLocalService = jvbranchLocalService;
	}

	/**
	 * Returns the jvbranch remote service.
	 *
	 * @return the jvbranch remote service
	 */
	public userapi.service.jvbranchService getjvbranchService() {
		return jvbranchService;
	}

	/**
	 * Sets the jvbranch remote service.
	 *
	 * @param jvbranchService the jvbranch remote service
	 */
	public void setjvbranchService(
		userapi.service.jvbranchService jvbranchService) {
		this.jvbranchService = jvbranchService;
	}

	/**
	 * Returns the jvbranch persistence.
	 *
	 * @return the jvbranch persistence
	 */
	public jvbranchPersistence getjvbranchPersistence() {
		return jvbranchPersistence;
	}

	/**
	 * Sets the jvbranch persistence.
	 *
	 * @param jvbranchPersistence the jvbranch persistence
	 */
	public void setjvbranchPersistence(jvbranchPersistence jvbranchPersistence) {
		this.jvbranchPersistence = jvbranchPersistence;
	}

	/**
	 * Returns the locationtable local service.
	 *
	 * @return the locationtable local service
	 */
	public userapi.service.locationtableLocalService getlocationtableLocalService() {
		return locationtableLocalService;
	}

	/**
	 * Sets the locationtable local service.
	 *
	 * @param locationtableLocalService the locationtable local service
	 */
	public void setlocationtableLocalService(
		userapi.service.locationtableLocalService locationtableLocalService) {
		this.locationtableLocalService = locationtableLocalService;
	}

	/**
	 * Returns the locationtable remote service.
	 *
	 * @return the locationtable remote service
	 */
	public userapi.service.locationtableService getlocationtableService() {
		return locationtableService;
	}

	/**
	 * Sets the locationtable remote service.
	 *
	 * @param locationtableService the locationtable remote service
	 */
	public void setlocationtableService(
		userapi.service.locationtableService locationtableService) {
		this.locationtableService = locationtableService;
	}

	/**
	 * Returns the locationtable persistence.
	 *
	 * @return the locationtable persistence
	 */
	public locationtablePersistence getlocationtablePersistence() {
		return locationtablePersistence;
	}

	/**
	 * Sets the locationtable persistence.
	 *
	 * @param locationtablePersistence the locationtable persistence
	 */
	public void setlocationtablePersistence(
		locationtablePersistence locationtablePersistence) {
		this.locationtablePersistence = locationtablePersistence;
	}

	/**
	 * Returns the regiontable local service.
	 *
	 * @return the regiontable local service
	 */
	public userapi.service.regiontableLocalService getregiontableLocalService() {
		return regiontableLocalService;
	}

	/**
	 * Sets the regiontable local service.
	 *
	 * @param regiontableLocalService the regiontable local service
	 */
	public void setregiontableLocalService(
		userapi.service.regiontableLocalService regiontableLocalService) {
		this.regiontableLocalService = regiontableLocalService;
	}

	/**
	 * Returns the regiontable remote service.
	 *
	 * @return the regiontable remote service
	 */
	public userapi.service.regiontableService getregiontableService() {
		return regiontableService;
	}

	/**
	 * Sets the regiontable remote service.
	 *
	 * @param regiontableService the regiontable remote service
	 */
	public void setregiontableService(
		userapi.service.regiontableService regiontableService) {
		this.regiontableService = regiontableService;
	}

	/**
	 * Returns the regiontable persistence.
	 *
	 * @return the regiontable persistence
	 */
	public regiontablePersistence getregiontablePersistence() {
		return regiontablePersistence;
	}

	/**
	 * Sets the regiontable persistence.
	 *
	 * @param regiontablePersistence the regiontable persistence
	 */
	public void setregiontablePersistence(
		regiontablePersistence regiontablePersistence) {
		this.regiontablePersistence = regiontablePersistence;
	}

	/**
	 * Returns the screennameempidmapping local service.
	 *
	 * @return the screennameempidmapping local service
	 */
	public userapi.service.screennameempidmappingLocalService getscreennameempidmappingLocalService() {
		return screennameempidmappingLocalService;
	}

	/**
	 * Sets the screennameempidmapping local service.
	 *
	 * @param screennameempidmappingLocalService the screennameempidmapping local service
	 */
	public void setscreennameempidmappingLocalService(
		userapi.service.screennameempidmappingLocalService screennameempidmappingLocalService) {
		this.screennameempidmappingLocalService = screennameempidmappingLocalService;
	}

	/**
	 * Returns the screennameempidmapping remote service.
	 *
	 * @return the screennameempidmapping remote service
	 */
	public userapi.service.screennameempidmappingService getscreennameempidmappingService() {
		return screennameempidmappingService;
	}

	/**
	 * Sets the screennameempidmapping remote service.
	 *
	 * @param screennameempidmappingService the screennameempidmapping remote service
	 */
	public void setscreennameempidmappingService(
		userapi.service.screennameempidmappingService screennameempidmappingService) {
		this.screennameempidmappingService = screennameempidmappingService;
	}

	/**
	 * Returns the screennameempidmapping persistence.
	 *
	 * @return the screennameempidmapping persistence
	 */
	public screennameempidmappingPersistence getscreennameempidmappingPersistence() {
		return screennameempidmappingPersistence;
	}

	/**
	 * Sets the screennameempidmapping persistence.
	 *
	 * @param screennameempidmappingPersistence the screennameempidmapping persistence
	 */
	public void setscreennameempidmappingPersistence(
		screennameempidmappingPersistence screennameempidmappingPersistence) {
		this.screennameempidmappingPersistence = screennameempidmappingPersistence;
	}

	/**
	 * Returns the screennameempidmapping finder.
	 *
	 * @return the screennameempidmapping finder
	 */
	public screennameempidmappingFinder getscreennameempidmappingFinder() {
		return screennameempidmappingFinder;
	}

	/**
	 * Sets the screennameempidmapping finder.
	 *
	 * @param screennameempidmappingFinder the screennameempidmapping finder
	 */
	public void setscreennameempidmappingFinder(
		screennameempidmappingFinder screennameempidmappingFinder) {
		this.screennameempidmappingFinder = screennameempidmappingFinder;
	}

	/**
	 * Returns the unit local service.
	 *
	 * @return the unit local service
	 */
	public userapi.service.unitLocalService getunitLocalService() {
		return unitLocalService;
	}

	/**
	 * Sets the unit local service.
	 *
	 * @param unitLocalService the unit local service
	 */
	public void setunitLocalService(
		userapi.service.unitLocalService unitLocalService) {
		this.unitLocalService = unitLocalService;
	}

	/**
	 * Returns the unit remote service.
	 *
	 * @return the unit remote service
	 */
	public unitService getunitService() {
		return unitService;
	}

	/**
	 * Sets the unit remote service.
	 *
	 * @param unitService the unit remote service
	 */
	public void setunitService(unitService unitService) {
		this.unitService = unitService;
	}

	/**
	 * Returns the unit persistence.
	 *
	 * @return the unit persistence
	 */
	public unitPersistence getunitPersistence() {
		return unitPersistence;
	}

	/**
	 * Sets the unit persistence.
	 *
	 * @param unitPersistence the unit persistence
	 */
	public void setunitPersistence(unitPersistence unitPersistence) {
		this.unitPersistence = unitPersistence;
	}

	/**
	 * Returns the zone local service.
	 *
	 * @return the zone local service
	 */
	public userapi.service.zoneLocalService getzoneLocalService() {
		return zoneLocalService;
	}

	/**
	 * Sets the zone local service.
	 *
	 * @param zoneLocalService the zone local service
	 */
	public void setzoneLocalService(
		userapi.service.zoneLocalService zoneLocalService) {
		this.zoneLocalService = zoneLocalService;
	}

	/**
	 * Returns the zone remote service.
	 *
	 * @return the zone remote service
	 */
	public userapi.service.zoneService getzoneService() {
		return zoneService;
	}

	/**
	 * Sets the zone remote service.
	 *
	 * @param zoneService the zone remote service
	 */
	public void setzoneService(userapi.service.zoneService zoneService) {
		this.zoneService = zoneService;
	}

	/**
	 * Returns the zone persistence.
	 *
	 * @return the zone persistence
	 */
	public zonePersistence getzonePersistence() {
		return zonePersistence;
	}

	/**
	 * Sets the zone persistence.
	 *
	 * @param zonePersistence the zone persistence
	 */
	public void setzonePersistence(zonePersistence zonePersistence) {
		this.zonePersistence = zonePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return unitService.class.getName();
	}

	protected Class<?> getModelClass() {
		return unit.class;
	}

	protected String getModelClassName() {
		return unit.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = unitPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = userapi.service.activeemployeeinfosampleLocalService.class)
	protected userapi.service.activeemployeeinfosampleLocalService activeemployeeinfosampleLocalService;
	@BeanReference(type = userapi.service.activeemployeeinfosampleService.class)
	protected userapi.service.activeemployeeinfosampleService activeemployeeinfosampleService;
	@BeanReference(type = activeemployeeinfosamplePersistence.class)
	protected activeemployeeinfosamplePersistence activeemployeeinfosamplePersistence;
	@BeanReference(type = userapi.service.areahandledLocalService.class)
	protected userapi.service.areahandledLocalService areahandledLocalService;
	@BeanReference(type = userapi.service.areahandledService.class)
	protected userapi.service.areahandledService areahandledService;
	@BeanReference(type = areahandledPersistence.class)
	protected areahandledPersistence areahandledPersistence;
	@BeanReference(type = userapi.service.branchLocalService.class)
	protected userapi.service.branchLocalService branchLocalService;
	@BeanReference(type = userapi.service.branchService.class)
	protected userapi.service.branchService branchService;
	@BeanReference(type = branchPersistence.class)
	protected branchPersistence branchPersistence;
	@BeanReference(type = userapi.service.businessLocalService.class)
	protected userapi.service.businessLocalService businessLocalService;
	@BeanReference(type = userapi.service.businessService.class)
	protected userapi.service.businessService businessService;
	@BeanReference(type = businessPersistence.class)
	protected businessPersistence businessPersistence;
	@BeanReference(type = userapi.service.departmentLocalService.class)
	protected userapi.service.departmentLocalService departmentLocalService;
	@BeanReference(type = userapi.service.departmentService.class)
	protected userapi.service.departmentService departmentService;
	@BeanReference(type = departmentPersistence.class)
	protected departmentPersistence departmentPersistence;
	@BeanReference(type = userapi.service.designationLocalService.class)
	protected userapi.service.designationLocalService designationLocalService;
	@BeanReference(type = userapi.service.designationService.class)
	protected userapi.service.designationService designationService;
	@BeanReference(type = designationPersistence.class)
	protected designationPersistence designationPersistence;
	@BeanReference(type = userapi.service.functiontableLocalService.class)
	protected userapi.service.functiontableLocalService functiontableLocalService;
	@BeanReference(type = userapi.service.functiontableService.class)
	protected userapi.service.functiontableService functiontableService;
	@BeanReference(type = functiontablePersistence.class)
	protected functiontablePersistence functiontablePersistence;
	@BeanReference(type = userapi.service.gradeLocalService.class)
	protected userapi.service.gradeLocalService gradeLocalService;
	@BeanReference(type = userapi.service.gradeService.class)
	protected userapi.service.gradeService gradeService;
	@BeanReference(type = gradePersistence.class)
	protected gradePersistence gradePersistence;
	@BeanReference(type = userapi.service.jvbranchLocalService.class)
	protected userapi.service.jvbranchLocalService jvbranchLocalService;
	@BeanReference(type = userapi.service.jvbranchService.class)
	protected userapi.service.jvbranchService jvbranchService;
	@BeanReference(type = jvbranchPersistence.class)
	protected jvbranchPersistence jvbranchPersistence;
	@BeanReference(type = userapi.service.locationtableLocalService.class)
	protected userapi.service.locationtableLocalService locationtableLocalService;
	@BeanReference(type = userapi.service.locationtableService.class)
	protected userapi.service.locationtableService locationtableService;
	@BeanReference(type = locationtablePersistence.class)
	protected locationtablePersistence locationtablePersistence;
	@BeanReference(type = userapi.service.regiontableLocalService.class)
	protected userapi.service.regiontableLocalService regiontableLocalService;
	@BeanReference(type = userapi.service.regiontableService.class)
	protected userapi.service.regiontableService regiontableService;
	@BeanReference(type = regiontablePersistence.class)
	protected regiontablePersistence regiontablePersistence;
	@BeanReference(type = userapi.service.screennameempidmappingLocalService.class)
	protected userapi.service.screennameempidmappingLocalService screennameempidmappingLocalService;
	@BeanReference(type = userapi.service.screennameempidmappingService.class)
	protected userapi.service.screennameempidmappingService screennameempidmappingService;
	@BeanReference(type = screennameempidmappingPersistence.class)
	protected screennameempidmappingPersistence screennameempidmappingPersistence;
	@BeanReference(type = screennameempidmappingFinder.class)
	protected screennameempidmappingFinder screennameempidmappingFinder;
	@BeanReference(type = userapi.service.unitLocalService.class)
	protected userapi.service.unitLocalService unitLocalService;
	@BeanReference(type = unitService.class)
	protected unitService unitService;
	@BeanReference(type = unitPersistence.class)
	protected unitPersistence unitPersistence;
	@BeanReference(type = userapi.service.zoneLocalService.class)
	protected userapi.service.zoneLocalService zoneLocalService;
	@BeanReference(type = userapi.service.zoneService.class)
	protected userapi.service.zoneService zoneService;
	@BeanReference(type = zonePersistence.class)
	protected zonePersistence zonePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}