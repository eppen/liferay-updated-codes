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
 * Provides a wrapper for {@link activeemployeeinfosampleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see activeemployeeinfosampleLocalService
 * @generated
 */
@ProviderType
public class activeemployeeinfosampleLocalServiceWrapper
	implements activeemployeeinfosampleLocalService,
		ServiceWrapper<activeemployeeinfosampleLocalService> {
	public activeemployeeinfosampleLocalServiceWrapper(
		activeemployeeinfosampleLocalService activeemployeeinfosampleLocalService) {
		_activeemployeeinfosampleLocalService = activeemployeeinfosampleLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _activeemployeeinfosampleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _activeemployeeinfosampleLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _activeemployeeinfosampleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _activeemployeeinfosampleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _activeemployeeinfosampleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of activeemployeeinfosamples.
	*
	* @return the number of activeemployeeinfosamples
	*/
	@Override
	public int getactiveemployeeinfosamplesCount() {
		return _activeemployeeinfosampleLocalService.getactiveemployeeinfosamplesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _activeemployeeinfosampleLocalService.getOSGiServiceIdentifier();
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
		return _activeemployeeinfosampleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _activeemployeeinfosampleLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _activeemployeeinfosampleLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<userapi.model.activeemployeeinfosample> getEmpDetailsByEmpId(
		java.lang.String empid) {
		return _activeemployeeinfosampleLocalService.getEmpDetailsByEmpId(empid);
	}

	/**
	* Returns a range of all the activeemployeeinfosamples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @return the range of activeemployeeinfosamples
	*/
	@Override
	public java.util.List<userapi.model.activeemployeeinfosample> getactiveemployeeinfosamples(
		int start, int end) {
		return _activeemployeeinfosampleLocalService.getactiveemployeeinfosamples(start,
			end);
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
		return _activeemployeeinfosampleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _activeemployeeinfosampleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the activeemployeeinfosample to the database. Also notifies the appropriate model listeners.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	* @return the activeemployeeinfosample that was added
	*/
	@Override
	public userapi.model.activeemployeeinfosample addactiveemployeeinfosample(
		userapi.model.activeemployeeinfosample activeemployeeinfosample) {
		return _activeemployeeinfosampleLocalService.addactiveemployeeinfosample(activeemployeeinfosample);
	}

	/**
	* Creates a new activeemployeeinfosample with the primary key. Does not add the activeemployeeinfosample to the database.
	*
	* @param srno the primary key for the new activeemployeeinfosample
	* @return the new activeemployeeinfosample
	*/
	@Override
	public userapi.model.activeemployeeinfosample createactiveemployeeinfosample(
		int srno) {
		return _activeemployeeinfosampleLocalService.createactiveemployeeinfosample(srno);
	}

	/**
	* Deletes the activeemployeeinfosample with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample that was removed
	* @throws PortalException if a activeemployeeinfosample with the primary key could not be found
	*/
	@Override
	public userapi.model.activeemployeeinfosample deleteactiveemployeeinfosample(
		int srno) throws com.liferay.portal.kernel.exception.PortalException {
		return _activeemployeeinfosampleLocalService.deleteactiveemployeeinfosample(srno);
	}

	/**
	* Deletes the activeemployeeinfosample from the database. Also notifies the appropriate model listeners.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	* @return the activeemployeeinfosample that was removed
	*/
	@Override
	public userapi.model.activeemployeeinfosample deleteactiveemployeeinfosample(
		userapi.model.activeemployeeinfosample activeemployeeinfosample) {
		return _activeemployeeinfosampleLocalService.deleteactiveemployeeinfosample(activeemployeeinfosample);
	}

	@Override
	public userapi.model.activeemployeeinfosample fetchactiveemployeeinfosample(
		int srno) {
		return _activeemployeeinfosampleLocalService.fetchactiveemployeeinfosample(srno);
	}

	/**
	* Returns the activeemployeeinfosample with the primary key.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample
	* @throws PortalException if a activeemployeeinfosample with the primary key could not be found
	*/
	@Override
	public userapi.model.activeemployeeinfosample getactiveemployeeinfosample(
		int srno) throws com.liferay.portal.kernel.exception.PortalException {
		return _activeemployeeinfosampleLocalService.getactiveemployeeinfosample(srno);
	}

	/**
	* Updates the activeemployeeinfosample in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	* @return the activeemployeeinfosample that was updated
	*/
	@Override
	public userapi.model.activeemployeeinfosample updateactiveemployeeinfosample(
		userapi.model.activeemployeeinfosample activeemployeeinfosample) {
		return _activeemployeeinfosampleLocalService.updateactiveemployeeinfosample(activeemployeeinfosample);
	}

	@Override
	public activeemployeeinfosampleLocalService getWrappedService() {
		return _activeemployeeinfosampleLocalService;
	}

	@Override
	public void setWrappedService(
		activeemployeeinfosampleLocalService activeemployeeinfosampleLocalService) {
		_activeemployeeinfosampleLocalService = activeemployeeinfosampleLocalService;
	}

	private activeemployeeinfosampleLocalService _activeemployeeinfosampleLocalService;
}