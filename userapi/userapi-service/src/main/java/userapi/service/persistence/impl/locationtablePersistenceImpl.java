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

import userapi.exception.NoSuchlocationtableException;

import userapi.model.impl.locationtableImpl;
import userapi.model.impl.locationtableModelImpl;

import userapi.model.locationtable;

import userapi.service.persistence.locationtablePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the locationtable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see locationtablePersistence
 * @see userapi.service.persistence.locationtableUtil
 * @generated
 */
@ProviderType
public class locationtablePersistenceImpl extends BasePersistenceImpl<locationtable>
	implements locationtablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link locationtableUtil} to access the locationtable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = locationtableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(locationtableModelImpl.ENTITY_CACHE_ENABLED,
			locationtableModelImpl.FINDER_CACHE_ENABLED,
			locationtableImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(locationtableModelImpl.ENTITY_CACHE_ENABLED,
			locationtableModelImpl.FINDER_CACHE_ENABLED,
			locationtableImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(locationtableModelImpl.ENTITY_CACHE_ENABLED,
			locationtableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public locationtablePersistenceImpl() {
		setModelClass(locationtable.class);
	}

	/**
	 * Caches the locationtable in the entity cache if it is enabled.
	 *
	 * @param locationtable the locationtable
	 */
	@Override
	public void cacheResult(locationtable locationtable) {
		entityCache.putResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
			locationtableImpl.class, locationtable.getPrimaryKey(),
			locationtable);

		locationtable.resetOriginalValues();
	}

	/**
	 * Caches the locationtables in the entity cache if it is enabled.
	 *
	 * @param locationtables the locationtables
	 */
	@Override
	public void cacheResult(List<locationtable> locationtables) {
		for (locationtable locationtable : locationtables) {
			if (entityCache.getResult(
						locationtableModelImpl.ENTITY_CACHE_ENABLED,
						locationtableImpl.class, locationtable.getPrimaryKey()) == null) {
				cacheResult(locationtable);
			}
			else {
				locationtable.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all locationtables.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(locationtableImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the locationtable.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(locationtable locationtable) {
		entityCache.removeResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
			locationtableImpl.class, locationtable.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<locationtable> locationtables) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (locationtable locationtable : locationtables) {
			entityCache.removeResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
				locationtableImpl.class, locationtable.getPrimaryKey());
		}
	}

	/**
	 * Creates a new locationtable with the primary key. Does not add the locationtable to the database.
	 *
	 * @param loc_id the primary key for the new locationtable
	 * @return the new locationtable
	 */
	@Override
	public locationtable create(int loc_id) {
		locationtable locationtable = new locationtableImpl();

		locationtable.setNew(true);
		locationtable.setPrimaryKey(loc_id);

		return locationtable;
	}

	/**
	 * Removes the locationtable with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loc_id the primary key of the locationtable
	 * @return the locationtable that was removed
	 * @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	 */
	@Override
	public locationtable remove(int loc_id) throws NoSuchlocationtableException {
		return remove((Serializable)loc_id);
	}

	/**
	 * Removes the locationtable with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the locationtable
	 * @return the locationtable that was removed
	 * @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	 */
	@Override
	public locationtable remove(Serializable primaryKey)
		throws NoSuchlocationtableException {
		Session session = null;

		try {
			session = openSession();

			locationtable locationtable = (locationtable)session.get(locationtableImpl.class,
					primaryKey);

			if (locationtable == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlocationtableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(locationtable);
		}
		catch (NoSuchlocationtableException nsee) {
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
	protected locationtable removeImpl(locationtable locationtable) {
		locationtable = toUnwrappedModel(locationtable);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(locationtable)) {
				locationtable = (locationtable)session.get(locationtableImpl.class,
						locationtable.getPrimaryKeyObj());
			}

			if (locationtable != null) {
				session.delete(locationtable);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (locationtable != null) {
			clearCache(locationtable);
		}

		return locationtable;
	}

	@Override
	public locationtable updateImpl(locationtable locationtable) {
		locationtable = toUnwrappedModel(locationtable);

		boolean isNew = locationtable.isNew();

		Session session = null;

		try {
			session = openSession();

			if (locationtable.isNew()) {
				session.save(locationtable);

				locationtable.setNew(false);
			}
			else {
				locationtable = (locationtable)session.merge(locationtable);
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

		entityCache.putResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
			locationtableImpl.class, locationtable.getPrimaryKey(),
			locationtable, false);

		locationtable.resetOriginalValues();

		return locationtable;
	}

	protected locationtable toUnwrappedModel(locationtable locationtable) {
		if (locationtable instanceof locationtableImpl) {
			return locationtable;
		}

		locationtableImpl locationtableImpl = new locationtableImpl();

		locationtableImpl.setNew(locationtable.isNew());
		locationtableImpl.setPrimaryKey(locationtable.getPrimaryKey());

		locationtableImpl.setLoc_id(locationtable.getLoc_id());
		locationtableImpl.setLocation(locationtable.getLocation());
		locationtableImpl.setBusiness_id(locationtable.getBusiness_id());
		locationtableImpl.setIsactive(locationtable.getIsactive());

		return locationtableImpl;
	}

	/**
	 * Returns the locationtable with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the locationtable
	 * @return the locationtable
	 * @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	 */
	@Override
	public locationtable findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlocationtableException {
		locationtable locationtable = fetchByPrimaryKey(primaryKey);

		if (locationtable == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlocationtableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return locationtable;
	}

	/**
	 * Returns the locationtable with the primary key or throws a {@link NoSuchlocationtableException} if it could not be found.
	 *
	 * @param loc_id the primary key of the locationtable
	 * @return the locationtable
	 * @throws NoSuchlocationtableException if a locationtable with the primary key could not be found
	 */
	@Override
	public locationtable findByPrimaryKey(int loc_id)
		throws NoSuchlocationtableException {
		return findByPrimaryKey((Serializable)loc_id);
	}

	/**
	 * Returns the locationtable with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the locationtable
	 * @return the locationtable, or <code>null</code> if a locationtable with the primary key could not be found
	 */
	@Override
	public locationtable fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
				locationtableImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		locationtable locationtable = (locationtable)serializable;

		if (locationtable == null) {
			Session session = null;

			try {
				session = openSession();

				locationtable = (locationtable)session.get(locationtableImpl.class,
						primaryKey);

				if (locationtable != null) {
					cacheResult(locationtable);
				}
				else {
					entityCache.putResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
						locationtableImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
					locationtableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return locationtable;
	}

	/**
	 * Returns the locationtable with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loc_id the primary key of the locationtable
	 * @return the locationtable, or <code>null</code> if a locationtable with the primary key could not be found
	 */
	@Override
	public locationtable fetchByPrimaryKey(int loc_id) {
		return fetchByPrimaryKey((Serializable)loc_id);
	}

	@Override
	public Map<Serializable, locationtable> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, locationtable> map = new HashMap<Serializable, locationtable>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			locationtable locationtable = fetchByPrimaryKey(primaryKey);

			if (locationtable != null) {
				map.put(primaryKey, locationtable);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
					locationtableImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (locationtable)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LOCATIONTABLE_WHERE_PKS_IN);

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

			for (locationtable locationtable : (List<locationtable>)q.list()) {
				map.put(locationtable.getPrimaryKeyObj(), locationtable);

				cacheResult(locationtable);

				uncachedPrimaryKeys.remove(locationtable.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(locationtableModelImpl.ENTITY_CACHE_ENABLED,
					locationtableImpl.class, primaryKey, nullModel);
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
	 * Returns all the locationtables.
	 *
	 * @return the locationtables
	 */
	@Override
	public List<locationtable> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<locationtable> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<locationtable> findAll(int start, int end,
		OrderByComparator<locationtable> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<locationtable> findAll(int start, int end,
		OrderByComparator<locationtable> orderByComparator,
		boolean retrieveFromCache) {
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

		List<locationtable> list = null;

		if (retrieveFromCache) {
			list = (List<locationtable>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LOCATIONTABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCATIONTABLE;

				if (pagination) {
					sql = sql.concat(locationtableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<locationtable>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<locationtable>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the locationtables from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (locationtable locationtable : findAll()) {
			remove(locationtable);
		}
	}

	/**
	 * Returns the number of locationtables.
	 *
	 * @return the number of locationtables
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LOCATIONTABLE);

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
		return locationtableModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the locationtable persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(locationtableImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LOCATIONTABLE = "SELECT locationtable FROM locationtable locationtable";
	private static final String _SQL_SELECT_LOCATIONTABLE_WHERE_PKS_IN = "SELECT locationtable FROM locationtable locationtable WHERE loc_id IN (";
	private static final String _SQL_COUNT_LOCATIONTABLE = "SELECT COUNT(locationtable) FROM locationtable locationtable";
	private static final String _ORDER_BY_ENTITY_ALIAS = "locationtable.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No locationtable exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(locationtablePersistenceImpl.class);
}