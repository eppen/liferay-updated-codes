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

package userapi.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link gradeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see gradeLocalService
 * @generated
 */
@ProviderType
public class gradeLocalServiceWrapper implements gradeLocalService,
	ServiceWrapper<gradeLocalService> {
	public gradeLocalServiceWrapper(gradeLocalService gradeLocalService) {
		_gradeLocalService = gradeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _gradeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gradeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _gradeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gradeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gradeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of grades.
	*
	* @return the number of grades
	*/
	@Override
	public int getgradesCount() {
		return _gradeLocalService.getgradesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _gradeLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _gradeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _gradeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _gradeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the grades.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of grades
	* @param end the upper bound of the range of grades (not inclusive)
	* @return the range of grades
	*/
	@Override
	public java.util.List<userapi.model.grade> getgrades(int start, int end) {
		return _gradeLocalService.getgrades(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _gradeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _gradeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the grade to the database. Also notifies the appropriate model listeners.
	*
	* @param grade the grade
	* @return the grade that was added
	*/
	@Override
	public userapi.model.grade addgrade(userapi.model.grade grade) {
		return _gradeLocalService.addgrade(grade);
	}

	/**
	* Creates a new grade with the primary key. Does not add the grade to the database.
	*
	* @param grade_id the primary key for the new grade
	* @return the new grade
	*/
	@Override
	public userapi.model.grade creategrade(int grade_id) {
		return _gradeLocalService.creategrade(grade_id);
	}

	/**
	* Deletes the grade with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param grade_id the primary key of the grade
	* @return the grade that was removed
	* @throws PortalException if a grade with the primary key could not be found
	*/
	@Override
	public userapi.model.grade deletegrade(int grade_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gradeLocalService.deletegrade(grade_id);
	}

	/**
	* Deletes the grade from the database. Also notifies the appropriate model listeners.
	*
	* @param grade the grade
	* @return the grade that was removed
	*/
	@Override
	public userapi.model.grade deletegrade(userapi.model.grade grade) {
		return _gradeLocalService.deletegrade(grade);
	}

	@Override
	public userapi.model.grade fetchgrade(int grade_id) {
		return _gradeLocalService.fetchgrade(grade_id);
	}

	/**
	* Returns the grade with the primary key.
	*
	* @param grade_id the primary key of the grade
	* @return the grade
	* @throws PortalException if a grade with the primary key could not be found
	*/
	@Override
	public userapi.model.grade getgrade(int grade_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _gradeLocalService.getgrade(grade_id);
	}

	/**
	* Updates the grade in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param grade the grade
	* @return the grade that was updated
	*/
	@Override
	public userapi.model.grade updategrade(userapi.model.grade grade) {
		return _gradeLocalService.updategrade(grade);
	}

	@Override
	public gradeLocalService getWrappedService() {
		return _gradeLocalService;
	}

	@Override
	public void setWrappedService(gradeLocalService gradeLocalService) {
		_gradeLocalService = gradeLocalService;
	}

	private gradeLocalService _gradeLocalService;
}