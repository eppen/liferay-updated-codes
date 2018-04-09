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

import userapi.exception.NoSuchregiontableException;

import userapi.model.impl.regiontableImpl;
import userapi.model.impl.regiontableModelImpl;

import userapi.model.regiontable;

import userapi.service.persistence.regiontablePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the regiontable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see regiontablePersistence
 * @see userapi.service.persistence.regiontableUtil
 * @generated
 */
@ProviderType
public class regiontablePersistenceImpl extends BasePersistenceImpl<regiontable>
	implements regiontablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link regiontableUtil} to access the regiontable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = regiontableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(regiontableModelImpl.ENTITY_CACHE_ENABLED,
			regiontableModelImpl.FINDER_CACHE_ENABLED, regiontableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(regiontableModelImpl.ENTITY_CACHE_ENABLED,
			regiontableModelImpl.FINDER_CACHE_ENABLED, regiontableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(regiontableModelImpl.ENTITY_CACHE_ENABLED,
			regiontableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public regiontablePersistenceImpl() {
		setModelClass(regiontable.class);
	}

	/**
	 * Caches the regiontable in the entity cache if it is enabled.
	 *
	 * @param regiontable the regiontable
	 */
	@Override
	public void cacheResult(regiontable regiontable) {
		entityCache.putResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
			regiontableImpl.class, regiontable.getPrimaryKey(), regiontable);

		regiontable.resetOriginalValues();
	}

	/**
	 * Caches the regiontables in the entity cache if it is enabled.
	 *
	 * @param regiontables the regiontables
	 */
	@Override
	public void cacheResult(List<regiontable> regiontables) {
		for (regiontable regiontable : regiontables) {
			if (entityCache.getResult(
						regiontableModelImpl.ENTITY_CACHE_ENABLED,
						regiontableImpl.class, regiontable.getPrimaryKey()) == null) {
				cacheResult(regiontable);
			}
			else {
				regiontable.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all regiontables.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(regiontableImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the regiontable.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(regiontable regiontable) {
		entityCache.removeResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
			regiontableImpl.class, regiontable.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<regiontable> regiontables) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (regiontable regiontable : regiontables) {
			entityCache.removeResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
				regiontableImpl.class, regiontable.getPrimaryKey());
		}
	}

	/**
	 * Creates a new regiontable with the primary key. Does not add the regiontable to the database.
	 *
	 * @param region_id the primary key for the new regiontable
	 * @return the new regiontable
	 */
	@Override
	public regiontable create(int region_id) {
		regiontable regiontable = new regiontableImpl();

		regiontable.setNew(true);
		regiontable.setPrimaryKey(region_id);

		return regiontable;
	}

	/**
	 * Removes the regiontable with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param region_id the primary key of the regiontable
	 * @return the regiontable that was removed
	 * @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	 */
	@Override
	public regiontable remove(int region_id) throws NoSuchregiontableException {
		return remove((Serializable)region_id);
	}

	/**
	 * Removes the regiontable with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the regiontable
	 * @return the regiontable that was removed
	 * @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	 */
	@Override
	public regiontable remove(Serializable primaryKey)
		throws NoSuchregiontableException {
		Session session = null;

		try {
			session = openSession();

			regiontable regiontable = (regiontable)session.get(regiontableImpl.class,
					primaryKey);

			if (regiontable == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchregiontableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(regiontable);
		}
		catch (NoSuchregiontableException nsee) {
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
	protected regiontable removeImpl(regiontable regiontable) {
		regiontable = toUnwrappedModel(regiontable);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(regiontable)) {
				regiontable = (regiontable)session.get(regiontableImpl.class,
						regiontable.getPrimaryKeyObj());
			}

			if (regiontable != null) {
				session.delete(regiontable);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (regiontable != null) {
			clearCache(regiontable);
		}

		return regiontable;
	}

	@Override
	public regiontable updateImpl(regiontable regiontable) {
		regiontable = toUnwrappedModel(regiontable);

		boolean isNew = regiontable.isNew();

		Session session = null;

		try {
			session = openSession();

			if (regiontable.isNew()) {
				session.save(regiontable);

				regiontable.setNew(false);
			}
			else {
				regiontable = (regiontable)session.merge(regiontable);
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

		entityCache.putResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
			regiontableImpl.class, regiontable.getPrimaryKey(), regiontable,
			false);

		regiontable.resetOriginalValues();

		return regiontable;
	}

	protected regiontable toUnwrappedModel(regiontable regiontable) {
		if (regiontable instanceof regiontableImpl) {
			return regiontable;
		}

		regiontableImpl regiontableImpl = new regiontableImpl();

		regiontableImpl.setNew(regiontable.isNew());
		regiontableImpl.setPrimaryKey(regiontable.getPrimaryKey());

		regiontableImpl.setRegion_id(regiontable.getRegion_id());
		regiontableImpl.setRegion(regiontable.getRegion());
		regiontableImpl.setBusiness_id(regiontable.getBusiness_id());
		regiontableImpl.setIsactive(regiontable.getIsactive());

		return regiontableImpl;
	}

	/**
	 * Returns the regiontable with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the regiontable
	 * @return the regiontable
	 * @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	 */
	@Override
	public regiontable findByPrimaryKey(Serializable primaryKey)
		throws NoSuchregiontableException {
		regiontable regiontable = fetchByPrimaryKey(primaryKey);

		if (regiontable == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchregiontableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return regiontable;
	}

	/**
	 * Returns the regiontable with the primary key or throws a {@link NoSuchregiontableException} if it could not be found.
	 *
	 * @param region_id the primary key of the regiontable
	 * @return the regiontable
	 * @throws NoSuchregiontableException if a regiontable with the primary key could not be found
	 */
	@Override
	public regiontable findByPrimaryKey(int region_id)
		throws NoSuchregiontableException {
		return findByPrimaryKey((Serializable)region_id);
	}

	/**
	 * Returns the regiontable with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the regiontable
	 * @return the regiontable, or <code>null</code> if a regiontable with the primary key could not be found
	 */
	@Override
	public regiontable fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
				regiontableImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		regiontable regiontable = (regiontable)serializable;

		if (regiontable == null) {
			Session session = null;

			try {
				session = openSession();

				regiontable = (regiontable)session.get(regiontableImpl.class,
						primaryKey);

				if (regiontable != null) {
					cacheResult(regiontable);
				}
				else {
					entityCache.putResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
						regiontableImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
					regiontableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return regiontable;
	}

	/**
	 * Returns the regiontable with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param region_id the primary key of the regiontable
	 * @return the regiontable, or <code>null</code> if a regiontable with the primary key could not be found
	 */
	@Override
	public regiontable fetchByPrimaryKey(int region_id) {
		return fetchByPrimaryKey((Serializable)region_id);
	}

	@Override
	public Map<Serializable, regiontable> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, regiontable> map = new HashMap<Serializable, regiontable>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			regiontable regiontable = fetchByPrimaryKey(primaryKey);

			if (regiontable != null) {
				map.put(primaryKey, regiontable);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
					regiontableImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (regiontable)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_REGIONTABLE_WHERE_PKS_IN);

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

			for (regiontable regiontable : (List<regiontable>)q.list()) {
				map.put(regiontable.getPrimaryKeyObj(), regiontable);

				cacheResult(regiontable);

				uncachedPrimaryKeys.remove(regiontable.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(regiontableModelImpl.ENTITY_CACHE_ENABLED,
					regiontableImpl.class, primaryKey, nullModel);
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
	 * Returns all the regiontables.
	 *
	 * @return the regiontables
	 */
	@Override
	public List<regiontable> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<regiontable> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<regiontable> findAll(int start, int end,
		OrderByComparator<regiontable> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<regiontable> findAll(int start, int end,
		OrderByComparator<regiontable> orderByComparator,
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

		List<regiontable> list = null;

		if (retrieveFromCache) {
			list = (List<regiontable>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REGIONTABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGIONTABLE;

				if (pagination) {
					sql = sql.concat(regiontableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<regiontable>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<regiontable>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the regiontables from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (regiontable regiontable : findAll()) {
			remove(regiontable);
		}
	}

	/**
	 * Returns the number of regiontables.
	 *
	 * @return the number of regiontables
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REGIONTABLE);

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
		return regiontableModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the regiontable persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(regiontableImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_REGIONTABLE = "SELECT regiontable FROM regiontable regiontable";
	private static final String _SQL_SELECT_REGIONTABLE_WHERE_PKS_IN = "SELECT regiontable FROM regiontable regiontable WHERE region_id IN (";
	private static final String _SQL_COUNT_REGIONTABLE = "SELECT COUNT(regiontable) FROM regiontable regiontable";
	private static final String _ORDER_BY_ENTITY_ALIAS = "regiontable.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No regiontable exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(regiontablePersistenceImpl.class);
}