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
 * Provides a wrapper for {@link screennameempidmappingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see screennameempidmappingLocalService
 * @generated
 */
@ProviderType
public class screennameempidmappingLocalServiceWrapper
	implements screennameempidmappingLocalService,
		ServiceWrapper<screennameempidmappingLocalService> {
	public screennameempidmappingLocalServiceWrapper(
		screennameempidmappingLocalService screennameempidmappingLocalService) {
		_screennameempidmappingLocalService = screennameempidmappingLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _screennameempidmappingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _screennameempidmappingLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _screennameempidmappingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _screennameempidmappingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _screennameempidmappingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of screennameempidmappings.
	*
	* @return the number of screennameempidmappings
	*/
	@Override
	public int getscreennameempidmappingsCount() {
		return _screennameempidmappingLocalService.getscreennameempidmappingsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _screennameempidmappingLocalService.getOSGiServiceIdentifier();
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
		return _screennameempidmappingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _screennameempidmappingLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _screennameempidmappingLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List getEmpAnniversary() {
		return _screennameempidmappingLocalService.getEmpAnniversary();
	}

	@Override
	public java.util.List getEmpBirthday() {
		return _screennameempidmappingLocalService.getEmpBirthday();
	}

	@Override
	public java.util.List<userapi.model.screennameempidmapping> getEmpIdbyScreenName(
		java.lang.String screename) {
		return _screennameempidmappingLocalService.getEmpIdbyScreenName(screename);
	}

	@Override
	public java.util.List getMilestone() {
		return _screennameempidmappingLocalService.getMilestone();
	}

	/**
	* Returns a range of all the screennameempidmappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of screennameempidmappings
	* @param end the upper bound of the range of screennameempidmappings (not inclusive)
	* @return the range of screennameempidmappings
	*/
	@Override
	public java.util.List<userapi.model.screennameempidmapping> getscreennameempidmappings(
		int start, int end) {
		return _screennameempidmappingLocalService.getscreennameempidmappings(start,
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
		return _screennameempidmappingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _screennameempidmappingLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the screennameempidmapping to the database. Also notifies the appropriate model listeners.
	*
	* @param screennameempidmapping the screennameempidmapping
	* @return the screennameempidmapping that was added
	*/
	@Override
	public userapi.model.screennameempidmapping addscreennameempidmapping(
		userapi.model.screennameempidmapping screennameempidmapping) {
		return _screennameempidmappingLocalService.addscreennameempidmapping(screennameempidmapping);
	}

	/**
	* Creates a new screennameempidmapping with the primary key. Does not add the screennameempidmapping to the database.
	*
	* @param srno the primary key for the new screennameempidmapping
	* @return the new screennameempidmapping
	*/
	@Override
	public userapi.model.screennameempidmapping createscreennameempidmapping(
		int srno) {
		return _screennameempidmappingLocalService.createscreennameempidmapping(srno);
	}

	/**
	* Deletes the screennameempidmapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping that was removed
	* @throws PortalException if a screennameempidmapping with the primary key could not be found
	*/
	@Override
	public userapi.model.screennameempidmapping deletescreennameempidmapping(
		int srno) throws com.liferay.portal.kernel.exception.PortalException {
		return _screennameempidmappingLocalService.deletescreennameempidmapping(srno);
	}

	/**
	* Deletes the screennameempidmapping from the database. Also notifies the appropriate model listeners.
	*
	* @param screennameempidmapping the screennameempidmapping
	* @return the screennameempidmapping that was removed
	*/
	@Override
	public userapi.model.screennameempidmapping deletescreennameempidmapping(
		userapi.model.screennameempidmapping screennameempidmapping) {
		return _screennameempidmappingLocalService.deletescreennameempidmapping(screennameempidmapping);
	}

	@Override
	public userapi.model.screennameempidmapping fetchscreennameempidmapping(
		int srno) {
		return _screennameempidmappingLocalService.fetchscreennameempidmapping(srno);
	}

	/**
	* Returns the screennameempidmapping with the primary key.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping
	* @throws PortalException if a screennameempidmapping with the primary key could not be found
	*/
	@Override
	public userapi.model.screennameempidmapping getscreennameempidmapping(
		int srno) throws com.liferay.portal.kernel.exception.PortalException {
		return _screennameempidmappingLocalService.getscreennameempidmapping(srno);
	}

	/**
	* Updates the screennameempidmapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param screennameempidmapping the screennameempidmapping
	* @return the screennameempidmapping that was updated
	*/
	@Override
	public userapi.model.screennameempidmapping updatescreennameempidmapping(
		userapi.model.screennameempidmapping screennameempidmapping) {
		return _screennameempidmappingLocalService.updatescreennameempidmapping(screennameempidmapping);
	}

	@Override
	public screennameempidmappingLocalService getWrappedService() {
		return _screennameempidmappingLocalService;
	}

	@Override
	public void setWrappedService(
		screennameempidmappingLocalService screennameempidmappingLocalService) {
		_screennameempidmappingLocalService = screennameempidmappingLocalService;
	}

	private screennameempidmappingLocalService _screennameempidmappingLocalService;
}