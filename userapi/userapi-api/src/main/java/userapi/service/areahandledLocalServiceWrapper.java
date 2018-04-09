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
 * Provides a wrapper for {@link areahandledLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see areahandledLocalService
 * @generated
 */
@ProviderType
public class areahandledLocalServiceWrapper implements areahandledLocalService,
	ServiceWrapper<areahandledLocalService> {
	public areahandledLocalServiceWrapper(
		areahandledLocalService areahandledLocalService) {
		_areahandledLocalService = areahandledLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _areahandledLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _areahandledLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _areahandledLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _areahandledLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _areahandledLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of areahandleds.
	*
	* @return the number of areahandleds
	*/
	@Override
	public int getareahandledsCount() {
		return _areahandledLocalService.getareahandledsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _areahandledLocalService.getOSGiServiceIdentifier();
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
		return _areahandledLocalService.dynamicQuery(dynamicQuery);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _areahandledLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _areahandledLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	public java.util.List<userapi.model.areahandled> getareahandleds(
		int start, int end) {
		return _areahandledLocalService.getareahandleds(start, end);
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
		return _areahandledLocalService.dynamicQueryCount(dynamicQuery);
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
		return _areahandledLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the areahandled to the database. Also notifies the appropriate model listeners.
	*
	* @param areahandled the areahandled
	* @return the areahandled that was added
	*/
	@Override
	public userapi.model.areahandled addareahandled(
		userapi.model.areahandled areahandled) {
		return _areahandledLocalService.addareahandled(areahandled);
	}

	/**
	* Creates a new areahandled with the primary key. Does not add the areahandled to the database.
	*
	* @param area_id the primary key for the new areahandled
	* @return the new areahandled
	*/
	@Override
	public userapi.model.areahandled createareahandled(int area_id) {
		return _areahandledLocalService.createareahandled(area_id);
	}

	/**
	* Deletes the areahandled with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled that was removed
	* @throws PortalException if a areahandled with the primary key could not be found
	*/
	@Override
	public userapi.model.areahandled deleteareahandled(int area_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _areahandledLocalService.deleteareahandled(area_id);
	}

	/**
	* Deletes the areahandled from the database. Also notifies the appropriate model listeners.
	*
	* @param areahandled the areahandled
	* @return the areahandled that was removed
	*/
	@Override
	public userapi.model.areahandled deleteareahandled(
		userapi.model.areahandled areahandled) {
		return _areahandledLocalService.deleteareahandled(areahandled);
	}

	@Override
	public userapi.model.areahandled fetchareahandled(int area_id) {
		return _areahandledLocalService.fetchareahandled(area_id);
	}

	/**
	* Returns the areahandled with the primary key.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled
	* @throws PortalException if a areahandled with the primary key could not be found
	*/
	@Override
	public userapi.model.areahandled getareahandled(int area_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _areahandledLocalService.getareahandled(area_id);
	}

	/**
	* Updates the areahandled in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param areahandled the areahandled
	* @return the areahandled that was updated
	*/
	@Override
	public userapi.model.areahandled updateareahandled(
		userapi.model.areahandled areahandled) {
		return _areahandledLocalService.updateareahandled(areahandled);
	}

	@Override
	public areahandledLocalService getWrappedService() {
		return _areahandledLocalService;
	}

	@Override
	public void setWrappedService(
		areahandledLocalService areahandledLocalService) {
		_areahandledLocalService = areahandledLocalService;
	}

	private areahandledLocalService _areahandledLocalService;
}