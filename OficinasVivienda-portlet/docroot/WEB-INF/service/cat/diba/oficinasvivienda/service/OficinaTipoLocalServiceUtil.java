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
 * Provides the local service utility for OficinaTipo. This utility wraps
 * {@link cat.diba.oficinasvivienda.service.impl.OficinaTipoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author gonzalezscr
 * @see OficinaTipoLocalService
 * @see cat.diba.oficinasvivienda.service.base.OficinaTipoLocalServiceBaseImpl
 * @see cat.diba.oficinasvivienda.service.impl.OficinaTipoLocalServiceImpl
 * @generated
 */
public class OficinaTipoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link cat.diba.oficinasvivienda.service.impl.OficinaTipoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the oficina tipo to the database. Also notifies the appropriate model listeners.
	*
	* @param oficinaTipo the oficina tipo
	* @return the oficina tipo that was added
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo addOficinaTipo(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addOficinaTipo(oficinaTipo);
	}

	/**
	* Creates a new oficina tipo with the primary key. Does not add the oficina tipo to the database.
	*
	* @param id the primary key for the new oficina tipo
	* @return the new oficina tipo
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo createOficinaTipo(
		long id) {
		return getService().createOficinaTipo(id);
	}

	/**
	* Deletes the oficina tipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oficina tipo
	* @return the oficina tipo that was removed
	* @throws PortalException if a oficina tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo deleteOficinaTipo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOficinaTipo(id);
	}

	/**
	* Deletes the oficina tipo from the database. Also notifies the appropriate model listeners.
	*
	* @param oficinaTipo the oficina tipo
	* @return the oficina tipo that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo deleteOficinaTipo(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOficinaTipo(oficinaTipo);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static cat.diba.oficinasvivienda.model.OficinaTipo fetchOficinaTipo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchOficinaTipo(id);
	}

	/**
	* Returns the oficina tipo with the primary key.
	*
	* @param id the primary key of the oficina tipo
	* @return the oficina tipo
	* @throws PortalException if a oficina tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo getOficinaTipo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOficinaTipo(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> getOficinaTipos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOficinaTipos(start, end);
	}

	/**
	* Returns the number of oficina tipos.
	*
	* @return the number of oficina tipos
	* @throws SystemException if a system exception occurred
	*/
	public static int getOficinaTiposCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOficinaTiposCount();
	}

	/**
	* Updates the oficina tipo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oficinaTipo the oficina tipo
	* @return the oficina tipo that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static cat.diba.oficinasvivienda.model.OficinaTipo updateOficinaTipo(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOficinaTipo(oficinaTipo);
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

	public static long obtenerTipoPorOficina(long companyId, long groupId,
		long idOficina) {
		return getService().obtenerTipoPorOficina(companyId, groupId, idOficina);
	}

	public static cat.diba.oficinasvivienda.model.OficinaTipo obtenerOficinaTipoPorOficina(
		long companyId, long groupId, long idOficina) {
		return getService()
				   .obtenerOficinaTipoPorOficina(companyId, groupId, idOficina);
	}

	public static java.util.List<cat.diba.oficinasvivienda.model.OficinaTipo> obtenerOficinaTipoPorTipo(
		long companyId, long groupId, long idTipo) {
		return getService().obtenerOficinaTipoPorTipo(companyId, groupId, idTipo);
	}

	public static cat.diba.oficinasvivienda.model.OficinaTipo nuevaOficinaTipo(
		cat.diba.oficinasvivienda.model.OficinaTipo ofiTipo) {
		return getService().nuevaOficinaTipo(ofiTipo);
	}

	public static void clearService() {
		_service = null;
	}

	public static OficinaTipoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OficinaTipoLocalService.class.getName());

			if (invokableLocalService instanceof OficinaTipoLocalService) {
				_service = (OficinaTipoLocalService)invokableLocalService;
			}
			else {
				_service = new OficinaTipoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(OficinaTipoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(OficinaTipoLocalService service) {
	}

	private static OficinaTipoLocalService _service;
}