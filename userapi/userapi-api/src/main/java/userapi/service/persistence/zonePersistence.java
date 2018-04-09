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

import userapi.exception.NoSuchzoneException;

import userapi.model.zone;

/**
 * The persistence interface for the zone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see userapi.service.persistence.impl.zonePersistenceImpl
 * @see zoneUtil
 * @generated
 */
@ProviderType
public interface zonePersistence extends BasePersistence<zone> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link zoneUtil} to access the zone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the zone in the entity cache if it is enabled.
	*
	* @param zone the zone
	*/
	public void cacheResult(zone zone);

	/**
	* Caches the zones in the entity cache if it is enabled.
	*
	* @param zones the zones
	*/
	public void cacheResult(java.util.List<zone> zones);

	/**
	* Creates a new zone with the primary key. Does not add the zone to the database.
	*
	* @param zone_id the primary key for the new zone
	* @return the new zone
	*/
	public zone create(int zone_id);

	/**
	* Removes the zone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zone_id the primary key of the zone
	* @return the zone that was removed
	* @throws NoSuchzoneException if a zone with the primary key could not be found
	*/
	public zone remove(int zone_id) throws NoSuchzoneException;

	public zone updateImpl(zone zone);

	/**
	* Returns the zone with the primary key or throws a {@link NoSuchzoneException} if it could not be found.
	*
	* @param zone_id the primary key of the zone
	* @return the zone
	* @throws NoSuchzoneException if a zone with the primary key could not be found
	*/
	public zone findByPrimaryKey(int zone_id) throws NoSuchzoneException;

	/**
	* Returns the zone with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param zone_id the primary key of the zone
	* @return the zone, or <code>null</code> if a zone with the primary key could not be found
	*/
	public zone fetchByPrimaryKey(int zone_id);

	@Override
	public java.util.Map<java.io.Serializable, zone> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the zones.
	*
	* @return the zones
	*/
	public java.util.List<zone> findAll();

	/**
	* Returns a range of all the zones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zones
	* @param end the upper bound of the range of zones (not inclusive)
	* @return the range of zones
	*/
	public java.util.List<zone> findAll(int start, int end);

	/**
	* Returns an ordered range of all the zones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zones
	* @param end the upper bound of the range of zones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of zones
	*/
	public java.util.List<zone> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<zone> orderByComparator);

	/**
	* Returns an ordered range of all the zones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zones
	* @param end the upper bound of the range of zones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of zones
	*/
	public java.util.List<zone> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<zone> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the zones from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of zones.
	*
	* @return the number of zones
	*/
	public int countAll();
}