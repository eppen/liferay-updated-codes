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
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import userapi.exception.NoSuchactiveemployeeinfosampleException;

import userapi.model.activeemployeeinfosample;

import userapi.model.impl.activeemployeeinfosampleImpl;
import userapi.model.impl.activeemployeeinfosampleModelImpl;

import userapi.service.persistence.activeemployeeinfosamplePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the activeemployeeinfosample service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see activeemployeeinfosamplePersistence
 * @see userapi.service.persistence.activeemployeeinfosampleUtil
 * @generated
 */
@ProviderType
public class activeemployeeinfosamplePersistenceImpl extends BasePersistenceImpl<activeemployeeinfosample>
	implements activeemployeeinfosamplePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link activeemployeeinfosampleUtil} to access the activeemployeeinfosample persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = activeemployeeinfosampleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleModelImpl.FINDER_CACHE_ENABLED,
			activeemployeeinfosampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleModelImpl.FINDER_CACHE_ENABLED,
			activeemployeeinfosampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPID = new FinderPath(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleModelImpl.FINDER_CACHE_ENABLED,
			activeemployeeinfosampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmpId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPID = new FinderPath(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleModelImpl.FINDER_CACHE_ENABLED,
			activeemployeeinfosampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmpId",
			new String[] { String.class.getName() },
			activeemployeeinfosampleModelImpl.EMPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPID = new FinderPath(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmpId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the activeemployeeinfosamples where EmpId = &#63;.
	 *
	 * @param EmpId the emp ID
	 * @return the matching activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findByEmpId(String EmpId) {
		return findByEmpId(EmpId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the activeemployeeinfosamples where EmpId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param EmpId the emp ID
	 * @param start the lower bound of the range of activeemployeeinfosamples
	 * @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	 * @return the range of matching activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findByEmpId(String EmpId, int start,
		int end) {
		return findByEmpId(EmpId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the activeemployeeinfosamples where EmpId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param EmpId the emp ID
	 * @param start the lower bound of the range of activeemployeeinfosamples
	 * @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findByEmpId(String EmpId, int start,
		int end, OrderByComparator<activeemployeeinfosample> orderByComparator) {
		return findByEmpId(EmpId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the activeemployeeinfosamples where EmpId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param EmpId the emp ID
	 * @param start the lower bound of the range of activeemployeeinfosamples
	 * @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findByEmpId(String EmpId, int start,
		int end, OrderByComparator<activeemployeeinfosample> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPID;
			finderArgs = new Object[] { EmpId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPID;
			finderArgs = new Object[] { EmpId, start, end, orderByComparator };
		}

		List<activeemployeeinfosample> list = null;

		if (retrieveFromCache) {
			list = (List<activeemployeeinfosample>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (activeemployeeinfosample activeemployeeinfosample : list) {
					if (!Objects.equals(EmpId,
								activeemployeeinfosample.getEmpId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE_WHERE);

			boolean bindEmpId = false;

			if (EmpId == null) {
				query.append(_FINDER_COLUMN_EMPID_EMPID_1);
			}
			else if (EmpId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPID_EMPID_3);
			}
			else {
				bindEmpId = true;

				query.append(_FINDER_COLUMN_EMPID_EMPID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(activeemployeeinfosampleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmpId) {
					qPos.add(EmpId);
				}

				if (!pagination) {
					list = (List<activeemployeeinfosample>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<activeemployeeinfosample>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first activeemployeeinfosample in the ordered set where EmpId = &#63;.
	 *
	 * @param EmpId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching activeemployeeinfosample
	 * @throws NoSuchactiveemployeeinfosampleException if a matching activeemployeeinfosample could not be found
	 */
	@Override
	public activeemployeeinfosample findByEmpId_First(String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws NoSuchactiveemployeeinfosampleException {
		activeemployeeinfosample activeemployeeinfosample = fetchByEmpId_First(EmpId,
				orderByComparator);

		if (activeemployeeinfosample != null) {
			return activeemployeeinfosample;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("EmpId=");
		msg.append(EmpId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchactiveemployeeinfosampleException(msg.toString());
	}

	/**
	 * Returns the first activeemployeeinfosample in the ordered set where EmpId = &#63;.
	 *
	 * @param EmpId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching activeemployeeinfosample, or <code>null</code> if a matching activeemployeeinfosample could not be found
	 */
	@Override
	public activeemployeeinfosample fetchByEmpId_First(String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		List<activeemployeeinfosample> list = findByEmpId(EmpId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last activeemployeeinfosample in the ordered set where EmpId = &#63;.
	 *
	 * @param EmpId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching activeemployeeinfosample
	 * @throws NoSuchactiveemployeeinfosampleException if a matching activeemployeeinfosample could not be found
	 */
	@Override
	public activeemployeeinfosample findByEmpId_Last(String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws NoSuchactiveemployeeinfosampleException {
		activeemployeeinfosample activeemployeeinfosample = fetchByEmpId_Last(EmpId,
				orderByComparator);

		if (activeemployeeinfosample != null) {
			return activeemployeeinfosample;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("EmpId=");
		msg.append(EmpId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchactiveemployeeinfosampleException(msg.toString());
	}

	/**
	 * Returns the last activeemployeeinfosample in the ordered set where EmpId = &#63;.
	 *
	 * @param EmpId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching activeemployeeinfosample, or <code>null</code> if a matching activeemployeeinfosample could not be found
	 */
	@Override
	public activeemployeeinfosample fetchByEmpId_Last(String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		int count = countByEmpId(EmpId);

		if (count == 0) {
			return null;
		}

		List<activeemployeeinfosample> list = findByEmpId(EmpId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the activeemployeeinfosamples before and after the current activeemployeeinfosample in the ordered set where EmpId = &#63;.
	 *
	 * @param srno the primary key of the current activeemployeeinfosample
	 * @param EmpId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next activeemployeeinfosample
	 * @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	 */
	@Override
	public activeemployeeinfosample[] findByEmpId_PrevAndNext(int srno,
		String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator)
		throws NoSuchactiveemployeeinfosampleException {
		activeemployeeinfosample activeemployeeinfosample = findByPrimaryKey(srno);

		Session session = null;

		try {
			session = openSession();

			activeemployeeinfosample[] array = new activeemployeeinfosampleImpl[3];

			array[0] = getByEmpId_PrevAndNext(session,
					activeemployeeinfosample, EmpId, orderByComparator, true);

			array[1] = activeemployeeinfosample;

			array[2] = getByEmpId_PrevAndNext(session,
					activeemployeeinfosample, EmpId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected activeemployeeinfosample getByEmpId_PrevAndNext(Session session,
		activeemployeeinfosample activeemployeeinfosample, String EmpId,
		OrderByComparator<activeemployeeinfosample> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE_WHERE);

		boolean bindEmpId = false;

		if (EmpId == null) {
			query.append(_FINDER_COLUMN_EMPID_EMPID_1);
		}
		else if (EmpId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMPID_EMPID_3);
		}
		else {
			bindEmpId = true;

			query.append(_FINDER_COLUMN_EMPID_EMPID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(activeemployeeinfosampleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmpId) {
			qPos.add(EmpId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(activeemployeeinfosample);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<activeemployeeinfosample> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the activeemployeeinfosamples where EmpId = &#63; from the database.
	 *
	 * @param EmpId the emp ID
	 */
	@Override
	public void removeByEmpId(String EmpId) {
		for (activeemployeeinfosample activeemployeeinfosample : findByEmpId(
				EmpId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(activeemployeeinfosample);
		}
	}

	/**
	 * Returns the number of activeemployeeinfosamples where EmpId = &#63;.
	 *
	 * @param EmpId the emp ID
	 * @return the number of matching activeemployeeinfosamples
	 */
	@Override
	public int countByEmpId(String EmpId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPID;

		Object[] finderArgs = new Object[] { EmpId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIVEEMPLOYEEINFOSAMPLE_WHERE);

			boolean bindEmpId = false;

			if (EmpId == null) {
				query.append(_FINDER_COLUMN_EMPID_EMPID_1);
			}
			else if (EmpId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPID_EMPID_3);
			}
			else {
				bindEmpId = true;

				query.append(_FINDER_COLUMN_EMPID_EMPID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmpId) {
					qPos.add(EmpId);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMPID_EMPID_1 = "activeemployeeinfosample.EmpId IS NULL";
	private static final String _FINDER_COLUMN_EMPID_EMPID_2 = "activeemployeeinfosample.EmpId = ?";
	private static final String _FINDER_COLUMN_EMPID_EMPID_3 = "(activeemployeeinfosample.EmpId IS NULL OR activeemployeeinfosample.EmpId = '')";

	public activeemployeeinfosamplePersistenceImpl() {
		setModelClass(activeemployeeinfosample.class);
	}

	/**
	 * Caches the activeemployeeinfosample in the entity cache if it is enabled.
	 *
	 * @param activeemployeeinfosample the activeemployeeinfosample
	 */
	@Override
	public void cacheResult(activeemployeeinfosample activeemployeeinfosample) {
		entityCache.putResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleImpl.class,
			activeemployeeinfosample.getPrimaryKey(), activeemployeeinfosample);

		activeemployeeinfosample.resetOriginalValues();
	}

	/**
	 * Caches the activeemployeeinfosamples in the entity cache if it is enabled.
	 *
	 * @param activeemployeeinfosamples the activeemployeeinfosamples
	 */
	@Override
	public void cacheResult(
		List<activeemployeeinfosample> activeemployeeinfosamples) {
		for (activeemployeeinfosample activeemployeeinfosample : activeemployeeinfosamples) {
			if (entityCache.getResult(
						activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
						activeemployeeinfosampleImpl.class,
						activeemployeeinfosample.getPrimaryKey()) == null) {
				cacheResult(activeemployeeinfosample);
			}
			else {
				activeemployeeinfosample.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all activeemployeeinfosamples.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(activeemployeeinfosampleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the activeemployeeinfosample.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(activeemployeeinfosample activeemployeeinfosample) {
		entityCache.removeResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleImpl.class,
			activeemployeeinfosample.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<activeemployeeinfosample> activeemployeeinfosamples) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (activeemployeeinfosample activeemployeeinfosample : activeemployeeinfosamples) {
			entityCache.removeResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
				activeemployeeinfosampleImpl.class,
				activeemployeeinfosample.getPrimaryKey());
		}
	}

	/**
	 * Creates a new activeemployeeinfosample with the primary key. Does not add the activeemployeeinfosample to the database.
	 *
	 * @param srno the primary key for the new activeemployeeinfosample
	 * @return the new activeemployeeinfosample
	 */
	@Override
	public activeemployeeinfosample create(int srno) {
		activeemployeeinfosample activeemployeeinfosample = new activeemployeeinfosampleImpl();

		activeemployeeinfosample.setNew(true);
		activeemployeeinfosample.setPrimaryKey(srno);

		return activeemployeeinfosample;
	}

	/**
	 * Removes the activeemployeeinfosample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param srno the primary key of the activeemployeeinfosample
	 * @return the activeemployeeinfosample that was removed
	 * @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	 */
	@Override
	public activeemployeeinfosample remove(int srno)
		throws NoSuchactiveemployeeinfosampleException {
		return remove((Serializable)srno);
	}

	/**
	 * Removes the activeemployeeinfosample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the activeemployeeinfosample
	 * @return the activeemployeeinfosample that was removed
	 * @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	 */
	@Override
	public activeemployeeinfosample remove(Serializable primaryKey)
		throws NoSuchactiveemployeeinfosampleException {
		Session session = null;

		try {
			session = openSession();

			activeemployeeinfosample activeemployeeinfosample = (activeemployeeinfosample)session.get(activeemployeeinfosampleImpl.class,
					primaryKey);

			if (activeemployeeinfosample == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchactiveemployeeinfosampleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(activeemployeeinfosample);
		}
		catch (NoSuchactiveemployeeinfosampleException nsee) {
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
	protected activeemployeeinfosample removeImpl(
		activeemployeeinfosample activeemployeeinfosample) {
		activeemployeeinfosample = toUnwrappedModel(activeemployeeinfosample);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(activeemployeeinfosample)) {
				activeemployeeinfosample = (activeemployeeinfosample)session.get(activeemployeeinfosampleImpl.class,
						activeemployeeinfosample.getPrimaryKeyObj());
			}

			if (activeemployeeinfosample != null) {
				session.delete(activeemployeeinfosample);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (activeemployeeinfosample != null) {
			clearCache(activeemployeeinfosample);
		}

		return activeemployeeinfosample;
	}

	@Override
	public activeemployeeinfosample updateImpl(
		activeemployeeinfosample activeemployeeinfosample) {
		activeemployeeinfosample = toUnwrappedModel(activeemployeeinfosample);

		boolean isNew = activeemployeeinfosample.isNew();

		activeemployeeinfosampleModelImpl activeemployeeinfosampleModelImpl = (activeemployeeinfosampleModelImpl)activeemployeeinfosample;

		Session session = null;

		try {
			session = openSession();

			if (activeemployeeinfosample.isNew()) {
				session.save(activeemployeeinfosample);

				activeemployeeinfosample.setNew(false);
			}
			else {
				activeemployeeinfosample = (activeemployeeinfosample)session.merge(activeemployeeinfosample);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!activeemployeeinfosampleModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					activeemployeeinfosampleModelImpl.getEmpId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EMPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((activeemployeeinfosampleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						activeemployeeinfosampleModelImpl.getOriginalEmpId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPID,
					args);

				args = new Object[] { activeemployeeinfosampleModelImpl.getEmpId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPID,
					args);
			}
		}

		entityCache.putResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
			activeemployeeinfosampleImpl.class,
			activeemployeeinfosample.getPrimaryKey(), activeemployeeinfosample,
			false);

		activeemployeeinfosample.resetOriginalValues();

		return activeemployeeinfosample;
	}

	protected activeemployeeinfosample toUnwrappedModel(
		activeemployeeinfosample activeemployeeinfosample) {
		if (activeemployeeinfosample instanceof activeemployeeinfosampleImpl) {
			return activeemployeeinfosample;
		}

		activeemployeeinfosampleImpl activeemployeeinfosampleImpl = new activeemployeeinfosampleImpl();

		activeemployeeinfosampleImpl.setNew(activeemployeeinfosample.isNew());
		activeemployeeinfosampleImpl.setPrimaryKey(activeemployeeinfosample.getPrimaryKey());

		activeemployeeinfosampleImpl.setSrno(activeemployeeinfosample.getSrno());
		activeemployeeinfosampleImpl.setMilestone(activeemployeeinfosample.getMilestone());
		activeemployeeinfosampleImpl.setEmpId(activeemployeeinfosample.getEmpId());
		activeemployeeinfosampleImpl.setName(activeemployeeinfosample.getName());
		activeemployeeinfosampleImpl.setEmailid(activeemployeeinfosample.getEmailid());
		activeemployeeinfosampleImpl.setReason(activeemployeeinfosample.getReason());
		activeemployeeinfosampleImpl.setPhoto(activeemployeeinfosample.getPhoto());
		activeemployeeinfosampleImpl.setDOJ(activeemployeeinfosample.getDOJ());
		activeemployeeinfosampleImpl.setExitOn(activeemployeeinfosample.getExitOn());
		activeemployeeinfosampleImpl.setBirthday(activeemployeeinfosample.getBirthday());
		activeemployeeinfosampleImpl.setAnniversary(activeemployeeinfosample.getAnniversary());
		activeemployeeinfosampleImpl.setBusiness(activeemployeeinfosample.getBusiness());
		activeemployeeinfosampleImpl.setUnit(activeemployeeinfosample.getUnit());
		activeemployeeinfosampleImpl.setGradeGroup(activeemployeeinfosample.getGradeGroup());
		activeemployeeinfosampleImpl.setGrade(activeemployeeinfosample.getGrade());
		activeemployeeinfosampleImpl.setFunctionName(activeemployeeinfosample.getFunctionName());
		activeemployeeinfosampleImpl.setDepartment(activeemployeeinfosample.getDepartment());
		activeemployeeinfosampleImpl.setDesignation(activeemployeeinfosample.getDesignation());
		activeemployeeinfosampleImpl.setZone(activeemployeeinfosample.getZone());
		activeemployeeinfosampleImpl.setRegion(activeemployeeinfosample.getRegion());
		activeemployeeinfosampleImpl.setLocation(activeemployeeinfosample.getLocation());
		activeemployeeinfosampleImpl.setProduct(activeemployeeinfosample.getProduct());
		activeemployeeinfosampleImpl.setJVBranch(activeemployeeinfosample.getJVBranch());
		activeemployeeinfosampleImpl.setBranch(activeemployeeinfosample.getBranch());
		activeemployeeinfosampleImpl.setCostcenter(activeemployeeinfosample.getCostcenter());
		activeemployeeinfosampleImpl.setAreaHandled(activeemployeeinfosample.getAreaHandled());
		activeemployeeinfosampleImpl.setGender(activeemployeeinfosample.getGender());
		activeemployeeinfosampleImpl.setFirstName(activeemployeeinfosample.getFirstName());
		activeemployeeinfosampleImpl.setLastName(activeemployeeinfosample.getLastName());

		return activeemployeeinfosampleImpl;
	}

	/**
	 * Returns the activeemployeeinfosample with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the activeemployeeinfosample
	 * @return the activeemployeeinfosample
	 * @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	 */
	@Override
	public activeemployeeinfosample findByPrimaryKey(Serializable primaryKey)
		throws NoSuchactiveemployeeinfosampleException {
		activeemployeeinfosample activeemployeeinfosample = fetchByPrimaryKey(primaryKey);

		if (activeemployeeinfosample == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchactiveemployeeinfosampleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return activeemployeeinfosample;
	}

	/**
	 * Returns the activeemployeeinfosample with the primary key or throws a {@link NoSuchactiveemployeeinfosampleException} if it could not be found.
	 *
	 * @param srno the primary key of the activeemployeeinfosample
	 * @return the activeemployeeinfosample
	 * @throws NoSuchactiveemployeeinfosampleException if a activeemployeeinfosample with the primary key could not be found
	 */
	@Override
	public activeemployeeinfosample findByPrimaryKey(int srno)
		throws NoSuchactiveemployeeinfosampleException {
		return findByPrimaryKey((Serializable)srno);
	}

	/**
	 * Returns the activeemployeeinfosample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the activeemployeeinfosample
	 * @return the activeemployeeinfosample, or <code>null</code> if a activeemployeeinfosample with the primary key could not be found
	 */
	@Override
	public activeemployeeinfosample fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
				activeemployeeinfosampleImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		activeemployeeinfosample activeemployeeinfosample = (activeemployeeinfosample)serializable;

		if (activeemployeeinfosample == null) {
			Session session = null;

			try {
				session = openSession();

				activeemployeeinfosample = (activeemployeeinfosample)session.get(activeemployeeinfosampleImpl.class,
						primaryKey);

				if (activeemployeeinfosample != null) {
					cacheResult(activeemployeeinfosample);
				}
				else {
					entityCache.putResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
						activeemployeeinfosampleImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
					activeemployeeinfosampleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return activeemployeeinfosample;
	}

	/**
	 * Returns the activeemployeeinfosample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param srno the primary key of the activeemployeeinfosample
	 * @return the activeemployeeinfosample, or <code>null</code> if a activeemployeeinfosample with the primary key could not be found
	 */
	@Override
	public activeemployeeinfosample fetchByPrimaryKey(int srno) {
		return fetchByPrimaryKey((Serializable)srno);
	}

	@Override
	public Map<Serializable, activeemployeeinfosample> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, activeemployeeinfosample> map = new HashMap<Serializable, activeemployeeinfosample>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			activeemployeeinfosample activeemployeeinfosample = fetchByPrimaryKey(primaryKey);

			if (activeemployeeinfosample != null) {
				map.put(primaryKey, activeemployeeinfosample);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
					activeemployeeinfosampleImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (activeemployeeinfosample)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE_WHERE_PKS_IN);

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

			for (activeemployeeinfosample activeemployeeinfosample : (List<activeemployeeinfosample>)q.list()) {
				map.put(activeemployeeinfosample.getPrimaryKeyObj(),
					activeemployeeinfosample);

				cacheResult(activeemployeeinfosample);

				uncachedPrimaryKeys.remove(activeemployeeinfosample.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(activeemployeeinfosampleModelImpl.ENTITY_CACHE_ENABLED,
					activeemployeeinfosampleImpl.class, primaryKey, nullModel);
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
	 * Returns all the activeemployeeinfosamples.
	 *
	 * @return the activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the activeemployeeinfosamples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of activeemployeeinfosamples
	 * @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	 * @return the range of activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the activeemployeeinfosamples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of activeemployeeinfosamples
	 * @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findAll(int start, int end,
		OrderByComparator<activeemployeeinfosample> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the activeemployeeinfosamples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link activeemployeeinfosampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of activeemployeeinfosamples
	 * @param end the upper bound of the range of activeemployeeinfosamples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of activeemployeeinfosamples
	 */
	@Override
	public List<activeemployeeinfosample> findAll(int start, int end,
		OrderByComparator<activeemployeeinfosample> orderByComparator,
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

		List<activeemployeeinfosample> list = null;

		if (retrieveFromCache) {
			list = (List<activeemployeeinfosample>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE;

				if (pagination) {
					sql = sql.concat(activeemployeeinfosampleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<activeemployeeinfosample>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<activeemployeeinfosample>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the activeemployeeinfosamples from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (activeemployeeinfosample activeemployeeinfosample : findAll()) {
			remove(activeemployeeinfosample);
		}
	}

	/**
	 * Returns the number of activeemployeeinfosamples.
	 *
	 * @return the number of activeemployeeinfosamples
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACTIVEEMPLOYEEINFOSAMPLE);

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
		return activeemployeeinfosampleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the activeemployeeinfosample persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(activeemployeeinfosampleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE = "SELECT activeemployeeinfosample FROM activeemployeeinfosample activeemployeeinfosample";
	private static final String _SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE_WHERE_PKS_IN =
		"SELECT activeemployeeinfosample FROM activeemployeeinfosample activeemployeeinfosample WHERE srno IN (";
	private static final String _SQL_SELECT_ACTIVEEMPLOYEEINFOSAMPLE_WHERE = "SELECT activeemployeeinfosample FROM activeemployeeinfosample activeemployeeinfosample WHERE ";
	private static final String _SQL_COUNT_ACTIVEEMPLOYEEINFOSAMPLE = "SELECT COUNT(activeemployeeinfosample) FROM activeemployeeinfosample activeemployeeinfosample";
	private static final String _SQL_COUNT_ACTIVEEMPLOYEEINFOSAMPLE_WHERE = "SELECT COUNT(activeemployeeinfosample) FROM activeemployeeinfosample activeemployeeinfosample WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "activeemployeeinfosample.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No activeemployeeinfosample exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No activeemployeeinfosample exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(activeemployeeinfosamplePersistenceImpl.class);
}