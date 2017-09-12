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

import cat.diba.oficinasvivienda.model.Municipio;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the municipio service. This utility wraps {@link MunicipioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see MunicipioPersistence
 * @see MunicipioPersistenceImpl
 * @generated
 */
public class MunicipioUtil {
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
	public static void clearCache(Municipio municipio) {
		getPersistence().clearCache(municipio);
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
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Municipio update(Municipio municipio)
		throws SystemException {
		return getPersistence().update(municipio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Municipio update(Municipio municipio,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(municipio, serviceContext);
	}

	/**
	* Caches the municipio in the entity cache if it is enabled.
	*
	* @param municipio the municipio
	*/
	public static void cacheResult(
		cat.diba.oficinasvivienda.model.Municipio municipio) {
		getPersistence().cacheResult(municipio);
	}

	/**
	* Caches the municipios in the entity cache if it is enabled.
	*
	* @param municipios the municipios
	*/
	public static void cacheResult(
		java.util.List<cat.diba.oficinasvivienda.model.Municipio> municipios) {
		getPersistence().cacheResult(municipios);
	}

	/**
	* Creates a new municipio with the primary key. Does not add the municipio to the database.
	*
	* @param codigoIne the primary key for the new municipio
	* @return the new municipio
	*/
	public static cat.diba.oficinasvivienda.model.Municipio create(
		java.lang.String codigoIne) {
		return getPersistence().create(codigoIne);
	}

	/**
	* Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigoIne the primary key of the municipio
	* @return the municipio that was removed
	* @throws cat.diba.oficinasvivienda.NoSuchMunicipioException if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.Municipio remove(
		java.lang.String codigoIne)
		throws cat.diba.oficinasvivienda.NoSuchMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(codigoIne);
	}

	public static cat.diba.oficinasvivienda.model.Municipio updateImpl(
		cat.diba.oficinasvivienda.model.Municipio municipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(municipio);
	}

	/**
	* Returns the municipio with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchMunicipioException} if it could not be found.
	*
	* @param codigoIne the primary key of the municipio
	* @return the municipio
	* @throws cat.diba.oficinasvivienda.NoSuchMunicipioException if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.Municipio findByPrimaryKey(
		java.lang.String codigoIne)
		throws cat.diba.oficinasvivienda.NoSuchMunicipioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(codigoIne);
	}

	/**
	* Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param codigoIne the primary key of the municipio
	* @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.Municipio fetchByPrimaryKey(
		java.lang.String codigoIne)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(codigoIne);
	}

	/**
	* Returns all the municipios.
	*
	* @return the municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.Municipio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the municipios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.MunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of municipios
	* @param end the upper bound of the range of municipios (not inclusive)
	* @return the range of municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.Municipio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the municipios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.MunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of municipios
	* @param end the upper bound of the range of municipios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cat.diba.oficinasvivienda.model.Municipio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the municipios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of municipios.
	*
	* @return the number of municipios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MunicipioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MunicipioPersistence)PortletBeanLocatorUtil.locate(cat.diba.oficinasvivienda.service.ClpSerializer.getServletContextName(),
					MunicipioPersistence.class.getName());

			ReferenceRegistry.registerReference(MunicipioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MunicipioPersistence persistence) {
	}

	private static MunicipioPersistence _persistence;
}