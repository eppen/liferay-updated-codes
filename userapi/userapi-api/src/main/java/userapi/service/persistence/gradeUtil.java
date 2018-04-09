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

import userapi.model.grade;

import java.util.List;

/**
 * The persistence utility for the grade service. This utility wraps {@link userapi.service.persistence.impl.gradePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gradePersistence
 * @see userapi.service.persistence.impl.gradePersistenceImpl
 * @generated
 */
@ProviderType
public class gradeUtil {
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
	public static void clearCache(grade grade) {
		getPersistence().clearCache(grade);
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
	public static List<grade> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<grade> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<grade> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<grade> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static grade update(grade grade) {
		return getPersistence().update(grade);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static grade update(grade grade, ServiceContext serviceContext) {
		return getPersistence().update(grade, serviceContext);
	}

	/**
	* Caches the grade in the entity cache if it is enabled.
	*
	* @param grade the grade
	*/
	public static void cacheResult(grade grade) {
		getPersistence().cacheResult(grade);
	}

	/**
	* Caches the grades in the entity cache if it is enabled.
	*
	* @param grades the grades
	*/
	public static void cacheResult(List<grade> grades) {
		getPersistence().cacheResult(grades);
	}

	/**
	* Creates a new grade with the primary key. Does not add the grade to the database.
	*
	* @param grade_id the primary key for the new grade
	* @return the new grade
	*/
	public static grade create(int grade_id) {
		return getPersistence().create(grade_id);
	}

	/**
	* Removes the grade with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param grade_id the primary key of the grade
	* @return the grade that was removed
	* @throws NoSuchgradeException if a grade with the primary key could not be found
	*/
	public static grade remove(int grade_id)
		throws userapi.exception.NoSuchgradeException {
		return getPersistence().remove(grade_id);
	}

	public static grade updateImpl(grade grade) {
		return getPersistence().updateImpl(grade);
	}

	/**
	* Returns the grade with the primary key or throws a {@link NoSuchgradeException} if it could not be found.
	*
	* @param grade_id the primary key of the grade
	* @return the grade
	* @throws NoSuchgradeException if a grade with the primary key could not be found
	*/
	public static grade findByPrimaryKey(int grade_id)
		throws userapi.exception.NoSuchgradeException {
		return getPersistence().findByPrimaryKey(grade_id);
	}

	/**
	* Returns the grade with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param grade_id the primary key of the grade
	* @return the grade, or <code>null</code> if a grade with the primary key could not be found
	*/
	public static grade fetchByPrimaryKey(int grade_id) {
		return getPersistence().fetchByPrimaryKey(grade_id);
	}

	public static java.util.Map<java.io.Serializable, grade> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the grades.
	*
	* @return the grades
	*/
	public static List<grade> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the grades.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of grades
	* @param end the upper bound of the range of grades (not inclusive)
	* @return the range of grades
	*/
	public static List<grade> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the grades.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of grades
	* @param end the upper bound of the range of grades (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of grades
	*/
	public static List<grade> findAll(int start, int end,
		OrderByComparator<grade> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the grades.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of grades
	* @param end the upper bound of the range of grades (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of grades
	*/
	public static List<grade> findAll(int start, int end,
		OrderByComparator<grade> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the grades from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of grades.
	*
	* @return the number of grades
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static gradePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<gradePersistence, gradePersistence> _serviceTracker =
		ServiceTrackerFactory.open(gradePersistence.class);
}