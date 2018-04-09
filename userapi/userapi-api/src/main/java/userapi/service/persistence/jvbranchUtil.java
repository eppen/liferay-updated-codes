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

import userapi.model.jvbranch;

import java.util.List;

/**
 * The persistence utility for the jvbranch service. This utility wraps {@link userapi.service.persistence.impl.jvbranchPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see jvbranchPersistence
 * @see userapi.service.persistence.impl.jvbranchPersistenceImpl
 * @generated
 */
@ProviderType
public class jvbranchUtil {
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
	public static void clearCache(jvbranch jvbranch) {
		getPersistence().clearCache(jvbranch);
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
	public static List<jvbranch> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<jvbranch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<jvbranch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<jvbranch> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static jvbranch update(jvbranch jvbranch) {
		return getPersistence().update(jvbranch);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static jvbranch update(jvbranch jvbranch,
		ServiceContext serviceContext) {
		return getPersistence().update(jvbranch, serviceContext);
	}

	/**
	* Caches the jvbranch in the entity cache if it is enabled.
	*
	* @param jvbranch the jvbranch
	*/
	public static void cacheResult(jvbranch jvbranch) {
		getPersistence().cacheResult(jvbranch);
	}

	/**
	* Caches the jvbranchs in the entity cache if it is enabled.
	*
	* @param jvbranchs the jvbranchs
	*/
	public static void cacheResult(List<jvbranch> jvbranchs) {
		getPersistence().cacheResult(jvbranchs);
	}

	/**
	* Creates a new jvbranch with the primary key. Does not add the jvbranch to the database.
	*
	* @param jvbranch_id the primary key for the new jvbranch
	* @return the new jvbranch
	*/
	public static jvbranch create(int jvbranch_id) {
		return getPersistence().create(jvbranch_id);
	}

	/**
	* Removes the jvbranch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch that was removed
	* @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	*/
	public static jvbranch remove(int jvbranch_id)
		throws userapi.exception.NoSuchjvbranchException {
		return getPersistence().remove(jvbranch_id);
	}

	public static jvbranch updateImpl(jvbranch jvbranch) {
		return getPersistence().updateImpl(jvbranch);
	}

	/**
	* Returns the jvbranch with the primary key or throws a {@link NoSuchjvbranchException} if it could not be found.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch
	* @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	*/
	public static jvbranch findByPrimaryKey(int jvbranch_id)
		throws userapi.exception.NoSuchjvbranchException {
		return getPersistence().findByPrimaryKey(jvbranch_id);
	}

	/**
	* Returns the jvbranch with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch, or <code>null</code> if a jvbranch with the primary key could not be found
	*/
	public static jvbranch fetchByPrimaryKey(int jvbranch_id) {
		return getPersistence().fetchByPrimaryKey(jvbranch_id);
	}

	public static java.util.Map<java.io.Serializable, jvbranch> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the jvbranchs.
	*
	* @return the jvbranchs
	*/
	public static List<jvbranch> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the jvbranchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jvbranchs
	* @param end the upper bound of the range of jvbranchs (not inclusive)
	* @return the range of jvbranchs
	*/
	public static List<jvbranch> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the jvbranchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jvbranchs
	* @param end the upper bound of the range of jvbranchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jvbranchs
	*/
	public static List<jvbranch> findAll(int start, int end,
		OrderByComparator<jvbranch> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jvbranchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jvbranchs
	* @param end the upper bound of the range of jvbranchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of jvbranchs
	*/
	public static List<jvbranch> findAll(int start, int end,
		OrderByComparator<jvbranch> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the jvbranchs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jvbranchs.
	*
	* @return the number of jvbranchs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static jvbranchPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<jvbranchPersistence, jvbranchPersistence> _serviceTracker =
		ServiceTrackerFactory.open(jvbranchPersistence.class);
}