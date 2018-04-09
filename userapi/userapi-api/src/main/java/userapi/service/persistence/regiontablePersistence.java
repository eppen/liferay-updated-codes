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

import userapi.exception.NoSuchregiontableException;

import userapi.model.regiontable;

/**
 * The persistence interface for the regiontable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.regiontablePersistenceImpl
 * @see regiontableUtil
 * @generated
 */
@ProviderType
public interface regiontablePersistence extends BasePersistence<regiontable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link regiontableUtil} to access the regiontable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the regiontable in the entity cache if it is enabled.
	*
	* @param regiontable the regiontable
	*/
	public void cacheResult(regiontable regiontable);

	/**
	* Caches the regiontables in the entity cache if it is enabled.
	*
	* @param regiontables the regiontables
	*/
	public void cacheResult(java.util.List<regiontable> regiontables);

	/**
	* Creates a new regiontable with the primary key. Does not add the regiontable to the database.
	*
	* @param region_id the primary key for the new regiontable
	* @return the new regiontable
	*/
	public regiontable create(int region_id);

	/**
	* Removes the regiontable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable that was removed
	* @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	*/
	public regiontable remove(int region_id) throws NoSuchregiontableException;

	public regiontable updateImpl(regiontable regiontable);

	/**
	* Returns the regiontable with the primary key or throws a {@link NoSuchregiontableException} if it could not be found.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable
	* @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	*/
	public regiontable findByPrimaryKey(int region_id)
		throws NoSuchregiontableException;

	/**
	* Returns the regiontable with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param region_id the primary key of the regiontable
	* @return the regiontable, or <code>null</code> if a regiontable with the primary key could not be found
	*/
	public regiontable fetchByPrimaryKey(int region_id);

	@Override
	public java.util.Map<java.io.Serializable, regiontable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the regiontables.
	*
	* @return the regiontables
	*/
	public java.util.List<regiontable> findAll();

	/**
	* Returns a range of all the regiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regiontables
	* @param end the upper bound of the range of regiontables (not inclusive)
	* @return the range of regiontables
	*/
	public java.util.List<regiontable> findAll(int start, int end);

	/**
	* Returns an ordered range of all the regiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regiontables
	* @param end the upper bound of the range of regiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of regiontables
	*/
	public java.util.List<regiontable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<regiontable> orderByComparator);

	/**
	* Returns an ordered range of all the regiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link regiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regiontables
	* @param end the upper bound of the range of regiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of regiontables
	*/
	public java.util.List<regiontable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<regiontable> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the regiontables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of regiontables.
	*
	* @return the number of regiontables
	*/
	public int countAll();
}