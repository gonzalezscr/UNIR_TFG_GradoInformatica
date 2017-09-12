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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the oficina servicio municipio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipioPersistenceImpl
 * @see OficinaServicioMunicipioUtil
 * @generated
 */
public interface OficinaServicioMunicipioPersistence extends BasePersistence<OficinaServicioMunicipio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OficinaServicioMunicipioUtil} to access the oficina servicio municipio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idOficina the id oficina
	* @return the matching oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficina(
		long companyId, long groupId, long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficina(
		long companyId, long groupId, long idOficina, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficina(
		long companyId, long groupId, long idOficina, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficina_First(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficina_First(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficina_Last(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficina_Last(
		long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByOficina_PrevAndNext(
		long id, long companyId, long groupId, long idOficina,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idOficina the id oficina
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOficina(long companyId, long groupId, long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idOficina the id oficina
	* @return the number of matching oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public int countByOficina(long companyId, long groupId, long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaServicio_First(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaServicio_First(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaServicio_Last(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaServicio_Last(
		long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByOficinaServicio_PrevAndNext(
		long id, long companyId, long groupId, long idOficina, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and idServicio = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idOficina the id oficina
	* @param idServicio the id servicio
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOficinaServicio(long companyId, long groupId,
		long idOficina, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByOficinaServicio(long companyId, long groupId,
		long idOficina, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaIne(
		long companyId, long groupId, long idOficina, java.lang.String codigoIne)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaIne(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByOficinaIne(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaIne_First(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaIne_First(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByOficinaIne_Last(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByOficinaIne_Last(
		long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByOficinaIne_PrevAndNext(
		long id, long companyId, long groupId, long idOficina,
		java.lang.String codigoIne,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idOficina = &#63; and codigoIne = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idOficina the id oficina
	* @param codigoIne the codigo ine
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOficinaIne(long companyId, long groupId,
		long idOficina, java.lang.String codigoIne)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByOficinaIne(long companyId, long groupId, long idOficina,
		java.lang.String codigoIne)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idServicio the id servicio
	* @return the matching oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByServicio(
		long companyId, long groupId, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByServicio(
		long companyId, long groupId, long idServicio, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findByServicio(
		long companyId, long groupId, long idServicio, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByServicio_First(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByServicio_First(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByServicio_Last(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByServicio_Last(
		long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio[] findByServicio_PrevAndNext(
		long id, long companyId, long groupId, long idServicio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idServicio the id servicio
	* @throws SystemException if a system exception occurred
	*/
	public void removeByServicio(long companyId, long groupId, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of oficina servicio municipios where companyId = &#63; and groupId = &#63; and idServicio = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idServicio the id servicio
	* @return the number of matching oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public int countByServicio(long companyId, long groupId, long idServicio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the oficina servicio municipio in the entity cache if it is enabled.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	*/
	public void cacheResult(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio);

	/**
	* Caches the oficina servicio municipios in the entity cache if it is enabled.
	*
	* @param oficinaServicioMunicipios the oficina servicio municipios
	*/
	public void cacheResult(
		java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> oficinaServicioMunicipios);

	/**
	* Creates a new oficina servicio municipio with the primary key. Does not add the oficina servicio municipio to the database.
	*
	* @param id the primary key for the new oficina servicio municipio
	* @return the new oficina servicio municipio
	*/
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio create(
		long id);

	/**
	* Removes the oficina servicio municipio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio that was removed
	* @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio remove(
		long id)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio updateImpl(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the oficina servicio municipio with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException} if it could not be found.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio
	* @throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio findByPrimaryKey(
		long id)
		throws cat.diba.oficinasvivienda.NoSuchOficinaServicioMunicipioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the oficina servicio municipio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio, or <code>null</code> if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the oficina servicio municipios.
	*
	* @return the oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the oficina servicio municipios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of oficina servicio municipios.
	*
	* @return the number of oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}