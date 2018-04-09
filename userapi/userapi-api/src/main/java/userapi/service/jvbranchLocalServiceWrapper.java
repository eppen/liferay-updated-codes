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
 * Provides a wrapper for {@link jvbranchLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see jvbranchLocalService
 * @generated
 */
@ProviderType
public class jvbranchLocalServiceWrapper implements jvbranchLocalService,
	ServiceWrapper<jvbranchLocalService> {
	public jvbranchLocalServiceWrapper(
		jvbranchLocalService jvbranchLocalService) {
		_jvbranchLocalService = jvbranchLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _jvbranchLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jvbranchLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _jvbranchLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jvbranchLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jvbranchLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of jvbranchs.
	*
	* @return the number of jvbranchs
	*/
	@Override
	public int getjvbranchsCount() {
		return _jvbranchLocalService.getjvbranchsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _jvbranchLocalService.getOSGiServiceIdentifier();
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
		return _jvbranchLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jvbranchLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jvbranchLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the jvbranchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jvbranchs
	* @param end the upper bound of the range of jvbranchs (not inclusive)
	* @return the range of jvbranchs
	*/
	@Override
	public java.util.List<userapi.model.jvbranch> getjvbranchs(int start,
		int end) {
		return _jvbranchLocalService.getjvbranchs(start, end);
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
		return _jvbranchLocalService.dynamicQueryCount(dynamicQuery);
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
		return _jvbranchLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the jvbranch to the database. Also notifies the appropriate model listeners.
	*
	* @param jvbranch the jvbranch
	* @return the jvbranch that was added
	*/
	@Override
	public userapi.model.jvbranch addjvbranch(userapi.model.jvbranch jvbranch) {
		return _jvbranchLocalService.addjvbranch(jvbranch);
	}

	/**
	* Creates a new jvbranch with the primary key. Does not add the jvbranch to the database.
	*
	* @param jvbranch_id the primary key for the new jvbranch
	* @return the new jvbranch
	*/
	@Override
	public userapi.model.jvbranch createjvbranch(int jvbranch_id) {
		return _jvbranchLocalService.createjvbranch(jvbranch_id);
	}

	/**
	* Deletes the jvbranch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch that was removed
	* @throws PortalException if a jvbranch with the primary key could not be found
	*/
	@Override
	public userapi.model.jvbranch deletejvbranch(int jvbranch_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jvbranchLocalService.deletejvbranch(jvbranch_id);
	}

	/**
	* Deletes the jvbranch from the database. Also notifies the appropriate model listeners.
	*
	* @param jvbranch the jvbranch
	* @return the jvbranch that was removed
	*/
	@Override
	public userapi.model.jvbranch deletejvbranch(
		userapi.model.jvbranch jvbranch) {
		return _jvbranchLocalService.deletejvbranch(jvbranch);
	}

	@Override
	public userapi.model.jvbranch fetchjvbranch(int jvbranch_id) {
		return _jvbranchLocalService.fetchjvbranch(jvbranch_id);
	}

	/**
	* Returns the jvbranch with the primary key.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch
	* @throws PortalException if a jvbranch with the primary key could not be found
	*/
	@Override
	public userapi.model.jvbranch getjvbranch(int jvbranch_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jvbranchLocalService.getjvbranch(jvbranch_id);
	}

	/**
	* Updates the jvbranch in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jvbranch the jvbranch
	* @return the jvbranch that was updated
	*/
	@Override
	public userapi.model.jvbranch updatejvbranch(
		userapi.model.jvbranch jvbranch) {
		return _jvbranchLocalService.updatejvbranch(jvbranch);
	}

	@Override
	public jvbranchLocalService getWrappedService() {
		return _jvbranchLocalService;
	}

	@Override
	public void setWrappedService(jvbranchLocalService jvbranchLocalService) {
		_jvbranchLocalService = jvbranchLocalService;
	}

	private jvbranchLocalService _jvbranchLocalService;
}