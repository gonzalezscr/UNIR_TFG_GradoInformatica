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

import cat.diba.oficinasvivienda.NoSuchTipoException;
import cat.diba.oficinasvivienda.model.Tipo;
import cat.diba.oficinasvivienda.model.impl.TipoImpl;
import cat.diba.oficinasvivienda.model.impl.TipoModelImpl;

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
 * The persistence implementation for the tipo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see TipoPersistence
 * @see TipoUtil
 * @generated
 */
public class TipoPersistenceImpl extends BasePersistenceImpl<Tipo>
	implements TipoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TipoUtil} to access the tipo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TipoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoModelImpl.FINDER_CACHE_ENABLED, TipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoModelImpl.FINDER_CACHE_ENABLED, TipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYGROUP =
		new FinderPath(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoModelImpl.FINDER_CACHE_ENABLED, TipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycompanyGroup",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP =
		new FinderPath(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoModelImpl.FINDER_CACHE_ENABLED, TipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycompanyGroup",
			new String[] { Long.class.getName(), Long.class.getName() },
			TipoModelImpl.COMPANYID_COLUMN_BITMASK |
			TipoModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYGROUP = new FinderPath(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycompanyGroup",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tipos where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tipo> findBycompanyGroup(long companyId, long groupId)
		throws SystemException {
		return findBycompanyGroup(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipos where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tipos
	 * @param end the upper bound of the range of tipos (not inclusive)
	 * @return the range of matching tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tipo> findBycompanyGroup(long companyId, long groupId,
		int start, int end) throws SystemException {
		return findBycompanyGroup(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipos where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tipos
	 * @param end the upper bound of the range of tipos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tipo> findBycompanyGroup(long companyId, long groupId,
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

		List<Tipo> list = (List<Tipo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Tipo tipo : list) {
				if ((companyId != tipo.getCompanyId()) ||
						(groupId != tipo.getGroupId())) {
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

			query.append(_SQL_SELECT_TIPO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYGROUP_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUP_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TipoModelImpl.ORDER_BY_JPQL);
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
					list = (List<Tipo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Tipo>(list);
				}
				else {
					list = (List<Tipo>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchTipoException if a matching tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo findBycompanyGroup_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTipoException, SystemException {
		Tipo tipo = fetchBycompanyGroup_First(companyId, groupId,
				orderByComparator);

		if (tipo != null) {
			return tipo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTipoException(msg.toString());
	}

	/**
	 * Returns the first tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo fetchBycompanyGroup_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Tipo> list = findBycompanyGroup(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchTipoException if a matching tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo findBycompanyGroup_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTipoException, SystemException {
		Tipo tipo = fetchBycompanyGroup_Last(companyId, groupId,
				orderByComparator);

		if (tipo != null) {
			return tipo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTipoException(msg.toString());
	}

	/**
	 * Returns the last tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo fetchBycompanyGroup_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycompanyGroup(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<Tipo> list = findBycompanyGroup(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tipos before and after the current tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param idTipo the primary key of the current tipo
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo[] findBycompanyGroup_PrevAndNext(long idTipo, long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchTipoException, SystemException {
		Tipo tipo = findByPrimaryKey(idTipo);

		Session session = null;

		try {
			session = openSession();

			Tipo[] array = new TipoImpl[3];

			array[0] = getBycompanyGroup_PrevAndNext(session, tipo, companyId,
					groupId, orderByComparator, true);

			array[1] = tipo;

			array[2] = getBycompanyGroup_PrevAndNext(session, tipo, companyId,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tipo getBycompanyGroup_PrevAndNext(Session session, Tipo tipo,
		long companyId, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TIPO_WHERE);

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
			query.append(TipoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tipo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tipo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tipos where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycompanyGroup(long companyId, long groupId)
		throws SystemException {
		for (Tipo tipo : findBycompanyGroup(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tipo);
		}
	}

	/**
	 * Returns the number of tipos where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching tipos
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

			query.append(_SQL_COUNT_TIPO_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYGROUP_COMPANYID_2 = "tipo.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYGROUP_GROUPID_2 = "tipo.groupId = ?";

	public TipoPersistenceImpl() {
		setModelClass(Tipo.class);
	}

	/**
	 * Caches the tipo in the entity cache if it is enabled.
	 *
	 * @param tipo the tipo
	 */
	@Override
	public void cacheResult(Tipo tipo) {
		EntityCacheUtil.putResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoImpl.class, tipo.getPrimaryKey(), tipo);

		tipo.resetOriginalValues();
	}

	/**
	 * Caches the tipos in the entity cache if it is enabled.
	 *
	 * @param tipos the tipos
	 */
	@Override
	public void cacheResult(List<Tipo> tipos) {
		for (Tipo tipo : tipos) {
			if (EntityCacheUtil.getResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
						TipoImpl.class, tipo.getPrimaryKey()) == null) {
				cacheResult(tipo);
			}
			else {
				tipo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TipoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TipoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tipo tipo) {
		EntityCacheUtil.removeResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoImpl.class, tipo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Tipo> tipos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Tipo tipo : tipos) {
			EntityCacheUtil.removeResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
				TipoImpl.class, tipo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipo with the primary key. Does not add the tipo to the database.
	 *
	 * @param idTipo the primary key for the new tipo
	 * @return the new tipo
	 */
	@Override
	public Tipo create(long idTipo) {
		Tipo tipo = new TipoImpl();

		tipo.setNew(true);
		tipo.setPrimaryKey(idTipo);

		return tipo;
	}

	/**
	 * Removes the tipo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idTipo the primary key of the tipo
	 * @return the tipo that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo remove(long idTipo) throws NoSuchTipoException, SystemException {
		return remove((Serializable)idTipo);
	}

	/**
	 * Removes the tipo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipo
	 * @return the tipo that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo remove(Serializable primaryKey)
		throws NoSuchTipoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Tipo tipo = (Tipo)session.get(TipoImpl.class, primaryKey);

			if (tipo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTipoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipo);
		}
		catch (NoSuchTipoException nsee) {
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
	protected Tipo removeImpl(Tipo tipo) throws SystemException {
		tipo = toUnwrappedModel(tipo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipo)) {
				tipo = (Tipo)session.get(TipoImpl.class, tipo.getPrimaryKeyObj());
			}

			if (tipo != null) {
				session.delete(tipo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipo != null) {
			clearCache(tipo);
		}

		return tipo;
	}

	@Override
	public Tipo updateImpl(cat.diba.oficinasvivienda.model.Tipo tipo)
		throws SystemException {
		tipo = toUnwrappedModel(tipo);

		boolean isNew = tipo.isNew();

		TipoModelImpl tipoModelImpl = (TipoModelImpl)tipo;

		Session session = null;

		try {
			session = openSession();

			if (tipo.isNew()) {
				session.save(tipo);

				tipo.setNew(false);
			}
			else {
				session.merge(tipo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TipoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tipoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tipoModelImpl.getOriginalCompanyId(),
						tipoModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUP,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP,
					args);

				args = new Object[] {
						tipoModelImpl.getCompanyId(), tipoModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUP,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP,
					args);
			}
		}

		EntityCacheUtil.putResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
			TipoImpl.class, tipo.getPrimaryKey(), tipo);

		return tipo;
	}

	protected Tipo toUnwrappedModel(Tipo tipo) {
		if (tipo instanceof TipoImpl) {
			return tipo;
		}

		TipoImpl tipoImpl = new TipoImpl();

		tipoImpl.setNew(tipo.isNew());
		tipoImpl.setPrimaryKey(tipo.getPrimaryKey());

		tipoImpl.setIdTipo(tipo.getIdTipo());
		tipoImpl.setCompanyId(tipo.getCompanyId());
		tipoImpl.setGroupId(tipo.getGroupId());
		tipoImpl.setNombre(tipo.getNombre());

		return tipoImpl;
	}

	/**
	 * Returns the tipo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo
	 * @return the tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTipoException, SystemException {
		Tipo tipo = fetchByPrimaryKey(primaryKey);

		if (tipo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTipoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipo;
	}

	/**
	 * Returns the tipo with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchTipoException} if it could not be found.
	 *
	 * @param idTipo the primary key of the tipo
	 * @return the tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo findByPrimaryKey(long idTipo)
		throws NoSuchTipoException, SystemException {
		return findByPrimaryKey((Serializable)idTipo);
	}

	/**
	 * Returns the tipo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo
	 * @return the tipo, or <code>null</code> if a tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Tipo tipo = (Tipo)EntityCacheUtil.getResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
				TipoImpl.class, primaryKey);

		if (tipo == _nullTipo) {
			return null;
		}

		if (tipo == null) {
			Session session = null;

			try {
				session = openSession();

				tipo = (Tipo)session.get(TipoImpl.class, primaryKey);

				if (tipo != null) {
					cacheResult(tipo);
				}
				else {
					EntityCacheUtil.putResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
						TipoImpl.class, primaryKey, _nullTipo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TipoModelImpl.ENTITY_CACHE_ENABLED,
					TipoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipo;
	}

	/**
	 * Returns the tipo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idTipo the primary key of the tipo
	 * @return the tipo, or <code>null</code> if a tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tipo fetchByPrimaryKey(long idTipo) throws SystemException {
		return fetchByPrimaryKey((Serializable)idTipo);
	}

	/**
	 * Returns all the tipos.
	 *
	 * @return the tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tipo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipos
	 * @param end the upper bound of the range of tipos (not inclusive)
	 * @return the range of tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tipo> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipos
	 * @param end the upper bound of the range of tipos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tipo> findAll(int start, int end,
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

		List<Tipo> list = (List<Tipo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TIPO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPO;

				if (pagination) {
					sql = sql.concat(TipoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Tipo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Tipo>(list);
				}
				else {
					list = (List<Tipo>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the tipos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Tipo tipo : findAll()) {
			remove(tipo);
		}
	}

	/**
	 * Returns the number of tipos.
	 *
	 * @return the number of tipos
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

				Query q = session.createQuery(_SQL_COUNT_TIPO);

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
	 * Initializes the tipo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cat.diba.oficinasvivienda.model.Tipo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Tipo>> listenersList = new ArrayList<ModelListener<Tipo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Tipo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TipoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TIPO = "SELECT tipo FROM Tipo tipo";
	private static final String _SQL_SELECT_TIPO_WHERE = "SELECT tipo FROM Tipo tipo WHERE ";
	private static final String _SQL_COUNT_TIPO = "SELECT COUNT(tipo) FROM Tipo tipo";
	private static final String _SQL_COUNT_TIPO_WHERE = "SELECT COUNT(tipo) FROM Tipo tipo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tipo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Tipo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TipoPersistenceImpl.class);
	private static Tipo _nullTipo = new TipoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Tipo> toCacheModel() {
				return _nullTipoCacheModel;
			}
		};

	private static CacheModel<Tipo> _nullTipoCacheModel = new CacheModel<Tipo>() {
			@Override
			public Tipo toEntityModel() {
				return _nullTipo;
			}
		};
}