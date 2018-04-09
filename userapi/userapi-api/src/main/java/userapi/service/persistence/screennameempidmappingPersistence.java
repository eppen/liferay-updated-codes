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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import userapi.exception.NoSuchscreennameempidmappingException;

import userapi.model.screennameempidmapping;

/**
 * The persistence interface for the screennameempidmapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.screennameempidmappingPersistenceImpl
 * @see screennameempidmappingUtil
 * @generated
 */
@ProviderType
public interface screennameempidmappingPersistence extends BasePersistence<screennameempidmapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link screennameempidmappingUtil} to access the screennameempidmapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the screennameempidmappings where screenname = &#63;.
	*
	* @param screenname the screenname
	* @return the matching screennameempidmappings
	*/
	public java.util.List<screennameempidmapping> findByscreenname(
		java.lang.String screenname);

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
	public java.util.List<screennameempidmapping> findByscreenname(
		java.lang.String screenname, int start, int end);

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
	public java.util.List<screennameempidmapping> findByscreenname(
		java.lang.String screenname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator);

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
	public java.util.List<screennameempidmapping> findByscreenname(
		java.lang.String screenname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a matching screennameempidmapping could not be found
	*/
	public screennameempidmapping findByscreenname_First(
		java.lang.String screenname,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator)
		throws NoSuchscreennameempidmappingException;

	/**
	* Returns the first screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching screennameempidmapping, or <code>null</code> if a matching screennameempidmapping could not be found
	*/
	public screennameempidmapping fetchByscreenname_First(
		java.lang.String screenname,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator);

	/**
	* Returns the last screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a matching screennameempidmapping could not be found
	*/
	public screennameempidmapping findByscreenname_Last(
		java.lang.String screenname,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator)
		throws NoSuchscreennameempidmappingException;

	/**
	* Returns the last screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching screennameempidmapping, or <code>null</code> if a matching screennameempidmapping could not be found
	*/
	public screennameempidmapping fetchByscreenname_Last(
		java.lang.String screenname,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator);

	/**
	* Returns the screennameempidmappings before and after the current screennameempidmapping in the ordered set where screenname = &#63;.
	*
	* @param srno the primary key of the current screennameempidmapping
	* @param screenname the screenname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	*/
	public screennameempidmapping[] findByscreenname_PrevAndNext(int srno,
		java.lang.String screenname,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator)
		throws NoSuchscreennameempidmappingException;

	/**
	* Removes all the screennameempidmappings where screenname = &#63; from the database.
	*
	* @param screenname the screenname
	*/
	public void removeByscreenname(java.lang.String screenname);

	/**
	* Returns the number of screennameempidmappings where screenname = &#63;.
	*
	* @param screenname the screenname
	* @return the number of matching screennameempidmappings
	*/
	public int countByscreenname(java.lang.String screenname);

	/**
	* Caches the screennameempidmapping in the entity cache if it is enabled.
	*
	* @param screennameempidmapping the screennameempidmapping
	*/
	public void cacheResult(screennameempidmapping screennameempidmapping);

	/**
	* Caches the screennameempidmappings in the entity cache if it is enabled.
	*
	* @param screennameempidmappings the screennameempidmappings
	*/
	public void cacheResult(
		java.util.List<screennameempidmapping> screennameempidmappings);

	/**
	* Creates a new screennameempidmapping with the primary key. Does not add the screennameempidmapping to the database.
	*
	* @param srno the primary key for the new screennameempidmapping
	* @return the new screennameempidmapping
	*/
	public screennameempidmapping create(int srno);

	/**
	* Removes the screennameempidmapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping that was removed
	* @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	*/
	public screennameempidmapping remove(int srno)
		throws NoSuchscreennameempidmappingException;

	public screennameempidmapping updateImpl(
		screennameempidmapping screennameempidmapping);

	/**
	* Returns the screennameempidmapping with the primary key or throws a {@link NoSuchscreennameempidmappingException} if it could not be found.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping
	* @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	*/
	public screennameempidmapping findByPrimaryKey(int srno)
		throws NoSuchscreennameempidmappingException;

	/**
	* Returns the screennameempidmapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srno the primary key of the screennameempidmapping
	* @return the screennameempidmapping, or <code>null</code> if a screennameempidmapping with the primary key could not be found
	*/
	public screennameempidmapping fetchByPrimaryKey(int srno);

	@Override
	public java.util.Map<java.io.Serializable, screennameempidmapping> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the screennameempidmappings.
	*
	* @return the screennameempidmappings
	*/
	public java.util.List<screennameempidmapping> findAll();

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
	public java.util.List<screennameempidmapping> findAll(int start, int end);

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
	public java.util.List<screennameempidmapping> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator);

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
	public java.util.List<screennameempidmapping> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<screennameempidmapping> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the screennameempidmappings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of screennameempidmappings.
	*
	* @return the number of screennameempidmappings
	*/
	public int countAll();
}