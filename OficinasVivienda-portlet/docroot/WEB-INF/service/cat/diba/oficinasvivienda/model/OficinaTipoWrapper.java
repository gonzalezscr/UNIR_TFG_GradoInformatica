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
 * This class is a wrapper for {@link OficinaTipo}.
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaTipo
 * @generated
 */
public class OficinaTipoWrapper implements OficinaTipo,
	ModelWrapper<OficinaTipo> {
	public OficinaTipoWrapper(OficinaTipo oficinaTipo) {
		_oficinaTipo = oficinaTipo;
	}

	@Override
	public Class<?> getModelClass() {
		return OficinaTipo.class;
	}

	@Override
	public String getModelClassName() {
		return OficinaTipo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("idOficina", getIdOficina());
		attributes.put("idTipo", getIdTipo());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long idOficina = (Long)attributes.get("idOficina");

		if (idOficina != null) {
			setIdOficina(idOficina);
		}

		Long idTipo = (Long)attributes.get("idTipo");

		if (idTipo != null) {
			setIdTipo(idTipo);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	/**
	* Returns the primary key of this oficina tipo.
	*
	* @return the primary key of this oficina tipo
	*/
	@Override
	public long getPrimaryKey() {
		return _oficinaTipo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this oficina tipo.
	*
	* @param primaryKey the primary key of this oficina tipo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oficinaTipo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this oficina tipo.
	*
	* @return the ID of this oficina tipo
	*/
	@Override
	public long getId() {
		return _oficinaTipo.getId();
	}

	/**
	* Sets the ID of this oficina tipo.
	*
	* @param id the ID of this oficina tipo
	*/
	@Override
	public void setId(long id) {
		_oficinaTipo.setId(id);
	}

	/**
	* Returns the id oficina of this oficina tipo.
	*
	* @return the id oficina of this oficina tipo
	*/
	@Override
	public long getIdOficina() {
		return _oficinaTipo.getIdOficina();
	}

	/**
	* Sets the id oficina of this oficina tipo.
	*
	* @param idOficina the id oficina of this oficina tipo
	*/
	@Override
	public void setIdOficina(long idOficina) {
		_oficinaTipo.setIdOficina(idOficina);
	}

	/**
	* Returns the id tipo of this oficina tipo.
	*
	* @return the id tipo of this oficina tipo
	*/
	@Override
	public long getIdTipo() {
		return _oficinaTipo.getIdTipo();
	}

	/**
	* Sets the id tipo of this oficina tipo.
	*
	* @param idTipo the id tipo of this oficina tipo
	*/
	@Override
	public void setIdTipo(long idTipo) {
		_oficinaTipo.setIdTipo(idTipo);
	}

	/**
	* Returns the company ID of this oficina tipo.
	*
	* @return the company ID of this oficina tipo
	*/
	@Override
	public long getCompanyId() {
		return _oficinaTipo.getCompanyId();
	}

	/**
	* Sets the company ID of this oficina tipo.
	*
	* @param companyId the company ID of this oficina tipo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_oficinaTipo.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this oficina tipo.
	*
	* @return the group ID of this oficina tipo
	*/
	@Override
	public long getGroupId() {
		return _oficinaTipo.getGroupId();
	}

	/**
	* Sets the group ID of this oficina tipo.
	*
	* @param groupId the group ID of this oficina tipo
	*/
	@Override
	public void setGroupId(long groupId) {
		_oficinaTipo.setGroupId(groupId);
	}

	@Override
	public boolean isNew() {
		return _oficinaTipo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oficinaTipo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oficinaTipo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oficinaTipo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oficinaTipo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oficinaTipo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oficinaTipo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oficinaTipo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oficinaTipo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oficinaTipo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oficinaTipo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OficinaTipoWrapper((OficinaTipo)_oficinaTipo.clone());
	}

	@Override
	public int compareTo(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo) {
		return _oficinaTipo.compareTo(oficinaTipo);
	}

	@Override
	public int hashCode() {
		return _oficinaTipo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<cat.diba.oficinasvivienda.model.OficinaTipo> toCacheModel() {
		return _oficinaTipo.toCacheModel();
	}

	@Override
	public cat.diba.oficinasvivienda.model.OficinaTipo toEscapedModel() {
		return new OficinaTipoWrapper(_oficinaTipo.toEscapedModel());
	}

	@Override
	public cat.diba.oficinasvivienda.model.OficinaTipo toUnescapedModel() {
		return new OficinaTipoWrapper(_oficinaTipo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oficinaTipo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oficinaTipo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oficinaTipo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OficinaTipoWrapper)) {
			return false;
		}

		OficinaTipoWrapper oficinaTipoWrapper = (OficinaTipoWrapper)obj;

		if (Validator.equals(_oficinaTipo, oficinaTipoWrapper._oficinaTipo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OficinaTipo getWrappedOficinaTipo() {
		return _oficinaTipo;
	}

	@Override
	public OficinaTipo getWrappedModel() {
		return _oficinaTipo;
	}

	@Override
	public void resetOriginalValues() {
		_oficinaTipo.resetOriginalValues();
	}

	private OficinaTipo _oficinaTipo;
}