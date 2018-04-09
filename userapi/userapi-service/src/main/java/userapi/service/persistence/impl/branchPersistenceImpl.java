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

import userapi.exception.NoSuchbranchException;

import userapi.model.branch;

import userapi.model.impl.branchImpl;
import userapi.model.impl.branchModelImpl;

import userapi.service.persistence.branchPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the branch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see branchPersistence
 * @see userapi.service.persistence.branchUtil
 * @generated
 */
@ProviderType
public class branchPersistenceImpl extends BasePersistenceImpl<branch>
	implements branchPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link branchUtil} to access the branch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = branchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(branchModelImpl.ENTITY_CACHE_ENABLED,
			branchModelImpl.FINDER_CACHE_ENABLED, branchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(branchModelImpl.ENTITY_CACHE_ENABLED,
			branchModelImpl.FINDER_CACHE_ENABLED, branchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(branchModelImpl.ENTITY_CACHE_ENABLED,
			branchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public branchPersistenceImpl() {
		setModelClass(branch.class);
	}

	/**
	 * Caches the branch in the entity cache if it is enabled.
	 *
	 * @param branch the branch
	 */
	@Override
	public void cacheResult(branch branch) {
		entityCache.putResult(branchModelImpl.ENTITY_CACHE_ENABLED,
			branchImpl.class, branch.getPrimaryKey(), branch);

		branch.resetOriginalValues();
	}

	/**
	 * Caches the branchs in the entity cache if it is enabled.
	 *
	 * @param branchs the branchs
	 */
	@Override
	public void cacheResult(List<branch> branchs) {
		for (branch branch : branchs) {
			if (entityCache.getResult(branchModelImpl.ENTITY_CACHE_ENABLED,
						branchImpl.class, branch.getPrimaryKey()) == null) {
				cacheResult(branch);
			}
			else {
				branch.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all branchs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(branchImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the branch.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(branch branch) {
		entityCache.removeResult(branchModelImpl.ENTITY_CACHE_ENABLED,
			branchImpl.class, branch.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<branch> branchs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (branch branch : branchs) {
			entityCache.removeResult(branchModelImpl.ENTITY_CACHE_ENABLED,
				branchImpl.class, branch.getPrimaryKey());
		}
	}

	/**
	 * Creates a new branch with the primary key. Does not add the branch to the database.
	 *
	 * @param branch_id the primary key for the new branch
	 * @return the new branch
	 */
	@Override
	public branch create(int branch_id) {
		branch branch = new branchImpl();

		branch.setNew(true);
		branch.setPrimaryKey(branch_id);

		return branch;
	}

	/**
	 * Removes the branch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param branch_id the primary key of the branch
	 * @return the branch that was removed
	 * @throws NoSuchbranchException if a branch with the primary key could not be found
	 */
	@Override
	public branch remove(int branch_id) throws NoSuchbranchException {
		return remove((Serializable)branch_id);
	}

	/**
	 * Removes the branch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the branch
	 * @return the branch that was removed
	 * @throws NoSuchbranchException if a branch with the primary key could not be found
	 */
	@Override
	public branch remove(Serializable primaryKey) throws NoSuchbranchException {
		Session session = null;

		try {
			session = openSession();

			branch branch = (branch)session.get(branchImpl.class, primaryKey);

			if (branch == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(branch);
		}
		catch (NoSuchbranchException nsee) {
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
	protected branch removeImpl(branch branch) {
		branch = toUnwrappedModel(branch);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(branch)) {
				branch = (branch)session.get(branchImpl.class,
						branch.getPrimaryKeyObj());
			}

			if (branch != null) {
				session.delete(branch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (branch != null) {
			clearCache(branch);
		}

		return branch;
	}

	@Override
	public branch updateImpl(branch branch) {
		branch = toUnwrappedModel(branch);

		boolean isNew = branch.isNew();

		Session session = null;

		try {
			session = openSession();

			if (branch.isNew()) {
				session.save(branch);

				branch.setNew(false);
			}
			else {
				branch = (branch)session.merge(branch);
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

		entityCache.putResult(branchModelImpl.ENTITY_CACHE_ENABLED,
			branchImpl.class, branch.getPrimaryKey(), branch, false);

		branch.resetOriginalValues();

		return branch;
	}

	protected branch toUnwrappedModel(branch branch) {
		if (branch instanceof branchImpl) {
			return branch;
		}

		branchImpl branchImpl = new branchImpl();

		branchImpl.setNew(branch.isNew());
		branchImpl.setPrimaryKey(branch.getPrimaryKey());

		branchImpl.setBranch_id(branch.getBranch_id());
		branchImpl.setBranch(branch.getBranch());
		branchImpl.setBusiness_id(branch.getBusiness_id());
		branchImpl.setIsactive(branch.getIsactive());

		return branchImpl;
	}

	/**
	 * Returns the branch with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the branch
	 * @return the branch
	 * @throws NoSuchbranchException if a branch with the primary key could not be found
	 */
	@Override
	public branch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbranchException {
		branch branch = fetchByPrimaryKey(primaryKey);

		if (branch == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return branch;
	}

	/**
	 * Returns the branch with the primary key or throws a {@link NoSuchbranchException} if it could not be found.
	 *
	 * @param branch_id the primary key of the branch
	 * @return the branch
	 * @throws NoSuchbranchException if a branch with the primary key could not be found
	 */
	@Override
	public branch findByPrimaryKey(int branch_id) throws NoSuchbranchException {
		return findByPrimaryKey((Serializable)branch_id);
	}

	/**
	 * Returns the branch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the branch
	 * @return the branch, or <code>null</code> if a branch with the primary key could not be found
	 */
	@Override
	public branch fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(branchModelImpl.ENTITY_CACHE_ENABLED,
				branchImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		branch branch = (branch)serializable;

		if (branch == null) {
			Session session = null;

			try {
				session = openSession();

				branch = (branch)session.get(branchImpl.class, primaryKey);

				if (branch != null) {
					cacheResult(branch);
				}
				else {
					entityCache.putResult(branchModelImpl.ENTITY_CACHE_ENABLED,
						branchImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(branchModelImpl.ENTITY_CACHE_ENABLED,
					branchImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return branch;
	}

	/**
	 * Returns the branch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param branch_id the primary key of the branch
	 * @return the branch, or <code>null</code> if a branch with the primary key could not be found
	 */
	@Override
	public branch fetchByPrimaryKey(int branch_id) {
		return fetchByPrimaryKey((Serializable)branch_id);
	}

	@Override
	public Map<Serializable, branch> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, branch> map = new HashMap<Serializable, branch>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			branch branch = fetchByPrimaryKey(primaryKey);

			if (branch != null) {
				map.put(primaryKey, branch);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(branchModelImpl.ENTITY_CACHE_ENABLED,
					branchImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (branch)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BRANCH_WHERE_PKS_IN);

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

			for (branch branch : (List<branch>)q.list()) {
				map.put(branch.getPrimaryKeyObj(), branch);

				cacheResult(branch);

				uncachedPrimaryKeys.remove(branch.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(branchModelImpl.ENTITY_CACHE_ENABLED,
					branchImpl.class, primaryKey, nullModel);
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
	 * Returns all the branchs.
	 *
	 * @return the branchs
	 */
	@Override
	public List<branch> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the branchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branchs
	 * @param end the upper bound of the range of branchs (not inclusive)
	 * @return the range of branchs
	 */
	@Override
	public List<branch> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the branchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branchs
	 * @param end the upper bound of the range of branchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of branchs
	 */
	@Override
	public List<branch> findAll(int start, int end,
		OrderByComparator<branch> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the branchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branchs
	 * @param end the upper bound of the range of branchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of branchs
	 */
	@Override
	public List<branch> findAll(int start, int end,
		OrderByComparator<branch> orderByComparator, boolean retrieveFromCache) {
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

		List<branch> list = null;

		if (retrieveFromCache) {
			list = (List<branch>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BRANCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BRANCH;

				if (pagination) {
					sql = sql.concat(branchModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<branch>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<branch>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the branchs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (branch branch : findAll()) {
			remove(branch);
		}
	}

	/**
	 * Returns the number of branchs.
	 *
	 * @return the number of branchs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BRANCH);

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
		return branchModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the branch persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(branchImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BRANCH = "SELECT branch FROM branch branch";
	private static final String _SQL_SELECT_BRANCH_WHERE_PKS_IN = "SELECT branch FROM branch branch WHERE branch_id IN (";
	private static final String _SQL_COUNT_BRANCH = "SELECT COUNT(branch) FROM branch branch";
	private static final String _ORDER_BY_ENTITY_ALIAS = "branch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No branch exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(branchPersistenceImpl.class);
}