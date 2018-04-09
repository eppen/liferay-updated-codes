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

import userapi.exception.NoSuchareahandledException;

import userapi.model.areahandled;

/**
 * The persistence interface for the areahandled service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.areahandledPersistenceImpl
 * @see areahandledUtil
 * @generated
 */
@ProviderType
public interface areahandledPersistence extends BasePersistence<areahandled> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link areahandledUtil} to access the areahandled persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the areahandled in the entity cache if it is enabled.
	*
	* @param areahandled the areahandled
	*/
	public void cacheResult(areahandled areahandled);

	/**
	* Caches the areahandleds in the entity cache if it is enabled.
	*
	* @param areahandleds the areahandleds
	*/
	public void cacheResult(java.util.List<areahandled> areahandleds);

	/**
	* Creates a new areahandled with the primary key. Does not add the areahandled to the database.
	*
	* @param area_id the primary key for the new areahandled
	* @return the new areahandled
	*/
	public areahandled create(int area_id);

	/**
	* Removes the areahandled with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled that was removed
	* @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	*/
	public areahandled remove(int area_id) throws NoSuchareahandledException;

	public areahandled updateImpl(areahandled areahandled);

	/**
	* Returns the areahandled with the primary key or throws a {@link NoSuchareahandledException} if it could not be found.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled
	* @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	*/
	public areahandled findByPrimaryKey(int area_id)
		throws NoSuchareahandledException;

	/**
	* Returns the areahandled with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param area_id the primary key of the areahandled
	* @return the areahandled, or <code>null</code> if a areahandled with the primary key could not be found
	*/
	public areahandled fetchByPrimaryKey(int area_id);

	@Override
	public java.util.Map<java.io.Serializable, areahandled> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the areahandleds.
	*
	* @return the areahandleds
	*/
	public java.util.List<areahandled> findAll();

	/**
	* Returns a range of all the areahandleds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of areahandleds
	* @param end the upper bound of the range of areahandleds (not inclusive)
	* @return the range of areahandleds
	*/
	public java.util.List<areahandled> findAll(int start, int end);

	/**
	* Returns an ordered range of all the areahandleds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of areahandleds
	* @param end the upper bound of the range of areahandleds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of areahandleds
	*/
	public java.util.List<areahandled> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<areahandled> orderByComparator);

	/**
	* Returns an ordered range of all the areahandleds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link areahandledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of areahandleds
	* @param end the upper bound of the range of areahandleds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of areahandleds
	*/
	public java.util.List<areahandled> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<areahandled> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the areahandleds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of areahandleds.
	*
	* @return the number of areahandleds
	*/
	public int countAll();
}