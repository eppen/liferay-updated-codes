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

import userapi.exception.NoSuchlocationtableException;

import userapi.model.locationtable;

/**
 * The persistence interface for the locationtable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.locationtablePersistenceImpl
 * @see locationtableUtil
 * @generated
 */
@ProviderType
public interface locationtablePersistence extends BasePersistence<locationtable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link locationtableUtil} to access the locationtable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the locationtable in the entity cache if it is enabled.
	*
	* @param locationtable the locationtable
	*/
	public void cacheResult(locationtable locationtable);

	/**
	* Caches the locationtables in the entity cache if it is enabled.
	*
	* @param locationtables the locationtables
	*/
	public void cacheResult(java.util.List<locationtable> locationtables);

	/**
	* Creates a new locationtable with the primary key. Does not add the locationtable to the database.
	*
	* @param loc_id the primary key for the new locationtable
	* @return the new locationtable
	*/
	public locationtable create(int loc_id);

	/**
	* Removes the locationtable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable that was removed
	* @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	*/
	public locationtable remove(int loc_id) throws NoSuchlocationtableException;

	public locationtable updateImpl(locationtable locationtable);

	/**
	* Returns the locationtable with the primary key or throws a {@link NoSuchlocationtableException} if it could not be found.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable
	* @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	*/
	public locationtable findByPrimaryKey(int loc_id)
		throws NoSuchlocationtableException;

	/**
	* Returns the locationtable with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loc_id the primary key of the locationtable
	* @return the locationtable, or <code>null</code> if a locationtable with the primary key could not be found
	*/
	public locationtable fetchByPrimaryKey(int loc_id);

	@Override
	public java.util.Map<java.io.Serializable, locationtable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the locationtables.
	*
	* @return the locationtables
	*/
	public java.util.List<locationtable> findAll();

	/**
	* Returns a range of all the locationtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locationtables
	* @param end the upper bound of the range of locationtables (not inclusive)
	* @return the range of locationtables
	*/
	public java.util.List<locationtable> findAll(int start, int end);

	/**
	* Returns an ordered range of all the locationtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locationtables
	* @param end the upper bound of the range of locationtables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of locationtables
	*/
	public java.util.List<locationtable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<locationtable> orderByComparator);

	/**
	* Returns an ordered range of all the locationtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locationtables
	* @param end the upper bound of the range of locationtables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of locationtables
	*/
	public java.util.List<locationtable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<locationtable> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the locationtables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of locationtables.
	*
	* @return the number of locationtables
	*/
	public int countAll();
}