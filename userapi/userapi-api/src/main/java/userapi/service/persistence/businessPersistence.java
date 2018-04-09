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

import userapi.exception.NoSuchbusinessException;

import userapi.model.business;

/**
 * The persistence interface for the business service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.businessPersistenceImpl
 * @see businessUtil
 * @generated
 */
@ProviderType
public interface businessPersistence extends BasePersistence<business> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businessUtil} to access the business persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the business in the entity cache if it is enabled.
	*
	* @param business the business
	*/
	public void cacheResult(business business);

	/**
	* Caches the businesses in the entity cache if it is enabled.
	*
	* @param businesses the businesses
	*/
	public void cacheResult(java.util.List<business> businesses);

	/**
	* Creates a new business with the primary key. Does not add the business to the database.
	*
	* @param business_id the primary key for the new business
	* @return the new business
	*/
	public business create(int business_id);

	/**
	* Removes the business with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param business_id the primary key of the business
	* @return the business that was removed
	* @throws NoSuchbusinessException if a business with the primary key could not be found
	*/
	public business remove(int business_id) throws NoSuchbusinessException;

	public business updateImpl(business business);

	/**
	* Returns the business with the primary key or throws a {@link NoSuchbusinessException} if it could not be found.
	*
	* @param business_id the primary key of the business
	* @return the business
	* @throws NoSuchbusinessException if a business with the primary key could not be found
	*/
	public business findByPrimaryKey(int business_id)
		throws NoSuchbusinessException;

	/**
	* Returns the business with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param business_id the primary key of the business
	* @return the business, or <code>null</code> if a business with the primary key could not be found
	*/
	public business fetchByPrimaryKey(int business_id);

	@Override
	public java.util.Map<java.io.Serializable, business> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the businesses.
	*
	* @return the businesses
	*/
	public java.util.List<business> findAll();

	/**
	* Returns a range of all the businesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @return the range of businesses
	*/
	public java.util.List<business> findAll(int start, int end);

	/**
	* Returns an ordered range of all the businesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesses
	*/
	public java.util.List<business> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<business> orderByComparator);

	/**
	* Returns an ordered range of all the businesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesses
	* @param end the upper bound of the range of businesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesses
	*/
	public java.util.List<business> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<business> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the businesses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of businesses.
	*
	* @return the number of businesses
	*/
	public int countAll();
}