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

import cat.diba.oficinasvivienda.model.OficinaTipo;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the oficina tipo service. This utility wraps {@link OficinaTipoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaTipoPersistence
 * @see OficinaTipoPersistenceImpl
 * @generated
 */
public class OficinaTipoUtil {
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
	public static void clearCache(OficinaTipo oficinaTipo) {
		getPersistence().clearCache(oficinaTipo);
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
	public static List<OficinaTipo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OficinaTipo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OficinaTipo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OficinaTipo update(OficinaTipo oficinaTipo)
		throws SystemException {
		return getPersistence().update(oficinaTipo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OficinaTipo update(OficinaTipo oficinaTipo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oficinaTipo, serviceContext);
	}

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
	public static cat.diba.oficinasvivienda.model.OficinaTipo findByOficinaTipo(
		long companyId, long groupId, long idOficina)
		throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOficinaTipo(companyId, groupId, idOficina);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo fetchByOficinaTipo(
		long companyId, long groupId, long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOficinaTipo(companyId, groupId, idOficina);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo fetchByOficinaTipo(
		long companyId, long groupId, long idOficina, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOficinaTipo(companyId, groupId, idOficina,
			retrieveFromCache);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo removeByOficinaTipo(
		long companyId, long groupId, long idOficina)
		throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByOficinaTipo(companyId, groupId, idOficina);
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
	public static int countByOficinaTipo(long companyId, long groupId,
		long idOficina)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOficinaTipo(companyId, groupId, idOficina);
	}

	/**
	* Returns all the oficina tipos where companyId = &#63; and groupId = &#63; and idTipo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idTipo the id tipo
	* @return the matching oficina tipos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> findByTipo(
		long companyId, long groupId, long idTipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTipo(companyId, groupId, idTipo);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> findByTipo(
		long companyId, long groupId, long idTipo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTipo(companyId, groupId, idTipo, start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> findByTipo(
		long companyId, long groupId, long idTipo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTipo(companyId, groupId, idTipo, start, end,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo findByTipo_First(
		long companyId, long groupId, long idTipo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTipo_First(companyId, groupId, idTipo,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo fetchByTipo_First(
		long companyId, long groupId, long idTipo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTipo_First(companyId, groupId, idTipo,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo findByTipo_Last(
		long companyId, long groupId, long idTipo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTipo_Last(companyId, groupId, idTipo,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo fetchByTipo_Last(
		long companyId, long groupId, long idTipo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTipo_Last(companyId, groupId, idTipo,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.OficinaTipo[] findByTipo_PrevAndNext(
		long id, long companyId, long groupId, long idTipo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTipo_PrevAndNext(id, companyId, groupId, idTipo,
			orderByComparator);
	}

	/**
	* Removes all the oficina tipos where companyId = &#63; and groupId = &#63; and idTipo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param idTipo the id tipo
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTipo(long companyId, long groupId, long idTipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTipo(companyId, groupId, idTipo);
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
	public static int countByTipo(long companyId, long groupId, long idTipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTipo(companyId, groupId, idTipo);
	}

	/**
	* Caches the oficina tipo in the entity cache if it is enabled.
	*
	* @param oficinaTipo the oficina tipo
	*/
	public static void cacheResult(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo) {
		getPersistence().cacheResult(oficinaTipo);
	}

	/**
	* Caches the oficina tipos in the entity cache if it is enabled.
	*
	* @param oficinaTipos the oficina tipos
	*/
	public static void cacheResult(
		java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> oficinaTipos) {
		getPersistence().cacheResult(oficinaTipos);
	}

	/**
	* Creates a new oficina tipo with the primary key. Does not add the oficina tipo to the database.
	*
	* @param id the primary key for the new oficina tipo
	* @return the new oficina tipo
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the oficina tipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oficina tipo
	* @return the oficina tipo that was removed
	* @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a oficina tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo remove(long id)
		throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static cat.diba.oficinasvivienda.model.OficinaTipo updateImpl(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oficinaTipo);
	}

	/**
	* Returns the oficina tipo with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchOficinaTipoException} if it could not be found.
	*
	* @param id the primary key of the oficina tipo
	* @return the oficina tipo
	* @throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException if a oficina tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo findByPrimaryKey(
		long id)
		throws cat.diba.oficinasvivienda.NoSuchOficinaTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the oficina tipo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the oficina tipo
	* @return the oficina tipo, or <code>null</code> if a oficina tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the oficina tipos.
	*
	* @return the oficina tipos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the oficina tipos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of oficina tipos.
	*
	* @return the number of oficina tipos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OficinaTipoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OficinaTipoPersistence)PortletBeanLocatorUtil.locate(cat.diba.oficinasvivienda.service.ClpSerializer.getServletContextName(),
					OficinaTipoPersistence.class.getName());

			ReferenceRegistry.registerReference(OficinaTipoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OficinaTipoPersistence persistence) {
	}

	private static OficinaTipoPersistence _persistence;
}