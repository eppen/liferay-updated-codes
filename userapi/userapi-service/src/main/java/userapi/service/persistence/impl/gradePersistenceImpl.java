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

import userapi.exception.NoSuchgradeException;

import userapi.model.grade;

import userapi.model.impl.gradeImpl;
import userapi.model.impl.gradeModelImpl;

import userapi.service.persistence.gradePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the grade service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gradePersistence
 * @see userapi.service.persistence.gradeUtil
 * @generated
 */
@ProviderType
public class gradePersistenceImpl extends BasePersistenceImpl<grade>
	implements gradePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link gradeUtil} to access the grade persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = gradeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(gradeModelImpl.ENTITY_CACHE_ENABLED,
			gradeModelImpl.FINDER_CACHE_ENABLED, gradeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(gradeModelImpl.ENTITY_CACHE_ENABLED,
			gradeModelImpl.FINDER_CACHE_ENABLED, gradeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(gradeModelImpl.ENTITY_CACHE_ENABLED,
			gradeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public gradePersistenceImpl() {
		setModelClass(grade.class);
	}

	/**
	 * Caches the grade in the entity cache if it is enabled.
	 *
	 * @param grade the grade
	 */
	@Override
	public void cacheResult(grade grade) {
		entityCache.putResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
			gradeImpl.class, grade.getPrimaryKey(), grade);

		grade.resetOriginalValues();
	}

	/**
	 * Caches the grades in the entity cache if it is enabled.
	 *
	 * @param grades the grades
	 */
	@Override
	public void cacheResult(List<grade> grades) {
		for (grade grade : grades) {
			if (entityCache.getResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
						gradeImpl.class, grade.getPrimaryKey()) == null) {
				cacheResult(grade);
			}
			else {
				grade.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all grades.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(gradeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the grade.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(grade grade) {
		entityCache.removeResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
			gradeImpl.class, grade.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<grade> grades) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (grade grade : grades) {
			entityCache.removeResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
				gradeImpl.class, grade.getPrimaryKey());
		}
	}

	/**
	 * Creates a new grade with the primary key. Does not add the grade to the database.
	 *
	 * @param grade_id the primary key for the new grade
	 * @return the new grade
	 */
	@Override
	public grade create(int grade_id) {
		grade grade = new gradeImpl();

		grade.setNew(true);
		grade.setPrimaryKey(grade_id);

		return grade;
	}

	/**
	 * Removes the grade with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param grade_id the primary key of the grade
	 * @return the grade that was removed
	 * @throws NoSuchgradeException if a grade with the primary key could not be found
	 */
	@Override
	public grade remove(int grade_id) throws NoSuchgradeException {
		return remove((Serializable)grade_id);
	}

	/**
	 * Removes the grade with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the grade
	 * @return the grade that was removed
	 * @throws NoSuchgradeException if a grade with the primary key could not be found
	 */
	@Override
	public grade remove(Serializable primaryKey) throws NoSuchgradeException {
		Session session = null;

		try {
			session = openSession();

			grade grade = (grade)session.get(gradeImpl.class, primaryKey);

			if (grade == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchgradeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(grade);
		}
		catch (NoSuchgradeException nsee) {
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
	protected grade removeImpl(grade grade) {
		grade = toUnwrappedModel(grade);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(grade)) {
				grade = (grade)session.get(gradeImpl.class,
						grade.getPrimaryKeyObj());
			}

			if (grade != null) {
				session.delete(grade);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (grade != null) {
			clearCache(grade);
		}

		return grade;
	}

	@Override
	public grade updateImpl(grade grade) {
		grade = toUnwrappedModel(grade);

		boolean isNew = grade.isNew();

		Session session = null;

		try {
			session = openSession();

			if (grade.isNew()) {
				session.save(grade);

				grade.setNew(false);
			}
			else {
				grade = (grade)session.merge(grade);
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

		entityCache.putResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
			gradeImpl.class, grade.getPrimaryKey(), grade, false);

		grade.resetOriginalValues();

		return grade;
	}

	protected grade toUnwrappedModel(grade grade) {
		if (grade instanceof gradeImpl) {
			return grade;
		}

		gradeImpl gradeImpl = new gradeImpl();

		gradeImpl.setNew(grade.isNew());
		gradeImpl.setPrimaryKey(grade.getPrimaryKey());

		gradeImpl.setGrade_id(grade.getGrade_id());
		gradeImpl.setGrade(grade.getGrade());
		gradeImpl.setBusiness_id(grade.getBusiness_id());
		gradeImpl.setIsactive(grade.getIsactive());

		return gradeImpl;
	}

	/**
	 * Returns the grade with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the grade
	 * @return the grade
	 * @throws NoSuchgradeException if a grade with the primary key could not be found
	 */
	@Override
	public grade findByPrimaryKey(Serializable primaryKey)
		throws NoSuchgradeException {
		grade grade = fetchByPrimaryKey(primaryKey);

		if (grade == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchgradeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return grade;
	}

	/**
	 * Returns the grade with the primary key or throws a {@link NoSuchgradeException} if it could not be found.
	 *
	 * @param grade_id the primary key of the grade
	 * @return the grade
	 * @throws NoSuchgradeException if a grade with the primary key could not be found
	 */
	@Override
	public grade findByPrimaryKey(int grade_id) throws NoSuchgradeException {
		return findByPrimaryKey((Serializable)grade_id);
	}

	/**
	 * Returns the grade with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the grade
	 * @return the grade, or <code>null</code> if a grade with the primary key could not be found
	 */
	@Override
	public grade fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
				gradeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		grade grade = (grade)serializable;

		if (grade == null) {
			Session session = null;

			try {
				session = openSession();

				grade = (grade)session.get(gradeImpl.class, primaryKey);

				if (grade != null) {
					cacheResult(grade);
				}
				else {
					entityCache.putResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
						gradeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
					gradeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return grade;
	}

	/**
	 * Returns the grade with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param grade_id the primary key of the grade
	 * @return the grade, or <code>null</code> if a grade with the primary key could not be found
	 */
	@Override
	public grade fetchByPrimaryKey(int grade_id) {
		return fetchByPrimaryKey((Serializable)grade_id);
	}

	@Override
	public Map<Serializable, grade> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, grade> map = new HashMap<Serializable, grade>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			grade grade = fetchByPrimaryKey(primaryKey);

			if (grade != null) {
				map.put(primaryKey, grade);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
					gradeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (grade)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_GRADE_WHERE_PKS_IN);

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

			for (grade grade : (List<grade>)q.list()) {
				map.put(grade.getPrimaryKeyObj(), grade);

				cacheResult(grade);

				uncachedPrimaryKeys.remove(grade.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(gradeModelImpl.ENTITY_CACHE_ENABLED,
					gradeImpl.class, primaryKey, nullModel);
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
	 * Returns all the grades.
	 *
	 * @return the grades
	 */
	@Override
	public List<grade> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the grades.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of grades
	 * @param end the upper bound of the range of grades (not inclusive)
	 * @return the range of grades
	 */
	@Override
	public List<grade> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the grades.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of grades
	 * @param end the upper bound of the range of grades (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of grades
	 */
	@Override
	public List<grade> findAll(int start, int end,
		OrderByComparator<grade> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the grades.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of grades
	 * @param end the upper bound of the range of grades (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of grades
	 */
	@Override
	public List<grade> findAll(int start, int end,
		OrderByComparator<grade> orderByComparator, boolean retrieveFromCache) {
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

		List<grade> list = null;

		if (retrieveFromCache) {
			list = (List<grade>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_GRADE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GRADE;

				if (pagination) {
					sql = sql.concat(gradeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<grade>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<grade>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the grades from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (grade grade : findAll()) {
			remove(grade);
		}
	}

	/**
	 * Returns the number of grades.
	 *
	 * @return the number of grades
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GRADE);

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
		return gradeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the grade persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(gradeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_GRADE = "SELECT grade FROM grade grade";
	private static final String _SQL_SELECT_GRADE_WHERE_PKS_IN = "SELECT grade FROM grade grade WHERE grade_id IN (";
	private static final String _SQL_COUNT_GRADE = "SELECT COUNT(grade) FROM grade grade";
	private static final String _ORDER_BY_ENTITY_ALIAS = "grade.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No grade exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(gradePersistenceImpl.class);
}