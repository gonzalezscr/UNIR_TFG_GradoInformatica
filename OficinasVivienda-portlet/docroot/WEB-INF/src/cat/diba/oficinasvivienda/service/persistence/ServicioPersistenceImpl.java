/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package cat.diba.oficinasvivienda.service.persistence;

import cat.diba.oficinasvivienda.NoSuchServicioException;
import cat.diba.oficinasvivienda.model.Servicio;
import cat.diba.oficinasvivienda.model.impl.ServicioImpl;
import cat.diba.oficinasvivienda.model.impl.ServicioModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the servicio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see ServicioPersistence
 * @see ServicioUtil
 * @generated
 */
public class ServicioPersistenceImpl extends BasePersistenceImpl<Servicio>
	implements ServicioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServicioUtil} to access the servicio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServicioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, ServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, ServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYGROUP =
		new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, ServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycompanyGroup",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP =
		new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, ServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycompanyGroup",
			new String[] { Long.class.getName(), Long.class.getName() },
			ServicioModelImpl.COMPANYID_COLUMN_BITMASK |
			ServicioModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYGROUP = new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycompanyGroup",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the servicios where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Servicio> findBycompanyGroup(long companyId, long groupId)
		throws SystemException {
		return findBycompanyGroup(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the servicios where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of servicios
	 * @param end the upper bound of the range of servicios (not inclusive)
	 * @return the range of matching servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Servicio> findBycompanyGroup(long companyId, long groupId,
		int start, int end) throws SystemException {
		return findBycompanyGroup(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the servicios where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of servicios
	 * @param end the upper bound of the range of servicios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Servicio> findBycompanyGroup(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYGROUP;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<Servicio> list = (List<Servicio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Servicio servicio : list) {
				if ((companyId != servicio.getCompanyId()) ||
						(groupId != servicio.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SERVICIO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYGROUP_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUP_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServicioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Servicio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Servicio>(list);
				}
				else {
					list = (List<Servicio>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first servicio in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching servicio
	 * @throws cat.diba.oficinasvivienda.NoSuchServicioException if a matching servicio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio findBycompanyGroup_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchServicioException, SystemException {
		Servicio servicio = fetchBycompanyGroup_First(companyId, groupId,
				orderByComparator);

		if (servicio != null) {
			return servicio;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicioException(msg.toString());
	}

	/**
	 * Returns the first servicio in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching servicio, or <code>null</code> if a matching servicio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio fetchBycompanyGroup_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Servicio> list = findBycompanyGroup(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last servicio in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching servicio
	 * @throws cat.diba.oficinasvivienda.NoSuchServicioException if a matching servicio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio findBycompanyGroup_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchServicioException, SystemException {
		Servicio servicio = fetchBycompanyGroup_Last(companyId, groupId,
				orderByComparator);

		if (servicio != null) {
			return servicio;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicioException(msg.toString());
	}

	/**
	 * Returns the last servicio in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching servicio, or <code>null</code> if a matching servicio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio fetchBycompanyGroup_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycompanyGroup(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<Servicio> list = findBycompanyGroup(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the servicios before and after the current servicio in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param idServicio the primary key of the current servicio
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next servicio
	 * @throws cat.diba.oficinasvivienda.NoSuchServicioException if a servicio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio[] findBycompanyGroup_PrevAndNext(long idServicio,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchServicioException, SystemException {
		Servicio servicio = findByPrimaryKey(idServicio);

		Session session = null;

		try {
			session = openSession();

			Servicio[] array = new ServicioImpl[3];

			array[0] = getBycompanyGroup_PrevAndNext(session, servicio,
					companyId, groupId, orderByComparator, true);

			array[1] = servicio;

			array[2] = getBycompanyGroup_PrevAndNext(session, servicio,
					companyId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Servicio getBycompanyGroup_PrevAndNext(Session session,
		Servicio servicio, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICIO_WHERE);

		query.append(_FINDER_COLUMN_COMPANYGROUP_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYGROUP_GROUPID_2);

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
			query.append(ServicioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(servicio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Servicio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the servicios where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycompanyGroup(long companyId, long groupId)
		throws SystemException {
		for (Servicio servicio : findBycompanyGroup(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(servicio);
		}
	}

	/**
	 * Returns the number of servicios where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycompanyGroup(long companyId, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYGROUP;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SERVICIO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYGROUP_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUP_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYGROUP_COMPANYID_2 = "servicio.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYGROUP_GROUPID_2 = "servicio.groupId = ?";

	public ServicioPersistenceImpl() {
		setModelClass(Servicio.class);
	}

	/**
	 * Caches the servicio in the entity cache if it is enabled.
	 *
	 * @param servicio the servicio
	 */
	@Override
	public void cacheResult(Servicio servicio) {
		EntityCacheUtil.putResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioImpl.class, servicio.getPrimaryKey(), servicio);

		servicio.resetOriginalValues();
	}

	/**
	 * Caches the servicios in the entity cache if it is enabled.
	 *
	 * @param servicios the servicios
	 */
	@Override
	public void cacheResult(List<Servicio> servicios) {
		for (Servicio servicio : servicios) {
			if (EntityCacheUtil.getResult(
						ServicioModelImpl.ENTITY_CACHE_ENABLED,
						ServicioImpl.class, servicio.getPrimaryKey()) == null) {
				cacheResult(servicio);
			}
			else {
				servicio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all servicios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServicioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServicioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the servicio.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Servicio servicio) {
		EntityCacheUtil.removeResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioImpl.class, servicio.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Servicio> servicios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Servicio servicio : servicios) {
			EntityCacheUtil.removeResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
				ServicioImpl.class, servicio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new servicio with the primary key. Does not add the servicio to the database.
	 *
	 * @param idServicio the primary key for the new servicio
	 * @return the new servicio
	 */
	@Override
	public Servicio create(long idServicio) {
		Servicio servicio = new ServicioImpl();

		servicio.setNew(true);
		servicio.setPrimaryKey(idServicio);

		return servicio;
	}

	/**
	 * Removes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchServicioException if a servicio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio remove(long idServicio)
		throws NoSuchServicioException, SystemException {
		return remove((Serializable)idServicio);
	}

	/**
	 * Removes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the servicio
	 * @return the servicio that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchServicioException if a servicio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio remove(Serializable primaryKey)
		throws NoSuchServicioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Servicio servicio = (Servicio)session.get(ServicioImpl.class,
					primaryKey);

			if (servicio == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServicioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(servicio);
		}
		catch (NoSuchServicioException nsee) {
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
	protected Servicio removeImpl(Servicio servicio) throws SystemException {
		servicio = toUnwrappedModel(servicio);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(servicio)) {
				servicio = (Servicio)session.get(ServicioImpl.class,
						servicio.getPrimaryKeyObj());
			}

			if (servicio != null) {
				session.delete(servicio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (servicio != null) {
			clearCache(servicio);
		}

		return servicio;
	}

	@Override
	public Servicio updateImpl(
		cat.diba.oficinasvivienda.model.Servicio servicio)
		throws SystemException {
		servicio = toUnwrappedModel(servicio);

		boolean isNew = servicio.isNew();

		ServicioModelImpl servicioModelImpl = (ServicioModelImpl)servicio;

		Session session = null;

		try {
			session = openSession();

			if (servicio.isNew()) {
				session.save(servicio);

				servicio.setNew(false);
			}
			else {
				session.merge(servicio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServicioModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((servicioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						servicioModelImpl.getOriginalCompanyId(),
						servicioModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUP,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP,
					args);

				args = new Object[] {
						servicioModelImpl.getCompanyId(),
						servicioModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUP,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP,
					args);
			}
		}

		EntityCacheUtil.putResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioImpl.class, servicio.getPrimaryKey(), servicio);

		return servicio;
	}

	protected Servicio toUnwrappedModel(Servicio servicio) {
		if (servicio instanceof ServicioImpl) {
			return servicio;
		}

		ServicioImpl servicioImpl = new ServicioImpl();

		servicioImpl.setNew(servicio.isNew());
		servicioImpl.setPrimaryKey(servicio.getPrimaryKey());

		servicioImpl.setIdServicio(servicio.getIdServicio());
		servicioImpl.setCompanyId(servicio.getCompanyId());
		servicioImpl.setGroupId(servicio.getGroupId());
		servicioImpl.setNombre(servicio.getNombre());
		servicioImpl.setNecesidad(servicio.getNecesidad());

		return servicioImpl;
	}

	/**
	 * Returns the servicio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the servicio
	 * @return the servicio
	 * @throws cat.diba.oficinasvivienda.NoSuchServicioException if a servicio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServicioException, SystemException {
		Servicio servicio = fetchByPrimaryKey(primaryKey);

		if (servicio == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServicioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return servicio;
	}

	/**
	 * Returns the servicio with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchServicioException} if it could not be found.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio
	 * @throws cat.diba.oficinasvivienda.NoSuchServicioException if a servicio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio findByPrimaryKey(long idServicio)
		throws NoSuchServicioException, SystemException {
		return findByPrimaryKey((Serializable)idServicio);
	}

	/**
	 * Returns the servicio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the servicio
	 * @return the servicio, or <code>null</code> if a servicio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Servicio servicio = (Servicio)EntityCacheUtil.getResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
				ServicioImpl.class, primaryKey);

		if (servicio == _nullServicio) {
			return null;
		}

		if (servicio == null) {
			Session session = null;

			try {
				session = openSession();

				servicio = (Servicio)session.get(ServicioImpl.class, primaryKey);

				if (servicio != null) {
					cacheResult(servicio);
				}
				else {
					EntityCacheUtil.putResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
						ServicioImpl.class, primaryKey, _nullServicio);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
					ServicioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return servicio;
	}

	/**
	 * Returns the servicio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio, or <code>null</code> if a servicio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servicio fetchByPrimaryKey(long idServicio)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)idServicio);
	}

	/**
	 * Returns all the servicios.
	 *
	 * @return the servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Servicio> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the servicios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of servicios
	 * @param end the upper bound of the range of servicios (not inclusive)
	 * @return the range of servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Servicio> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the servicios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of servicios
	 * @param end the upper bound of the range of servicios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Servicio> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<Servicio> list = (List<Servicio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICIO;

				if (pagination) {
					sql = sql.concat(ServicioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Servicio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Servicio>(list);
				}
				else {
					list = (List<Servicio>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the servicios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Servicio servicio : findAll()) {
			remove(servicio);
		}
	}

	/**
	 * Returns the number of servicios.
	 *
	 * @return the number of servicios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SERVICIO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the servicio persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cat.diba.oficinasvivienda.model.Servicio")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Servicio>> listenersList = new ArrayList<ModelListener<Servicio>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Servicio>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ServicioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICIO = "SELECT servicio FROM Servicio servicio";
	private static final String _SQL_SELECT_SERVICIO_WHERE = "SELECT servicio FROM Servicio servicio WHERE ";
	private static final String _SQL_COUNT_SERVICIO = "SELECT COUNT(servicio) FROM Servicio servicio";
	private static final String _SQL_COUNT_SERVICIO_WHERE = "SELECT COUNT(servicio) FROM Servicio servicio WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "servicio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Servicio exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Servicio exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ServicioPersistenceImpl.class);
	private static Servicio _nullServicio = new ServicioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Servicio> toCacheModel() {
				return _nullServicioCacheModel;
			}
		};

	private static CacheModel<Servicio> _nullServicioCacheModel = new CacheModel<Servicio>() {
			@Override
			public Servicio toEntityModel() {
				return _nullServicio;
			}
		};
}