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

package userapi.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import userapi.exception.NoSuchzoneException;

import userapi.model.impl.zoneImpl;
import userapi.model.impl.zoneModelImpl;

import userapi.model.zone;

import userapi.service.persistence.zonePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the zone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zonePersistence
 * @see userapi.service.persistence.zoneUtil
 * @generated
 */
@ProviderType
public class zonePersistenceImpl extends BasePersistenceImpl<zone>
	implements zonePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link zoneUtil} to access the zone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = zoneImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(zoneModelImpl.ENTITY_CACHE_ENABLED,
			zoneModelImpl.FINDER_CACHE_ENABLED, zoneImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(zoneModelImpl.ENTITY_CACHE_ENABLED,
			zoneModelImpl.FINDER_CACHE_ENABLED, zoneImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(zoneModelImpl.ENTITY_CACHE_ENABLED,
			zoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public zonePersistenceImpl() {
		setModelClass(zone.class);
	}

	/**
	 * Caches the zone in the entity cache if it is enabled.
	 *
	 * @param zone the zone
	 */
	@Override
	public void cacheResult(zone zone) {
		entityCache.putResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
			zoneImpl.class, zone.getPrimaryKey(), zone);

		zone.resetOriginalValues();
	}

	/**
	 * Caches the zones in the entity cache if it is enabled.
	 *
	 * @param zones the zones
	 */
	@Override
	public void cacheResult(List<zone> zones) {
		for (zone zone : zones) {
			if (entityCache.getResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
						zoneImpl.class, zone.getPrimaryKey()) == null) {
				cacheResult(zone);
			}
			else {
				zone.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all zones.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(zoneImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the zone.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(zone zone) {
		entityCache.removeResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
			zoneImpl.class, zone.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<zone> zones) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (zone zone : zones) {
			entityCache.removeResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
				zoneImpl.class, zone.getPrimaryKey());
		}
	}

	/**
	 * Creates a new zone with the primary key. Does not add the zone to the database.
	 *
	 * @param zone_id the primary key for the new zone
	 * @return the new zone
	 */
	@Override
	public zone create(int zone_id) {
		zone zone = new zoneImpl();

		zone.setNew(true);
		zone.setPrimaryKey(zone_id);

		return zone;
	}

	/**
	 * Removes the zone with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param zone_id the primary key of the zone
	 * @return the zone that was removed
	 * @throws NoSuchzoneException if a zone with the primary key could not be found
	 */
	@Override
	public zone remove(int zone_id) throws NoSuchzoneException {
		return remove((Serializable)zone_id);
	}

	/**
	 * Removes the zone with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the zone
	 * @return the zone that was removed
	 * @throws NoSuchzoneException if a zone with the primary key could not be found
	 */
	@Override
	public zone remove(Serializable primaryKey) throws NoSuchzoneException {
		Session session = null;

		try {
			session = openSession();

			zone zone = (zone)session.get(zoneImpl.class, primaryKey);

			if (zone == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchzoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(zone);
		}
		catch (NoSuchzoneException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected zone removeImpl(zone zone) {
		zone = toUnwrappedModel(zone);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(zone)) {
				zone = (zone)session.get(zoneImpl.class, zone.getPrimaryKeyObj());
			}

			if (zone != null) {
				session.delete(zone);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (zone != null) {
			clearCache(zone);
		}

		return zone;
	}

	@Override
	public zone updateImpl(zone zone) {
		zone = toUnwrappedModel(zone);

		boolean isNew = zone.isNew();

		Session session = null;

		try {
			session = openSession();

			if (zone.isNew()) {
				session.save(zone);

				zone.setNew(false);
			}
			else {
				zone = (zone)session.merge(zone);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
			zoneImpl.class, zone.getPrimaryKey(), zone, false);

		zone.resetOriginalValues();

		return zone;
	}

	protected zone toUnwrappedModel(zone zone) {
		if (zone instanceof zoneImpl) {
			return zone;
		}

		zoneImpl zoneImpl = new zoneImpl();

		zoneImpl.setNew(zone.isNew());
		zoneImpl.setPrimaryKey(zone.getPrimaryKey());

		zoneImpl.setZone_id(zone.getZone_id());
		zoneImpl.setZone(zone.getZone());
		zoneImpl.setBusiness_id(zone.getBusiness_id());
		zoneImpl.setIsactive(zone.getIsactive());

		return zoneImpl;
	}

	/**
	 * Returns the zone with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the zone
	 * @return the zone
	 * @throws NoSuchzoneException if a zone with the primary key could not be found
	 */
	@Override
	public zone findByPrimaryKey(Serializable primaryKey)
		throws NoSuchzoneException {
		zone zone = fetchByPrimaryKey(primaryKey);

		if (zone == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchzoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return zone;
	}

	/**
	 * Returns the zone with the primary key or throws a {@link NoSuchzoneException} if it could not be found.
	 *
	 * @param zone_id the primary key of the zone
	 * @return the zone
	 * @throws NoSuchzoneException if a zone with the primary key could not be found
	 */
	@Override
	public zone findByPrimaryKey(int zone_id) throws NoSuchzoneException {
		return findByPrimaryKey((Serializable)zone_id);
	}

	/**
	 * Returns the zone with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the zone
	 * @return the zone, or <code>null</code> if a zone with the primary key could not be found
	 */
	@Override
	public zone fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
				zoneImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		zone zone = (zone)serializable;

		if (zone == null) {
			Session session = null;

			try {
				session = openSession();

				zone = (zone)session.get(zoneImpl.class, primaryKey);

				if (zone != null) {
					cacheResult(zone);
				}
				else {
					entityCache.putResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
						zoneImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
					zoneImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return zone;
	}

	/**
	 * Returns the zone with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param zone_id the primary key of the zone
	 * @return the zone, or <code>null</code> if a zone with the primary key could not be found
	 */
	@Override
	public zone fetchByPrimaryKey(int zone_id) {
		return fetchByPrimaryKey((Serializable)zone_id);
	}

	@Override
	public Map<Serializable, zone> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, zone> map = new HashMap<Serializable, zone>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			zone zone = fetchByPrimaryKey(primaryKey);

			if (zone != null) {
				map.put(primaryKey, zone);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
					zoneImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (zone)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ZONE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((int)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (zone zone : (List<zone>)q.list()) {
				map.put(zone.getPrimaryKeyObj(), zone);

				cacheResult(zone);

				uncachedPrimaryKeys.remove(zone.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(zoneModelImpl.ENTITY_CACHE_ENABLED,
					zoneImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the zones.
	 *
	 * @return the zones
	 */
	@Override
	public List<zone> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<zone> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<zone> findAll(int start, int end,
		OrderByComparator<zone> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<zone> findAll(int start, int end,
		OrderByComparator<zone> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<zone> list = null;

		if (retrieveFromCache) {
			list = (List<zone>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ZONE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ZONE;

				if (pagination) {
					sql = sql.concat(zoneModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<zone>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<zone>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the zones from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (zone zone : findAll()) {
			remove(zone);
		}
	}

	/**
	 * Returns the number of zones.
	 *
	 * @return the number of zones
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ZONE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return zoneModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the zone persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(zoneImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ZONE = "SELECT zone FROM zone zone";
	private static final String _SQL_SELECT_ZONE_WHERE_PKS_IN = "SELECT zone FROM zone zone WHERE zone_id IN (";
	private static final String _SQL_COUNT_ZONE = "SELECT COUNT(zone) FROM zone zone";
	private static final String _ORDER_BY_ENTITY_ALIAS = "zone.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No zone exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(zonePersistenceImpl.class);
}