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

import userapi.model.designation;

import java.util.List;

/**
 * The persistence utility for the designation service. This utility wraps {@link userapi.service.persistence.impl.designationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see designationPersistence
 * @see userapi.service.persistence.impl.designationPersistenceImpl
 * @generated
 */
@ProviderType
public class designationUtil {
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
	public static void clearCache(designation designation) {
		getPersistence().clearCache(designation);
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
	public static List<designation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<designation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<designation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<designation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static designation update(designation designation) {
		return getPersistence().update(designation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static designation update(designation designation,
		ServiceContext serviceContext) {
		return getPersistence().update(designation, serviceContext);
	}

	/**
	* Caches the designation in the entity cache if it is enabled.
	*
	* @param designation the designation
	*/
	public static void cacheResult(designation designation) {
		getPersistence().cacheResult(designation);
	}

	/**
	* Caches the designations in the entity cache if it is enabled.
	*
	* @param designations the designations
	*/
	public static void cacheResult(List<designation> designations) {
		getPersistence().cacheResult(designations);
	}

	/**
	* Creates a new designation with the primary key. Does not add the designation to the database.
	*
	* @param desig_id the primary key for the new designation
	* @return the new designation
	*/
	public static designation create(int desig_id) {
		return getPersistence().create(desig_id);
	}

	/**
	* Removes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param desig_id the primary key of the designation
	* @return the designation that was removed
	* @throws NoSuchdesignationException if a designation with the primary key could not be found
	*/
	public static designation remove(int desig_id)
		throws userapi.exception.NoSuchdesignationException {
		return getPersistence().remove(desig_id);
	}

	public static designation updateImpl(designation designation) {
		return getPersistence().updateImpl(designation);
	}

	/**
	* Returns the designation with the primary key or throws a {@link NoSuchdesignationException} if it could not be found.
	*
	* @param desig_id the primary key of the designation
	* @return the designation
	* @throws NoSuchdesignationException if a designation with the primary key could not be found
	*/
	public static designation findByPrimaryKey(int desig_id)
		throws userapi.exception.NoSuchdesignationException {
		return getPersistence().findByPrimaryKey(desig_id);
	}

	/**
	* Returns the designation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param desig_id the primary key of the designation
	* @return the designation, or <code>null</code> if a designation with the primary key could not be found
	*/
	public static designation fetchByPrimaryKey(int desig_id) {
		return getPersistence().fetchByPrimaryKey(desig_id);
	}

	public static java.util.Map<java.io.Serializable, designation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the designations.
	*
	* @return the designations
	*/
	public static List<designation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the designations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of designations
	* @param end the upper bound of the range of designations (not inclusive)
	* @return the range of designations
	*/
	public static List<designation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the designations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of designations
	* @param end the upper bound of the range of designations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of designations
	*/
	public static List<designation> findAll(int start, int end,
		OrderByComparator<designation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the designations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of designations
	* @param end the upper bound of the range of designations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of designations
	*/
	public static List<designation> findAll(int start, int end,
		OrderByComparator<designation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the designations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of designations.
	*
	* @return the number of designations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static designationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<designationPersistence, designationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(designationPersistence.class);
}