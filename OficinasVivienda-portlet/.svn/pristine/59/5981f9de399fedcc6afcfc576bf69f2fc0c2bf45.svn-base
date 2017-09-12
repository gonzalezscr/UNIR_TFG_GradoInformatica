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
 * This class is a wrapper for {@link Municipio}.
 * </p>
 *
 * @author gonzalezscr
 * @see Municipio
 * @generated
 */
public class MunicipioWrapper implements Municipio, ModelWrapper<Municipio> {
	public MunicipioWrapper(Municipio municipio) {
		_municipio = municipio;
	}

	@Override
	public Class<?> getModelClass() {
		return Municipio.class;
	}

	@Override
	public String getModelClassName() {
		return Municipio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigoIne", getCodigoIne());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String codigoIne = (String)attributes.get("codigoIne");

		if (codigoIne != null) {
			setCodigoIne(codigoIne);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	/**
	* Returns the primary key of this municipio.
	*
	* @return the primary key of this municipio
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _municipio.getPrimaryKey();
	}

	/**
	* Sets the primary key of this municipio.
	*
	* @param primaryKey the primary key of this municipio
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_municipio.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo ine of this municipio.
	*
	* @return the codigo ine of this municipio
	*/
	@Override
	public java.lang.String getCodigoIne() {
		return _municipio.getCodigoIne();
	}

	/**
	* Sets the codigo ine of this municipio.
	*
	* @param codigoIne the codigo ine of this municipio
	*/
	@Override
	public void setCodigoIne(java.lang.String codigoIne) {
		_municipio.setCodigoIne(codigoIne);
	}

	/**
	* Returns the nombre of this municipio.
	*
	* @return the nombre of this municipio
	*/
	@Override
	public java.lang.String getNombre() {
		return _municipio.getNombre();
	}

	/**
	* Sets the nombre of this municipio.
	*
	* @param nombre the nombre of this municipio
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_municipio.setNombre(nombre);
	}

	@Override
	public boolean isNew() {
		return _municipio.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_municipio.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _municipio.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_municipio.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _municipio.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _municipio.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_municipio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _municipio.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_municipio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_municipio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_municipio.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MunicipioWrapper((Municipio)_municipio.clone());
	}

	@Override
	public int compareTo(cat.diba.oficinasvivienda.model.Municipio municipio) {
		return _municipio.compareTo(municipio);
	}

	@Override
	public int hashCode() {
		return _municipio.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<cat.diba.oficinasvivienda.model.Municipio> toCacheModel() {
		return _municipio.toCacheModel();
	}

	@Override
	public cat.diba.oficinasvivienda.model.Municipio toEscapedModel() {
		return new MunicipioWrapper(_municipio.toEscapedModel());
	}

	@Override
	public cat.diba.oficinasvivienda.model.Municipio toUnescapedModel() {
		return new MunicipioWrapper(_municipio.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _municipio.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _municipio.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_municipio.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MunicipioWrapper)) {
			return false;
		}

		MunicipioWrapper municipioWrapper = (MunicipioWrapper)obj;

		if (Validator.equals(_municipio, municipioWrapper._municipio)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Municipio getWrappedMunicipio() {
		return _municipio;
	}

	@Override
	public Municipio getWrappedModel() {
		return _municipio;
	}

	@Override
	public void resetOriginalValues() {
		_municipio.resetOriginalValues();
	}

	private Municipio _municipio;
}