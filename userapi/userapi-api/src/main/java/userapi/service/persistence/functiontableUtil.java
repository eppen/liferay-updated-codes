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

import userapi.model.functiontable;

import java.util.List;

/**
 * The persistence utility for the functiontable service. This utility wraps {@link userapi.service.persistence.impl.functiontablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see functiontablePersistence
 * @see userapi.service.persistence.impl.functiontablePersistenceImpl
 * @generated
 */
@ProviderType
public class functiontableUtil {
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
	public static void clearCache(functiontable functiontable) {
		getPersistence().clearCache(functiontable);
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
	public static List<functiontable> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<functiontable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<functiontable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<functiontable> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static functiontable update(functiontable functiontable) {
		return getPersistence().update(functiontable);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static functiontable update(functiontable functiontable,
		ServiceContext serviceContext) {
		return getPersistence().update(functiontable, serviceContext);
	}

	/**
	* Caches the functiontable in the entity cache if it is enabled.
	*
	* @param functiontable the functiontable
	*/
	public static void cacheResult(functiontable functiontable) {
		getPersistence().cacheResult(functiontable);
	}

	/**
	* Caches the functiontables in the entity cache if it is enabled.
	*
	* @param functiontables the functiontables
	*/
	public static void cacheResult(List<functiontable> functiontables) {
		getPersistence().cacheResult(functiontables);
	}

	/**
	* Creates a new functiontable with the primary key. Does not add the functiontable to the database.
	*
	* @param function_id the primary key for the new functiontable
	* @return the new functiontable
	*/
	public static functiontable create(int function_id) {
		return getPersistence().create(function_id);
	}

	/**
	* Removes the functiontable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable that was removed
	* @throws NoSuchfunctiontableException if a functiontable with the primary key could not be found
	*/
	public static functiontable remove(int function_id)
		throws userapi.exception.NoSuchfunctiontableException {
		return getPersistence().remove(function_id);
	}

	public static functiontable updateImpl(functiontable functiontable) {
		return getPersistence().updateImpl(functiontable);
	}

	/**
	* Returns the functiontable with the primary key or throws a {@link NoSuchfunctiontableException} if it could not be found.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable
	* @throws NoSuchfunctiontableException if a functiontable with the primary key could not be found
	*/
	public static functiontable findByPrimaryKey(int function_id)
		throws userapi.exception.NoSuchfunctiontableException {
		return getPersistence().findByPrimaryKey(function_id);
	}

	/**
	* Returns the functiontable with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable, or <code>null</code> if a functiontable with the primary key could not be found
	*/
	public static functiontable fetchByPrimaryKey(int function_id) {
		return getPersistence().fetchByPrimaryKey(function_id);
	}

	public static java.util.Map<java.io.Serializable, functiontable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the functiontables.
	*
	* @return the functiontables
	*/
	public static List<functiontable> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the functiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of functiontables
	* @param end the upper bound of the range of functiontables (not inclusive)
	* @return the range of functiontables
	*/
	public static List<functiontable> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the functiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of functiontables
	* @param end the upper bound of the range of functiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of functiontables
	*/
	public static List<functiontable> findAll(int start, int end,
		OrderByComparator<functiontable> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the functiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of functiontables
	* @param end the upper bound of the range of functiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of functiontables
	*/
	public static List<functiontable> findAll(int start, int end,
		OrderByComparator<functiontable> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the functiontables from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of functiontables.
	*
	* @return the number of functiontables
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static functiontablePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<functiontablePersistence, functiontablePersistence> _serviceTracker =
		ServiceTrackerFactory.open(functiontablePersistence.class);
}