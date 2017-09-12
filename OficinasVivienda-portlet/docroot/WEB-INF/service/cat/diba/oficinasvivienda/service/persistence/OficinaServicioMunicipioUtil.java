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

import cat.diba.oficinasvivienda.model.OficinaServicioMunicipio;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the oficina servicio municipio service. This utility wraps {@link OficinaServicioMunicipioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipioPersistence
 * @see OficinaServicioMunicipioPersistenceImpl
 * @generated
 */
public class OficinaServicioMunicipioUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		OficinaServicioMunicipio oficinaServicioMunicipio) {
		getPersistence().clearCache(oficinaServicioMunicipio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OficinaServicioMunicipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OficinaServicioMunicipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OficinaServicioMunicipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OficinaServicioMunicipio update(
		OficinaServicioMunicipio oficinaServicioMunicipio)
		throws SystemException {
		return getPersistence().update(oficinaServicioMunicipio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OficinaServicioMunicipio update(
		OficinaServicioMunicipio oficinaServicioMunicipio,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oficinaServicioMunicipio, serviceContext);
	}

	/**
	* Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idOficina the id oficina
	* @return the matching oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficina(
		long companyId, long groupId, long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOficina(companyId, groupId, idOficina);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficina(
		long companyId, long groupId, long idOficina, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficina(companyId, groupId, idOficina, start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficina(
		long companyId, long groupId, long idOficina, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficina(companyId, groupId, idOficina, start, end,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficina_First(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficina_First(companyId, groupId, idOficina,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficina_First(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOficina_First(companyId, groupId, idOficina,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficina_Last(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficina_Last(companyId, groupId, idOficina,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficina_Last(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOficina_Last(companyId, groupId, idOficina,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByOficina_PrevAndNext(
		long id, long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficina_PrevAndNext(id, companyId, groupId,
			idOficina, orderByComparator);
	}

	/**
	* Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idOficina the id oficina
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOficina(long companyId, long groupId,
		long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOficina(companyId, groupId, idOficina);
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
	public static int countByOficina(long companyId, long groupId,
		long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOficina(companyId, groupId, idOficina);
	}

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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaServicio(companyId, groupId, idOficina,
			idServicio);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaServicio(companyId, groupId, idOficina,
			idServicio, start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaServicio(companyId, groupId, idOficina,
			idServicio, start, end, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaServicio_First(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaServicio_First(companyId, groupId, idOficina,
			idServicio, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaServicio_First(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOficinaServicio_First(companyId, groupId, idOficina,
			idServicio, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaServicio_Last(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaServicio_Last(companyId, groupId, idOficina,
			idServicio, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaServicio_Last(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOficinaServicio_Last(companyId, groupId, idOficina,
			idServicio, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByOficinaServicio_PrevAndNext(
		long id, long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaServicio_PrevAndNext(id, companyId, groupId,
			idOficina, idServicio, orderByComparator);
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
	public static void removeByOficinaServicio(long companyId, long groupId,
		long idOficina, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByOficinaServicio(companyId, groupId, idOficina, idServicio);
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
	public static int countByOficinaServicio(long companyId, long groupId,
		long idOficina, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByOficinaServicio(companyId, groupId, idOficina,
			idServicio);
	}

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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaIne(
		long companyId, long groupId, long idOficina, java.lang.String codigoIne)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaIne(companyId, groupId, idOficina, codigoIne);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaIne(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaIne(companyId, groupId, idOficina, codigoIne,
			start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaIne(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaIne(companyId, groupId, idOficina, codigoIne,
			start, end, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaIne_First(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaIne_First(companyId, groupId, idOficina,
			codigoIne, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaIne_First(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOficinaIne_First(companyId, groupId, idOficina,
			codigoIne, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaIne_Last(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaIne_Last(companyId, groupId, idOficina,
			codigoIne, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaIne_Last(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOficinaIne_Last(companyId, groupId, idOficina,
			codigoIne, orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByOficinaIne_PrevAndNext(
		long id, long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOficinaIne_PrevAndNext(id, companyId, groupId,
			idOficina, codigoIne, orderByComparator);
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
	public static void removeByOficinaIne(long companyId, long groupId,
		long idOficina, java.lang.String codigoIne)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByOficinaIne(companyId, groupId, idOficina, codigoIne);
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
	public static int countByOficinaIne(long companyId, long groupId,
		long idOficina, java.lang.String codigoIne)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByOficinaIne(companyId, groupId, idOficina, codigoIne);
	}

	/**
	* Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idServicio the id servicio
	* @return the matching oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByServicio(
		long companyId, long groupId, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByServicio(companyId, groupId, idServicio);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByServicio(
		long companyId, long groupId, long idServicio, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServicio(companyId, groupId, idServicio, start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByServicio(
		long companyId, long groupId, long idServicio, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServicio(companyId, groupId, idServicio, start, end,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByServicio_First(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServicio_First(companyId, groupId, idServicio,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByServicio_First(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServicio_First(companyId, groupId, idServicio,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByServicio_Last(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServicio_Last(companyId, groupId, idServicio,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByServicio_Last(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServicio_Last(companyId, groupId, idServicio,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByServicio_PrevAndNext(
		long id, long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServicio_PrevAndNext(id, companyId, groupId,
			idServicio, orderByComparator);
	}

	/**
	* Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idServicio the id servicio
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByServicio(long companyId, long groupId,
		long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByServicio(companyId, groupId, idServicio);
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
	public static int countByServicio(long companyId, long groupId,
		long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByServicio(companyId, groupId, idServicio);
	}

	/**
	* Caches the oficina servicio municipio in the entity cache if it is enabled.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	*/
	public static void cacheResult(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio) {
		getPersistence().cacheResult(oficinaServicioMunicipio);
	}

	/**
	* Caches the oficina servicio municipios in the entity cache if it is enabled.
	*
	* @param oficinaServicioMunicipios the oficina servicio municipios
	*/
	public static void cacheResult(
		java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> oficinaServicioMunicipios) {
		getPersistence().cacheResult(oficinaServicioMunicipios);
	}

	/**
	* Creates a new oficina servicio municipio with the primary key. Does not add the oficina servicio municipio to the database.
	*
	* @param id the primary key for the new oficina servicio municipio
	* @return the new oficina servicio municipio
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the oficina servicio municipio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio that was removed
	* @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio remove(
		long id)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio updateImpl(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oficinaServicioMunicipio);
	}

	/**
	* Returns the oficina servicio municipio with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException} if it could not be found.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio
	* @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByPrimaryKey(
		long id)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the oficina servicio municipio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio, or <code>null</code> if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the oficina servicio municipios.
	*
	* @return the oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the oficina servicio municipios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of oficina servicio municipios.
	*
	* @return the number of oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OficinaServicioMunicipioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OficinaServicioMunicipioPersistence)PortletBeanLocatorUtil.locate(cat.diba.oficinasvivienda.service.ClpSerializer.getServletContextName(),
					OficinaServicioMunicipioPersistence.class.getName());

			ReferenceRegistry.registerReference(OficinaServicioMunicipioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OficinaServicioMunicipioPersistence persistence) {
	}

	private static OficinaServicioMunicipioPersistence _persistence;
}