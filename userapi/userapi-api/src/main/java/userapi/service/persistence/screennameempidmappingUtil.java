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

import userapi.model.screennameempidmapping;

import java.util.List;

/**
 * The persistence utility for the screennameempidmapping service. This utility wraps {@link userapi.service.persistence.impl.screennameempidmappingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see screennameempidmappingPersistence
 * @see userapi.service.persistence.impl.screennameempidmappingPersistenceImpl
 * @generated
 */
@ProviderType
public class screennameempidmappingUtil {
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
	public static void clearCache(screennameempidmapping screennameempidmapping) {
		getPersistence().clearCache(screennameempidmapping);
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
	public static List<screennameempidmapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<screennameempidmapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<screennameempidmapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static screennameempidmapping update(
		screennameempidmapping screennameempidmapping) {
		return getPersistence().update(screennameempidmapping);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static screennameempidmapping update(
		screennameempidmapping screennameempidmapping,
		ServiceContext serviceContext) {
		return getPersistence().update(screennameempidmapping, serviceContext);
	}

	/**
	* Returns all the screennameempidmappings where screenname = &#63;.
	*
	* @param screenname the screenname
	* @return the matching screennameempidmappings
	*/
	public static List<screennameempidmapping> findByscreenname(
		java.lang.String screenname) {
		return getPersistence().findByscreenname(screenname);
	}

	/**
	* Returns a range of all the screennameempidmappings where screenname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param screenname the screenname
	* @param start the lower bound of the range of screennameempidmappings
	* @param end the upper bound of the range of screennameempidmappings (not inclusive)
	* @return the range of matching screennameempidmappings
	*/
	public static List<screennameempidmapping> findByscreenname(
		java.lang.String screenname, int start, int end) {
		return getPersistence().findByscreenname(screenname, start, end);
	}

	/**
	* Returns an ordered range of all the screennameempidmappings where screenname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param screenname the screenname
	* @param start the lower bound of the range of screennameempidmappings
	* @param end the upper bound of the range of screennameempidmappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching screennameempidmappings
	*/
	public static List<screennameempidmapping> findByscreenname(
		java.lang.String screenname, int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		return getPersistence()
				   .findByscreenname(screenname, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the screennameempidmappings where screenname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param screenname the screenname
	* @param start the lower bound of the range of screennameempidmappings
	* @param end the upper bound of the range of screennameempidmappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching screennameempidmappings
	*/
	public static List<screennameempidmapping> findByscreenname(
		java.lang.String screenname, int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByscreenname(screenname, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a matching screennameempidmapping could not be found
	*/
	public static screennameempidmapping findByscreenname_First(
		java.lang.String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator)
		throws userapi.exception.NoSuchscreennameempidmappingException {
		return getPersistence()
				   .findByscreenname_First(screenname, orderByComparator);
	}

	/**
	* Returns the first screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching screennameempidmapping, or <code>null</code> if a matching screennameempidmapping could not be found
	*/
	public static screennameempidmapping fetchByscreenname_First(
		java.lang.String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		return getPersistence()
				   .fetchByscreenname_First(screenname, orderByComparator);
	}

	/**
	* Returns the last screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a matching screennameempidmapping could not be found
	*/
	public static screennameempidmapping findByscreenname_Last(
		java.lang.String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator)
		throws userapi.exception.NoSuchscreennameempidmappingException {
		return getPersistence()
				   .findByscreenname_Last(screenname, orderByComparator);
	}

	/**
	* Returns the last screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching screennameempidmapping, or <code>null</code> if a matching screennameempidmapping could not be found
	*/
	public static screennameempidmapping fetchByscreenname_Last(
		java.lang.String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		return getPersistence()
				   .fetchByscreenname_Last(screenname, orderByComparator);
	}

	/**
	* Returns the screennameempidmappings before and after the current screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param srno the primary key of the current screennameempidmapping
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	*/
	public static screennameempidmapping[] findByscreenname_PrevAndNext(
		int srno, java.lang.String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator)
		throws userapi.exception.NoSuchscreennameempidmappingException {
		return getPersistence()
				   .findByscreenname_PrevAndNext(srno, screenname,
			orderByComparator);
	}

	/**
	* Removes all the screennameempidmappings where screenname = &#63; from the database.
	*
	* @param screenname the screenname
	*/
	public static void removeByscreenname(java.lang.String screenname) {
		getPersistence().removeByscreenname(screenname);
	}

	/**
	* Returns the number of screennameempidmappings where screenname = &#63;.
	*
	* @param screenname the screenname
	* @return the number of matching screennameempidmappings
	*/
	public static int countByscreenname(java.lang.String screenname) {
		return getPersistence().countByscreenname(screenname);
	}

	/**
	* Caches the screennameempidmapping in the entity cache if it is enabled.
	*
	* @param screennameempidmapping the screennameempidmapping
	*/
	public static void cacheResult(
		screennameempidmapping screennameempidmapping) {
		getPersistence().cacheResult(screennameempidmapping);
	}

	/**
	* Caches the screennameempidmappings in the entity cache if it is enabled.
	*
	* @param screennameempidmappings the screennameempidmappings
	*/
	public static void cacheResult(
		List<screennameempidmapping> screennameempidmappings) {
		getPersistence().cacheResult(screennameempidmappings);
	}

	/**
	* Creates a new screennameempidmapping with the primary key. Does not add the screennameempidmapping to the database.
	*
	* @param srno the primary key for the new screennameempidmapping
	* @return the new screennameempidmapping
	*/
	public static screennameempidmapping create(int srno) {
		return getPersistence().create(srno);
	}

	/**
	* Removes the screennameempidmapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping that was removed
	* @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	*/
	public static screennameempidmapping remove(int srno)
		throws userapi.exception.NoSuchscreennameempidmappingException {
		return getPersistence().remove(srno);
	}

	public static screennameempidmapping updateImpl(
		screennameempidmapping screennameempidmapping) {
		return getPersistence().updateImpl(screennameempidmapping);
	}

	/**
	* Returns the screennameempidmapping with the primary key or throws a {@link NoSuchscreennameempidmappingException} if it could not be found.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	*/
	public static screennameempidmapping findByPrimaryKey(int srno)
		throws userapi.exception.NoSuchscreennameempidmappingException {
		return getPersistence().findByPrimaryKey(srno);
	}

	/**
	* Returns the screennameempidmapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping, or <code>null</code> if a screennameempidmapping with the primary key could not be found
	*/
	public static screennameempidmapping fetchByPrimaryKey(int srno) {
		return getPersistence().fetchByPrimaryKey(srno);
	}

	public static java.util.Map<java.io.Serializable, screennameempidmapping> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the screennameempidmappings.
	*
	* @return the screennameempidmappings
	*/
	public static List<screennameempidmapping> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the screennameempidmappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of screennameempidmappings
	* @param end the upper bound of the range of screennameempidmappings (not inclusive)
	* @return the range of screennameempidmappings
	*/
	public static List<screennameempidmapping> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the screennameempidmappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of screennameempidmappings
	* @param end the upper bound of the range of screennameempidmappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of screennameempidmappings
	*/
	public static List<screennameempidmapping> findAll(int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the screennameempidmappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of screennameempidmappings
	* @param end the upper bound of the range of screennameempidmappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of screennameempidmappings
	*/
	public static List<screennameempidmapping> findAll(int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the screennameempidmappings from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of screennameempidmappings.
	*
	* @return the number of screennameempidmappings
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static screennameempidmappingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<screennameempidmappingPersistence, screennameempidmappingPersistence> _serviceTracker =
		ServiceTrackerFactory.open(screennameempidmappingPersistence.class);
}