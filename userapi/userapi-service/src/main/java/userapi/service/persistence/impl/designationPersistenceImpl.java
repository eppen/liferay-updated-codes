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

import userapi.exception.NoSuchdesignationException;

import userapi.model.designation;

import userapi.model.impl.designationImpl;
import userapi.model.impl.designationModelImpl;

import userapi.service.persistence.designationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the designation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see designationPersistence
 * @see userapi.service.persistence.designationUtil
 * @generated
 */
@ProviderType
public class designationPersistenceImpl extends BasePersistenceImpl<designation>
	implements designationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link designationUtil} to access the designation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = designationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(designationModelImpl.ENTITY_CACHE_ENABLED,
			designationModelImpl.FINDER_CACHE_ENABLED, designationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(designationModelImpl.ENTITY_CACHE_ENABLED,
			designationModelImpl.FINDER_CACHE_ENABLED, designationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(designationModelImpl.ENTITY_CACHE_ENABLED,
			designationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public designationPersistenceImpl() {
		setModelClass(designation.class);
	}

	/**
	 * Caches the designation in the entity cache if it is enabled.
	 *
	 * @param designation the designation
	 */
	@Override
	public void cacheResult(designation designation) {
		entityCache.putResult(designationModelImpl.ENTITY_CACHE_ENABLED,
			designationImpl.class, designation.getPrimaryKey(), designation);

		designation.resetOriginalValues();
	}

	/**
	 * Caches the designations in the entity cache if it is enabled.
	 *
	 * @param designations the designations
	 */
	@Override
	public void cacheResult(List<designation> designations) {
		for (designation designation : designations) {
			if (entityCache.getResult(
						designationModelImpl.ENTITY_CACHE_ENABLED,
						designationImpl.class, designation.getPrimaryKey()) == null) {
				cacheResult(designation);
			}
			else {
				designation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all designations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(designationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the designation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(designation designation) {
		entityCache.removeResult(designationModelImpl.ENTITY_CACHE_ENABLED,
			designationImpl.class, designation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<designation> designations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (designation designation : designations) {
			entityCache.removeResult(designationModelImpl.ENTITY_CACHE_ENABLED,
				designationImpl.class, designation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new designation with the primary key. Does not add the designation to the database.
	 *
	 * @param desig_id the primary key for the new designation
	 * @return the new designation
	 */
	@Override
	public designation create(int desig_id) {
		designation designation = new designationImpl();

		designation.setNew(true);
		designation.setPrimaryKey(desig_id);

		return designation;
	}

	/**
	 * Removes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param desig_id the primary key of the designation
	 * @return the designation that was removed
	 * @throws NoSuchdesignationException if a designation with the primary key could not be found
	 */
	@Override
	public designation remove(int desig_id) throws NoSuchdesignationException {
		return remove((Serializable)desig_id);
	}

	/**
	 * Removes the designation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the designation
	 * @return the designation that was removed
	 * @throws NoSuchdesignationException if a designation with the primary key could not be found
	 */
	@Override
	public designation remove(Serializable primaryKey)
		throws NoSuchdesignationException {
		Session session = null;

		try {
			session = openSession();

			designation designation = (designation)session.get(designationImpl.class,
					primaryKey);

			if (designation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdesignationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(designation);
		}
		catch (NoSuchdesignationException nsee) {
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
	protected designation removeImpl(designation designation) {
		designation = toUnwrappedModel(designation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(designation)) {
				designation = (designation)session.get(designationImpl.class,
						designation.getPrimaryKeyObj());
			}

			if (designation != null) {
				session.delete(designation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (designation != null) {
			clearCache(designation);
		}

		return designation;
	}

	@Override
	public designation updateImpl(designation designation) {
		designation = toUnwrappedModel(designation);

		boolean isNew = designation.isNew();

		Session session = null;

		try {
			session = openSession();

			if (designation.isNew()) {
				session.save(designation);

				designation.setNew(false);
			}
			else {
				designation = (designation)session.merge(designation);
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

		entityCache.putResult(designationModelImpl.ENTITY_CACHE_ENABLED,
			designationImpl.class, designation.getPrimaryKey(), designation,
			false);

		designation.resetOriginalValues();

		return designation;
	}

	protected designation toUnwrappedModel(designation designation) {
		if (designation instanceof designationImpl) {
			return designation;
		}

		designationImpl designationImpl = new designationImpl();

		designationImpl.setNew(designation.isNew());
		designationImpl.setPrimaryKey(designation.getPrimaryKey());

		designationImpl.setDesig_id(designation.getDesig_id());
		designationImpl.setDesignation(designation.getDesignation());
		designationImpl.setBusiness_id(designation.getBusiness_id());
		designationImpl.setIsactive(designation.getIsactive());

		return designationImpl;
	}

	/**
	 * Returns the designation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the designation
	 * @return the designation
	 * @throws NoSuchdesignationException if a designation with the primary key could not be found
	 */
	@Override
	public designation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchdesignationException {
		designation designation = fetchByPrimaryKey(primaryKey);

		if (designation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchdesignationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return designation;
	}

	/**
	 * Returns the designation with the primary key or throws a {@link NoSuchdesignationException} if it could not be found.
	 *
	 * @param desig_id the primary key of the designation
	 * @return the designation
	 * @throws NoSuchdesignationException if a designation with the primary key could not be found
	 */
	@Override
	public designation findByPrimaryKey(int desig_id)
		throws NoSuchdesignationException {
		return findByPrimaryKey((Serializable)desig_id);
	}

	/**
	 * Returns the designation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the designation
	 * @return the designation, or <code>null</code> if a designation with the primary key could not be found
	 */
	@Override
	public designation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(designationModelImpl.ENTITY_CACHE_ENABLED,
				designationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		designation designation = (designation)serializable;

		if (designation == null) {
			Session session = null;

			try {
				session = openSession();

				designation = (designation)session.get(designationImpl.class,
						primaryKey);

				if (designation != null) {
					cacheResult(designation);
				}
				else {
					entityCache.putResult(designationModelImpl.ENTITY_CACHE_ENABLED,
						designationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(designationModelImpl.ENTITY_CACHE_ENABLED,
					designationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return designation;
	}

	/**
	 * Returns the designation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param desig_id the primary key of the designation
	 * @return the designation, or <code>null</code> if a designation with the primary key could not be found
	 */
	@Override
	public designation fetchByPrimaryKey(int desig_id) {
		return fetchByPrimaryKey((Serializable)desig_id);
	}

	@Override
	public Map<Serializable, designation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, designation> map = new HashMap<Serializable, designation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			designation designation = fetchByPrimaryKey(primaryKey);

			if (designation != null) {
				map.put(primaryKey, designation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(designationModelImpl.ENTITY_CACHE_ENABLED,
					designationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (designation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DESIGNATION_WHERE_PKS_IN);

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

			for (designation designation : (List<designation>)q.list()) {
				map.put(designation.getPrimaryKeyObj(), designation);

				cacheResult(designation);

				uncachedPrimaryKeys.remove(designation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(designationModelImpl.ENTITY_CACHE_ENABLED,
					designationImpl.class, primaryKey, nullModel);
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
	 * Returns all the designations.
	 *
	 * @return the designations
	 */
	@Override
	public List<designation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of designations
	 * @param end the upper bound of the range of designations (not inclusive)
	 * @return the range of designations
	 */
	@Override
	public List<designation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of designations
	 * @param end the upper bound of the range of designations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of designations
	 */
	@Override
	public List<designation> findAll(int start, int end,
		OrderByComparator<designation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the designations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link designationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of designations
	 * @param end the upper bound of the range of designations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of designations
	 */
	@Override
	public List<designation> findAll(int start, int end,
		OrderByComparator<designation> orderByComparator,
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

		List<designation> list = null;

		if (retrieveFromCache) {
			list = (List<designation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DESIGNATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DESIGNATION;

				if (pagination) {
					sql = sql.concat(designationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<designation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<designation>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the designations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (designation designation : findAll()) {
			remove(designation);
		}
	}

	/**
	 * Returns the number of designations.
	 *
	 * @return the number of designations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DESIGNATION);

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
		return designationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the designation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(designationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DESIGNATION = "SELECT designation FROM designation designation";
	private static final String _SQL_SELECT_DESIGNATION_WHERE_PKS_IN = "SELECT designation FROM designation designation WHERE desig_id IN (";
	private static final String _SQL_COUNT_DESIGNATION = "SELECT COUNT(designation) FROM designation designation";
	private static final String _ORDER_BY_ENTITY_ALIAS = "designation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No designation exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(designationPersistenceImpl.class);
}