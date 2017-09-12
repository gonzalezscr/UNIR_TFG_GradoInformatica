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

package cat.diba.oficinasvivienda.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for OficinaServicioMunicipio. This utility wraps
 * {@link cat.diba.oficinasvivienda.service.impl.OficinaServicioMunicipioLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipioLocalService
 * @see cat.diba.oficinasvivienda.service.base.OficinaServicioMunicipioLocalServiceBaseImpl
 * @see cat.diba.oficinasvivienda.service.impl.OficinaServicioMunicipioLocalServiceImpl
 * @generated
 */
public class OficinaServicioMunicipioLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link cat.diba.oficinasvivienda.service.impl.OficinaServicioMunicipioLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the oficina servicio municipio to the database. Also notifies the appropriate model listeners.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	* @return the oficina servicio municipio that was added
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio addOficinaServicioMunicipio(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addOficinaServicioMunicipio(oficinaServicioMunicipio);
	}

	/**
	* Creates a new oficina servicio municipio with the primary key. Does not add the oficina servicio municipio to the database.
	*
	* @param id the primary key for the new oficina servicio municipio
	* @return the new oficina servicio municipio
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio createOficinaServicioMunicipio(
		long id) {
		return getService().createOficinaServicioMunicipio(id);
	}

	/**
	* Deletes the oficina servicio municipio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio that was removed
	* @throws PortalException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio deleteOficinaServicioMunicipio(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOficinaServicioMunicipio(id);
	}

	/**
	* Deletes the oficina servicio municipio from the database. Also notifies the appropriate model listeners.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	* @return the oficina servicio municipio that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio deleteOficinaServicioMunicipio(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteOficinaServicioMunicipio(oficinaServicioMunicipio);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchOficinaServicioMunicipio(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchOficinaServicioMunicipio(id);
	}

	/**
	* Returns the oficina servicio municipio with the primary key.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio
	* @throws PortalException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio getOficinaServicioMunicipio(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOficinaServicioMunicipio(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> getOficinaServicioMunicipios(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOficinaServicioMunicipios(start, end);
	}

	/**
	* Returns the number of oficina servicio municipios.
	*
	* @return the number of oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	public static int getOficinaServicioMunicipiosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOficinaServicioMunicipiosCount();
	}

	/**
	* Updates the oficina servicio municipio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	* @return the oficina servicio municipio that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio updateOficinaServicioMunicipio(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateOficinaServicioMunicipio(oficinaServicioMunicipio);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerMunicipiosPorOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio) {
		return getService()
				   .obtenerMunicipiosPorOficinaServicio(companyId, groupId,
			idOficina, idServicio);
	}

	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerMunicipiosPorOficina(
		long companyId, long groupId, long idOficina, int start, int end) {
		return getService()
				   .obtenerMunicipiosPorOficina(companyId, groupId, idOficina,
			start, end);
	}

	public static int obtenerMunicipiosPorOficinaTotal(long companyId,
		long groupId, long idOficina) {
		return getService()
				   .obtenerMunicipiosPorOficinaTotal(companyId, groupId,
			idOficina);
	}

	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerServiciosPorOficina(
		long companyId, long groupId, long idOficina, int start, int end) {
		return getService()
				   .obtenerServiciosPorOficina(companyId, groupId, idOficina,
			start, end);
	}

	public static int obtenerServiciosPorOficinaTotal(long companyId,
		long groupId, long idOficina) {
		return getService()
				   .obtenerServiciosPorOficinaTotal(companyId, groupId,
			idOficina);
	}

	public static cat.diba.oficinasvivienda.model.OficinaServicioMunicipio nuevaOficinaSM(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio osm) {
		return getService().nuevaOficinaSM(osm);
	}

	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerInfoPorServicio(
		long companyId, long groupId, long idServicio) {
		return getService()
				   .obtenerInfoPorServicio(companyId, groupId, idServicio);
	}

	public static java.util.List<java.lang.Long> obtenerOficinas(
		long companyId, long groupId, java.lang.String[] municipiosId,
		long[] serviciosId, long[] tipoOficina, int start, int end) {
		return getService()
				   .obtenerOficinas(companyId, groupId, municipiosId,
			serviciosId, tipoOficina, start, end);
	}

	public static int obtenerOficinasTotal(long companyId, long groupId,
		java.lang.String[] municipiosId, long[] serviciosId, long[] tipoOficina) {
		return getService()
				   .obtenerOficinasTotal(companyId, groupId, municipiosId,
			serviciosId, tipoOficina);
	}

	public static void clearService() {
		_service = null;
	}

	public static OficinaServicioMunicipioLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OficinaServicioMunicipioLocalService.class.getName());

			if (invokableLocalService instanceof OficinaServicioMunicipioLocalService) {
				_service = (OficinaServicioMunicipioLocalService)invokableLocalService;
			}
			else {
				_service = new OficinaServicioMunicipioLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(OficinaServicioMunicipioLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(OficinaServicioMunicipioLocalService service) {
	}

	private static OficinaServicioMunicipioLocalService _service;
}