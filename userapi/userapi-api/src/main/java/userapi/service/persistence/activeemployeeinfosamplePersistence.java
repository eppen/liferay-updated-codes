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

import userapi.exception.NoSuchactiveemployeeinfosampleException;

import userapi.model.activeemployeeinfosample;

/**
 * The persistence interface for the activeemployeeinfosample service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.activeemployeeinfosamplePersistenceImpl
 * @see activeemployeeinfosampleUtil
 * @generated
 */
@ProviderType
public interface activeemployeeinfosamplePersistence extends BasePersistence<activeemployeeinfosample> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link activeemployeeinfosampleUtil} to access the activeemployeeinfosample persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @return the matching activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId);

	/**
	* Returns a range of all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param EmpId the emp ID
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @return the range of matching activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId, int start, int end);

	/**
	* Returns an ordered range of all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param EmpId the emp ID
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator);

	/**
	* Returns an ordered range of all the activeemployeeinfosamples where EmpId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param EmpId the emp ID
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findByEmpId(
		java.lang.String EmpId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a matching activeemployeeinfosample could not be found
	*/
	public activeemployeeinfosample findByEmpId_First(java.lang.String EmpId,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws NoSuchactiveemployeeinfosampleException;

	/**
	* Returns the first activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching activeemployeeinfosample, or <code>null</code> if a matching activeemployeeinfosample could not be found
	*/
	public activeemployeeinfosample fetchByEmpId_First(java.lang.String EmpId,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator);

	/**
	* Returns the last activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a matching activeemployeeinfosample could not be found
	*/
	public activeemployeeinfosample findByEmpId_Last(java.lang.String EmpId,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws NoSuchactiveemployeeinfosampleException;

	/**
	* Returns the last activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching activeemployeeinfosample, or <code>null</code> if a matching activeemployeeinfosample could not be found
	*/
	public activeemployeeinfosample fetchByEmpId_Last(java.lang.String EmpId,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator);

	/**
	* Returns the activeemployeeinfosamples before and after the current activeemployeeinfosample in the ordered set where EmpId = &#63;.
	*
	* @param srno the primary key of the current activeemployeeinfosample
	* @param EmpId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	*/
	public activeemployeeinfosample[] findByEmpId_PrevAndNext(int srno,
		java.lang.String EmpId,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws NoSuchactiveemployeeinfosampleException;

	/**
	* Removes all the activeemployeeinfosamples where EmpId = &#63; from the database.
	*
	* @param EmpId the emp ID
	*/
	public void removeByEmpId(java.lang.String EmpId);

	/**
	* Returns the number of activeemployeeinfosamples where EmpId = &#63;.
	*
	* @param EmpId the emp ID
	* @return the number of matching activeemployeeinfosamples
	*/
	public int countByEmpId(java.lang.String EmpId);

	/**
	* Caches the activeemployeeinfosample in the entity cache if it is enabled.
	*
	* @param activeemployeeinfosample the activeemployeeinfosample
	*/
	public void cacheResult(activeemployeeinfosample activeemployeeinfosample);

	/**
	* Caches the activeemployeeinfosamples in the entity cache if it is enabled.
	*
	* @param activeemployeeinfosamples the activeemployeeinfosamples
	*/
	public void cacheResult(
		java.util.List<activeemployeeinfosample> activeemployeeinfosamples);

	/**
	* Creates a new activeemployeeinfosample with the primary key. Does not add the activeemployeeinfosample to the database.
	*
	* @param srno the primary key for the new activeemployeeinfosample
	* @return the new activeemployeeinfosample
	*/
	public activeemployeeinfosample create(int srno);

	/**
	* Removes the activeemployeeinfosample with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample that was removed
	* @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	*/
	public activeemployeeinfosample remove(int srno)
		throws NoSuchactiveemployeeinfosampleException;

	public activeemployeeinfosample updateImpl(
		activeemployeeinfosample activeemployeeinfosample);

	/**
	* Returns the activeemployeeinfosample with the primary key or throws a {@link NoSuchactiveemployeeinfosampleException} if it could not be found.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample
	* @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	*/
	public activeemployeeinfosample findByPrimaryKey(int srno)
		throws NoSuchactiveemployeeinfosampleException;

	/**
	* Returns the activeemployeeinfosample with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srno the primary key of the activeemployeeinfosample
	* @return the activeemployeeinfosample, or <code>null</code> if a activeemployeeinfosample with the primary key could not be found
	*/
	public activeemployeeinfosample fetchByPrimaryKey(int srno);

	@Override
	public java.util.Map<java.io.Serializable, activeemployeeinfosample> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the activeemployeeinfosamples.
	*
	* @return the activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findAll();

	/**
	* Returns a range of all the activeemployeeinfosamples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @return the range of activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findAll(int start, int end);

	/**
	* Returns an ordered range of all the activeemployeeinfosamples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator);

	/**
	* Returns an ordered range of all the activeemployeeinfosamples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activeemployeeinfosamples
	* @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of activeemployeeinfosamples
	*/
	public java.util.List<activeemployeeinfosample> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<activeemployeeinfosample> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the activeemployeeinfosamples from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of activeemployeeinfosamples.
	*
	* @return the number of activeemployeeinfosamples
	*/
	public int countAll();
}