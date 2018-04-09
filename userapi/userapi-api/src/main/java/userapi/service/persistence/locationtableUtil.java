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

import userapi.model.locationtable;

import java.util.List;

/**
 * The persistence utility for the locationtable service. This utility wraps {@link userapi.service.persistence.impl.locationtablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see locationtablePersistence
 * @see userapi.service.persistence.impl.locationtablePersistenceImpl
 * @generated
 */
@ProviderType
public class locationtableUtil {
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
	public static void clearCache(locationtable locationtable) {
		getPersistence().clearCache(locationtable);
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
	public static List<locationtable> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<locationtable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<locationtable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<locationtable> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static locationtable update(locationtable locationtable) {
		return getPersistence().update(locationtable);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static locationtable update(locationtable locationtable,
		ServiceContext serviceContext) {
		return getPersistence().update(locationtable, serviceContext);
	}

	/**
	* Caches the locationtable in the entity cache if it is enabled.
	*
	* @param locationtable the locationtable
	*/
	public static void cacheResult(locationtable locationtable) {
		getPersistence().cacheResult(locationtable);
	}

	/**
	* Caches the locationtables in the entity cache if it is enabled.
	*
	* @param locationtables the locationtables
	*/
	public static void cacheResult(List<locationtable> locationtables) {
		getPersistence().cacheResult(locationtables);
	}

	/**
	* Creates a new locationtable with the primary key. Does not add the locationtable to the database.
	*
	* @param loc_id the primary key for the new locationtable
	* @return the new locationtable
	*/
	public static locationtable create(int loc_id) {
		return getPersistence().create(loc_id);
	}

	/**
	* Removes the locationtable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable that was removed
	* @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	*/
	public static locationtable remove(int loc_id)
		throws userapi.exception.NoSuchlocationtableException {
		return getPersistence().remove(loc_id);
	}

	public static locationtable updateImpl(locationtable locationtable) {
		return getPersistence().updateImpl(locationtable);
	}

	/**
	* Returns the locationtable with the primary key or throws a {@link NoSuchlocationtableException} if it could not be found.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable
	* @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	*/
	public static locationtable findByPrimaryKey(int loc_id)
		throws userapi.exception.NoSuchlocationtableException {
		return getPersistence().findByPrimaryKey(loc_id);
	}

	/**
	* Returns the locationtable with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable, or <code>null</code> if a locationtable with the primary key could not be found
	*/
	public static locationtable fetchByPrimaryKey(int loc_id) {
		return getPersistence().fetchByPrimaryKey(loc_id);
	}

	public static java.util.Map<java.io.Serializable, locationtable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the locationtables.
	*
	* @return the locationtables
	*/
	public static List<locationtable> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the locationtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locationtables
	* @param end the upper bound of the range of locationtables (not inclusive)
	* @return the range of locationtables
	*/
	public static List<locationtable> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the locationtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locationtables
	* @param end the upper bound of the range of locationtables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of locationtables
	*/
	public static List<locationtable> findAll(int start, int end,
		OrderByComparator<locationtable> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the locationtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locationtables
	* @param end the upper bound of the range of locationtables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of locationtables
	*/
	public static List<locationtable> findAll(int start, int end,
		OrderByComparator<locationtable> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the locationtables from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of locationtables.
	*
	* @return the number of locationtables
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static locationtablePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<locationtablePersistence, locationtablePersistence> _serviceTracker =
		ServiceTrackerFactory.open(locationtablePersistence.class);
}