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

import userapi.exception.NoSuchgradeException;

import userapi.model.grade;

/**
 * The persistence interface for the grade service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.gradePersistenceImpl
 * @see gradeUtil
 * @generated
 */
@ProviderType
public interface gradePersistence extends BasePersistence<grade> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link gradeUtil} to access the grade persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the grade in the entity cache if it is enabled.
	*
	* @param grade the grade
	*/
	public void cacheResult(grade grade);

	/**
	* Caches the grades in the entity cache if it is enabled.
	*
	* @param grades the grades
	*/
	public void cacheResult(java.util.List<grade> grades);

	/**
	* Creates a new grade with the primary key. Does not add the grade to the database.
	*
	* @param grade_id the primary key for the new grade
	* @return the new grade
	*/
	public grade create(int grade_id);

	/**
	* Removes the grade with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param grade_id the primary key of the grade
	* @return the grade that was removed
	* @throws NoSuchgradeException if a grade with the primary key could not be found
	*/
	public grade remove(int grade_id) throws NoSuchgradeException;

	public grade updateImpl(grade grade);

	/**
	* Returns the grade with the primary key or throws a {@link NoSuchgradeException} if it could not be found.
	*
	* @param grade_id the primary key of the grade
	* @return the grade
	* @throws NoSuchgradeException if a grade with the primary key could not be found
	*/
	public grade findByPrimaryKey(int grade_id) throws NoSuchgradeException;

	/**
	* Returns the grade with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param grade_id the primary key of the grade
	* @return the grade, or <code>null</code> if a grade with the primary key could not be found
	*/
	public grade fetchByPrimaryKey(int grade_id);

	@Override
	public java.util.Map<java.io.Serializable, grade> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the grades.
	*
	* @return the grades
	*/
	public java.util.List<grade> findAll();

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
	public java.util.List<grade> findAll(int start, int end);

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
	public java.util.List<grade> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<grade> orderByComparator);

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
	public java.util.List<grade> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<grade> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the grades from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of grades.
	*
	* @return the number of grades
	*/
	public int countAll();
}