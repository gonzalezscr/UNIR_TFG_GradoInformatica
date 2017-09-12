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

import cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException;
import cat.diba.oficinasvivienda.model.OficinaServicioMunicipio;
import cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioImpl;
import cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the oficina servicio municipio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipioPersistence
 * @see OficinaServicioMunicipioUtil
 * @generated
 */
public class OficinaServicioMunicipioPersistenceImpl extends BasePersistenceImpl<OficinaServicioMunicipio>
	implements OficinaServicioMunicipioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OficinaServicioMunicipioUtil} to access the oficina servicio municipio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OficinaServicioMunicipioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OFICINA = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOficina",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINA =
		new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOficina",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			OficinaServicioMunicipioModelImpl.COMPANYID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.GROUPID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.IDOFICINA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OFICINA = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOficina",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @return the matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficina(long companyId,
		long groupId, long idOficina) throws SystemException {
		return findByOficina(companyId, groupId, idOficina, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @return the range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficina(long companyId,
		long groupId, long idOficina, int start, int end)
		throws SystemException {
		return findByOficina(companyId, groupId, idOficina, start, end, null);
	}

	/**
	 * Returns an ordered range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficina(long companyId,
		long groupId, long idOficina, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINA;
			finderArgs = new Object[] { companyId, groupId, idOficina };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OFICINA;
			finderArgs = new Object[] {
					companyId, groupId, idOficina,
					
					start, end, orderByComparator
				};
		}

		List<OficinaServicioMunicipio> list = (List<OficinaServicioMunicipio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OficinaServicioMunicipio oficinaServicioMunicipio : list) {
				if ((companyId != oficinaServicioMunicipio.getCompanyId()) ||
						(groupId != oficinaServicioMunicipio.getGroupId()) ||
						(idOficina != oficinaServicioMunicipio.getIdOficina())) {
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

			query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_OFICINA_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINA_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINA_IDOFICINA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idOficina);

				if (!pagination) {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OficinaServicioMunicipio>(list);
				}
				else {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByOficina_First(long companyId,
		long groupId, long idOficina, OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByOficina_First(companyId,
				groupId, idOficina, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idOficina=");
		msg.append(idOficina);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByOficina_First(long companyId,
		long groupId, long idOficina, OrderByComparator orderByComparator)
		throws SystemException {
		List<OficinaServicioMunicipio> list = findByOficina(companyId, groupId,
				idOficina, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByOficina_Last(long companyId,
		long groupId, long idOficina, OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByOficina_Last(companyId,
				groupId, idOficina, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idOficina=");
		msg.append(idOficina);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByOficina_Last(long companyId,
		long groupId, long idOficina, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByOficina(companyId, groupId, idOficina);

		if (count == 0) {
			return null;
		}

		List<OficinaServicioMunicipio> list = findByOficina(companyId, groupId,
				idOficina, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the oficina servicio municipios before and after the current oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param id the primary key of the current oficina servicio municipio
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio[] findByOficina_PrevAndNext(long id,
		long companyId, long groupId, long idOficina,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OficinaServicioMunicipio[] array = new OficinaServicioMunicipioImpl[3];

			array[0] = getByOficina_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idOficina,
					orderByComparator, true);

			array[1] = oficinaServicioMunicipio;

			array[2] = getByOficina_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idOficina,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OficinaServicioMunicipio getByOficina_PrevAndNext(
		Session session, OficinaServicioMunicipio oficinaServicioMunicipio,
		long companyId, long groupId, long idOficina,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

		query.append(_FINDER_COLUMN_OFICINA_COMPANYID_2);

		query.append(_FINDER_COLUMN_OFICINA_GROUPID_2);

		query.append(_FINDER_COLUMN_OFICINA_IDOFICINA_2);

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
			query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(idOficina);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oficinaServicioMunicipio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OficinaServicioMunicipio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOficina(long companyId, long groupId, long idOficina)
		throws SystemException {
		for (OficinaServicioMunicipio oficinaServicioMunicipio : findByOficina(
				companyId, groupId, idOficina, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(oficinaServicioMunicipio);
		}
	}

	/**
	 * Returns the number of oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @return the number of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOficina(long companyId, long groupId, long idOficina)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OFICINA;

		Object[] finderArgs = new Object[] { companyId, groupId, idOficina };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_OFICINA_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINA_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINA_IDOFICINA_2);

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

	private static final String _FINDER_COLUMN_OFICINA_COMPANYID_2 = "oficinaServicioMunicipio.companyId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINA_GROUPID_2 = "oficinaServicioMunicipio.groupId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINA_IDOFICINA_2 = "oficinaServicioMunicipio.idOficina = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OFICINASERVICIO =
		new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOficinaServicio",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINASERVICIO =
		new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOficinaServicio",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			OficinaServicioMunicipioModelImpl.COMPANYID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.GROUPID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.IDOFICINA_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.IDSERVICIO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OFICINASERVICIO = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOficinaServicio",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @return the matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio)
		throws SystemException {
		return findByOficinaServicio(companyId, groupId, idOficina, idServicio,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @return the range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio,
		int start, int end) throws SystemException {
		return findByOficinaServicio(companyId, groupId, idOficina, idServicio,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINASERVICIO;
			finderArgs = new Object[] { companyId, groupId, idOficina, idServicio };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OFICINASERVICIO;
			finderArgs = new Object[] {
					companyId, groupId, idOficina, idServicio,
					
					start, end, orderByComparator
				};
		}

		List<OficinaServicioMunicipio> list = (List<OficinaServicioMunicipio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OficinaServicioMunicipio oficinaServicioMunicipio : list) {
				if ((companyId != oficinaServicioMunicipio.getCompanyId()) ||
						(groupId != oficinaServicioMunicipio.getGroupId()) ||
						(idOficina != oficinaServicioMunicipio.getIdOficina()) ||
						(idServicio != oficinaServicioMunicipio.getIdServicio())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_IDOFICINA_2);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_IDSERVICIO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idOficina);

				qPos.add(idServicio);

				if (!pagination) {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OficinaServicioMunicipio>(list);
				}
				else {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByOficinaServicio_First(
		long companyId, long groupId, long idOficina, long idServicio,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByOficinaServicio_First(companyId,
				groupId, idOficina, idServicio, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idOficina=");
		msg.append(idOficina);

		msg.append(", idServicio=");
		msg.append(idServicio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByOficinaServicio_First(
		long companyId, long groupId, long idOficina, long idServicio,
		OrderByComparator orderByComparator) throws SystemException {
		List<OficinaServicioMunicipio> list = findByOficinaServicio(companyId,
				groupId, idOficina, idServicio, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByOficinaServicio_Last(long companyId,
		long groupId, long idOficina, long idServicio,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByOficinaServicio_Last(companyId,
				groupId, idOficina, idServicio, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idOficina=");
		msg.append(idOficina);

		msg.append(", idServicio=");
		msg.append(idServicio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByOficinaServicio_Last(
		long companyId, long groupId, long idOficina, long idServicio,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByOficinaServicio(companyId, groupId, idOficina,
				idServicio);

		if (count == 0) {
			return null;
		}

		List<OficinaServicioMunicipio> list = findByOficinaServicio(companyId,
				groupId, idOficina, idServicio, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the oficina servicio municipios before and after the current oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * @param id the primary key of the current oficina servicio municipio
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio[] findByOficinaServicio_PrevAndNext(
		long id, long companyId, long groupId, long idOficina, long idServicio,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OficinaServicioMunicipio[] array = new OficinaServicioMunicipioImpl[3];

			array[0] = getByOficinaServicio_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idOficina,
					idServicio, orderByComparator, true);

			array[1] = oficinaServicioMunicipio;

			array[2] = getByOficinaServicio_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idOficina,
					idServicio, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OficinaServicioMunicipio getByOficinaServicio_PrevAndNext(
		Session session, OficinaServicioMunicipio oficinaServicioMunicipio,
		long companyId, long groupId, long idOficina, long idServicio,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

		query.append(_FINDER_COLUMN_OFICINASERVICIO_COMPANYID_2);

		query.append(_FINDER_COLUMN_OFICINASERVICIO_GROUPID_2);

		query.append(_FINDER_COLUMN_OFICINASERVICIO_IDOFICINA_2);

		query.append(_FINDER_COLUMN_OFICINASERVICIO_IDSERVICIO_2);

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
			query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(idOficina);

		qPos.add(idServicio);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oficinaServicioMunicipio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OficinaServicioMunicipio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOficinaServicio(long companyId, long groupId,
		long idOficina, long idServicio) throws SystemException {
		for (OficinaServicioMunicipio oficinaServicioMunicipio : findByOficinaServicio(
				companyId, groupId, idOficina, idServicio, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(oficinaServicioMunicipio);
		}
	}

	/**
	 * Returns the number of oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param idServicio the id servicio
	 * @return the number of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOficinaServicio(long companyId, long groupId,
		long idOficina, long idServicio) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OFICINASERVICIO;

		Object[] finderArgs = new Object[] {
				companyId, groupId, idOficina, idServicio
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_IDOFICINA_2);

			query.append(_FINDER_COLUMN_OFICINASERVICIO_IDSERVICIO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idOficina);

				qPos.add(idServicio);

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

	private static final String _FINDER_COLUMN_OFICINASERVICIO_COMPANYID_2 = "oficinaServicioMunicipio.companyId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINASERVICIO_GROUPID_2 = "oficinaServicioMunicipio.groupId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINASERVICIO_IDOFICINA_2 = "oficinaServicioMunicipio.idOficina = ? AND ";
	private static final String _FINDER_COLUMN_OFICINASERVICIO_IDSERVICIO_2 = "oficinaServicioMunicipio.idServicio = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OFICINAINE =
		new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOficinaIne",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINAINE =
		new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOficinaIne",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			OficinaServicioMunicipioModelImpl.COMPANYID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.GROUPID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.IDOFICINA_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.CODIGOINE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OFICINAINE = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOficinaIne",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @return the matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficinaIne(long companyId,
		long groupId, long idOficina, String codigoIne)
		throws SystemException {
		return findByOficinaIne(companyId, groupId, idOficina, codigoIne,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @return the range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficinaIne(long companyId,
		long groupId, long idOficina, String codigoIne, int start, int end)
		throws SystemException {
		return findByOficinaIne(companyId, groupId, idOficina, codigoIne,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByOficinaIne(long companyId,
		long groupId, long idOficina, String codigoIne, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINAINE;
			finderArgs = new Object[] { companyId, groupId, idOficina, codigoIne };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OFICINAINE;
			finderArgs = new Object[] {
					companyId, groupId, idOficina, codigoIne,
					
					start, end, orderByComparator
				};
		}

		List<OficinaServicioMunicipio> list = (List<OficinaServicioMunicipio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OficinaServicioMunicipio oficinaServicioMunicipio : list) {
				if ((companyId != oficinaServicioMunicipio.getCompanyId()) ||
						(groupId != oficinaServicioMunicipio.getGroupId()) ||
						(idOficina != oficinaServicioMunicipio.getIdOficina()) ||
						!Validator.equals(codigoIne,
							oficinaServicioMunicipio.getCodigoIne())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_OFICINAINE_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINAINE_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINAINE_IDOFICINA_2);

			boolean bindCodigoIne = false;

			if (codigoIne == null) {
				query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_1);
			}
			else if (codigoIne.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_3);
			}
			else {
				bindCodigoIne = true;

				query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idOficina);

				if (bindCodigoIne) {
					qPos.add(codigoIne);
				}

				if (!pagination) {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OficinaServicioMunicipio>(list);
				}
				else {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByOficinaIne_First(long companyId,
		long groupId, long idOficina, String codigoIne,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByOficinaIne_First(companyId,
				groupId, idOficina, codigoIne, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idOficina=");
		msg.append(idOficina);

		msg.append(", codigoIne=");
		msg.append(codigoIne);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByOficinaIne_First(long companyId,
		long groupId, long idOficina, String codigoIne,
		OrderByComparator orderByComparator) throws SystemException {
		List<OficinaServicioMunicipio> list = findByOficinaIne(companyId,
				groupId, idOficina, codigoIne, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByOficinaIne_Last(long companyId,
		long groupId, long idOficina, String codigoIne,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByOficinaIne_Last(companyId,
				groupId, idOficina, codigoIne, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idOficina=");
		msg.append(idOficina);

		msg.append(", codigoIne=");
		msg.append(codigoIne);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByOficinaIne_Last(long companyId,
		long groupId, long idOficina, String codigoIne,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByOficinaIne(companyId, groupId, idOficina, codigoIne);

		if (count == 0) {
			return null;
		}

		List<OficinaServicioMunicipio> list = findByOficinaIne(companyId,
				groupId, idOficina, codigoIne, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the oficina servicio municipios before and after the current oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * @param id the primary key of the current oficina servicio municipio
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio[] findByOficinaIne_PrevAndNext(long id,
		long companyId, long groupId, long idOficina, String codigoIne,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OficinaServicioMunicipio[] array = new OficinaServicioMunicipioImpl[3];

			array[0] = getByOficinaIne_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idOficina,
					codigoIne, orderByComparator, true);

			array[1] = oficinaServicioMunicipio;

			array[2] = getByOficinaIne_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idOficina,
					codigoIne, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OficinaServicioMunicipio getByOficinaIne_PrevAndNext(
		Session session, OficinaServicioMunicipio oficinaServicioMunicipio,
		long companyId, long groupId, long idOficina, String codigoIne,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

		query.append(_FINDER_COLUMN_OFICINAINE_COMPANYID_2);

		query.append(_FINDER_COLUMN_OFICINAINE_GROUPID_2);

		query.append(_FINDER_COLUMN_OFICINAINE_IDOFICINA_2);

		boolean bindCodigoIne = false;

		if (codigoIne == null) {
			query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_1);
		}
		else if (codigoIne.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_3);
		}
		else {
			bindCodigoIne = true;

			query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_2);
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
			query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(idOficina);

		if (bindCodigoIne) {
			qPos.add(codigoIne);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oficinaServicioMunicipio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OficinaServicioMunicipio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOficinaIne(long companyId, long groupId,
		long idOficina, String codigoIne) throws SystemException {
		for (OficinaServicioMunicipio oficinaServicioMunicipio : findByOficinaIne(
				companyId, groupId, idOficina, codigoIne, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(oficinaServicioMunicipio);
		}
	}

	/**
	 * Returns the number of oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idOficina the id oficina
	 * @param codigoIne the codigo ine
	 * @return the number of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOficinaIne(long companyId, long groupId, long idOficina,
		String codigoIne) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OFICINAINE;

		Object[] finderArgs = new Object[] {
				companyId, groupId, idOficina, codigoIne
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_OFICINAINE_COMPANYID_2);

			query.append(_FINDER_COLUMN_OFICINAINE_GROUPID_2);

			query.append(_FINDER_COLUMN_OFICINAINE_IDOFICINA_2);

			boolean bindCodigoIne = false;

			if (codigoIne == null) {
				query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_1);
			}
			else if (codigoIne.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_3);
			}
			else {
				bindCodigoIne = true;

				query.append(_FINDER_COLUMN_OFICINAINE_CODIGOINE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idOficina);

				if (bindCodigoIne) {
					qPos.add(codigoIne);
				}

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

	private static final String _FINDER_COLUMN_OFICINAINE_COMPANYID_2 = "oficinaServicioMunicipio.companyId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINAINE_GROUPID_2 = "oficinaServicioMunicipio.groupId = ? AND ";
	private static final String _FINDER_COLUMN_OFICINAINE_IDOFICINA_2 = "oficinaServicioMunicipio.idOficina = ? AND ";
	private static final String _FINDER_COLUMN_OFICINAINE_CODIGOINE_1 = "oficinaServicioMunicipio.codigoIne IS NULL";
	private static final String _FINDER_COLUMN_OFICINAINE_CODIGOINE_2 = "oficinaServicioMunicipio.codigoIne = ?";
	private static final String _FINDER_COLUMN_OFICINAINE_CODIGOINE_3 = "(oficinaServicioMunicipio.codigoIne IS NULL OR oficinaServicioMunicipio.codigoIne = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICIO = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServicio",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICIO =
		new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServicio",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			OficinaServicioMunicipioModelImpl.COMPANYID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.GROUPID_COLUMN_BITMASK |
			OficinaServicioMunicipioModelImpl.IDSERVICIO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICIO = new FinderPath(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServicio",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @return the matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByServicio(long companyId,
		long groupId, long idServicio) throws SystemException {
		return findByServicio(companyId, groupId, idServicio,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @return the range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByServicio(long companyId,
		long groupId, long idServicio, int start, int end)
		throws SystemException {
		return findByServicio(companyId, groupId, idServicio, start, end, null);
	}

	/**
	 * Returns an ordered range of all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findByServicio(long companyId,
		long groupId, long idServicio, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICIO;
			finderArgs = new Object[] { companyId, groupId, idServicio };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICIO;
			finderArgs = new Object[] {
					companyId, groupId, idServicio,
					
					start, end, orderByComparator
				};
		}

		List<OficinaServicioMunicipio> list = (List<OficinaServicioMunicipio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OficinaServicioMunicipio oficinaServicioMunicipio : list) {
				if ((companyId != oficinaServicioMunicipio.getCompanyId()) ||
						(groupId != oficinaServicioMunicipio.getGroupId()) ||
						(idServicio != oficinaServicioMunicipio.getIdServicio())) {
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

			query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_SERVICIO_COMPANYID_2);

			query.append(_FINDER_COLUMN_SERVICIO_GROUPID_2);

			query.append(_FINDER_COLUMN_SERVICIO_IDSERVICIO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idServicio);

				if (!pagination) {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OficinaServicioMunicipio>(list);
				}
				else {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByServicio_First(long companyId,
		long groupId, long idServicio, OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByServicio_First(companyId,
				groupId, idServicio, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idServicio=");
		msg.append(idServicio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the first oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByServicio_First(long companyId,
		long groupId, long idServicio, OrderByComparator orderByComparator)
		throws SystemException {
		List<OficinaServicioMunicipio> list = findByServicio(companyId,
				groupId, idServicio, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByServicio_Last(long companyId,
		long groupId, long idServicio, OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByServicio_Last(companyId,
				groupId, idServicio, orderByComparator);

		if (oficinaServicioMunicipio != null) {
			return oficinaServicioMunicipio;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", idServicio=");
		msg.append(idServicio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOficinaServicioMunicipioException(msg.toString());
	}

	/**
	 * Returns the last oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oficina servicio municipio, or <code>null</code> if a matching oficina servicio municipio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByServicio_Last(long companyId,
		long groupId, long idServicio, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByServicio(companyId, groupId, idServicio);

		if (count == 0) {
			return null;
		}

		List<OficinaServicioMunicipio> list = findByServicio(companyId,
				groupId, idServicio, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the oficina servicio municipios before and after the current oficina servicio municipio in the ordered set where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * @param id the primary key of the current oficina servicio municipio
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio[] findByServicio_PrevAndNext(long id,
		long companyId, long groupId, long idServicio,
		OrderByComparator orderByComparator)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OficinaServicioMunicipio[] array = new OficinaServicioMunicipioImpl[3];

			array[0] = getByServicio_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idServicio,
					orderByComparator, true);

			array[1] = oficinaServicioMunicipio;

			array[2] = getByServicio_PrevAndNext(session,
					oficinaServicioMunicipio, companyId, groupId, idServicio,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OficinaServicioMunicipio getByServicio_PrevAndNext(
		Session session, OficinaServicioMunicipio oficinaServicioMunicipio,
		long companyId, long groupId, long idServicio,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE);

		query.append(_FINDER_COLUMN_SERVICIO_COMPANYID_2);

		query.append(_FINDER_COLUMN_SERVICIO_GROUPID_2);

		query.append(_FINDER_COLUMN_SERVICIO_IDSERVICIO_2);

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
			query.append(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(idServicio);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oficinaServicioMunicipio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OficinaServicioMunicipio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByServicio(long companyId, long groupId, long idServicio)
		throws SystemException {
		for (OficinaServicioMunicipio oficinaServicioMunicipio : findByServicio(
				companyId, groupId, idServicio, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(oficinaServicioMunicipio);
		}
	}

	/**
	 * Returns the number of oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param idServicio the id servicio
	 * @return the number of matching oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByServicio(long companyId, long groupId, long idServicio)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICIO;

		Object[] finderArgs = new Object[] { companyId, groupId, idServicio };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_OFICINASERVICIOMUNICIPIO_WHERE);

			query.append(_FINDER_COLUMN_SERVICIO_COMPANYID_2);

			query.append(_FINDER_COLUMN_SERVICIO_GROUPID_2);

			query.append(_FINDER_COLUMN_SERVICIO_IDSERVICIO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(idServicio);

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

	private static final String _FINDER_COLUMN_SERVICIO_COMPANYID_2 = "oficinaServicioMunicipio.companyId = ? AND ";
	private static final String _FINDER_COLUMN_SERVICIO_GROUPID_2 = "oficinaServicioMunicipio.groupId = ? AND ";
	private static final String _FINDER_COLUMN_SERVICIO_IDSERVICIO_2 = "oficinaServicioMunicipio.idServicio = ?";

	public OficinaServicioMunicipioPersistenceImpl() {
		setModelClass(OficinaServicioMunicipio.class);
	}

	/**
	 * Caches the oficina servicio municipio in the entity cache if it is enabled.
	 *
	 * @param oficinaServicioMunicipio the oficina servicio municipio
	 */
	@Override
	public void cacheResult(OficinaServicioMunicipio oficinaServicioMunicipio) {
		EntityCacheUtil.putResult(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			oficinaServicioMunicipio.getPrimaryKey(), oficinaServicioMunicipio);

		oficinaServicioMunicipio.resetOriginalValues();
	}

	/**
	 * Caches the oficina servicio municipios in the entity cache if it is enabled.
	 *
	 * @param oficinaServicioMunicipios the oficina servicio municipios
	 */
	@Override
	public void cacheResult(
		List<OficinaServicioMunicipio> oficinaServicioMunicipios) {
		for (OficinaServicioMunicipio oficinaServicioMunicipio : oficinaServicioMunicipios) {
			if (EntityCacheUtil.getResult(
						OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
						OficinaServicioMunicipioImpl.class,
						oficinaServicioMunicipio.getPrimaryKey()) == null) {
				cacheResult(oficinaServicioMunicipio);
			}
			else {
				oficinaServicioMunicipio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oficina servicio municipios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OficinaServicioMunicipioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OficinaServicioMunicipioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oficina servicio municipio.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OficinaServicioMunicipio oficinaServicioMunicipio) {
		EntityCacheUtil.removeResult(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			oficinaServicioMunicipio.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<OficinaServicioMunicipio> oficinaServicioMunicipios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OficinaServicioMunicipio oficinaServicioMunicipio : oficinaServicioMunicipios) {
			EntityCacheUtil.removeResult(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
				OficinaServicioMunicipioImpl.class,
				oficinaServicioMunicipio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new oficina servicio municipio with the primary key. Does not add the oficina servicio municipio to the database.
	 *
	 * @param id the primary key for the new oficina servicio municipio
	 * @return the new oficina servicio municipio
	 */
	@Override
	public OficinaServicioMunicipio create(long id) {
		OficinaServicioMunicipio oficinaServicioMunicipio = new OficinaServicioMunicipioImpl();

		oficinaServicioMunicipio.setNew(true);
		oficinaServicioMunicipio.setPrimaryKey(id);

		return oficinaServicioMunicipio;
	}

	/**
	 * Removes the oficina servicio municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the oficina servicio municipio
	 * @return the oficina servicio municipio that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio remove(long id)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the oficina servicio municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oficina servicio municipio
	 * @return the oficina servicio municipio that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio remove(Serializable primaryKey)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OficinaServicioMunicipio oficinaServicioMunicipio = (OficinaServicioMunicipio)session.get(OficinaServicioMunicipioImpl.class,
					primaryKey);

			if (oficinaServicioMunicipio == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOficinaServicioMunicipioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oficinaServicioMunicipio);
		}
		catch (NoSuchOficinaServicioMunicipioException nsee) {
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
	protected OficinaServicioMunicipio removeImpl(
		OficinaServicioMunicipio oficinaServicioMunicipio)
		throws SystemException {
		oficinaServicioMunicipio = toUnwrappedModel(oficinaServicioMunicipio);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oficinaServicioMunicipio)) {
				oficinaServicioMunicipio = (OficinaServicioMunicipio)session.get(OficinaServicioMunicipioImpl.class,
						oficinaServicioMunicipio.getPrimaryKeyObj());
			}

			if (oficinaServicioMunicipio != null) {
				session.delete(oficinaServicioMunicipio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oficinaServicioMunicipio != null) {
			clearCache(oficinaServicioMunicipio);
		}

		return oficinaServicioMunicipio;
	}

	@Override
	public OficinaServicioMunicipio updateImpl(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws SystemException {
		oficinaServicioMunicipio = toUnwrappedModel(oficinaServicioMunicipio);

		boolean isNew = oficinaServicioMunicipio.isNew();

		OficinaServicioMunicipioModelImpl oficinaServicioMunicipioModelImpl = (OficinaServicioMunicipioModelImpl)oficinaServicioMunicipio;

		Session session = null;

		try {
			session = openSession();

			if (oficinaServicioMunicipio.isNew()) {
				session.save(oficinaServicioMunicipio);

				oficinaServicioMunicipio.setNew(false);
			}
			else {
				session.merge(oficinaServicioMunicipio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OficinaServicioMunicipioModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((oficinaServicioMunicipioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oficinaServicioMunicipioModelImpl.getOriginalCompanyId(),
						oficinaServicioMunicipioModelImpl.getOriginalGroupId(),
						oficinaServicioMunicipioModelImpl.getOriginalIdOficina()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINA,
					args);

				args = new Object[] {
						oficinaServicioMunicipioModelImpl.getCompanyId(),
						oficinaServicioMunicipioModelImpl.getGroupId(),
						oficinaServicioMunicipioModelImpl.getIdOficina()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINA,
					args);
			}

			if ((oficinaServicioMunicipioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINASERVICIO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oficinaServicioMunicipioModelImpl.getOriginalCompanyId(),
						oficinaServicioMunicipioModelImpl.getOriginalGroupId(),
						oficinaServicioMunicipioModelImpl.getOriginalIdOficina(),
						oficinaServicioMunicipioModelImpl.getOriginalIdServicio()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINASERVICIO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINASERVICIO,
					args);

				args = new Object[] {
						oficinaServicioMunicipioModelImpl.getCompanyId(),
						oficinaServicioMunicipioModelImpl.getGroupId(),
						oficinaServicioMunicipioModelImpl.getIdOficina(),
						oficinaServicioMunicipioModelImpl.getIdServicio()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINASERVICIO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINASERVICIO,
					args);
			}

			if ((oficinaServicioMunicipioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINAINE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oficinaServicioMunicipioModelImpl.getOriginalCompanyId(),
						oficinaServicioMunicipioModelImpl.getOriginalGroupId(),
						oficinaServicioMunicipioModelImpl.getOriginalIdOficina(),
						oficinaServicioMunicipioModelImpl.getOriginalCodigoIne()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINAINE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINAINE,
					args);

				args = new Object[] {
						oficinaServicioMunicipioModelImpl.getCompanyId(),
						oficinaServicioMunicipioModelImpl.getGroupId(),
						oficinaServicioMunicipioModelImpl.getIdOficina(),
						oficinaServicioMunicipioModelImpl.getCodigoIne()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OFICINAINE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OFICINAINE,
					args);
			}

			if ((oficinaServicioMunicipioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICIO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oficinaServicioMunicipioModelImpl.getOriginalCompanyId(),
						oficinaServicioMunicipioModelImpl.getOriginalGroupId(),
						oficinaServicioMunicipioModelImpl.getOriginalIdServicio()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICIO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICIO,
					args);

				args = new Object[] {
						oficinaServicioMunicipioModelImpl.getCompanyId(),
						oficinaServicioMunicipioModelImpl.getGroupId(),
						oficinaServicioMunicipioModelImpl.getIdServicio()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICIO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICIO,
					args);
			}
		}

		EntityCacheUtil.putResult(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
			OficinaServicioMunicipioImpl.class,
			oficinaServicioMunicipio.getPrimaryKey(), oficinaServicioMunicipio);

		return oficinaServicioMunicipio;
	}

	protected OficinaServicioMunicipio toUnwrappedModel(
		OficinaServicioMunicipio oficinaServicioMunicipio) {
		if (oficinaServicioMunicipio instanceof OficinaServicioMunicipioImpl) {
			return oficinaServicioMunicipio;
		}

		OficinaServicioMunicipioImpl oficinaServicioMunicipioImpl = new OficinaServicioMunicipioImpl();

		oficinaServicioMunicipioImpl.setNew(oficinaServicioMunicipio.isNew());
		oficinaServicioMunicipioImpl.setPrimaryKey(oficinaServicioMunicipio.getPrimaryKey());

		oficinaServicioMunicipioImpl.setId(oficinaServicioMunicipio.getId());
		oficinaServicioMunicipioImpl.setCompanyId(oficinaServicioMunicipio.getCompanyId());
		oficinaServicioMunicipioImpl.setGroupId(oficinaServicioMunicipio.getGroupId());
		oficinaServicioMunicipioImpl.setIdOficina(oficinaServicioMunicipio.getIdOficina());
		oficinaServicioMunicipioImpl.setIdServicio(oficinaServicioMunicipio.getIdServicio());
		oficinaServicioMunicipioImpl.setCodigoIne(oficinaServicioMunicipio.getCodigoIne());

		return oficinaServicioMunicipioImpl;
	}

	/**
	 * Returns the oficina servicio municipio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oficina servicio municipio
	 * @return the oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = fetchByPrimaryKey(primaryKey);

		if (oficinaServicioMunicipio == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOficinaServicioMunicipioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oficinaServicioMunicipio;
	}

	/**
	 * Returns the oficina servicio municipio with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException} if it could not be found.
	 *
	 * @param id the primary key of the oficina servicio municipio
	 * @return the oficina servicio municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio findByPrimaryKey(long id)
		throws NoSuchOficinaServicioMunicipioException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the oficina servicio municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oficina servicio municipio
	 * @return the oficina servicio municipio, or <code>null</code> if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OficinaServicioMunicipio oficinaServicioMunicipio = (OficinaServicioMunicipio)EntityCacheUtil.getResult(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
				OficinaServicioMunicipioImpl.class, primaryKey);

		if (oficinaServicioMunicipio == _nullOficinaServicioMunicipio) {
			return null;
		}

		if (oficinaServicioMunicipio == null) {
			Session session = null;

			try {
				session = openSession();

				oficinaServicioMunicipio = (OficinaServicioMunicipio)session.get(OficinaServicioMunicipioImpl.class,
						primaryKey);

				if (oficinaServicioMunicipio != null) {
					cacheResult(oficinaServicioMunicipio);
				}
				else {
					EntityCacheUtil.putResult(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
						OficinaServicioMunicipioImpl.class, primaryKey,
						_nullOficinaServicioMunicipio);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OficinaServicioMunicipioModelImpl.ENTITY_CACHE_ENABLED,
					OficinaServicioMunicipioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oficinaServicioMunicipio;
	}

	/**
	 * Returns the oficina servicio municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the oficina servicio municipio
	 * @return the oficina servicio municipio, or <code>null</code> if a oficina servicio municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OficinaServicioMunicipio fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the oficina servicio municipios.
	 *
	 * @return the oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oficina servicio municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @return the range of oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oficina servicio municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oficina servicio municipios
	 * @param end the upper bound of the range of oficina servicio municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oficina servicio municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OficinaServicioMunicipio> findAll(int start, int end,
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

		List<OficinaServicioMunicipio> list = (List<OficinaServicioMunicipio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OFICINASERVICIOMUNICIPIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OFICINASERVICIOMUNICIPIO;

				if (pagination) {
					sql = sql.concat(OficinaServicioMunicipioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OficinaServicioMunicipio>(list);
				}
				else {
					list = (List<OficinaServicioMunicipio>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the oficina servicio municipios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OficinaServicioMunicipio oficinaServicioMunicipio : findAll()) {
			remove(oficinaServicioMunicipio);
		}
	}

	/**
	 * Returns the number of oficina servicio municipios.
	 *
	 * @return the number of oficina servicio municipios
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

				Query q = session.createQuery(_SQL_COUNT_OFICINASERVICIOMUNICIPIO);

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
	 * Initializes the oficina servicio municipio persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cat.diba.oficinasvivienda.model.OficinaServicioMunicipio")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OficinaServicioMunicipio>> listenersList = new ArrayList<ModelListener<OficinaServicioMunicipio>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OficinaServicioMunicipio>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OficinaServicioMunicipioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OFICINASERVICIOMUNICIPIO = "SELECT oficinaServicioMunicipio FROM OficinaServicioMunicipio oficinaServicioMunicipio";
	private static final String _SQL_SELECT_OFICINASERVICIOMUNICIPIO_WHERE = "SELECT oficinaServicioMunicipio FROM OficinaServicioMunicipio oficinaServicioMunicipio WHERE ";
	private static final String _SQL_COUNT_OFICINASERVICIOMUNICIPIO = "SELECT COUNT(oficinaServicioMunicipio) FROM OficinaServicioMunicipio oficinaServicioMunicipio";
	private static final String _SQL_COUNT_OFICINASERVICIOMUNICIPIO_WHERE = "SELECT COUNT(oficinaServicioMunicipio) FROM OficinaServicioMunicipio oficinaServicioMunicipio WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oficinaServicioMunicipio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OficinaServicioMunicipio exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OficinaServicioMunicipio exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OficinaServicioMunicipioPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static OficinaServicioMunicipio _nullOficinaServicioMunicipio = new OficinaServicioMunicipioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OficinaServicioMunicipio> toCacheModel() {
				return _nullOficinaServicioMunicipioCacheModel;
			}
		};

	private static CacheModel<OficinaServicioMunicipio> _nullOficinaServicioMunicipioCacheModel =
		new CacheModel<OficinaServicioMunicipio>() {
			@Override
			public OficinaServicioMunicipio toEntityModel() {
				return _nullOficinaServicioMunicipio;
			}
		};
}