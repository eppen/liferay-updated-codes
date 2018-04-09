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
 * Provides a wrapper for {@link unitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see unitLocalService
 * @generated
 */
@ProviderType
public class unitLocalServiceWrapper implements unitLocalService,
	ServiceWrapper<unitLocalService> {
	public unitLocalServiceWrapper(unitLocalService unitLocalService) {
		_unitLocalService = unitLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _unitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _unitLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _unitLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _unitLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _unitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of units.
	*
	* @return the number of units
	*/
	@Override
	public int getunitsCount() {
		return _unitLocalService.getunitsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _unitLocalService.getOSGiServiceIdentifier();
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
		return _unitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _unitLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _unitLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link userapi.model.impl.unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of units
	* @param end the upper bound of the range of units (not inclusive)
	* @return the range of units
	*/
	@Override
	public java.util.List<userapi.model.unit> getunits(int start, int end) {
		return _unitLocalService.getunits(start, end);
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
		return _unitLocalService.dynamicQueryCount(dynamicQuery);
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
		return _unitLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the unit to the database. Also notifies the appropriate model listeners.
	*
	* @param unit the unit
	* @return the unit that was added
	*/
	@Override
	public userapi.model.unit addunit(userapi.model.unit unit) {
		return _unitLocalService.addunit(unit);
	}

	/**
	* Creates a new unit with the primary key. Does not add the unit to the database.
	*
	* @param unit_id the primary key for the new unit
	* @return the new unit
	*/
	@Override
	public userapi.model.unit createunit(int unit_id) {
		return _unitLocalService.createunit(unit_id);
	}

	/**
	* Deletes the unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param unit_id the primary key of the unit
	* @return the unit that was removed
	* @throws PortalException if a unit with the primary key could not be found
	*/
	@Override
	public userapi.model.unit deleteunit(int unit_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _unitLocalService.deleteunit(unit_id);
	}

	/**
	* Deletes the unit from the database. Also notifies the appropriate model listeners.
	*
	* @param unit the unit
	* @return the unit that was removed
	*/
	@Override
	public userapi.model.unit deleteunit(userapi.model.unit unit) {
		return _unitLocalService.deleteunit(unit);
	}

	@Override
	public userapi.model.unit fetchunit(int unit_id) {
		return _unitLocalService.fetchunit(unit_id);
	}

	/**
	* Returns the unit with the primary key.
	*
	* @param unit_id the primary key of the unit
	* @return the unit
	* @throws PortalException if a unit with the primary key could not be found
	*/
	@Override
	public userapi.model.unit getunit(int unit_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _unitLocalService.getunit(unit_id);
	}

	/**
	* Updates the unit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param unit the unit
	* @return the unit that was updated
	*/
	@Override
	public userapi.model.unit updateunit(userapi.model.unit unit) {
		return _unitLocalService.updateunit(unit);
	}

	@Override
	public unitLocalService getWrappedService() {
		return _unitLocalService;
	}

	@Override
	public void setWrappedService(unitLocalService unitLocalService) {
		_unitLocalService = unitLocalService;
	}

	private unitLocalService _unitLocalService;
}