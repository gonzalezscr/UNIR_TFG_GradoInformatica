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

import cat.diba.oficinasvivienda.model.Tipo;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the tipo service. This utility wraps {@link TipoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see TipoPersistence
 * @see TipoPersistenceImpl
 * @generated
 */
public class TipoUtil {
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
	public static void clearCache(Tipo tipo) {
		getPersistence().clearCache(tipo);
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
	public static List<Tipo> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tipo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tipo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Tipo update(Tipo tipo) throws SystemException {
		return getPersistence().update(tipo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Tipo update(Tipo tipo, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tipo, serviceContext);
	}

	/**
	* Returns all the tipos where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching tipos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.Tipo> findBycompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycompanyGroup(companyId, groupId);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.Tipo> findBycompanyGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyGroup(companyId, groupId, start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.Tipo> findBycompanyGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyGroup(companyId, groupId, start, end,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.Tipo findBycompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyGroup_First(companyId, groupId,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.Tipo fetchBycompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycompanyGroup_First(companyId, groupId,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.Tipo findBycompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyGroup_Last(companyId, groupId,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.Tipo fetchBycompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycompanyGroup_Last(companyId, groupId,
			orderByComparator);
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
	public static cat.diba.oficinasvivienda.model.Tipo[] findBycompanyGroup_PrevAndNext(
		long idTipo, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycompanyGroup_PrevAndNext(idTipo, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the tipos where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycompanyGroup(companyId, groupId);
	}

	/**
	* Returns the number of tipos where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching tipos
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycompanyGroup(companyId, groupId);
	}

	/**
	* Caches the tipo in the entity cache if it is enabled.
	*
	* @param tipo the tipo
	*/
	public static void cacheResult(cat.diba.oficinasvivienda.model.Tipo tipo) {
		getPersistence().cacheResult(tipo);
	}

	/**
	* Caches the tipos in the entity cache if it is enabled.
	*
	* @param tipos the tipos
	*/
	public static void cacheResult(
		java.util.List<cat.diba.oficinasvivienda.model.Tipo> tipos) {
		getPersistence().cacheResult(tipos);
	}

	/**
	* Creates a new tipo with the primary key. Does not add the tipo to the database.
	*
	* @param idTipo the primary key for the new tipo
	* @return the new tipo
	*/
	public static cat.diba.oficinasvivienda.model.Tipo create(long idTipo) {
		return getPersistence().create(idTipo);
	}

	/**
	* Removes the tipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idTipo the primary key of the tipo
	* @return the tipo that was removed
	* @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.Tipo remove(long idTipo)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(idTipo);
	}

	public static cat.diba.oficinasvivienda.model.Tipo updateImpl(
		cat.diba.oficinasvivienda.model.Tipo tipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tipo);
	}

	/**
	* Returns the tipo with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchTipoException} if it could not be found.
	*
	* @param idTipo the primary key of the tipo
	* @return the tipo
	* @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.Tipo findByPrimaryKey(
		long idTipo)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(idTipo);
	}

	/**
	* Returns the tipo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idTipo the primary key of the tipo
	* @return the tipo, or <code>null</code> if a tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.Tipo fetchByPrimaryKey(
		long idTipo) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(idTipo);
	}

	/**
	* Returns all the tipos.
	*
	* @return the tipos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.Tipo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<cat.diba.oficinasvivienda.model.Tipo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.Tipo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tipos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipos.
	*
	* @return the number of tipos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TipoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TipoPersistence)PortletBeanLocatorUtil.locate(cat.diba.oficinasvivienda.service.ClpSerializer.getServletContextName(),
					TipoPersistence.class.getName());

			ReferenceRegistry.registerReference(TipoUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TipoPersistence persistence) {
	}

	private static TipoPersistence _persistence;
}