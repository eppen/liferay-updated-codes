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
 * Provides a wrapper for {@link functiontableLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see functiontableLocalService
 * @generated
 */
@ProviderType
public class functiontableLocalServiceWrapper
	implements functiontableLocalService,
		ServiceWrapper<functiontableLocalService> {
	public functiontableLocalServiceWrapper(
		functiontableLocalService functiontableLocalService) {
		_functiontableLocalService = functiontableLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _functiontableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _functiontableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _functiontableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _functiontableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _functiontableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of functiontables.
	*
	* @return the number of functiontables
	*/
	@Override
	public int getfunctiontablesCount() {
		return _functiontableLocalService.getfunctiontablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _functiontableLocalService.getOSGiServiceIdentifier();
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
		return _functiontableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _functiontableLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _functiontableLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the functiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of functiontables
	* @param end the upper bound of the range of functiontables (not inclusive)
	* @return the range of functiontables
	*/
	@Override
	public java.util.List<userapi.model.functiontable> getfunctiontables(
		int start, int end) {
		return _functiontableLocalService.getfunctiontables(start, end);
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
		return _functiontableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _functiontableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the functiontable to the database. Also notifies the appropriate model listeners.
	*
	* @param functiontable the functiontable
	* @return the functiontable that was added
	*/
	@Override
	public userapi.model.functiontable addfunctiontable(
		userapi.model.functiontable functiontable) {
		return _functiontableLocalService.addfunctiontable(functiontable);
	}

	/**
	* Creates a new functiontable with the primary key. Does not add the functiontable to the database.
	*
	* @param function_id the primary key for the new functiontable
	* @return the new functiontable
	*/
	@Override
	public userapi.model.functiontable createfunctiontable(int function_id) {
		return _functiontableLocalService.createfunctiontable(function_id);
	}

	/**
	* Deletes the functiontable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable that was removed
	* @throws PortalException if a functiontable with the primary key could not be found
	*/
	@Override
	public userapi.model.functiontable deletefunctiontable(int function_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _functiontableLocalService.deletefunctiontable(function_id);
	}

	/**
	* Deletes the functiontable from the database. Also notifies the appropriate model listeners.
	*
	* @param functiontable the functiontable
	* @return the functiontable that was removed
	*/
	@Override
	public userapi.model.functiontable deletefunctiontable(
		userapi.model.functiontable functiontable) {
		return _functiontableLocalService.deletefunctiontable(functiontable);
	}

	@Override
	public userapi.model.functiontable fetchfunctiontable(int function_id) {
		return _functiontableLocalService.fetchfunctiontable(function_id);
	}

	/**
	* Returns the functiontable with the primary key.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable
	* @throws PortalException if a functiontable with the primary key could not be found
	*/
	@Override
	public userapi.model.functiontable getfunctiontable(int function_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _functiontableLocalService.getfunctiontable(function_id);
	}

	/**
	* Updates the functiontable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param functiontable the functiontable
	* @return the functiontable that was updated
	*/
	@Override
	public userapi.model.functiontable updatefunctiontable(
		userapi.model.functiontable functiontable) {
		return _functiontableLocalService.updatefunctiontable(functiontable);
	}

	@Override
	public functiontableLocalService getWrappedService() {
		return _functiontableLocalService;
	}

	@Override
	public void setWrappedService(
		functiontableLocalService functiontableLocalService) {
		_functiontableLocalService = functiontableLocalService;
	}

	private functiontableLocalService _functiontableLocalService;
}