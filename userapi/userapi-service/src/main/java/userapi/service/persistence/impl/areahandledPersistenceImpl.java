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

import userapi.exception.NoSuchareahandledException;

import userapi.model.areahandled;

import userapi.model.impl.areahandledImpl;
import userapi.model.impl.areahandledModelImpl;

import userapi.service.persistence.areahandledPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the areahandled service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see areahandledPersistence
 * @see userapi.service.persistence.areahandledUtil
 * @generated
 */
@ProviderType
public class areahandledPersistenceImpl extends BasePersistenceImpl<areahandled>
	implements areahandledPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link areahandledUtil} to access the areahandled persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = areahandledImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(areahandledModelImpl.ENTITY_CACHE_ENABLED,
			areahandledModelImpl.FINDER_CACHE_ENABLED, areahandledImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(areahandledModelImpl.ENTITY_CACHE_ENABLED,
			areahandledModelImpl.FINDER_CACHE_ENABLED, areahandledImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(areahandledModelImpl.ENTITY_CACHE_ENABLED,
			areahandledModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public areahandledPersistenceImpl() {
		setModelClass(areahandled.class);
	}

	/**
	 * Caches the areahandled in the entity cache if it is enabled.
	 *
	 * @param areahandled the areahandled
	 */
	@Override
	public void cacheResult(areahandled areahandled) {
		entityCache.putResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
			areahandledImpl.class, areahandled.getPrimaryKey(), areahandled);

		areahandled.resetOriginalValues();
	}

	/**
	 * Caches the areahandleds in the entity cache if it is enabled.
	 *
	 * @param areahandleds the areahandleds
	 */
	@Override
	public void cacheResult(List<areahandled> areahandleds) {
		for (areahandled areahandled : areahandleds) {
			if (entityCache.getResult(
						areahandledModelImpl.ENTITY_CACHE_ENABLED,
						areahandledImpl.class, areahandled.getPrimaryKey()) == null) {
				cacheResult(areahandled);
			}
			else {
				areahandled.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all areahandleds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(areahandledImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the areahandled.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(areahandled areahandled) {
		entityCache.removeResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
			areahandledImpl.class, areahandled.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<areahandled> areahandleds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (areahandled areahandled : areahandleds) {
			entityCache.removeResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
				areahandledImpl.class, areahandled.getPrimaryKey());
		}
	}

	/**
	 * Creates a new areahandled with the primary key. Does not add the areahandled to the database.
	 *
	 * @param area_id the primary key for the new areahandled
	 * @return the new areahandled
	 */
	@Override
	public areahandled create(int area_id) {
		areahandled areahandled = new areahandledImpl();

		areahandled.setNew(true);
		areahandled.setPrimaryKey(area_id);

		return areahandled;
	}

	/**
	 * Removes the areahandled with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param area_id the primary key of the areahandled
	 * @return the areahandled that was removed
	 * @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	 */
	@Override
	public areahandled remove(int area_id) throws NoSuchareahandledException {
		return remove((Serializable)area_id);
	}

	/**
	 * Removes the areahandled with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the areahandled
	 * @return the areahandled that was removed
	 * @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	 */
	@Override
	public areahandled remove(Serializable primaryKey)
		throws NoSuchareahandledException {
		Session session = null;

		try {
			session = openSession();

			areahandled areahandled = (areahandled)session.get(areahandledImpl.class,
					primaryKey);

			if (areahandled == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchareahandledException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(areahandled);
		}
		catch (NoSuchareahandledException nsee) {
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
	protected areahandled removeImpl(areahandled areahandled) {
		areahandled = toUnwrappedModel(areahandled);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(areahandled)) {
				areahandled = (areahandled)session.get(areahandledImpl.class,
						areahandled.getPrimaryKeyObj());
			}

			if (areahandled != null) {
				session.delete(areahandled);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (areahandled != null) {
			clearCache(areahandled);
		}

		return areahandled;
	}

	@Override
	public areahandled updateImpl(areahandled areahandled) {
		areahandled = toUnwrappedModel(areahandled);

		boolean isNew = areahandled.isNew();

		Session session = null;

		try {
			session = openSession();

			if (areahandled.isNew()) {
				session.save(areahandled);

				areahandled.setNew(false);
			}
			else {
				areahandled = (areahandled)session.merge(areahandled);
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

		entityCache.putResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
			areahandledImpl.class, areahandled.getPrimaryKey(), areahandled,
			false);

		areahandled.resetOriginalValues();

		return areahandled;
	}

	protected areahandled toUnwrappedModel(areahandled areahandled) {
		if (areahandled instanceof areahandledImpl) {
			return areahandled;
		}

		areahandledImpl areahandledImpl = new areahandledImpl();

		areahandledImpl.setNew(areahandled.isNew());
		areahandledImpl.setPrimaryKey(areahandled.getPrimaryKey());

		areahandledImpl.setArea_id(areahandled.getArea_id());
		areahandledImpl.setArea(areahandled.getArea());
		areahandledImpl.setBusiness_id(areahandled.getBusiness_id());
		areahandledImpl.setIsactive(areahandled.getIsactive());

		return areahandledImpl;
	}

	/**
	 * Returns the areahandled with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the areahandled
	 * @return the areahandled
	 * @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	 */
	@Override
	public areahandled findByPrimaryKey(Serializable primaryKey)
		throws NoSuchareahandledException {
		areahandled areahandled = fetchByPrimaryKey(primaryKey);

		if (areahandled == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchareahandledException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return areahandled;
	}

	/**
	 * Returns the areahandled with the primary key or throws a {@link NoSuchareahandledException} if it could not be found.
	 *
	 * @param area_id the primary key of the areahandled
	 * @return the areahandled
	 * @throws NoSuchareahandledException if a areahandled with the primary key could not be found
	 */
	@Override
	public areahandled findByPrimaryKey(int area_id)
		throws NoSuchareahandledException {
		return findByPrimaryKey((Serializable)area_id);
	}

	/**
	 * Returns the areahandled with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the areahandled
	 * @return the areahandled, or <code>null</code> if a areahandled with the primary key could not be found
	 */
	@Override
	public areahandled fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
				areahandledImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		areahandled areahandled = (areahandled)serializable;

		if (areahandled == null) {
			Session session = null;

			try {
				session = openSession();

				areahandled = (areahandled)session.get(areahandledImpl.class,
						primaryKey);

				if (areahandled != null) {
					cacheResult(areahandled);
				}
				else {
					entityCache.putResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
						areahandledImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
					areahandledImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return areahandled;
	}

	/**
	 * Returns the areahandled with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param area_id the primary key of the areahandled
	 * @return the areahandled, or <code>null</code> if a areahandled with the primary key could not be found
	 */
	@Override
	public areahandled fetchByPrimaryKey(int area_id) {
		return fetchByPrimaryKey((Serializable)area_id);
	}

	@Override
	public Map<Serializable, areahandled> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, areahandled> map = new HashMap<Serializable, areahandled>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			areahandled areahandled = fetchByPrimaryKey(primaryKey);

			if (areahandled != null) {
				map.put(primaryKey, areahandled);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
					areahandledImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (areahandled)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_AREAHANDLED_WHERE_PKS_IN);

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

			for (areahandled areahandled : (List<areahandled>)q.list()) {
				map.put(areahandled.getPrimaryKeyObj(), areahandled);

				cacheResult(areahandled);

				uncachedPrimaryKeys.remove(areahandled.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(areahandledModelImpl.ENTITY_CACHE_ENABLED,
					areahandledImpl.class, primaryKey, nullModel);
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
	 * Returns all the areahandleds.
	 *
	 * @return the areahandleds
	 */
	@Override
	public List<areahandled> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<areahandled> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<areahandled> findAll(int start, int end,
		OrderByComparator<areahandled> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<areahandled> findAll(int start, int end,
		OrderByComparator<areahandled> orderByComparator,
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

		List<areahandled> list = null;

		if (retrieveFromCache) {
			list = (List<areahandled>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_AREAHANDLED);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AREAHANDLED;

				if (pagination) {
					sql = sql.concat(areahandledModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<areahandled>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<areahandled>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the areahandleds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (areahandled areahandled : findAll()) {
			remove(areahandled);
		}
	}

	/**
	 * Returns the number of areahandleds.
	 *
	 * @return the number of areahandleds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AREAHANDLED);

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
		return areahandledModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the areahandled persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(areahandledImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_AREAHANDLED = "SELECT areahandled FROM areahandled areahandled";
	private static final String _SQL_SELECT_AREAHANDLED_WHERE_PKS_IN = "SELECT areahandled FROM areahandled areahandled WHERE area_id IN (";
	private static final String _SQL_COUNT_AREAHANDLED = "SELECT COUNT(areahandled) FROM areahandled areahandled";
	private static final String _ORDER_BY_ENTITY_ALIAS = "areahandled.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No areahandled exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(areahandledPersistenceImpl.class);
}