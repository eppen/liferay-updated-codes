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

import userapi.exception.NoSuchdesignationException;

import userapi.model.designation;

/**
 * The persistence interface for the designation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.designationPersistenceImpl
 * @see designationUtil
 * @generated
 */
@ProviderType
public interface designationPersistence extends BasePersistence<designation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link designationUtil} to access the designation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the designation in the entity cache if it is enabled.
	*
	* @param designation the designation
	*/
	public void cacheResult(designation designation);

	/**
	* Caches the designations in the entity cache if it is enabled.
	*
	* @param designations the designations
	*/
	public void cacheResult(java.util.List<designation> designations);

	/**
	* Creates a new designation with the primary key. Does not add the designation to the database.
	*
	* @param desig_id the primary key for the new designation
	* @return the new designation
	*/
	public designation create(int desig_id);

	/**
	* Removes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param desig_id the primary key of the designation
	* @return the designation that was removed
	* @throws NoSuchdesignationException if a designation with the primary key could not be found
	*/
	public designation remove(int desig_id) throws NoSuchdesignationException;

	public designation updateImpl(designation designation);

	/**
	* Returns the designation with the primary key or throws a {@link NoSuchdesignationException} if it could not be found.
	*
	* @param desig_id the primary key of the designation
	* @return the designation
	* @throws NoSuchdesignationException if a designation with the primary key could not be found
	*/
	public designation findByPrimaryKey(int desig_id)
		throws NoSuchdesignationException;

	/**
	* Returns the designation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param desig_id the primary key of the designation
	* @return the designation, or <code>null</code> if a designation with the primary key could not be found
	*/
	public designation fetchByPrimaryKey(int desig_id);

	@Override
	public java.util.Map<java.io.Serializable, designation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the designations.
	*
	* @return the designations
	*/
	public java.util.List<designation> findAll();

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
	public java.util.List<designation> findAll(int start, int end);

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
	public java.util.List<designation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<designation> orderByComparator);

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
	public java.util.List<designation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<designation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the designations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of designations.
	*
	* @return the number of designations
	*/
	public int countAll();
}