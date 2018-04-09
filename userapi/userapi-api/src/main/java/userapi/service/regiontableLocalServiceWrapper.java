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
 * Provides a wrapper for {@link regiontableLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see regiontableLocalService
 * @generated
 */
@ProviderType
public class regiontableLocalServiceWrapper implements regiontableLocalService,
	ServiceWrapper<regiontableLocalService> {
	public regiontableLocalServiceWrapper(
		regiontableLocalService regiontableLocalService) {
		_regiontableLocalService = regiontableLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _regiontableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _regiontableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _regiontableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _regiontableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _regiontableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of regiontables.
	*
	* @return the number of regiontables
	*/
	@Override
	public int getregiontablesCount() {
		return _regiontableLocalService.getregiontablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _regiontableLocalService.getOSGiServiceIdentifier();
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
		return _regiontableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _regiontableLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _regiontableLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the regiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regiontables
	* @param end the upper bound of the range of regiontables (not inclusive)
	* @return the range of regiontables
	*/
	@Override
	public java.util.List<userapi.model.regiontable> getregiontables(
		int start, int end) {
		return _regiontableLocalService.getregiontables(start, end);
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
		return _regiontableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _regiontableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the regiontable to the database. Also notifies the appropriate model listeners.
	*
	* @param regiontable the regiontable
	* @return the regiontable that was added
	*/
	@Override
	public userapi.model.regiontable addregiontable(
		userapi.model.regiontable regiontable) {
		return _regiontableLocalService.addregiontable(regiontable);
	}

	/**
	* Creates a new regiontable with the primary key. Does not add the regiontable to the database.
	*
	* @param region_id the primary key for the new regiontable
	* @return the new regiontable
	*/
	@Override
	public userapi.model.regiontable createregiontable(int region_id) {
		return _regiontableLocalService.createregiontable(region_id);
	}

	/**
	* Deletes the regiontable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable that was removed
	* @throws PortalException if a regiontable with the primary key could not be found
	*/
	@Override
	public userapi.model.regiontable deleteregiontable(int region_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _regiontableLocalService.deleteregiontable(region_id);
	}

	/**
	* Deletes the regiontable from the database. Also notifies the appropriate model listeners.
	*
	* @param regiontable the regiontable
	* @return the regiontable that was removed
	*/
	@Override
	public userapi.model.regiontable deleteregiontable(
		userapi.model.regiontable regiontable) {
		return _regiontableLocalService.deleteregiontable(regiontable);
	}

	@Override
	public userapi.model.regiontable fetchregiontable(int region_id) {
		return _regiontableLocalService.fetchregiontable(region_id);
	}

	/**
	* Returns the regiontable with the primary key.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable
	* @throws PortalException if a regiontable with the primary key could not be found
	*/
	@Override
	public userapi.model.regiontable getregiontable(int region_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _regiontableLocalService.getregiontable(region_id);
	}

	/**
	* Updates the regiontable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param regiontable the regiontable
	* @return the regiontable that was updated
	*/
	@Override
	public userapi.model.regiontable updateregiontable(
		userapi.model.regiontable regiontable) {
		return _regiontableLocalService.updateregiontable(regiontable);
	}

	@Override
	public regiontableLocalService getWrappedService() {
		return _regiontableLocalService;
	}

	@Override
	public void setWrappedService(
		regiontableLocalService regiontableLocalService) {
		_regiontableLocalService = regiontableLocalService;
	}

	private regiontableLocalService _regiontableLocalService;
}