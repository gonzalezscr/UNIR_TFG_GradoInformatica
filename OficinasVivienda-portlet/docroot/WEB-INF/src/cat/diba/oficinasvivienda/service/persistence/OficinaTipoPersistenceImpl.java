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

import cat.diba.oficinasvivienda.NoSuchOficinaTipoException;
import cat.diba.oficinasvivienda.model.OficinaTipo;
import cat.diba.oficinasvivienda.model.impl.OficinaTipoImpl;
import cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl;

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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the oficina tipo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaTipoPersistence
 * @see OficinaTipoUtil
 * @generated
 */
public class OficinaTipoPersistenceImpl extends BasePersistenceImpl<OficinaTipo>
	implements OficinaTipoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OficinaTipoUtil} to access the oficina tipo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OficinaTipoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, OficinaTipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, OficinaTipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_OFICINATIPO = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, OficinaTipoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByOficinaTipo",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			OficinaTipoModelImpl.COMPANYID_COLUMN_BITMASK |
			OficinaTipoModelImpl.GROUPID_COLUMN_BITMASK |
			OficinaTipoModelImpl.IDOFICINA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OFICINATIPO = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOficinaTipo",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the oficina tipo where companyId = &#63; and groupId = &#63; and idOficina = &#63; or throws a {@link cat.diba.oficinasvivienda.NoSuchOficinaTipoException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @return the matching oficina tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a matching oficina tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo findByOficinaTipo(long companyId, long groupId,
		long idOficina) throws NoSuchOficinaTipoException, SystemException {
		OficinaTipo oficinaTipo = fetchByOficinaTipo(companyId, groupId,
				idOficina);

		if (oficinaTipo == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", idOficina=");
			msg.append(idOficina);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOficinaTipoException(msg.toString());
		}

		return oficinaTipo;
	}

	/**
	 * Returns the oficina tipo where companyId = &#63; and groupId = &#63; and idOficina = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @return the matching oficina tipo, or <code>null</code> if a matching oficina tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo fetchByOficinaTipo(long companyId, long groupId,
		long idOficina) throws SystemException {
		return fetchByOficinaTipo(companyId, groupId, idOficina, true);
	}

	/**
	 * Returns the oficina tipo where companyId = &#63; and groupId = &#63; and idOficina = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching oficina tipo, or <code>null</code> if a matching oficina tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo fetchByOficinaTipo(long companyId, long groupId,
		long idOficina, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, idOficina };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_OFICINATIPO,
					finderArgs, this);
		}

		if (result instanceof OficinaTipo) {
			OficinaTipo oficinaTipo = (OficinaTipo)result;

			if ((companyId != oficinaTipo.getCompanyId()) ||
					(groupId != oficinaTipo.getGroupId()) ||
					(idOficina != oficinaTipo.getIdOficina())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_OFICINATIPO_WHERE);

			query.append(_FINDER_COLUMN_OFICINATIPO_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINATIPO_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINATIPO_IDOFICINA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idOficina);

				List<OficinaTipo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFICINATIPO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OficinaTipoPersistenceImpl.fetchByOficinaTipo(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					OficinaTipo oficinaTipo = list.get(0);

					result = oficinaTipo;

					cacheResult(oficinaTipo);

					if ((oficinaTipo.getCompanyId() != companyId) ||
							(oficinaTipo.getGroupId() != groupId) ||
							(oficinaTipo.getIdOficina() != idOficina)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFICINATIPO,
							finderArgs, oficinaTipo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OFICINATIPO,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (OficinaTipo)result;
		}
	}

	/**
	 * Removes the oficina tipo where companyId = &#63; and groupId = &#63; and idOficina = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @return the oficina tipo that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo removeByOficinaTipo(long companyId, long groupId,
		long idOficina) throws NoSuchOficinaTipoException, SystemException {
		OficinaTipo oficinaTipo = findByOficinaTipo(companyId, groupId,
				idOficina);

		return remove(oficinaTipo);
	}

	/**
	 * Returns the number of oficina tipos where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @return the number of matching oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOficinaTipo(long companyId, long groupId, long idOficina)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OFICINATIPO;

		Object[] finderArgs = new Object[] { companyId, groupId, idOficina };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_OFICINATIPO_WHERE);

			query.append(_FINDER_COLUMN_OFICINATIPO_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINATIPO_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINATIPO_IDOFICINA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idOficina);

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

	private static final String _FINDER_COLUMN_OFICINATIPO_COMPANYID_2 = "oficinaTipo.companyId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINATIPO_GROUPID_2 = "oficinaTipo.groupId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINATIPO_IDOFICINA_2 = "oficinaTipo.idOficina = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TIPO = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, OficinaTipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTipo",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPO = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, OficinaTipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTipo",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			OficinaTipoModelImpl.COMPANYID_COLUMN_BITMASK |
			OficinaTipoModelImpl.GROUPID_COLUMN_BITMASK |
			OficinaTipoModelImpl.IDTIPO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TIPO = new FinderPath(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTipo",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the oficina tipos where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @return the matching oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaTipo> findByTipo(long companyId, long groupId,
		long idTipo) throws SystemException {
		return findByTipo(companyId, groupId, idTipo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oficina tipos where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @param start the lower bound of the range of oficina tipos
	 * @param end the upper bound of the range of oficina tipos (not inclusive)
	 * @return the range of matching oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaTipo> findByTipo(long companyId, long groupId,
		long idTipo, int start, int end) throws SystemException {
		return findByTipo(companyId, groupId, idTipo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the oficina tipos where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @param start the lower bound of the range of oficina tipos
	 * @param end the upper bound of the range of oficina tipos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaTipo> findByTipo(long companyId, long groupId,
		long idTipo, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPO;
			finderArgs = new Object[] { companyId, groupId, idTipo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TIPO;
			finderArgs = new Object[] {
					companyId, groupId, idTipo,
					
					start, end, orderByComparator
				};
		}

		List<OficinaTipo> list = (List<OficinaTipo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OficinaTipo oficinaTipo : list) {
				if ((companyId != oficinaTipo.getCompanyId()) ||
						(groupId != oficinaTipo.getGroupId()) ||
						(idTipo != oficinaTipo.getIdTipo())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_OFICINATIPO_WHERE);

			query.append(_FINDER_COLUMN_TIPO_COMPANYID_2);

			query.append(_FINDER_COLUMN_TIPO_GROUPID_2);

			query.append(_FINDER_COLUMN_TIPO_IDTIPO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OficinaTipoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idTipo);

				if (!pagination) {
					list = (List<OficinaTipo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OficinaTipo>(list);
				}
				else {
					list = (List<OficinaTipo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first oficina tipo in the ordered set where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a matching oficina tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo findByTipo_First(long companyId, long groupId,
		long idTipo, OrderByComparator orderByComparator)
		throws NoSuchOficinaTipoException, SystemException {
		OficinaTipo oficinaTipo = fetchByTipo_First(companyId, groupId, idTipo,
				orderByComparator);

		if (oficinaTipo != null) {
			return oficinaTipo;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idTipo=");
		msg.append(idTipo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaTipoException(msg.toString());
	}

	/**
	 * Returns the first oficina tipo in the ordered set where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina tipo, or <code>null</code> if a matching oficina tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo fetchByTipo_First(long companyId, long groupId,
		long idTipo, OrderByComparator orderByComparator)
		throws SystemException {
		List<OficinaTipo> list = findByTipo(companyId, groupId, idTipo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last oficina tipo in the ordered set where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a matching oficina tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo findByTipo_Last(long companyId, long groupId,
		long idTipo, OrderByComparator orderByComparator)
		throws NoSuchOficinaTipoException, SystemException {
		OficinaTipo oficinaTipo = fetchByTipo_Last(companyId, groupId, idTipo,
				orderByComparator);

		if (oficinaTipo != null) {
			return oficinaTipo;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idTipo=");
		msg.append(idTipo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaTipoException(msg.toString());
	}

	/**
	 * Returns the last oficina tipo in the ordered set where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina tipo, or <code>null</code> if a matching oficina tipo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo fetchByTipo_Last(long companyId, long groupId,
		long idTipo, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTipo(companyId, groupId, idTipo);

		if (count == 0) {
			return null;
		}

		List<OficinaTipo> list = findByTipo(companyId, groupId, idTipo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the oficina tipos before and after the current oficina tipo in the ordered set where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * @param id the primary key of the current oficina tipo
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oficina tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a oficina tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo[] findByTipo_PrevAndNext(long id, long companyId,
		long groupId, long idTipo, OrderByComparator orderByComparator)
		throws NoSuchOficinaTipoException, SystemException {
		OficinaTipo oficinaTipo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OficinaTipo[] array = new OficinaTipoImpl[3];

			array[0] = getByTipo_PrevAndNext(session, oficinaTipo, companyId,
					groupId, idTipo, orderByComparator, true);

			array[1] = oficinaTipo;

			array[2] = getByTipo_PrevAndNext(session, oficinaTipo, companyId,
					groupId, idTipo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OficinaTipo getByTipo_PrevAndNext(Session session,
		OficinaTipo oficinaTipo, long companyId, long groupId, long idTipo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFICINATIPO_WHERE);

		query.append(_FINDER_COLUMN_TIPO_COMPANYID_2);

		query.append(_FINDER_COLUMN_TIPO_GROUPID_2);

		query.append(_FINDER_COLUMN_TIPO_IDTIPO_2);

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
			query.append(OficinaTipoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(idTipo);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oficinaTipo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OficinaTipo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the oficina tipos where companyId = &#63; and groupId = &#63; and idTipo = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTipo(long companyId, long groupId, long idTipo)
		throws SystemException {
		for (OficinaTipo oficinaTipo : findByTipo(companyId, groupId, idTipo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(oficinaTipo);
		}
	}

	/**
	 * Returns the number of oficina tipos where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idTipo the id tipo
	 * @return the number of matching oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTipo(long companyId, long groupId, long idTipo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TIPO;

		Object[] finderArgs = new Object[] { companyId, groupId, idTipo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_OFICINATIPO_WHERE);

			query.append(_FINDER_COLUMN_TIPO_COMPANYID_2);

			query.append(_FINDER_COLUMN_TIPO_GROUPID_2);

			query.append(_FINDER_COLUMN_TIPO_IDTIPO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idTipo);

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

	private static final String _FINDER_COLUMN_TIPO_COMPANYID_2 = "oficinaTipo.companyId = ? AND ";
	private static final String _FINDER_COLUMN_TIPO_GROUPID_2 = "oficinaTipo.groupId = ? AND ";
	private static final String _FINDER_COLUMN_TIPO_IDTIPO_2 = "oficinaTipo.idTipo = ?";

	public OficinaTipoPersistenceImpl() {
		setModelClass(OficinaTipo.class);
	}

	/**
	 * Caches the oficina tipo in the entity cache if it is enabled.
	 *
	 * @param oficinaTipo the oficina tipo
	 */
	@Override
	public void cacheResult(OficinaTipo oficinaTipo) {
		EntityCacheUtil.putResult(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoImpl.class, oficinaTipo.getPrimaryKey(), oficinaTipo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFICINATIPO,
			new Object[] {
				oficinaTipo.getCompanyId(), oficinaTipo.getGroupId(),
				oficinaTipo.getIdOficina()
			}, oficinaTipo);

		oficinaTipo.resetOriginalValues();
	}

	/**
	 * Caches the oficina tipos in the entity cache if it is enabled.
	 *
	 * @param oficinaTipos the oficina tipos
	 */
	@Override
	public void cacheResult(List<OficinaTipo> oficinaTipos) {
		for (OficinaTipo oficinaTipo : oficinaTipos) {
			if (EntityCacheUtil.getResult(
						OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
						OficinaTipoImpl.class, oficinaTipo.getPrimaryKey()) == null) {
				cacheResult(oficinaTipo);
			}
			else {
				oficinaTipo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oficina tipos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OficinaTipoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OficinaTipoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oficina tipo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OficinaTipo oficinaTipo) {
		EntityCacheUtil.removeResult(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoImpl.class, oficinaTipo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(oficinaTipo);
	}

	@Override
	public void clearCache(List<OficinaTipo> oficinaTipos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OficinaTipo oficinaTipo : oficinaTipos) {
			EntityCacheUtil.removeResult(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
				OficinaTipoImpl.class, oficinaTipo.getPrimaryKey());

			clearUniqueFindersCache(oficinaTipo);
		}
	}

	protected void cacheUniqueFindersCache(OficinaTipo oficinaTipo) {
		if (oficinaTipo.isNew()) {
			Object[] args = new Object[] {
					oficinaTipo.getCompanyId(), oficinaTipo.getGroupId(),
					oficinaTipo.getIdOficina()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OFICINATIPO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFICINATIPO, args,
				oficinaTipo);
		}
		else {
			OficinaTipoModelImpl oficinaTipoModelImpl = (OficinaTipoModelImpl)oficinaTipo;

			if ((oficinaTipoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_OFICINATIPO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oficinaTipo.getCompanyId(), oficinaTipo.getGroupId(),
						oficinaTipo.getIdOficina()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OFICINATIPO,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OFICINATIPO,
					args, oficinaTipo);
			}
		}
	}

	protected void clearUniqueFindersCache(OficinaTipo oficinaTipo) {
		OficinaTipoModelImpl oficinaTipoModelImpl = (OficinaTipoModelImpl)oficinaTipo;

		Object[] args = new Object[] {
				oficinaTipo.getCompanyId(), oficinaTipo.getGroupId(),
				oficinaTipo.getIdOficina()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINATIPO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OFICINATIPO, args);

		if ((oficinaTipoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_OFICINATIPO.getColumnBitmask()) != 0) {
			args = new Object[] {
					oficinaTipoModelImpl.getOriginalCompanyId(),
					oficinaTipoModelImpl.getOriginalGroupId(),
					oficinaTipoModelImpl.getOriginalIdOficina()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINATIPO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OFICINATIPO, args);
		}
	}

	/**
	 * Creates a new oficina tipo with the primary key. Does not add the oficina tipo to the database.
	 *
	 * @param id the primary key for the new oficina tipo
	 * @return the new oficina tipo
	 */
	@Override
	public OficinaTipo create(long id) {
		OficinaTipo oficinaTipo = new OficinaTipoImpl();

		oficinaTipo.setNew(true);
		oficinaTipo.setPrimaryKey(id);

		return oficinaTipo;
	}

	/**
	 * Removes the oficina tipo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the oficina tipo
	 * @return the oficina tipo that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a oficina tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo remove(long id)
		throws NoSuchOficinaTipoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the oficina tipo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oficina tipo
	 * @return the oficina tipo that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a oficina tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo remove(Serializable primaryKey)
		throws NoSuchOficinaTipoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OficinaTipo oficinaTipo = (OficinaTipo)session.get(OficinaTipoImpl.class,
					primaryKey);

			if (oficinaTipo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOficinaTipoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oficinaTipo);
		}
		catch (NoSuchOficinaTipoException nsee) {
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
	protected OficinaTipo removeImpl(OficinaTipo oficinaTipo)
		throws SystemException {
		oficinaTipo = toUnwrappedModel(oficinaTipo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oficinaTipo)) {
				oficinaTipo = (OficinaTipo)session.get(OficinaTipoImpl.class,
						oficinaTipo.getPrimaryKeyObj());
			}

			if (oficinaTipo != null) {
				session.delete(oficinaTipo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oficinaTipo != null) {
			clearCache(oficinaTipo);
		}

		return oficinaTipo;
	}

	@Override
	public OficinaTipo updateImpl(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo)
		throws SystemException {
		oficinaTipo = toUnwrappedModel(oficinaTipo);

		boolean isNew = oficinaTipo.isNew();

		OficinaTipoModelImpl oficinaTipoModelImpl = (OficinaTipoModelImpl)oficinaTipo;

		Session session = null;

		try {
			session = openSession();

			if (oficinaTipo.isNew()) {
				session.save(oficinaTipo);

				oficinaTipo.setNew(false);
			}
			else {
				session.merge(oficinaTipo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OficinaTipoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((oficinaTipoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oficinaTipoModelImpl.getOriginalCompanyId(),
						oficinaTipoModelImpl.getOriginalGroupId(),
						oficinaTipoModelImpl.getOriginalIdTipo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TIPO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPO,
					args);

				args = new Object[] {
						oficinaTipoModelImpl.getCompanyId(),
						oficinaTipoModelImpl.getGroupId(),
						oficinaTipoModelImpl.getIdTipo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TIPO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPO,
					args);
			}
		}

		EntityCacheUtil.putResult(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
			OficinaTipoImpl.class, oficinaTipo.getPrimaryKey(), oficinaTipo);

		clearUniqueFindersCache(oficinaTipo);
		cacheUniqueFindersCache(oficinaTipo);

		return oficinaTipo;
	}

	protected OficinaTipo toUnwrappedModel(OficinaTipo oficinaTipo) {
		if (oficinaTipo instanceof OficinaTipoImpl) {
			return oficinaTipo;
		}

		OficinaTipoImpl oficinaTipoImpl = new OficinaTipoImpl();

		oficinaTipoImpl.setNew(oficinaTipo.isNew());
		oficinaTipoImpl.setPrimaryKey(oficinaTipo.getPrimaryKey());

		oficinaTipoImpl.setId(oficinaTipo.getId());
		oficinaTipoImpl.setIdOficina(oficinaTipo.getIdOficina());
		oficinaTipoImpl.setIdTipo(oficinaTipo.getIdTipo());
		oficinaTipoImpl.setCompanyId(oficinaTipo.getCompanyId());
		oficinaTipoImpl.setGroupId(oficinaTipo.getGroupId());

		return oficinaTipoImpl;
	}

	/**
	 * Returns the oficina tipo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oficina tipo
	 * @return the oficina tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a oficina tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOficinaTipoException, SystemException {
		OficinaTipo oficinaTipo = fetchByPrimaryKey(primaryKey);

		if (oficinaTipo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOficinaTipoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oficinaTipo;
	}

	/**
	 * Returns the oficina tipo with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchOficinaTipoException} if it could not be found.
	 *
	 * @param id the primary key of the oficina tipo
	 * @return the oficina tipo
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a oficina tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo findByPrimaryKey(long id)
		throws NoSuchOficinaTipoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the oficina tipo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oficina tipo
	 * @return the oficina tipo, or <code>null</code> if a oficina tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OficinaTipo oficinaTipo = (OficinaTipo)EntityCacheUtil.getResult(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
				OficinaTipoImpl.class, primaryKey);

		if (oficinaTipo == _nullOficinaTipo) {
			return null;
		}

		if (oficinaTipo == null) {
			Session session = null;

			try {
				session = openSession();

				oficinaTipo = (OficinaTipo)session.get(OficinaTipoImpl.class,
						primaryKey);

				if (oficinaTipo != null) {
					cacheResult(oficinaTipo);
				}
				else {
					EntityCacheUtil.putResult(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
						OficinaTipoImpl.class, primaryKey, _nullOficinaTipo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OficinaTipoModelImpl.ENTITY_CACHE_ENABLED,
					OficinaTipoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oficinaTipo;
	}

	/**
	 * Returns the oficina tipo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the oficina tipo
	 * @return the oficina tipo, or <code>null</code> if a oficina tipo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaTipo fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the oficina tipos.
	 *
	 * @return the oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaTipo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oficina tipos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oficina tipos
	 * @param end the upper bound of the range of oficina tipos (not inclusive)
	 * @return the range of oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaTipo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oficina tipos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oficina tipos
	 * @param end the upper bound of the range of oficina tipos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oficina tipos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaTipo> findAll(int start, int end,
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

		List<OficinaTipo> list = (List<OficinaTipo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OFICINATIPO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OFICINATIPO;

				if (pagination) {
					sql = sql.concat(OficinaTipoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OficinaTipo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OficinaTipo>(list);
				}
				else {
					list = (List<OficinaTipo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the oficina tipos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OficinaTipo oficinaTipo : findAll()) {
			remove(oficinaTipo);
		}
	}

	/**
	 * Returns the number of oficina tipos.
	 *
	 * @return the number of oficina tipos
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

				Query q = session.createQuery(_SQL_COUNT_OFICINATIPO);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the oficina tipo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cat.diba.oficinasvivienda.model.OficinaTipo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OficinaTipo>> listenersList = new ArrayList<ModelListener<OficinaTipo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OficinaTipo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OficinaTipoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OFICINATIPO = "SELECT oficinaTipo FROM OficinaTipo oficinaTipo";
	private static final String _SQL_SELECT_OFICINATIPO_WHERE = "SELECT oficinaTipo FROM OficinaTipo oficinaTipo WHERE ";
	private static final String _SQL_COUNT_OFICINATIPO = "SELECT COUNT(oficinaTipo) FROM OficinaTipo oficinaTipo";
	private static final String _SQL_COUNT_OFICINATIPO_WHERE = "SELECT COUNT(oficinaTipo) FROM OficinaTipo oficinaTipo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oficinaTipo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OficinaTipo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OficinaTipo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OficinaTipoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static OficinaTipo _nullOficinaTipo = new OficinaTipoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OficinaTipo> toCacheModel() {
				return _nullOficinaTipoCacheModel;
			}
		};

	private static CacheModel<OficinaTipo> _nullOficinaTipoCacheModel = new CacheModel<OficinaTipo>() {
			@Override
			public OficinaTipo toEntityModel() {
				return _nullOficinaTipo;
			}
		};
}