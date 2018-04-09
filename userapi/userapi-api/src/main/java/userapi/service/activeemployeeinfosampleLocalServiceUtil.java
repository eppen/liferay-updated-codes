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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for activeemployeeinfosample. This utility wraps
 * {@link userapi.service.impl.activeemployeeinfosampleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see activeemployeeinfosampleLocalService
 * @see userapi.service.base.activeemployeeinfosampleLocalServiceBaseImpl
 * @see userapi.service.impl.activeemployeeinfosampleLocalServiceImpl
 * @generated
 */
@ProviderType
public class activeemployeeinfosampleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link userapi.service.impl.activeemployeeinfosampleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of activeemployeeinfosamples.
	*
	* @return the number of activeemployeeinfosamples
	*/
	public static int getactiveemployeeinfosamplesCount() {
		return getService().getactiveemployeeinfosamplesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<userapi.model.activeemployeeinfosample> getEmpDetailsByEmpId(
		java.lang.String empid) {
		return getService().getEmpDetailsByEmpId(empid);
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
	public static java.util.List<userapi.model.activeemployeeinfosample> getactiveemployeeinfosamples(
		int start, int end) {
		return getService().getactiveemployeeinfosamples(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the activeemployeeinfosample to the database. Also notifies the appropriate model listeners.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	* @return the activeemployeeinfosample that was added
	*/
	public static userapi.model.activeemployeeinfosample addactiveemployeeinfosample(
		userapi.model.activeemployeeinfosample activeemployeeinfosample) {
		return getService().addactiveemployeeinfosample(activeemployeeinfosample);
	}

	/**
	* Creates a new activeemployeeinfosample with the primary key. Does not add the activeemployeeinfosample to the database.
	*
	* @param srno the primary key for the new activeemployeeinfosample
	* @return the new activeemployeeinfosample
	*/
	public static userapi.model.activeemployeeinfosample createactiveemployeeinfosample(
		int srno) {
		return getService().createactiveemployeeinfosample(srno);
	}

	/**
	* Deletes the activeemployeeinfosample with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample that was removed
	* @throws PortalException if a activeemployeeinfosample with the primary key could not be found
	*/
	public static userapi.model.activeemployeeinfosample deleteactiveemployeeinfosample(
		int srno) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteactiveemployeeinfosample(srno);
	}

	/**
	* Deletes the activeemployeeinfosample from the database. Also notifies the appropriate model listeners.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	* @return the activeemployeeinfosample that was removed
	*/
	public static userapi.model.activeemployeeinfosample deleteactiveemployeeinfosample(
		userapi.model.activeemployeeinfosample activeemployeeinfosample) {
		return getService()
				   .deleteactiveemployeeinfosample(activeemployeeinfosample);
	}

	public static userapi.model.activeemployeeinfosample fetchactiveemployeeinfosample(
		int srno) {
		return getService().fetchactiveemployeeinfosample(srno);
	}

	/**
	* Returns the activeemployeeinfosample with the primary key.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample
	* @throws PortalException if a activeemployeeinfosample with the primary key could not be found
	*/
	public static userapi.model.activeemployeeinfosample getactiveemployeeinfosample(
		int srno) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getactiveemployeeinfosample(srno);
	}

	/**
	* Updates the activeemployeeinfosample in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	* @return the activeemployeeinfosample that was updated
	*/
	public static userapi.model.activeemployeeinfosample updateactiveemployeeinfosample(
		userapi.model.activeemployeeinfosample activeemployeeinfosample) {
		return getService()
				   .updateactiveemployeeinfosample(activeemployeeinfosample);
	}

	public static activeemployeeinfosampleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<activeemployeeinfosampleLocalService, activeemployeeinfosampleLocalService> _serviceTracker =
		ServiceTrackerFactory.open(activeemployeeinfosampleLocalService.class);
}