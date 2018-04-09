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

package userapi.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import userapi.model.activeemployeeinfosample;

import java.util.List;

/**
 * The persistence utility for the activeemployeeinfosample service. This utility wraps {@link userapi.service.persistence.impl.activeemployeeinfosamplePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see activeemployeeinfosamplePersistence
 * @see userapi.service.persistence.impl.activeemployeeinfosamplePersistenceImpl
 * @generated
 */
@ProviderType
public class activeemployeeinfosampleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		activeemployeeinfosample activeemployeeinfosample) {
		getPersistence().clearCache(activeemployeeinfosample);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<activeemployeeinfosample> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<activeemployeeinfosample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<activeemployeeinfosample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static activeemployeeinfosample update(
		activeemployeeinfosample activeemployeeinfosample) {
		return getPersistence().update(activeemployeeinfosample);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static activeemployeeinfosample update(
		activeemployeeinfosample activeemployeeinfosample,
		ServiceContext serviceContext) {
		return getPersistence().update(activeemployeeinfosample, serviceContext);
	}

	/**
	* Returns all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @return the matching activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId) {
		return getPersistence().findByEmpId(EmpId);
	}

	/**
	* Returns a range of all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param EmpId the emp ID
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @return the range of matching activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId, int start, int end) {
		return getPersistence().findByEmpId(EmpId, start, end);
	}

	/**
	* Returns an ordered range of all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param EmpId the emp ID
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId, int start, int end,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		return getPersistence().findByEmpId(EmpId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param EmpId the emp ID
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId, int start, int end,
		OrderByComparator<activeemployeeinfosample> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEmpId(EmpId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a matching activeemployeeinfosample could not be found
	*/
	public static activeemployeeinfosample findByEmpId_First(
		java.lang.String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws userapi.exception.NoSuchactiveemployeeinfosampleException {
		return getPersistence().findByEmpId_First(EmpId, orderByComparator);
	}

	/**
	* Returns the first activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching activeemployeeinfosample, or <code>null</code> if a matching activeemployeeinfosample could not be found
	*/
	public static activeemployeeinfosample fetchByEmpId_First(
		java.lang.String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		return getPersistence().fetchByEmpId_First(EmpId, orderByComparator);
	}

	/**
	* Returns the last activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a matching activeemployeeinfosample could not be found
	*/
	public static activeemployeeinfosample findByEmpId_Last(
		java.lang.String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws userapi.exception.NoSuchactiveemployeeinfosampleException {
		return getPersistence().findByEmpId_Last(EmpId, orderByComparator);
	}

	/**
	* Returns the last activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching activeemployeeinfosample, or <code>null</code> if a matching activeemployeeinfosample could not be found
	*/
	public static activeemployeeinfosample fetchByEmpId_Last(
		java.lang.String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		return getPersistence().fetchByEmpId_Last(EmpId, orderByComparator);
	}

	/**
	* Returns the activeemployeeinfosamples before and after the current activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param srno the primary key of the current activeemployeeinfosample
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	*/
	public static activeemployeeinfosample[] findByEmpId_PrevAndNext(int srno,
		java.lang.String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws userapi.exception.NoSuchactiveemployeeinfosampleException {
		return getPersistence()
				   .findByEmpId_PrevAndNext(srno, EmpId, orderByComparator);
	}

	/**
	* Removes all the activeemployeeinfosamples where EmpId = &#63; from the database.
	*
	* @param EmpId the emp ID
	*/
	public static void removeByEmpId(java.lang.String EmpId) {
		getPersistence().removeByEmpId(EmpId);
	}

	/**
	* Returns the number of activeemployeeinfosamples where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @return the number of matching activeemployeeinfosamples
	*/
	public static int countByEmpId(java.lang.String EmpId) {
		return getPersistence().countByEmpId(EmpId);
	}

	/**
	* Caches the activeemployeeinfosample in the entity cache if it is enabled.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	*/
	public static void cacheResult(
		activeemployeeinfosample activeemployeeinfosample) {
		getPersistence().cacheResult(activeemployeeinfosample);
	}

	/**
	* Caches the activeemployeeinfosamples in the entity cache if it is enabled.
	*
	* @param activeemployeeinfosamples the activeemployeeinfosamples
	*/
	public static void cacheResult(
		List<activeemployeeinfosample> activeemployeeinfosamples) {
		getPersistence().cacheResult(activeemployeeinfosamples);
	}

	/**
	* Creates a new activeemployeeinfosample with the primary key. Does not add the activeemployeeinfosample to the database.
	*
	* @param srno the primary key for the new activeemployeeinfosample
	* @return the new activeemployeeinfosample
	*/
	public static activeemployeeinfosample create(int srno) {
		return getPersistence().create(srno);
	}

	/**
	* Removes the activeemployeeinfosample with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample that was removed
	* @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	*/
	public static activeemployeeinfosample remove(int srno)
		throws userapi.exception.NoSuchactiveemployeeinfosampleException {
		return getPersistence().remove(srno);
	}

	public static activeemployeeinfosample updateImpl(
		activeemployeeinfosample activeemployeeinfosample) {
		return getPersistence().updateImpl(activeemployeeinfosample);
	}

	/**
	* Returns the activeemployeeinfosample with the primary key or throws a {@link NoSuchactiveemployeeinfosampleException} if it could not be found.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	*/
	public static activeemployeeinfosample findByPrimaryKey(int srno)
		throws userapi.exception.NoSuchactiveemployeeinfosampleException {
		return getPersistence().findByPrimaryKey(srno);
	}

	/**
	* Returns the activeemployeeinfosample with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample, or <code>null</code> if a activeemployeeinfosample with the primary key could not be found
	*/
	public static activeemployeeinfosample fetchByPrimaryKey(int srno) {
		return getPersistence().fetchByPrimaryKey(srno);
	}

	public static java.util.Map<java.io.Serializable, activeemployeeinfosample> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the activeemployeeinfosamples.
	*
	* @return the activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the activeemployeeinfosamples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @return the range of activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the activeemployeeinfosamples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findAll(int start, int end,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the activeemployeeinfosamples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of activeemployeeinfosamples
	*/
	public static List<activeemployeeinfosample> findAll(int start, int end,
		OrderByComparator<activeemployeeinfosample> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the activeemployeeinfosamples from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of activeemployeeinfosamples.
	*
	* @return the number of activeemployeeinfosamples
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static activeemployeeinfosamplePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<activeemployeeinfosamplePersistence, activeemployeeinfosamplePersistence> _serviceTracker =
		ServiceTrackerFactory.open(activeemployeeinfosamplePersistence.class);
}