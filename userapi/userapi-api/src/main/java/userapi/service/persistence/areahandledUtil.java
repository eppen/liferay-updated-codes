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

import userapi.model.areahandled;

import java.util.List;

/**
 * The persistence utility for the areahandled service. This utility wraps {@link userapi.service.persistence.impl.areahandledPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see areahandledPersistence
 * @see userapi.service.persistence.impl.areahandledPersistenceImpl
 * @generated
 */
@ProviderType
public class areahandledUtil {
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
	public static void clearCache(areahandled areahandled) {
		getPersistence().clearCache(areahandled);
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
	public static List<areahandled> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<areahandled> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<areahandled> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<areahandled> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static areahandled update(areahandled areahandled) {
		return getPersistence().update(areahandled);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static areahandled update(areahandled areahandled,
		ServiceContext serviceContext) {
		return getPersistence().update(areahandled, serviceContext);
	}

	/**
	* Caches the areahandled in the entity cache if it is enabled.
	*
	* @param areahandled the areahandled
	*/
	public static void cacheResult(areahandled areahandled) {
		getPersistence().cacheResult(areahandled);
	}

	/**
	* Caches the areahandleds in the entity cache if it is enabled.
	*
	* @param areahandleds the areahandleds
	*/
	public static void cacheResult(List<areahandled> areahandleds) {
		getPersistence().cacheResult(areahandleds);
	}

	/**
	* Creates a new areahandled with the primary key. Does not add the areahandled to the database.
	*
	* @param area_id the primary key for the new areahandled
	* @return the new areahandled
	*/
	public static areahandled create(int area_id) {
		return getPersistence().create(area_id);
	}

	/**
	* Removes the areahandled with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled that was removed
	* @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	*/
	public static areahandled remove(int area_id)
		throws userapi.exception.NoSuchareahandledException {
		return getPersistence().remove(area_id);
	}

	public static areahandled updateImpl(areahandled areahandled) {
		return getPersistence().updateImpl(areahandled);
	}

	/**
	* Returns the areahandled with the primary key or throws a {@link NoSuchareahandledException} if it could not be found.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled
	* @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	*/
	public static areahandled findByPrimaryKey(int area_id)
		throws userapi.exception.NoSuchareahandledException {
		return getPersistence().findByPrimaryKey(area_id);
	}

	/**
	* Returns the areahandled with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled, or <code>null</code> if a areahandled with the primary key could not be found
	*/
	public static areahandled fetchByPrimaryKey(int area_id) {
		return getPersistence().fetchByPrimaryKey(area_id);
	}

	public static java.util.Map<java.io.Serializable, areahandled> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the areahandleds.
	*
	* @return the areahandleds
	*/
	public static List<areahandled> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the areahandleds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of areahandleds
	* @param end the upper bound of the range of areahandleds (not inclusive)
	* @return the range of areahandleds
	*/
	public static List<areahandled> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the areahandleds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of areahandleds
	* @param end the upper bound of the range of areahandleds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of areahandleds
	*/
	public static List<areahandled> findAll(int start, int end,
		OrderByComparator<areahandled> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the areahandleds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of areahandleds
	* @param end the upper bound of the range of areahandleds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of areahandleds
	*/
	public static List<areahandled> findAll(int start, int end,
		OrderByComparator<areahandled> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the areahandleds from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of areahandleds.
	*
	* @return the number of areahandleds
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static areahandledPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<areahandledPersistence, areahandledPersistence> _serviceTracker =
		ServiceTrackerFactory.open(areahandledPersistence.class);
}