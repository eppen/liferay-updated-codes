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

import userapi.exception.NoSuchfunctiontableException;

import userapi.model.functiontable;

/**
 * The persistence interface for the functiontable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.functiontablePersistenceImpl
 * @see functiontableUtil
 * @generated
 */
@ProviderType
public interface functiontablePersistence extends BasePersistence<functiontable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link functiontableUtil} to access the functiontable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the functiontable in the entity cache if it is enabled.
	*
	* @param functiontable the functiontable
	*/
	public void cacheResult(functiontable functiontable);

	/**
	* Caches the functiontables in the entity cache if it is enabled.
	*
	* @param functiontables the functiontables
	*/
	public void cacheResult(java.util.List<functiontable> functiontables);

	/**
	* Creates a new functiontable with the primary key. Does not add the functiontable to the database.
	*
	* @param function_id the primary key for the new functiontable
	* @return the new functiontable
	*/
	public functiontable create(int function_id);

	/**
	* Removes the functiontable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable that was removed
	* @throws NoSuchfunctiontableException if a functiontable with the primary key could not be found
	*/
	public functiontable remove(int function_id)
		throws NoSuchfunctiontableException;

	public functiontable updateImpl(functiontable functiontable);

	/**
	* Returns the functiontable with the primary key or throws a {@link NoSuchfunctiontableException} if it could not be found.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable
	* @throws NoSuchfunctiontableException if a functiontable with the primary key could not be found
	*/
	public functiontable findByPrimaryKey(int function_id)
		throws NoSuchfunctiontableException;

	/**
	* Returns the functiontable with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param function_id the primary key of the functiontable
	* @return the functiontable, or <code>null</code> if a functiontable with the primary key could not be found
	*/
	public functiontable fetchByPrimaryKey(int function_id);

	@Override
	public java.util.Map<java.io.Serializable, functiontable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the functiontables.
	*
	* @return the functiontables
	*/
	public java.util.List<functiontable> findAll();

	/**
	* Returns a range of all the functiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of functiontables
	* @param end the upper bound of the range of functiontables (not inclusive)
	* @return the range of functiontables
	*/
	public java.util.List<functiontable> findAll(int start, int end);

	/**
	* Returns an ordered range of all the functiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of functiontables
	* @param end the upper bound of the range of functiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of functiontables
	*/
	public java.util.List<functiontable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<functiontable> orderByComparator);

	/**
	* Returns an ordered range of all the functiontables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link functiontableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of functiontables
	* @param end the upper bound of the range of functiontables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of functiontables
	*/
	public java.util.List<functiontable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<functiontable> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the functiontables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of functiontables.
	*
	* @return the number of functiontables
	*/
	public int countAll();
}