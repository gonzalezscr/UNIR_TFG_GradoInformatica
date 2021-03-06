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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OficinaServicioMunicipioLocalService}.
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipioLocalService
 * @generated
 */
public class OficinaServicioMunicipioLocalServiceWrapper
	implements OficinaServicioMunicipioLocalService,
		ServiceWrapper<OficinaServicioMunicipioLocalService> {
	public OficinaServicioMunicipioLocalServiceWrapper(
		OficinaServicioMunicipioLocalService oficinaServicioMunicipioLocalService) {
		_oficinaServicioMunicipioLocalService = oficinaServicioMunicipioLocalService;
	}

	/**
	* Adds the oficina servicio municipio to the database. Also notifies the appropriate model listeners.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	* @return the oficina servicio municipio that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio addOficinaServicioMunicipio(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.addOficinaServicioMunicipio(oficinaServicioMunicipio);
	}

	/**
	* Creates a new oficina servicio municipio with the primary key. Does not add the oficina servicio municipio to the database.
	*
	* @param id the primary key for the new oficina servicio municipio
	* @return the new oficina servicio municipio
	*/
	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio createOficinaServicioMunicipio(
		long id) {
		return _oficinaServicioMunicipioLocalService.createOficinaServicioMunicipio(id);
	}

	/**
	* Deletes the oficina servicio municipio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio that was removed
	* @throws PortalException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio deleteOficinaServicioMunicipio(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.deleteOficinaServicioMunicipio(id);
	}

	/**
	* Deletes the oficina servicio municipio from the database. Also notifies the appropriate model listeners.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	* @return the oficina servicio municipio that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio deleteOficinaServicioMunicipio(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.deleteOficinaServicioMunicipio(oficinaServicioMunicipio);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oficinaServicioMunicipioLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio fetchOficinaServicioMunicipio(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.fetchOficinaServicioMunicipio(id);
	}

	/**
	* Returns the oficina servicio municipio with the primary key.
	*
	* @param id the primary key of the oficina servicio municipio
	* @return the oficina servicio municipio
	* @throws PortalException if a oficina servicio municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio getOficinaServicioMunicipio(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.getOficinaServicioMunicipio(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> getOficinaServicioMunicipios(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.getOficinaServicioMunicipios(start,
			end);
	}

	/**
	* Returns the number of oficina servicio municipios.
	*
	* @return the number of oficina servicio municipios
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOficinaServicioMunicipiosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.getOficinaServicioMunicipiosCount();
	}

	/**
	* Updates the oficina servicio municipio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oficinaServicioMunicipio the oficina servicio municipio
	* @return the oficina servicio municipio that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio updateOficinaServicioMunicipio(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oficinaServicioMunicipioLocalService.updateOficinaServicioMunicipio(oficinaServicioMunicipio);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oficinaServicioMunicipioLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oficinaServicioMunicipioLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oficinaServicioMunicipioLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerMunicipiosPorOficinaServicio(
		long companyId, long groupId, long idOficina, long idServicio) {
		return _oficinaServicioMunicipioLocalService.obtenerMunicipiosPorOficinaServicio(companyId,
			groupId, idOficina, idServicio);
	}

	@Override
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerMunicipiosPorOficina(
		long companyId, long groupId, long idOficina, int start, int end) {
		return _oficinaServicioMunicipioLocalService.obtenerMunicipiosPorOficina(companyId,
			groupId, idOficina, start, end);
	}

	@Override
	public int obtenerMunicipiosPorOficinaTotal(long companyId, long groupId,
		long idOficina) {
		return _oficinaServicioMunicipioLocalService.obtenerMunicipiosPorOficinaTotal(companyId,
			groupId, idOficina);
	}

	@Override
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerServiciosPorOficina(
		long companyId, long groupId, long idOficina, int start, int end) {
		return _oficinaServicioMunicipioLocalService.obtenerServiciosPorOficina(companyId,
			groupId, idOficina, start, end);
	}

	@Override
	public int obtenerServiciosPorOficinaTotal(long companyId, long groupId,
		long idOficina) {
		return _oficinaServicioMunicipioLocalService.obtenerServiciosPorOficinaTotal(companyId,
			groupId, idOficina);
	}

	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio nuevaOficinaSM(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio osm) {
		return _oficinaServicioMunicipioLocalService.nuevaOficinaSM(osm);
	}

	@Override
	public java.util.List<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> obtenerInfoPorServicio(
		long companyId, long groupId, long idServicio) {
		return _oficinaServicioMunicipioLocalService.obtenerInfoPorServicio(companyId,
			groupId, idServicio);
	}

	@Override
	public java.util.List<java.lang.Long> obtenerOficinas(long companyId,
		long groupId, java.lang.String[] municipiosId, long[] serviciosId,
		long[] tipoOficina, int start, int end) {
		return _oficinaServicioMunicipioLocalService.obtenerOficinas(companyId,
			groupId, municipiosId, serviciosId, tipoOficina, start, end);
	}

	@Override
	public int obtenerOficinasTotal(long companyId, long groupId,
		java.lang.String[] municipiosId, long[] serviciosId, long[] tipoOficina) {
		return _oficinaServicioMunicipioLocalService.obtenerOficinasTotal(companyId,
			groupId, municipiosId, serviciosId, tipoOficina);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OficinaServicioMunicipioLocalService getWrappedOficinaServicioMunicipioLocalService() {
		return _oficinaServicioMunicipioLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOficinaServicioMunicipioLocalService(
		OficinaServicioMunicipioLocalService oficinaServicioMunicipioLocalService) {
		_oficinaServicioMunicipioLocalService = oficinaServicioMunicipioLocalService;
	}

	@Override
	public OficinaServicioMunicipioLocalService getWrappedService() {
		return _oficinaServicioMunicipioLocalService;
	}

	@Override
	public void setWrappedService(
		OficinaServicioMunicipioLocalService oficinaServicioMunicipioLocalService) {
		_oficinaServicioMunicipioLocalService = oficinaServicioMunicipioLocalService;
	}

	private OficinaServicioMunicipioLocalService _oficinaServicioMunicipioLocalService;
}