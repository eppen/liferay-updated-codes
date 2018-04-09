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

import userapi.exception.NoSuchunitException;

import userapi.model.unit;

/**
 * The persistence interface for the unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.unitPersistenceImpl
 * @see unitUtil
 * @generated
 */
@ProviderType
public interface unitPersistence extends BasePersistence<unit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link unitUtil} to access the unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the unit in the entity cache if it is enabled.
	*
	* @param unit the unit
	*/
	public void cacheResult(unit unit);

	/**
	* Caches the units in the entity cache if it is enabled.
	*
	* @param units the units
	*/
	public void cacheResult(java.util.List<unit> units);

	/**
	* Creates a new unit with the primary key. Does not add the unit to the database.
	*
	* @param unit_id the primary key for the new unit
	* @return the new unit
	*/
	public unit create(int unit_id);

	/**
	* Removes the unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param unit_id the primary key of the unit
	* @return the unit that was removed
	* @throws NoSuchunitException if a unit with the primary key could not be found
	*/
	public unit remove(int unit_id) throws NoSuchunitException;

	public unit updateImpl(unit unit);

	/**
	* Returns the unit with the primary key or throws a {@link NoSuchunitException} if it could not be found.
	*
	* @param unit_id the primary key of the unit
	* @return the unit
	* @throws NoSuchunitException if a unit with the primary key could not be found
	*/
	public unit findByPrimaryKey(int unit_id) throws NoSuchunitException;

	/**
	* Returns the unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param unit_id the primary key of the unit
	* @return the unit, or <code>null</code> if a unit with the primary key could not be found
	*/
	public unit fetchByPrimaryKey(int unit_id);

	@Override
	public java.util.Map<java.io.Serializable, unit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the units.
	*
	* @return the units
	*/
	public java.util.List<unit> findAll();

	/**
	* Returns a range of all the units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of units
	* @param end the upper bound of the range of units (not inclusive)
	* @return the range of units
	*/
	public java.util.List<unit> findAll(int start, int end);

	/**
	* Returns an ordered range of all the units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of units
	* @param end the upper bound of the range of units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of units
	*/
	public java.util.List<unit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<unit> orderByComparator);

	/**
	* Returns an ordered range of all the units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of units
	* @param end the upper bound of the range of units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of units
	*/
	public java.util.List<unit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<unit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the units from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of units.
	*
	* @return the number of units
	*/
	public int countAll();
}