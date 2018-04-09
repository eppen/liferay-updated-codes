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

import userapi.model.regiontable;

import java.util.List;

/**
 * The persistence utility for the regiontable service. This utility wraps {@link userapi.service.persistence.impl.regiontablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see regiontablePersistence
 * @see userapi.service.persistence.impl.regiontablePersistenceImpl
 * @generated
 */
@ProviderType
public class regiontableUtil {
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
	public static void clearCache(regiontable regiontable) {
		getPersistence().clearCache(regiontable);
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
	public static List<regiontable> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<regiontable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<regiontable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<regiontable> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static regiontable update(regiontable regiontable) {
		return getPersistence().update(regiontable);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static regiontable update(regiontable regiontable,
		ServiceContext serviceContext) {
		return getPersistence().update(regiontable, serviceContext);
	}

	/**
	* Caches the regiontable in the entity cache if it is enabled.
	*
	* @param regiontable the regiontable
	*/
	public static void cacheResult(regiontable regiontable) {
		getPersistence().cacheResult(regiontable);
	}

	/**
	* Caches the regiontables in the entity cache if it is enabled.
	*
	* @param regiontables the regiontables
	*/
	public static void cacheResult(List<regiontable> regiontables) {
		getPersistence().cacheResult(regiontables);
	}

	/**
	* Creates a new regiontable with the primary key. Does not add the regiontable to the database.
	*
	* @param region_id the primary key for the new regiontable
	* @return the new regiontable
	*/
	public static regiontable create(int region_id) {
		return getPersistence().create(region_id);
	}

	/**
	* Removes the regiontable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable that was removed
	* @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	*/
	public static regiontable remove(int region_id)
		throws userapi.exception.NoSuchregiontableException {
		return getPersistence().remove(region_id);
	}

	public static regiontable updateImpl(regiontable regiontable) {
		return getPersistence().updateImpl(regiontable);
	}

	/**
	* Returns the regiontable with the primary key or throws a {@link NoSuchregiontableException} if it could not be found.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable
	* @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	*/
	public static regiontable findByPrimaryKey(int region_id)
		throws userapi.exception.NoSuchregiontableException {
		return getPersistence().findByPrimaryKey(region_id);
	}

	/**
	* Returns the regiontable with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable, or <code>null</code> if a regiontable with the primary key could not be found
	*/
	public static regiontable fetchByPrimaryKey(int region_id) {
		return getPersistence().fetchByPrimaryKey(region_id);
	}

	public static java.util.Map<java.io.Serializable, regiontable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the regiontables.
	*
	* @return the regiontables
	*/
	public static List<regiontable> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the regiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regiontables
	* @param end the upper bound of the range of regiontables (not inclusive)
	* @return the range of regiontables
	*/
	public static List<regiontable> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the regiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regiontables
	* @param end the upper bound of the range of regiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of regiontables
	*/
	public static List<regiontable> findAll(int start, int end,
		OrderByComparator<regiontable> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the regiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regiontables
	* @param end the upper bound of the range of regiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of regiontables
	*/
	public static List<regiontable> findAll(int start, int end,
		OrderByComparator<regiontable> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the regiontables from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of regiontables.
	*
	* @return the number of regiontables
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static regiontablePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<regiontablePersistence, regiontablePersistence> _serviceTracker =
		ServiceTrackerFactory.open(regiontablePersistence.class);
}