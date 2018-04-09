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

import userapi.exception.NoSuchbusinessException;

import userapi.model.business;

import userapi.model.impl.businessImpl;
import userapi.model.impl.businessModelImpl;

import userapi.service.persistence.businessPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the business service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see businessPersistence
 * @see userapi.service.persistence.businessUtil
 * @generated
 */
@ProviderType
public class businessPersistenceImpl extends BasePersistenceImpl<business>
	implements businessPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link businessUtil} to access the business persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = businessImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(businessModelImpl.ENTITY_CACHE_ENABLED,
			businessModelImpl.FINDER_CACHE_ENABLED, businessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(businessModelImpl.ENTITY_CACHE_ENABLED,
			businessModelImpl.FINDER_CACHE_ENABLED, businessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(businessModelImpl.ENTITY_CACHE_ENABLED,
			businessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public businessPersistenceImpl() {
		setModelClass(business.class);
	}

	/**
	 * Caches the business in the entity cache if it is enabled.
	 *
	 * @param business the business
	 */
	@Override
	public void cacheResult(business business) {
		entityCache.putResult(businessModelImpl.ENTITY_CACHE_ENABLED,
			businessImpl.class, business.getPrimaryKey(), business);

		business.resetOriginalValues();
	}

	/**
	 * Caches the businesses in the entity cache if it is enabled.
	 *
	 * @param businesses the businesses
	 */
	@Override
	public void cacheResult(List<business> businesses) {
		for (business business : businesses) {
			if (entityCache.getResult(businessModelImpl.ENTITY_CACHE_ENABLED,
						businessImpl.class, business.getPrimaryKey()) == null) {
				cacheResult(business);
			}
			else {
				business.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all businesses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(businessImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the business.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(business business) {
		entityCache.removeResult(businessModelImpl.ENTITY_CACHE_ENABLED,
			businessImpl.class, business.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<business> businesses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (business business : businesses) {
			entityCache.removeResult(businessModelImpl.ENTITY_CACHE_ENABLED,
				businessImpl.class, business.getPrimaryKey());
		}
	}

	/**
	 * Creates a new business with the primary key. Does not add the business to the database.
	 *
	 * @param business_id the primary key for the new business
	 * @return the new business
	 */
	@Override
	public business create(int business_id) {
		business business = new businessImpl();

		business.setNew(true);
		business.setPrimaryKey(business_id);

		return business;
	}

	/**
	 * Removes the business with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param business_id the primary key of the business
	 * @return the business that was removed
	 * @throws NoSuchbusinessException if a business with the primary key could not be found
	 */
	@Override
	public business remove(int business_id) throws NoSuchbusinessException {
		return remove((Serializable)business_id);
	}

	/**
	 * Removes the business with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the business
	 * @return the business that was removed
	 * @throws NoSuchbusinessException if a business with the primary key could not be found
	 */
	@Override
	public business remove(Serializable primaryKey)
		throws NoSuchbusinessException {
		Session session = null;

		try {
			session = openSession();

			business business = (business)session.get(businessImpl.class,
					primaryKey);

			if (business == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbusinessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(business);
		}
		catch (NoSuchbusinessException nsee) {
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
	protected business removeImpl(business business) {
		business = toUnwrappedModel(business);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(business)) {
				business = (business)session.get(businessImpl.class,
						business.getPrimaryKeyObj());
			}

			if (business != null) {
				session.delete(business);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (business != null) {
			clearCache(business);
		}

		return business;
	}

	@Override
	public business updateImpl(business business) {
		business = toUnwrappedModel(business);

		boolean isNew = business.isNew();

		Session session = null;

		try {
			session = openSession();

			if (business.isNew()) {
				session.save(business);

				business.setNew(false);
			}
			else {
				business = (business)session.merge(business);
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

		entityCache.putResult(businessModelImpl.ENTITY_CACHE_ENABLED,
			businessImpl.class, business.getPrimaryKey(), business, false);

		business.resetOriginalValues();

		return business;
	}

	protected business toUnwrappedModel(business business) {
		if (business instanceof businessImpl) {
			return business;
		}

		businessImpl businessImpl = new businessImpl();

		businessImpl.setNew(business.isNew());
		businessImpl.setPrimaryKey(business.getPrimaryKey());

		businessImpl.setBusiness_id(business.getBusiness_id());
		businessImpl.setBusiness(business.getBusiness());
		businessImpl.setShort_name(business.getShort_name());

		return businessImpl;
	}

	/**
	 * Returns the business with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the business
	 * @return the business
	 * @throws NoSuchbusinessException if a business with the primary key could not be found
	 */
	@Override
	public business findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbusinessException {
		business business = fetchByPrimaryKey(primaryKey);

		if (business == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbusinessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return business;
	}

	/**
	 * Returns the business with the primary key or throws a {@link NoSuchbusinessException} if it could not be found.
	 *
	 * @param business_id the primary key of the business
	 * @return the business
	 * @throws NoSuchbusinessException if a business with the primary key could not be found
	 */
	@Override
	public business findByPrimaryKey(int business_id)
		throws NoSuchbusinessException {
		return findByPrimaryKey((Serializable)business_id);
	}

	/**
	 * Returns the business with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the business
	 * @return the business, or <code>null</code> if a business with the primary key could not be found
	 */
	@Override
	public business fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(businessModelImpl.ENTITY_CACHE_ENABLED,
				businessImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		business business = (business)serializable;

		if (business == null) {
			Session session = null;

			try {
				session = openSession();

				business = (business)session.get(businessImpl.class, primaryKey);

				if (business != null) {
					cacheResult(business);
				}
				else {
					entityCache.putResult(businessModelImpl.ENTITY_CACHE_ENABLED,
						businessImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(businessModelImpl.ENTITY_CACHE_ENABLED,
					businessImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return business;
	}

	/**
	 * Returns the business with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param business_id the primary key of the business
	 * @return the business, or <code>null</code> if a business with the primary key could not be found
	 */
	@Override
	public business fetchByPrimaryKey(int business_id) {
		return fetchByPrimaryKey((Serializable)business_id);
	}

	@Override
	public Map<Serializable, business> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, business> map = new HashMap<Serializable, business>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			business business = fetchByPrimaryKey(primaryKey);

			if (business != null) {
				map.put(primaryKey, business);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(businessModelImpl.ENTITY_CACHE_ENABLED,
					businessImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (business)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUSINESS_WHERE_PKS_IN);

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

			for (business business : (List<business>)q.list()) {
				map.put(business.getPrimaryKeyObj(), business);

				cacheResult(business);

				uncachedPrimaryKeys.remove(business.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(businessModelImpl.ENTITY_CACHE_ENABLED,
					businessImpl.class, primaryKey, nullModel);
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
	 * Returns all the businesses.
	 *
	 * @return the businesses
	 */
	@Override
	public List<business> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @return the range of businesses
	 */
	@Override
	public List<business> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of businesses
	 */
	@Override
	public List<business> findAll(int start, int end,
		OrderByComparator<business> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesses
	 * @param end the upper bound of the range of businesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of businesses
	 */
	@Override
	public List<business> findAll(int start, int end,
		OrderByComparator<business> orderByComparator, boolean retrieveFromCache) {
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

		List<business> list = null;

		if (retrieveFromCache) {
			list = (List<business>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUSINESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESS;

				if (pagination) {
					sql = sql.concat(businessModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<business>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<business>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the businesses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (business business : findAll()) {
			remove(business);
		}
	}

	/**
	 * Returns the number of businesses.
	 *
	 * @return the number of businesses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUSINESS);

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
		return businessModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the business persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(businessImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BUSINESS = "SELECT business FROM business business";
	private static final String _SQL_SELECT_BUSINESS_WHERE_PKS_IN = "SELECT business FROM business business WHERE business_id IN (";
	private static final String _SQL_COUNT_BUSINESS = "SELECT COUNT(business) FROM business business";
	private static final String _ORDER_BY_ENTITY_ALIAS = "business.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No business exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(businessPersistenceImpl.class);
}