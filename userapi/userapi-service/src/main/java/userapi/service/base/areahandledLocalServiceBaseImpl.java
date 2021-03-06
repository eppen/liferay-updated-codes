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

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import userapi.model.areahandled;

import userapi.service.areahandledLocalService;

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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the areahandled local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link userapi.service.impl.areahandledLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.impl.areahandledLocalServiceImpl
 * @see userapi.service.areahandledLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class areahandledLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements areahandledLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link userapi.service.areahandledLocalServiceUtil} to access the areahandled local service.
	 */

	/**
	 * Adds the areahandled to the database. Also notifies the appropriate model listeners.
	 *
	 * @param areahandled the areahandled
	 * @return the areahandled that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public areahandled addareahandled(areahandled areahandled) {
		areahandled.setNew(true);

		return areahandledPersistence.update(areahandled);
	}

	/**
	 * Creates a new areahandled with the primary key. Does not add the areahandled to the database.
	 *
	 * @param area_id the primary key for the new areahandled
	 * @return the new areahandled
	 */
	@Override
	public areahandled createareahandled(int area_id) {
		return areahandledPersistence.create(area_id);
	}

	/**
	 * Deletes the areahandled with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param area_id the primary key of the areahandled
	 * @return the areahandled that was removed
	 * @throws PortalException if a areahandled with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public areahandled deleteareahandled(int area_id) throws PortalException {
		return areahandledPersistence.remove(area_id);
	}

	/**
	 * Deletes the areahandled from the database. Also notifies the appropriate model listeners.
	 *
	 * @param areahandled the areahandled
	 * @return the areahandled that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public areahandled deleteareahandled(areahandled areahandled) {
		return areahandledPersistence.remove(areahandled);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(areahandled.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return areahandledPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return areahandledPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return areahandledPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return areahandledPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return areahandledPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public areahandled fetchareahandled(int area_id) {
		return areahandledPersistence.fetchByPrimaryKey(area_id);
	}

	/**
	 * Returns the areahandled with the primary key.
	 *
	 * @param area_id the primary key of the areahandled
	 * @return the areahandled
	 * @throws PortalException if a areahandled with the primary key could not be found
	 */
	@Override
	public areahandled getareahandled(int area_id) throws PortalException {
		return areahandledPersistence.findByPrimaryKey(area_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(areahandledLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(areahandled.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("area_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(areahandledLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(areahandled.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("area_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(areahandledLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(areahandled.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("area_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return areahandledLocalService.deleteareahandled((areahandled)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return areahandledPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the areahandleds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of areahandleds
	 * @param end the upper bound of the range of areahandleds (not inclusive)
	 * @return the range of areahandleds
	 */
	@Override
	public List<areahandled> getareahandleds(int start, int end) {
		return areahandledPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of areahandleds.
	 *
	 * @return the number of areahandleds
	 */
	@Override
	public int getareahandledsCount() {
		return areahandledPersistence.countAll();
	}

	/**
	 * Updates the areahandled in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param areahandled the areahandled
	 * @return the areahandled that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public areahandled updateareahandled(areahandled areahandled) {
		return areahandledPersistence.update(areahandled);
	}

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
	public areahandledLocalService getareahandledLocalService() {
		return areahandledLocalService;
	}

	/**
	 * Sets the areahandled local service.
	 *
	 * @param areahandledLocalService the areahandled local service
	 */
	public void setareahandledLocalService(
		areahandledLocalService areahandledLocalService) {
		this.areahandledLocalService = areahandledLocalService;
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
		persistedModelLocalServiceRegistry.register("userapi.model.areahandled",
			areahandledLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"userapi.model.areahandled");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return areahandledLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return areahandled.class;
	}

	protected String getModelClassName() {
		return areahandled.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = areahandledPersistence.getDataSource();

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
	@BeanReference(type = activeemployeeinfosamplePersistence.class)
	protected activeemployeeinfosamplePersistence activeemployeeinfosamplePersistence;
	@BeanReference(type = areahandledLocalService.class)
	protected areahandledLocalService areahandledLocalService;
	@BeanReference(type = areahandledPersistence.class)
	protected areahandledPersistence areahandledPersistence;
	@BeanReference(type = userapi.service.branchLocalService.class)
	protected userapi.service.branchLocalService branchLocalService;
	@BeanReference(type = branchPersistence.class)
	protected branchPersistence branchPersistence;
	@BeanReference(type = userapi.service.businessLocalService.class)
	protected userapi.service.businessLocalService businessLocalService;
	@BeanReference(type = businessPersistence.class)
	protected businessPersistence businessPersistence;
	@BeanReference(type = userapi.service.departmentLocalService.class)
	protected userapi.service.departmentLocalService departmentLocalService;
	@BeanReference(type = departmentPersistence.class)
	protected departmentPersistence departmentPersistence;
	@BeanReference(type = userapi.service.designationLocalService.class)
	protected userapi.service.designationLocalService designationLocalService;
	@BeanReference(type = designationPersistence.class)
	protected designationPersistence designationPersistence;
	@BeanReference(type = userapi.service.functiontableLocalService.class)
	protected userapi.service.functiontableLocalService functiontableLocalService;
	@BeanReference(type = functiontablePersistence.class)
	protected functiontablePersistence functiontablePersistence;
	@BeanReference(type = userapi.service.gradeLocalService.class)
	protected userapi.service.gradeLocalService gradeLocalService;
	@BeanReference(type = gradePersistence.class)
	protected gradePersistence gradePersistence;
	@BeanReference(type = userapi.service.jvbranchLocalService.class)
	protected userapi.service.jvbranchLocalService jvbranchLocalService;
	@BeanReference(type = jvbranchPersistence.class)
	protected jvbranchPersistence jvbranchPersistence;
	@BeanReference(type = userapi.service.locationtableLocalService.class)
	protected userapi.service.locationtableLocalService locationtableLocalService;
	@BeanReference(type = locationtablePersistence.class)
	protected locationtablePersistence locationtablePersistence;
	@BeanReference(type = userapi.service.regiontableLocalService.class)
	protected userapi.service.regiontableLocalService regiontableLocalService;
	@BeanReference(type = regiontablePersistence.class)
	protected regiontablePersistence regiontablePersistence;
	@BeanReference(type = userapi.service.screennameempidmappingLocalService.class)
	protected userapi.service.screennameempidmappingLocalService screennameempidmappingLocalService;
	@BeanReference(type = screennameempidmappingPersistence.class)
	protected screennameempidmappingPersistence screennameempidmappingPersistence;
	@BeanReference(type = screennameempidmappingFinder.class)
	protected screennameempidmappingFinder screennameempidmappingFinder;
	@BeanReference(type = userapi.service.unitLocalService.class)
	protected userapi.service.unitLocalService unitLocalService;
	@BeanReference(type = unitPersistence.class)
	protected unitPersistence unitPersistence;
	@BeanReference(type = userapi.service.zoneLocalService.class)
	protected userapi.service.zoneLocalService zoneLocalService;
	@BeanReference(type = zonePersistence.class)
	protected zonePersistence zonePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}