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

import userapi.exception.NoSuchscreennameempidmappingException;

import userapi.model.impl.screennameempidmappingImpl;
import userapi.model.impl.screennameempidmappingModelImpl;

import userapi.model.screennameempidmapping;

import userapi.service.persistence.screennameempidmappingPersistence;

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
 * The persistence implementation for the screennameempidmapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see screennameempidmappingPersistence
 * @see userapi.service.persistence.screennameempidmappingUtil
 * @generated
 */
@ProviderType
public class screennameempidmappingPersistenceImpl extends BasePersistenceImpl<screennameempidmapping>
	implements screennameempidmappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link screennameempidmappingUtil} to access the screennameempidmapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = screennameempidmappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingModelImpl.FINDER_CACHE_ENABLED,
			screennameempidmappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingModelImpl.FINDER_CACHE_ENABLED,
			screennameempidmappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SCREENNAME =
		new FinderPath(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingModelImpl.FINDER_CACHE_ENABLED,
			screennameempidmappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByscreenname",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SCREENNAME =
		new FinderPath(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingModelImpl.FINDER_CACHE_ENABLED,
			screennameempidmappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByscreenname",
			new String[] { String.class.getName() },
			screennameempidmappingModelImpl.SCREENNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SCREENNAME = new FinderPath(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByscreenname",
			new String[] { String.class.getName() });

	/**
	 * Returns all the screennameempidmappings where screenname = &#63;.
	 *
	 * @param screenname the screenname
	 * @return the matching screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findByscreenname(String screenname) {
		return findByscreenname(screenname, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the screennameempidmappings where screenname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param screenname the screenname
	 * @param start the lower bound of the range of screennameempidmappings
	 * @param end the upper bound of the range of screennameempidmappings (not inclusive)
	 * @return the range of matching screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findByscreenname(String screenname,
		int start, int end) {
		return findByscreenname(screenname, start, end, null);
	}

	/**
	 * Returns an ordered range of all the screennameempidmappings where screenname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param screenname the screenname
	 * @param start the lower bound of the range of screennameempidmappings
	 * @param end the upper bound of the range of screennameempidmappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findByscreenname(String screenname,
		int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		return findByscreenname(screenname, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the screennameempidmappings where screenname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param screenname the screenname
	 * @param start the lower bound of the range of screennameempidmappings
	 * @param end the upper bound of the range of screennameempidmappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findByscreenname(String screenname,
		int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SCREENNAME;
			finderArgs = new Object[] { screenname };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SCREENNAME;
			finderArgs = new Object[] { screenname, start, end, orderByComparator };
		}

		List<screennameempidmapping> list = null;

		if (retrieveFromCache) {
			list = (List<screennameempidmapping>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (screennameempidmapping screennameempidmapping : list) {
					if (!Objects.equals(screenname,
								screennameempidmapping.getScreenname())) {
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

			query.append(_SQL_SELECT_SCREENNAMEEMPIDMAPPING_WHERE);

			boolean bindScreenname = false;

			if (screenname == null) {
				query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_1);
			}
			else if (screenname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_3);
			}
			else {
				bindScreenname = true;

				query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(screennameempidmappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindScreenname) {
					qPos.add(screenname);
				}

				if (!pagination) {
					list = (List<screennameempidmapping>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<screennameempidmapping>)QueryUtil.list(q,
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
	 * Returns the first screennameempidmapping in the ordered set where screenname = &#63;.
	 *
	 * @param screenname the screenname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching screennameempidmapping
	 * @throws NoSuchscreennameempidmappingException if a matching screennameempidmapping could not be found
	 */
	@Override
	public screennameempidmapping findByscreenname_First(String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator)
		throws NoSuchscreennameempidmappingException {
		screennameempidmapping screennameempidmapping = fetchByscreenname_First(screenname,
				orderByComparator);

		if (screennameempidmapping != null) {
			return screennameempidmapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("screenname=");
		msg.append(screenname);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchscreennameempidmappingException(msg.toString());
	}

	/**
	 * Returns the first screennameempidmapping in the ordered set where screenname = &#63;.
	 *
	 * @param screenname the screenname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching screennameempidmapping, or <code>null</code> if a matching screennameempidmapping could not be found
	 */
	@Override
	public screennameempidmapping fetchByscreenname_First(String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		List<screennameempidmapping> list = findByscreenname(screenname, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last screennameempidmapping in the ordered set where screenname = &#63;.
	 *
	 * @param screenname the screenname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching screennameempidmapping
	 * @throws NoSuchscreennameempidmappingException if a matching screennameempidmapping could not be found
	 */
	@Override
	public screennameempidmapping findByscreenname_Last(String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator)
		throws NoSuchscreennameempidmappingException {
		screennameempidmapping screennameempidmapping = fetchByscreenname_Last(screenname,
				orderByComparator);

		if (screennameempidmapping != null) {
			return screennameempidmapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("screenname=");
		msg.append(screenname);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchscreennameempidmappingException(msg.toString());
	}

	/**
	 * Returns the last screennameempidmapping in the ordered set where screenname = &#63;.
	 *
	 * @param screenname the screenname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching screennameempidmapping, or <code>null</code> if a matching screennameempidmapping could not be found
	 */
	@Override
	public screennameempidmapping fetchByscreenname_Last(String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		int count = countByscreenname(screenname);

		if (count == 0) {
			return null;
		}

		List<screennameempidmapping> list = findByscreenname(screenname,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the screennameempidmappings before and after the current screennameempidmapping in the ordered set where screenname = &#63;.
	 *
	 * @param srno the primary key of the current screennameempidmapping
	 * @param screenname the screenname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next screennameempidmapping
	 * @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	 */
	@Override
	public screennameempidmapping[] findByscreenname_PrevAndNext(int srno,
		String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator)
		throws NoSuchscreennameempidmappingException {
		screennameempidmapping screennameempidmapping = findByPrimaryKey(srno);

		Session session = null;

		try {
			session = openSession();

			screennameempidmapping[] array = new screennameempidmappingImpl[3];

			array[0] = getByscreenname_PrevAndNext(session,
					screennameempidmapping, screenname, orderByComparator, true);

			array[1] = screennameempidmapping;

			array[2] = getByscreenname_PrevAndNext(session,
					screennameempidmapping, screenname, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected screennameempidmapping getByscreenname_PrevAndNext(
		Session session, screennameempidmapping screennameempidmapping,
		String screenname,
		OrderByComparator<screennameempidmapping> orderByComparator,
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

		query.append(_SQL_SELECT_SCREENNAMEEMPIDMAPPING_WHERE);

		boolean bindScreenname = false;

		if (screenname == null) {
			query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_1);
		}
		else if (screenname.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_3);
		}
		else {
			bindScreenname = true;

			query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_2);
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
			query.append(screennameempidmappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindScreenname) {
			qPos.add(screenname);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(screennameempidmapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<screennameempidmapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the screennameempidmappings where screenname = &#63; from the database.
	 *
	 * @param screenname the screenname
	 */
	@Override
	public void removeByscreenname(String screenname) {
		for (screennameempidmapping screennameempidmapping : findByscreenname(
				screenname, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(screennameempidmapping);
		}
	}

	/**
	 * Returns the number of screennameempidmappings where screenname = &#63;.
	 *
	 * @param screenname the screenname
	 * @return the number of matching screennameempidmappings
	 */
	@Override
	public int countByscreenname(String screenname) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SCREENNAME;

		Object[] finderArgs = new Object[] { screenname };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SCREENNAMEEMPIDMAPPING_WHERE);

			boolean bindScreenname = false;

			if (screenname == null) {
				query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_1);
			}
			else if (screenname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_3);
			}
			else {
				bindScreenname = true;

				query.append(_FINDER_COLUMN_SCREENNAME_SCREENNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindScreenname) {
					qPos.add(screenname);
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

	private static final String _FINDER_COLUMN_SCREENNAME_SCREENNAME_1 = "screennameempidmapping.screenname IS NULL";
	private static final String _FINDER_COLUMN_SCREENNAME_SCREENNAME_2 = "screennameempidmapping.screenname = ?";
	private static final String _FINDER_COLUMN_SCREENNAME_SCREENNAME_3 = "(screennameempidmapping.screenname IS NULL OR screennameempidmapping.screenname = '')";

	public screennameempidmappingPersistenceImpl() {
		setModelClass(screennameempidmapping.class);
	}

	/**
	 * Caches the screennameempidmapping in the entity cache if it is enabled.
	 *
	 * @param screennameempidmapping the screennameempidmapping
	 */
	@Override
	public void cacheResult(screennameempidmapping screennameempidmapping) {
		entityCache.putResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingImpl.class,
			screennameempidmapping.getPrimaryKey(), screennameempidmapping);

		screennameempidmapping.resetOriginalValues();
	}

	/**
	 * Caches the screennameempidmappings in the entity cache if it is enabled.
	 *
	 * @param screennameempidmappings the screennameempidmappings
	 */
	@Override
	public void cacheResult(
		List<screennameempidmapping> screennameempidmappings) {
		for (screennameempidmapping screennameempidmapping : screennameempidmappings) {
			if (entityCache.getResult(
						screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
						screennameempidmappingImpl.class,
						screennameempidmapping.getPrimaryKey()) == null) {
				cacheResult(screennameempidmapping);
			}
			else {
				screennameempidmapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all screennameempidmappings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(screennameempidmappingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the screennameempidmapping.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(screennameempidmapping screennameempidmapping) {
		entityCache.removeResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingImpl.class,
			screennameempidmapping.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<screennameempidmapping> screennameempidmappings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (screennameempidmapping screennameempidmapping : screennameempidmappings) {
			entityCache.removeResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
				screennameempidmappingImpl.class,
				screennameempidmapping.getPrimaryKey());
		}
	}

	/**
	 * Creates a new screennameempidmapping with the primary key. Does not add the screennameempidmapping to the database.
	 *
	 * @param srno the primary key for the new screennameempidmapping
	 * @return the new screennameempidmapping
	 */
	@Override
	public screennameempidmapping create(int srno) {
		screennameempidmapping screennameempidmapping = new screennameempidmappingImpl();

		screennameempidmapping.setNew(true);
		screennameempidmapping.setPrimaryKey(srno);

		return screennameempidmapping;
	}

	/**
	 * Removes the screennameempidmapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param srno the primary key of the screennameempidmapping
	 * @return the screennameempidmapping that was removed
	 * @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	 */
	@Override
	public screennameempidmapping remove(int srno)
		throws NoSuchscreennameempidmappingException {
		return remove((Serializable)srno);
	}

	/**
	 * Removes the screennameempidmapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the screennameempidmapping
	 * @return the screennameempidmapping that was removed
	 * @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	 */
	@Override
	public screennameempidmapping remove(Serializable primaryKey)
		throws NoSuchscreennameempidmappingException {
		Session session = null;

		try {
			session = openSession();

			screennameempidmapping screennameempidmapping = (screennameempidmapping)session.get(screennameempidmappingImpl.class,
					primaryKey);

			if (screennameempidmapping == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchscreennameempidmappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(screennameempidmapping);
		}
		catch (NoSuchscreennameempidmappingException nsee) {
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
	protected screennameempidmapping removeImpl(
		screennameempidmapping screennameempidmapping) {
		screennameempidmapping = toUnwrappedModel(screennameempidmapping);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(screennameempidmapping)) {
				screennameempidmapping = (screennameempidmapping)session.get(screennameempidmappingImpl.class,
						screennameempidmapping.getPrimaryKeyObj());
			}

			if (screennameempidmapping != null) {
				session.delete(screennameempidmapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (screennameempidmapping != null) {
			clearCache(screennameempidmapping);
		}

		return screennameempidmapping;
	}

	@Override
	public screennameempidmapping updateImpl(
		screennameempidmapping screennameempidmapping) {
		screennameempidmapping = toUnwrappedModel(screennameempidmapping);

		boolean isNew = screennameempidmapping.isNew();

		screennameempidmappingModelImpl screennameempidmappingModelImpl = (screennameempidmappingModelImpl)screennameempidmapping;

		Session session = null;

		try {
			session = openSession();

			if (screennameempidmapping.isNew()) {
				session.save(screennameempidmapping);

				screennameempidmapping.setNew(false);
			}
			else {
				screennameempidmapping = (screennameempidmapping)session.merge(screennameempidmapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!screennameempidmappingModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					screennameempidmappingModelImpl.getScreenname()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SCREENNAME, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SCREENNAME,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((screennameempidmappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SCREENNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						screennameempidmappingModelImpl.getOriginalScreenname()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SCREENNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SCREENNAME,
					args);

				args = new Object[] {
						screennameempidmappingModelImpl.getScreenname()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SCREENNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SCREENNAME,
					args);
			}
		}

		entityCache.putResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
			screennameempidmappingImpl.class,
			screennameempidmapping.getPrimaryKey(), screennameempidmapping,
			false);

		screennameempidmapping.resetOriginalValues();

		return screennameempidmapping;
	}

	protected screennameempidmapping toUnwrappedModel(
		screennameempidmapping screennameempidmapping) {
		if (screennameempidmapping instanceof screennameempidmappingImpl) {
			return screennameempidmapping;
		}

		screennameempidmappingImpl screennameempidmappingImpl = new screennameempidmappingImpl();

		screennameempidmappingImpl.setNew(screennameempidmapping.isNew());
		screennameempidmappingImpl.setPrimaryKey(screennameempidmapping.getPrimaryKey());

		screennameempidmappingImpl.setSrno(screennameempidmapping.getSrno());
		screennameempidmappingImpl.setScreenname(screennameempidmapping.getScreenname());
		screennameempidmappingImpl.setEmpid(screennameempidmapping.getEmpid());

		return screennameempidmappingImpl;
	}

	/**
	 * Returns the screennameempidmapping with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the screennameempidmapping
	 * @return the screennameempidmapping
	 * @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	 */
	@Override
	public screennameempidmapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchscreennameempidmappingException {
		screennameempidmapping screennameempidmapping = fetchByPrimaryKey(primaryKey);

		if (screennameempidmapping == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchscreennameempidmappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return screennameempidmapping;
	}

	/**
	 * Returns the screennameempidmapping with the primary key or throws a {@link NoSuchscreennameempidmappingException} if it could not be found.
	 *
	 * @param srno the primary key of the screennameempidmapping
	 * @return the screennameempidmapping
	 * @throws NoSuchscreennameempidmappingException if a screennameempidmapping with the primary key could not be found
	 */
	@Override
	public screennameempidmapping findByPrimaryKey(int srno)
		throws NoSuchscreennameempidmappingException {
		return findByPrimaryKey((Serializable)srno);
	}

	/**
	 * Returns the screennameempidmapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the screennameempidmapping
	 * @return the screennameempidmapping, or <code>null</code> if a screennameempidmapping with the primary key could not be found
	 */
	@Override
	public screennameempidmapping fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
				screennameempidmappingImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		screennameempidmapping screennameempidmapping = (screennameempidmapping)serializable;

		if (screennameempidmapping == null) {
			Session session = null;

			try {
				session = openSession();

				screennameempidmapping = (screennameempidmapping)session.get(screennameempidmappingImpl.class,
						primaryKey);

				if (screennameempidmapping != null) {
					cacheResult(screennameempidmapping);
				}
				else {
					entityCache.putResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
						screennameempidmappingImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
					screennameempidmappingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return screennameempidmapping;
	}

	/**
	 * Returns the screennameempidmapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param srno the primary key of the screennameempidmapping
	 * @return the screennameempidmapping, or <code>null</code> if a screennameempidmapping with the primary key could not be found
	 */
	@Override
	public screennameempidmapping fetchByPrimaryKey(int srno) {
		return fetchByPrimaryKey((Serializable)srno);
	}

	@Override
	public Map<Serializable, screennameempidmapping> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, screennameempidmapping> map = new HashMap<Serializable, screennameempidmapping>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			screennameempidmapping screennameempidmapping = fetchByPrimaryKey(primaryKey);

			if (screennameempidmapping != null) {
				map.put(primaryKey, screennameempidmapping);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
					screennameempidmappingImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (screennameempidmapping)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SCREENNAMEEMPIDMAPPING_WHERE_PKS_IN);

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

			for (screennameempidmapping screennameempidmapping : (List<screennameempidmapping>)q.list()) {
				map.put(screennameempidmapping.getPrimaryKeyObj(),
					screennameempidmapping);

				cacheResult(screennameempidmapping);

				uncachedPrimaryKeys.remove(screennameempidmapping.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(screennameempidmappingModelImpl.ENTITY_CACHE_ENABLED,
					screennameempidmappingImpl.class, primaryKey, nullModel);
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
	 * Returns all the screennameempidmappings.
	 *
	 * @return the screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the screennameempidmappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of screennameempidmappings
	 * @param end the upper bound of the range of screennameempidmappings (not inclusive)
	 * @return the range of screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the screennameempidmappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of screennameempidmappings
	 * @param end the upper bound of the range of screennameempidmappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findAll(int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the screennameempidmappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link screennameempidmappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of screennameempidmappings
	 * @param end the upper bound of the range of screennameempidmappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of screennameempidmappings
	 */
	@Override
	public List<screennameempidmapping> findAll(int start, int end,
		OrderByComparator<screennameempidmapping> orderByComparator,
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

		List<screennameempidmapping> list = null;

		if (retrieveFromCache) {
			list = (List<screennameempidmapping>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SCREENNAMEEMPIDMAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCREENNAMEEMPIDMAPPING;

				if (pagination) {
					sql = sql.concat(screennameempidmappingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<screennameempidmapping>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<screennameempidmapping>)QueryUtil.list(q,
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
	 * Removes all the screennameempidmappings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (screennameempidmapping screennameempidmapping : findAll()) {
			remove(screennameempidmapping);
		}
	}

	/**
	 * Returns the number of screennameempidmappings.
	 *
	 * @return the number of screennameempidmappings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SCREENNAMEEMPIDMAPPING);

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
		return screennameempidmappingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the screennameempidmapping persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(screennameempidmappingImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SCREENNAMEEMPIDMAPPING = "SELECT screennameempidmapping FROM screennameempidmapping screennameempidmapping";
	private static final String _SQL_SELECT_SCREENNAMEEMPIDMAPPING_WHERE_PKS_IN = "SELECT screennameempidmapping FROM screennameempidmapping screennameempidmapping WHERE srno IN (";
	private static final String _SQL_SELECT_SCREENNAMEEMPIDMAPPING_WHERE = "SELECT screennameempidmapping FROM screennameempidmapping screennameempidmapping WHERE ";
	private static final String _SQL_COUNT_SCREENNAMEEMPIDMAPPING = "SELECT COUNT(screennameempidmapping) FROM screennameempidmapping screennameempidmapping";
	private static final String _SQL_COUNT_SCREENNAMEEMPIDMAPPING_WHERE = "SELECT COUNT(screennameempidmapping) FROM screennameempidmapping screennameempidmapping WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "screennameempidmapping.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No screennameempidmapping exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No screennameempidmapping exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(screennameempidmappingPersistenceImpl.class);
}