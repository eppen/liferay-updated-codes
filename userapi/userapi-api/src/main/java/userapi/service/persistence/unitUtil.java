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

import userapi.model.unit;

import java.util.List;

/**
 * The persistence utility for the unit service. This utility wraps {@link userapi.service.persistence.impl.unitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see unitPersistence
 * @see userapi.service.persistence.impl.unitPersistenceImpl
 * @generated
 */
@ProviderType
public class unitUtil {
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
	public static void clearCache(unit unit) {
		getPersistence().clearCache(unit);
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
	public static List<unit> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<unit> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<unit> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<unit> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static unit update(unit unit) {
		return getPersistence().update(unit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static unit update(unit unit, ServiceContext serviceContext) {
		return getPersistence().update(unit, serviceContext);
	}

	/**
	* Caches the unit in the entity cache if it is enabled.
	*
	* @param unit the unit
	*/
	public static void cacheResult(unit unit) {
		getPersistence().cacheResult(unit);
	}

	/**
	* Caches the units in the entity cache if it is enabled.
	*
	* @param units the units
	*/
	public static void cacheResult(List<unit> units) {
		getPersistence().cacheResult(units);
	}

	/**
	* Creates a new unit with the primary key. Does not add the unit to the database.
	*
	* @param unit_id the primary key for the new unit
	* @return the new unit
	*/
	public static unit create(int unit_id) {
		return getPersistence().create(unit_id);
	}

	/**
	* Removes the unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param unit_id the primary key of the unit
	* @return the unit that was removed
	* @throws NoSuchunitException if a unit with the primary key could not be found
	*/
	public static unit remove(int unit_id)
		throws userapi.exception.NoSuchunitException {
		return getPersistence().remove(unit_id);
	}

	public static unit updateImpl(unit unit) {
		return getPersistence().updateImpl(unit);
	}

	/**
	* Returns the unit with the primary key or throws a {@link NoSuchunitException} if it could not be found.
	*
	* @param unit_id the primary key of the unit
	* @return the unit
	* @throws NoSuchunitException if a unit with the primary key could not be found
	*/
	public static unit findByPrimaryKey(int unit_id)
		throws userapi.exception.NoSuchunitException {
		return getPersistence().findByPrimaryKey(unit_id);
	}

	/**
	* Returns the unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param unit_id the primary key of the unit
	* @return the unit, or <code>null</code> if a unit with the primary key could not be found
	*/
	public static unit fetchByPrimaryKey(int unit_id) {
		return getPersistence().fetchByPrimaryKey(unit_id);
	}

	public static java.util.Map<java.io.Serializable, unit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the units.
	*
	* @return the units
	*/
	public static List<unit> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of units
	* @param end the upper bound of the range of units (not inclusive)
	* @return the range of units
	*/
	public static List<unit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of units
	* @param end the upper bound of the range of units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of units
	*/
	public static List<unit> findAll(int start, int end,
		OrderByComparator<unit> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of units
	* @param end the upper bound of the range of units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of units
	*/
	public static List<unit> findAll(int start, int end,
		OrderByComparator<unit> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the units from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of units.
	*
	* @return the number of units
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static unitPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<unitPersistence, unitPersistence> _serviceTracker =
		ServiceTrackerFactory.open(unitPersistence.class);
}