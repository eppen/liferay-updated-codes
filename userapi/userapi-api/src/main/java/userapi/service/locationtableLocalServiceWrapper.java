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
 * Provides a wrapper for {@link locationtableLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see locationtableLocalService
 * @generated
 */
@ProviderType
public class locationtableLocalServiceWrapper
	implements locationtableLocalService,
		ServiceWrapper<locationtableLocalService> {
	public locationtableLocalServiceWrapper(
		locationtableLocalService locationtableLocalService) {
		_locationtableLocalService = locationtableLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _locationtableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _locationtableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _locationtableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _locationtableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _locationtableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of locationtables.
	*
	* @return the number of locationtables
	*/
	@Override
	public int getlocationtablesCount() {
		return _locationtableLocalService.getlocationtablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _locationtableLocalService.getOSGiServiceIdentifier();
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
		return _locationtableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _locationtableLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _locationtableLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the locationtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locationtables
	* @param end the upper bound of the range of locationtables (not inclusive)
	* @return the range of locationtables
	*/
	@Override
	public java.util.List<userapi.model.locationtable> getlocationtables(
		int start, int end) {
		return _locationtableLocalService.getlocationtables(start, end);
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
		return _locationtableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _locationtableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the locationtable to the database. Also notifies the appropriate model listeners.
	*
	* @param locationtable the locationtable
	* @return the locationtable that was added
	*/
	@Override
	public userapi.model.locationtable addlocationtable(
		userapi.model.locationtable locationtable) {
		return _locationtableLocalService.addlocationtable(locationtable);
	}

	/**
	* Creates a new locationtable with the primary key. Does not add the locationtable to the database.
	*
	* @param loc_id the primary key for the new locationtable
	* @return the new locationtable
	*/
	@Override
	public userapi.model.locationtable createlocationtable(int loc_id) {
		return _locationtableLocalService.createlocationtable(loc_id);
	}

	/**
	* Deletes the locationtable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable that was removed
	* @throws PortalException if a locationtable with the primary key could not be found
	*/
	@Override
	public userapi.model.locationtable deletelocationtable(int loc_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _locationtableLocalService.deletelocationtable(loc_id);
	}

	/**
	* Deletes the locationtable from the database. Also notifies the appropriate model listeners.
	*
	* @param locationtable the locationtable
	* @return the locationtable that was removed
	*/
	@Override
	public userapi.model.locationtable deletelocationtable(
		userapi.model.locationtable locationtable) {
		return _locationtableLocalService.deletelocationtable(locationtable);
	}

	@Override
	public userapi.model.locationtable fetchlocationtable(int loc_id) {
		return _locationtableLocalService.fetchlocationtable(loc_id);
	}

	/**
	* Returns the locationtable with the primary key.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable
	* @throws PortalException if a locationtable with the primary key could not be found
	*/
	@Override
	public userapi.model.locationtable getlocationtable(int loc_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _locationtableLocalService.getlocationtable(loc_id);
	}

	/**
	* Updates the locationtable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param locationtable the locationtable
	* @return the locationtable that was updated
	*/
	@Override
	public userapi.model.locationtable updatelocationtable(
		userapi.model.locationtable locationtable) {
		return _locationtableLocalService.updatelocationtable(locationtable);
	}

	@Override
	public locationtableLocalService getWrappedService() {
		return _locationtableLocalService;
	}

	@Override
	public void setWrappedService(
		locationtableLocalService locationtableLocalService) {
		_locationtableLocalService = locationtableLocalService;
	}

	private locationtableLocalService _locationtableLocalService;
}