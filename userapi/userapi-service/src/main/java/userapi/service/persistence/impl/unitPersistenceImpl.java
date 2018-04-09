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

import userapi.exception.NoSuchunitException;

import userapi.model.impl.unitImpl;
import userapi.model.impl.unitModelImpl;

import userapi.model.unit;

import userapi.service.persistence.unitPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see unitPersistence
 * @see userapi.service.persistence.unitUtil
 * @generated
 */
@ProviderType
public class unitPersistenceImpl extends BasePersistenceImpl<unit>
	implements unitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link unitUtil} to access the unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = unitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(unitModelImpl.ENTITY_CACHE_ENABLED,
			unitModelImpl.FINDER_CACHE_ENABLED, unitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(unitModelImpl.ENTITY_CACHE_ENABLED,
			unitModelImpl.FINDER_CACHE_ENABLED, unitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(unitModelImpl.ENTITY_CACHE_ENABLED,
			unitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public unitPersistenceImpl() {
		setModelClass(unit.class);
	}

	/**
	 * Caches the unit in the entity cache if it is enabled.
	 *
	 * @param unit the unit
	 */
	@Override
	public void cacheResult(unit unit) {
		entityCache.putResult(unitModelImpl.ENTITY_CACHE_ENABLED,
			unitImpl.class, unit.getPrimaryKey(), unit);

		unit.resetOriginalValues();
	}

	/**
	 * Caches the units in the entity cache if it is enabled.
	 *
	 * @param units the units
	 */
	@Override
	public void cacheResult(List<unit> units) {
		for (unit unit : units) {
			if (entityCache.getResult(unitModelImpl.ENTITY_CACHE_ENABLED,
						unitImpl.class, unit.getPrimaryKey()) == null) {
				cacheResult(unit);
			}
			else {
				unit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all units.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(unitImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the unit.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(unit unit) {
		entityCache.removeResult(unitModelImpl.ENTITY_CACHE_ENABLED,
			unitImpl.class, unit.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<unit> units) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (unit unit : units) {
			entityCache.removeResult(unitModelImpl.ENTITY_CACHE_ENABLED,
				unitImpl.class, unit.getPrimaryKey());
		}
	}

	/**
	 * Creates a new unit with the primary key. Does not add the unit to the database.
	 *
	 * @param unit_id the primary key for the new unit
	 * @return the new unit
	 */
	@Override
	public unit create(int unit_id) {
		unit unit = new unitImpl();

		unit.setNew(true);
		unit.setPrimaryKey(unit_id);

		return unit;
	}

	/**
	 * Removes the unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param unit_id the primary key of the unit
	 * @return the unit that was removed
	 * @throws NoSuchunitException if a unit with the primary key could not be found
	 */
	@Override
	public unit remove(int unit_id) throws NoSuchunitException {
		return remove((Serializable)unit_id);
	}

	/**
	 * Removes the unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the unit
	 * @return the unit that was removed
	 * @throws NoSuchunitException if a unit with the primary key could not be found
	 */
	@Override
	public unit remove(Serializable primaryKey) throws NoSuchunitException {
		Session session = null;

		try {
			session = openSession();

			unit unit = (unit)session.get(unitImpl.class, primaryKey);

			if (unit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchunitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(unit);
		}
		catch (NoSuchunitException nsee) {
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
	protected unit removeImpl(unit unit) {
		unit = toUnwrappedModel(unit);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(unit)) {
				unit = (unit)session.get(unitImpl.class, unit.getPrimaryKeyObj());
			}

			if (unit != null) {
				session.delete(unit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (unit != null) {
			clearCache(unit);
		}

		return unit;
	}

	@Override
	public unit updateImpl(unit unit) {
		unit = toUnwrappedModel(unit);

		boolean isNew = unit.isNew();

		Session session = null;

		try {
			session = openSession();

			if (unit.isNew()) {
				session.save(unit);

				unit.setNew(false);
			}
			else {
				unit = (unit)session.merge(unit);
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

		entityCache.putResult(unitModelImpl.ENTITY_CACHE_ENABLED,
			unitImpl.class, unit.getPrimaryKey(), unit, false);

		unit.resetOriginalValues();

		return unit;
	}

	protected unit toUnwrappedModel(unit unit) {
		if (unit instanceof unitImpl) {
			return unit;
		}

		unitImpl unitImpl = new unitImpl();

		unitImpl.setNew(unit.isNew());
		unitImpl.setPrimaryKey(unit.getPrimaryKey());

		unitImpl.setUnit_id(unit.getUnit_id());
		unitImpl.setUnit(unit.getUnit());
		unitImpl.setShort_name(unit.getShort_name());
		unitImpl.setBusiness_id(unit.getBusiness_id());
		unitImpl.setIsactive(unit.getIsactive());

		return unitImpl;
	}

	/**
	 * Returns the unit with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the unit
	 * @return the unit
	 * @throws NoSuchunitException if a unit with the primary key could not be found
	 */
	@Override
	public unit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchunitException {
		unit unit = fetchByPrimaryKey(primaryKey);

		if (unit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchunitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return unit;
	}

	/**
	 * Returns the unit with the primary key or throws a {@link NoSuchunitException} if it could not be found.
	 *
	 * @param unit_id the primary key of the unit
	 * @return the unit
	 * @throws NoSuchunitException if a unit with the primary key could not be found
	 */
	@Override
	public unit findByPrimaryKey(int unit_id) throws NoSuchunitException {
		return findByPrimaryKey((Serializable)unit_id);
	}

	/**
	 * Returns the unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the unit
	 * @return the unit, or <code>null</code> if a unit with the primary key could not be found
	 */
	@Override
	public unit fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(unitModelImpl.ENTITY_CACHE_ENABLED,
				unitImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		unit unit = (unit)serializable;

		if (unit == null) {
			Session session = null;

			try {
				session = openSession();

				unit = (unit)session.get(unitImpl.class, primaryKey);

				if (unit != null) {
					cacheResult(unit);
				}
				else {
					entityCache.putResult(unitModelImpl.ENTITY_CACHE_ENABLED,
						unitImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(unitModelImpl.ENTITY_CACHE_ENABLED,
					unitImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return unit;
	}

	/**
	 * Returns the unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param unit_id the primary key of the unit
	 * @return the unit, or <code>null</code> if a unit with the primary key could not be found
	 */
	@Override
	public unit fetchByPrimaryKey(int unit_id) {
		return fetchByPrimaryKey((Serializable)unit_id);
	}

	@Override
	public Map<Serializable, unit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, unit> map = new HashMap<Serializable, unit>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			unit unit = fetchByPrimaryKey(primaryKey);

			if (unit != null) {
				map.put(primaryKey, unit);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(unitModelImpl.ENTITY_CACHE_ENABLED,
					unitImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (unit)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UNIT_WHERE_PKS_IN);

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

			for (unit unit : (List<unit>)q.list()) {
				map.put(unit.getPrimaryKeyObj(), unit);

				cacheResult(unit);

				uncachedPrimaryKeys.remove(unit.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(unitModelImpl.ENTITY_CACHE_ENABLED,
					unitImpl.class, primaryKey, nullModel);
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
	 * Returns all the units.
	 *
	 * @return the units
	 */
	@Override
	public List<unit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of units
	 * @param end the upper bound of the range of units (not inclusive)
	 * @return the range of units
	 */
	@Override
	public List<unit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of units
	 * @param end the upper bound of the range of units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of units
	 */
	@Override
	public List<unit> findAll(int start, int end,
		OrderByComparator<unit> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of units
	 * @param end the upper bound of the range of units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of units
	 */
	@Override
	public List<unit> findAll(int start, int end,
		OrderByComparator<unit> orderByComparator, boolean retrieveFromCache) {
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

		List<unit> list = null;

		if (retrieveFromCache) {
			list = (List<unit>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UNIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UNIT;

				if (pagination) {
					sql = sql.concat(unitModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<unit>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<unit>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the units from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (unit unit : findAll()) {
			remove(unit);
		}
	}

	/**
	 * Returns the number of units.
	 *
	 * @return the number of units
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UNIT);

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
		return unitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the unit persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(unitImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UNIT = "SELECT unit FROM unit unit";
	private static final String _SQL_SELECT_UNIT_WHERE_PKS_IN = "SELECT unit FROM unit unit WHERE unit_id IN (";
	private static final String _SQL_COUNT_UNIT = "SELECT COUNT(unit) FROM unit unit";
	private static final String _ORDER_BY_ENTITY_ALIAS = "unit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No unit exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(unitPersistenceImpl.class);
}