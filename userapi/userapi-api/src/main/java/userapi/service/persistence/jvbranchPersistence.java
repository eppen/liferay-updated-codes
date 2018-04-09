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

import userapi.exception.NoSuchjvbranchException;

import userapi.model.jvbranch;

/**
 * The persistence interface for the jvbranch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.jvbranchPersistenceImpl
 * @see jvbranchUtil
 * @generated
 */
@ProviderType
public interface jvbranchPersistence extends BasePersistence<jvbranch> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link jvbranchUtil} to access the jvbranch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the jvbranch in the entity cache if it is enabled.
	*
	* @param jvbranch the jvbranch
	*/
	public void cacheResult(jvbranch jvbranch);

	/**
	* Caches the jvbranchs in the entity cache if it is enabled.
	*
	* @param jvbranchs the jvbranchs
	*/
	public void cacheResult(java.util.List<jvbranch> jvbranchs);

	/**
	* Creates a new jvbranch with the primary key. Does not add the jvbranch to the database.
	*
	* @param jvbranch_id the primary key for the new jvbranch
	* @return the new jvbranch
	*/
	public jvbranch create(int jvbranch_id);

	/**
	* Removes the jvbranch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch that was removed
	* @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	*/
	public jvbranch remove(int jvbranch_id) throws NoSuchjvbranchException;

	public jvbranch updateImpl(jvbranch jvbranch);

	/**
	* Returns the jvbranch with the primary key or throws a {@link NoSuchjvbranchException} if it could not be found.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch
	* @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	*/
	public jvbranch findByPrimaryKey(int jvbranch_id)
		throws NoSuchjvbranchException;

	/**
	* Returns the jvbranch with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jvbranch_id the primary key of the jvbranch
	* @return the jvbranch, or <code>null</code> if a jvbranch with the primary key could not be found
	*/
	public jvbranch fetchByPrimaryKey(int jvbranch_id);

	@Override
	public java.util.Map<java.io.Serializable, jvbranch> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the jvbranchs.
	*
	* @return the jvbranchs
	*/
	public java.util.List<jvbranch> findAll();

	/**
	* Returns a range of all the jvbranchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jvbranchs
	* @param end the upper bound of the range of jvbranchs (not inclusive)
	* @return the range of jvbranchs
	*/
	public java.util.List<jvbranch> findAll(int start, int end);

	/**
	* Returns an ordered range of all the jvbranchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jvbranchs
	* @param end the upper bound of the range of jvbranchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jvbranchs
	*/
	public java.util.List<jvbranch> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<jvbranch> orderByComparator);

	/**
	* Returns an ordered range of all the jvbranchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link jvbranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jvbranchs
	* @param end the upper bound of the range of jvbranchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of jvbranchs
	*/
	public java.util.List<jvbranch> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<jvbranch> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the jvbranchs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of jvbranchs.
	*
	* @return the number of jvbranchs
	*/
	public int countAll();
}