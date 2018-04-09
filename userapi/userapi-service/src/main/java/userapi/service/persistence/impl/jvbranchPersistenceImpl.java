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

import userapi.exception.NoSuchjvbranchException;

import userapi.model.impl.jvbranchImpl;
import userapi.model.impl.jvbranchModelImpl;

import userapi.model.jvbranch;

import userapi.service.persistence.jvbranchPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the jvbranch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see jvbranchPersistence
 * @see userapi.service.persistence.jvbranchUtil
 * @generated
 */
@ProviderType
public class jvbranchPersistenceImpl extends BasePersistenceImpl<jvbranch>
	implements jvbranchPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link jvbranchUtil} to access the jvbranch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = jvbranchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
			jvbranchModelImpl.FINDER_CACHE_ENABLED, jvbranchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
			jvbranchModelImpl.FINDER_CACHE_ENABLED, jvbranchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
			jvbranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public jvbranchPersistenceImpl() {
		setModelClass(jvbranch.class);
	}

	/**
	 * Caches the jvbranch in the entity cache if it is enabled.
	 *
	 * @param jvbranch the jvbranch
	 */
	@Override
	public void cacheResult(jvbranch jvbranch) {
		entityCache.putResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
			jvbranchImpl.class, jvbranch.getPrimaryKey(), jvbranch);

		jvbranch.resetOriginalValues();
	}

	/**
	 * Caches the jvbranchs in the entity cache if it is enabled.
	 *
	 * @param jvbranchs the jvbranchs
	 */
	@Override
	public void cacheResult(List<jvbranch> jvbranchs) {
		for (jvbranch jvbranch : jvbranchs) {
			if (entityCache.getResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
						jvbranchImpl.class, jvbranch.getPrimaryKey()) == null) {
				cacheResult(jvbranch);
			}
			else {
				jvbranch.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all jvbranchs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(jvbranchImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the jvbranch.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(jvbranch jvbranch) {
		entityCache.removeResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
			jvbranchImpl.class, jvbranch.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<jvbranch> jvbranchs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (jvbranch jvbranch : jvbranchs) {
			entityCache.removeResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
				jvbranchImpl.class, jvbranch.getPrimaryKey());
		}
	}

	/**
	 * Creates a new jvbranch with the primary key. Does not add the jvbranch to the database.
	 *
	 * @param jvbranch_id the primary key for the new jvbranch
	 * @return the new jvbranch
	 */
	@Override
	public jvbranch create(int jvbranch_id) {
		jvbranch jvbranch = new jvbranchImpl();

		jvbranch.setNew(true);
		jvbranch.setPrimaryKey(jvbranch_id);

		return jvbranch;
	}

	/**
	 * Removes the jvbranch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jvbranch_id the primary key of the jvbranch
	 * @return the jvbranch that was removed
	 * @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	 */
	@Override
	public jvbranch remove(int jvbranch_id) throws NoSuchjvbranchException {
		return remove((Serializable)jvbranch_id);
	}

	/**
	 * Removes the jvbranch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jvbranch
	 * @return the jvbranch that was removed
	 * @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	 */
	@Override
	public jvbranch remove(Serializable primaryKey)
		throws NoSuchjvbranchException {
		Session session = null;

		try {
			session = openSession();

			jvbranch jvbranch = (jvbranch)session.get(jvbranchImpl.class,
					primaryKey);

			if (jvbranch == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchjvbranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jvbranch);
		}
		catch (NoSuchjvbranchException nsee) {
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
	protected jvbranch removeImpl(jvbranch jvbranch) {
		jvbranch = toUnwrappedModel(jvbranch);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jvbranch)) {
				jvbranch = (jvbranch)session.get(jvbranchImpl.class,
						jvbranch.getPrimaryKeyObj());
			}

			if (jvbranch != null) {
				session.delete(jvbranch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jvbranch != null) {
			clearCache(jvbranch);
		}

		return jvbranch;
	}

	@Override
	public jvbranch updateImpl(jvbranch jvbranch) {
		jvbranch = toUnwrappedModel(jvbranch);

		boolean isNew = jvbranch.isNew();

		Session session = null;

		try {
			session = openSession();

			if (jvbranch.isNew()) {
				session.save(jvbranch);

				jvbranch.setNew(false);
			}
			else {
				jvbranch = (jvbranch)session.merge(jvbranch);
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

		entityCache.putResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
			jvbranchImpl.class, jvbranch.getPrimaryKey(), jvbranch, false);

		jvbranch.resetOriginalValues();

		return jvbranch;
	}

	protected jvbranch toUnwrappedModel(jvbranch jvbranch) {
		if (jvbranch instanceof jvbranchImpl) {
			return jvbranch;
		}

		jvbranchImpl jvbranchImpl = new jvbranchImpl();

		jvbranchImpl.setNew(jvbranch.isNew());
		jvbranchImpl.setPrimaryKey(jvbranch.getPrimaryKey());

		jvbranchImpl.setJvbranch_id(jvbranch.getJvbranch_id());
		jvbranchImpl.setJvbranch(jvbranch.getJvbranch());
		jvbranchImpl.setBusiness_id(jvbranch.getBusiness_id());
		jvbranchImpl.setIsactive(jvbranch.getIsactive());

		return jvbranchImpl;
	}

	/**
	 * Returns the jvbranch with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the jvbranch
	 * @return the jvbranch
	 * @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	 */
	@Override
	public jvbranch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchjvbranchException {
		jvbranch jvbranch = fetchByPrimaryKey(primaryKey);

		if (jvbranch == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchjvbranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jvbranch;
	}

	/**
	 * Returns the jvbranch with the primary key or throws a {@link NoSuchjvbranchException} if it could not be found.
	 *
	 * @param jvbranch_id the primary key of the jvbranch
	 * @return the jvbranch
	 * @throws NoSuchjvbranchException if a jvbranch with the primary key could not be found
	 */
	@Override
	public jvbranch findByPrimaryKey(int jvbranch_id)
		throws NoSuchjvbranchException {
		return findByPrimaryKey((Serializable)jvbranch_id);
	}

	/**
	 * Returns the jvbranch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jvbranch
	 * @return the jvbranch, or <code>null</code> if a jvbranch with the primary key could not be found
	 */
	@Override
	public jvbranch fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
				jvbranchImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		jvbranch jvbranch = (jvbranch)serializable;

		if (jvbranch == null) {
			Session session = null;

			try {
				session = openSession();

				jvbranch = (jvbranch)session.get(jvbranchImpl.class, primaryKey);

				if (jvbranch != null) {
					cacheResult(jvbranch);
				}
				else {
					entityCache.putResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
						jvbranchImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
					jvbranchImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jvbranch;
	}

	/**
	 * Returns the jvbranch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jvbranch_id the primary key of the jvbranch
	 * @return the jvbranch, or <code>null</code> if a jvbranch with the primary key could not be found
	 */
	@Override
	public jvbranch fetchByPrimaryKey(int jvbranch_id) {
		return fetchByPrimaryKey((Serializable)jvbranch_id);
	}

	@Override
	public Map<Serializable, jvbranch> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, jvbranch> map = new HashMap<Serializable, jvbranch>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			jvbranch jvbranch = fetchByPrimaryKey(primaryKey);

			if (jvbranch != null) {
				map.put(primaryKey, jvbranch);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
					jvbranchImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (jvbranch)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_JVBRANCH_WHERE_PKS_IN);

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

			for (jvbranch jvbranch : (List<jvbranch>)q.list()) {
				map.put(jvbranch.getPrimaryKeyObj(), jvbranch);

				cacheResult(jvbranch);

				uncachedPrimaryKeys.remove(jvbranch.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(jvbranchModelImpl.ENTITY_CACHE_ENABLED,
					jvbranchImpl.class, primaryKey, nullModel);
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
	 * Returns all the jvbranchs.
	 *
	 * @return the jvbranchs
	 */
	@Override
	public List<jvbranch> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<jvbranch> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<jvbranch> findAll(int start, int end,
		OrderByComparator<jvbranch> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<jvbranch> findAll(int start, int end,
		OrderByComparator<jvbranch> orderByComparator, boolean retrieveFromCache) {
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

		List<jvbranch> list = null;

		if (retrieveFromCache) {
			list = (List<jvbranch>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_JVBRANCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JVBRANCH;

				if (pagination) {
					sql = sql.concat(jvbranchModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<jvbranch>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<jvbranch>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the jvbranchs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (jvbranch jvbranch : findAll()) {
			remove(jvbranch);
		}
	}

	/**
	 * Returns the number of jvbranchs.
	 *
	 * @return the number of jvbranchs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JVBRANCH);

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
		return jvbranchModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jvbranch persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(jvbranchImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_JVBRANCH = "SELECT jvbranch FROM jvbranch jvbranch";
	private static final String _SQL_SELECT_JVBRANCH_WHERE_PKS_IN = "SELECT jvbranch FROM jvbranch jvbranch WHERE jvbranch_id IN (";
	private static final String _SQL_COUNT_JVBRANCH = "SELECT COUNT(jvbranch) FROM jvbranch jvbranch";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jvbranch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No jvbranch exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(jvbranchPersistenceImpl.class);
}