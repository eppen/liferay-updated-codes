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
 * Provides a wrapper for {@link designationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see designationLocalService
 * @generated
 */
@ProviderType
public class designationLocalServiceWrapper implements designationLocalService,
	ServiceWrapper<designationLocalService> {
	public designationLocalServiceWrapper(
		designationLocalService designationLocalService) {
		_designationLocalService = designationLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _designationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _designationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _designationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _designationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _designationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of designations.
	*
	* @return the number of designations
	*/
	@Override
	public int getdesignationsCount() {
		return _designationLocalService.getdesignationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _designationLocalService.getOSGiServiceIdentifier();
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
		return _designationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _designationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _designationLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the designations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of designations
	* @param end the upper bound of the range of designations (not inclusive)
	* @return the range of designations
	*/
	@Override
	public java.util.List<userapi.model.designation> getdesignations(
		int start, int end) {
		return _designationLocalService.getdesignations(start, end);
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
		return _designationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _designationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the designation to the database. Also notifies the appropriate model listeners.
	*
	* @param designation the designation
	* @return the designation that was added
	*/
	@Override
	public userapi.model.designation adddesignation(
		userapi.model.designation designation) {
		return _designationLocalService.adddesignation(designation);
	}

	/**
	* Creates a new designation with the primary key. Does not add the designation to the database.
	*
	* @param desig_id the primary key for the new designation
	* @return the new designation
	*/
	@Override
	public userapi.model.designation createdesignation(int desig_id) {
		return _designationLocalService.createdesignation(desig_id);
	}

	/**
	* Deletes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param desig_id the primary key of the designation
	* @return the designation that was removed
	* @throws PortalException if a designation with the primary key could not be found
	*/
	@Override
	public userapi.model.designation deletedesignation(int desig_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _designationLocalService.deletedesignation(desig_id);
	}

	/**
	* Deletes the designation from the database. Also notifies the appropriate model listeners.
	*
	* @param designation the designation
	* @return the designation that was removed
	*/
	@Override
	public userapi.model.designation deletedesignation(
		userapi.model.designation designation) {
		return _designationLocalService.deletedesignation(designation);
	}

	@Override
	public userapi.model.designation fetchdesignation(int desig_id) {
		return _designationLocalService.fetchdesignation(desig_id);
	}

	/**
	* Returns the designation with the primary key.
	*
	* @param desig_id the primary key of the designation
	* @return the designation
	* @throws PortalException if a designation with the primary key could not be found
	*/
	@Override
	public userapi.model.designation getdesignation(int desig_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _designationLocalService.getdesignation(desig_id);
	}

	/**
	* Updates the designation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param designation the designation
	* @return the designation that was updated
	*/
	@Override
	public userapi.model.designation updatedesignation(
		userapi.model.designation designation) {
		return _designationLocalService.updatedesignation(designation);
	}

	@Override
	public designationLocalService getWrappedService() {
		return _designationLocalService;
	}

	@Override
	public void setWrappedService(
		designationLocalService designationLocalService) {
		_designationLocalService = designationLocalService;
	}

	private designationLocalService _designationLocalService;
}