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

package cat.diba.oficinasvivienda.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OficinaServicioMunicipio}.
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipio
 * @generated
 */
public class OficinaServicioMunicipioWrapper implements OficinaServicioMunicipio,
	ModelWrapper<OficinaServicioMunicipio> {
	public OficinaServicioMunicipioWrapper(
		OficinaServicioMunicipio oficinaServicioMunicipio) {
		_oficinaServicioMunicipio = oficinaServicioMunicipio;
	}

	@Override
	public Class<?> getModelClass() {
		return OficinaServicioMunicipio.class;
	}

	@Override
	public String getModelClassName() {
		return OficinaServicioMunicipio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("idOficina", getIdOficina());
		attributes.put("idServicio", getIdServicio());
		attributes.put("codigoIne", getCodigoIne());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long idOficina = (Long)attributes.get("idOficina");

		if (idOficina != null) {
			setIdOficina(idOficina);
		}

		Long idServicio = (Long)attributes.get("idServicio");

		if (idServicio != null) {
			setIdServicio(idServicio);
		}

		String codigoIne = (String)attributes.get("codigoIne");

		if (codigoIne != null) {
			setCodigoIne(codigoIne);
		}
	}

	/**
	* Returns the primary key of this oficina servicio municipio.
	*
	* @return the primary key of this oficina servicio municipio
	*/
	@Override
	public long getPrimaryKey() {
		return _oficinaServicioMunicipio.getPrimaryKey();
	}

	/**
	* Sets the primary key of this oficina servicio municipio.
	*
	* @param primaryKey the primary key of this oficina servicio municipio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oficinaServicioMunicipio.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this oficina servicio municipio.
	*
	* @return the ID of this oficina servicio municipio
	*/
	@Override
	public long getId() {
		return _oficinaServicioMunicipio.getId();
	}

	/**
	* Sets the ID of this oficina servicio municipio.
	*
	* @param id the ID of this oficina servicio municipio
	*/
	@Override
	public void setId(long id) {
		_oficinaServicioMunicipio.setId(id);
	}

	/**
	* Returns the company ID of this oficina servicio municipio.
	*
	* @return the company ID of this oficina servicio municipio
	*/
	@Override
	public long getCompanyId() {
		return _oficinaServicioMunicipio.getCompanyId();
	}

	/**
	* Sets the company ID of this oficina servicio municipio.
	*
	* @param companyId the company ID of this oficina servicio municipio
	*/
	@Override
	public void setCompanyId(long companyId) {
		_oficinaServicioMunicipio.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this oficina servicio municipio.
	*
	* @return the group ID of this oficina servicio municipio
	*/
	@Override
	public long getGroupId() {
		return _oficinaServicioMunicipio.getGroupId();
	}

	/**
	* Sets the group ID of this oficina servicio municipio.
	*
	* @param groupId the group ID of this oficina servicio municipio
	*/
	@Override
	public void setGroupId(long groupId) {
		_oficinaServicioMunicipio.setGroupId(groupId);
	}

	/**
	* Returns the id oficina of this oficina servicio municipio.
	*
	* @return the id oficina of this oficina servicio municipio
	*/
	@Override
	public long getIdOficina() {
		return _oficinaServicioMunicipio.getIdOficina();
	}

	/**
	* Sets the id oficina of this oficina servicio municipio.
	*
	* @param idOficina the id oficina of this oficina servicio municipio
	*/
	@Override
	public void setIdOficina(long idOficina) {
		_oficinaServicioMunicipio.setIdOficina(idOficina);
	}

	/**
	* Returns the id servicio of this oficina servicio municipio.
	*
	* @return the id servicio of this oficina servicio municipio
	*/
	@Override
	public long getIdServicio() {
		return _oficinaServicioMunicipio.getIdServicio();
	}

	/**
	* Sets the id servicio of this oficina servicio municipio.
	*
	* @param idServicio the id servicio of this oficina servicio municipio
	*/
	@Override
	public void setIdServicio(long idServicio) {
		_oficinaServicioMunicipio.setIdServicio(idServicio);
	}

	/**
	* Returns the codigo ine of this oficina servicio municipio.
	*
	* @return the codigo ine of this oficina servicio municipio
	*/
	@Override
	public java.lang.String getCodigoIne() {
		return _oficinaServicioMunicipio.getCodigoIne();
	}

	/**
	* Sets the codigo ine of this oficina servicio municipio.
	*
	* @param codigoIne the codigo ine of this oficina servicio municipio
	*/
	@Override
	public void setCodigoIne(java.lang.String codigoIne) {
		_oficinaServicioMunicipio.setCodigoIne(codigoIne);
	}

	@Override
	public boolean isNew() {
		return _oficinaServicioMunicipio.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oficinaServicioMunicipio.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oficinaServicioMunicipio.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oficinaServicioMunicipio.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oficinaServicioMunicipio.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oficinaServicioMunicipio.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oficinaServicioMunicipio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oficinaServicioMunicipio.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oficinaServicioMunicipio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oficinaServicioMunicipio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oficinaServicioMunicipio.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OficinaServicioMunicipioWrapper((OficinaServicioMunicipio)_oficinaServicioMunicipio.clone());
	}

	@Override
	public int compareTo(
		cat.diba.oficinasvivienda.model.OficinaServicioMunicipio oficinaServicioMunicipio) {
		return _oficinaServicioMunicipio.compareTo(oficinaServicioMunicipio);
	}

	@Override
	public int hashCode() {
		return _oficinaServicioMunicipio.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<cat.diba.oficinasvivienda.model.OficinaServicioMunicipio> toCacheModel() {
		return _oficinaServicioMunicipio.toCacheModel();
	}

	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio toEscapedModel() {
		return new OficinaServicioMunicipioWrapper(_oficinaServicioMunicipio.toEscapedModel());
	}

	@Override
	public cat.diba.oficinasvivienda.model.OficinaServicioMunicipio toUnescapedModel() {
		return new OficinaServicioMunicipioWrapper(_oficinaServicioMunicipio.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oficinaServicioMunicipio.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oficinaServicioMunicipio.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oficinaServicioMunicipio.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OficinaServicioMunicipioWrapper)) {
			return false;
		}

		OficinaServicioMunicipioWrapper oficinaServicioMunicipioWrapper = (OficinaServicioMunicipioWrapper)obj;

		if (Validator.equals(_oficinaServicioMunicipio,
					oficinaServicioMunicipioWrapper._oficinaServicioMunicipio)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OficinaServicioMunicipio getWrappedOficinaServicioMunicipio() {
		return _oficinaServicioMunicipio;
	}

	@Override
	public OficinaServicioMunicipio getWrappedModel() {
		return _oficinaServicioMunicipio;
	}

	@Override
	public void resetOriginalValues() {
		_oficinaServicioMunicipio.resetOriginalValues();
	}

	private OficinaServicioMunicipio _oficinaServicioMunicipio;
}