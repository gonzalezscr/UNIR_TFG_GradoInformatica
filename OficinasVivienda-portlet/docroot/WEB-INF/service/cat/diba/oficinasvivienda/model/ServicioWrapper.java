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
 * This class is a wrapper for {@link Servicio}.
 * </p>
 *
 * @author gonzalezscr
 * @see Servicio
 * @generated
 */
public class ServicioWrapper implements Servicio, ModelWrapper<Servicio> {
	public ServicioWrapper(Servicio servicio) {
		_servicio = servicio;
	}

	@Override
	public Class<?> getModelClass() {
		return Servicio.class;
	}

	@Override
	public String getModelClassName() {
		return Servicio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idServicio", getIdServicio());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("nombre", getNombre());
		attributes.put("necesidad", getNecesidad());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idServicio = (Long)attributes.get("idServicio");

		if (idServicio != null) {
			setIdServicio(idServicio);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String necesidad = (String)attributes.get("necesidad");

		if (necesidad != null) {
			setNecesidad(necesidad);
		}
	}

	/**
	* Returns the primary key of this servicio.
	*
	* @return the primary key of this servicio
	*/
	@Override
	public long getPrimaryKey() {
		return _servicio.getPrimaryKey();
	}

	/**
	* Sets the primary key of this servicio.
	*
	* @param primaryKey the primary key of this servicio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_servicio.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id servicio of this servicio.
	*
	* @return the id servicio of this servicio
	*/
	@Override
	public long getIdServicio() {
		return _servicio.getIdServicio();
	}

	/**
	* Sets the id servicio of this servicio.
	*
	* @param idServicio the id servicio of this servicio
	*/
	@Override
	public void setIdServicio(long idServicio) {
		_servicio.setIdServicio(idServicio);
	}

	/**
	* Returns the company ID of this servicio.
	*
	* @return the company ID of this servicio
	*/
	@Override
	public long getCompanyId() {
		return _servicio.getCompanyId();
	}

	/**
	* Sets the company ID of this servicio.
	*
	* @param companyId the company ID of this servicio
	*/
	@Override
	public void setCompanyId(long companyId) {
		_servicio.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this servicio.
	*
	* @return the group ID of this servicio
	*/
	@Override
	public long getGroupId() {
		return _servicio.getGroupId();
	}

	/**
	* Sets the group ID of this servicio.
	*
	* @param groupId the group ID of this servicio
	*/
	@Override
	public void setGroupId(long groupId) {
		_servicio.setGroupId(groupId);
	}

	/**
	* Returns the nombre of this servicio.
	*
	* @return the nombre of this servicio
	*/
	@Override
	public java.lang.String getNombre() {
		return _servicio.getNombre();
	}

	/**
	* Returns the localized nombre of this servicio in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized nombre of this servicio
	*/
	@Override
	public java.lang.String getNombre(java.util.Locale locale) {
		return _servicio.getNombre(locale);
	}

	/**
	* Returns the localized nombre of this servicio in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized nombre of this servicio. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getNombre(java.util.Locale locale,
		boolean useDefault) {
		return _servicio.getNombre(locale, useDefault);
	}

	/**
	* Returns the localized nombre of this servicio in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized nombre of this servicio
	*/
	@Override
	public java.lang.String getNombre(java.lang.String languageId) {
		return _servicio.getNombre(languageId);
	}

	/**
	* Returns the localized nombre of this servicio in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized nombre of this servicio
	*/
	@Override
	public java.lang.String getNombre(java.lang.String languageId,
		boolean useDefault) {
		return _servicio.getNombre(languageId, useDefault);
	}

	@Override
	public java.lang.String getNombreCurrentLanguageId() {
		return _servicio.getNombreCurrentLanguageId();
	}

	@Override
	public java.lang.String getNombreCurrentValue() {
		return _servicio.getNombreCurrentValue();
	}

	/**
	* Returns a map of the locales and localized nombres of this servicio.
	*
	* @return the locales and localized nombres of this servicio
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getNombreMap() {
		return _servicio.getNombreMap();
	}

	/**
	* Sets the nombre of this servicio.
	*
	* @param nombre the nombre of this servicio
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_servicio.setNombre(nombre);
	}

	/**
	* Sets the localized nombre of this servicio in the language.
	*
	* @param nombre the localized nombre of this servicio
	* @param locale the locale of the language
	*/
	@Override
	public void setNombre(java.lang.String nombre, java.util.Locale locale) {
		_servicio.setNombre(nombre, locale);
	}

	/**
	* Sets the localized nombre of this servicio in the language, and sets the default locale.
	*
	* @param nombre the localized nombre of this servicio
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setNombre(java.lang.String nombre, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_servicio.setNombre(nombre, locale, defaultLocale);
	}

	@Override
	public void setNombreCurrentLanguageId(java.lang.String languageId) {
		_servicio.setNombreCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized nombres of this servicio from the map of locales and localized nombres.
	*
	* @param nombreMap the locales and localized nombres of this servicio
	*/
	@Override
	public void setNombreMap(
		java.util.Map<java.util.Locale, java.lang.String> nombreMap) {
		_servicio.setNombreMap(nombreMap);
	}

	/**
	* Sets the localized nombres of this servicio from the map of locales and localized nombres, and sets the default locale.
	*
	* @param nombreMap the locales and localized nombres of this servicio
	* @param defaultLocale the default locale
	*/
	@Override
	public void setNombreMap(
		java.util.Map<java.util.Locale, java.lang.String> nombreMap,
		java.util.Locale defaultLocale) {
		_servicio.setNombreMap(nombreMap, defaultLocale);
	}

	/**
	* Returns the necesidad of this servicio.
	*
	* @return the necesidad of this servicio
	*/
	@Override
	public java.lang.String getNecesidad() {
		return _servicio.getNecesidad();
	}

	/**
	* Returns the localized necesidad of this servicio in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized necesidad of this servicio
	*/
	@Override
	public java.lang.String getNecesidad(java.util.Locale locale) {
		return _servicio.getNecesidad(locale);
	}

	/**
	* Returns the localized necesidad of this servicio in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized necesidad of this servicio. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getNecesidad(java.util.Locale locale,
		boolean useDefault) {
		return _servicio.getNecesidad(locale, useDefault);
	}

	/**
	* Returns the localized necesidad of this servicio in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized necesidad of this servicio
	*/
	@Override
	public java.lang.String getNecesidad(java.lang.String languageId) {
		return _servicio.getNecesidad(languageId);
	}

	/**
	* Returns the localized necesidad of this servicio in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized necesidad of this servicio
	*/
	@Override
	public java.lang.String getNecesidad(java.lang.String languageId,
		boolean useDefault) {
		return _servicio.getNecesidad(languageId, useDefault);
	}

	@Override
	public java.lang.String getNecesidadCurrentLanguageId() {
		return _servicio.getNecesidadCurrentLanguageId();
	}

	@Override
	public java.lang.String getNecesidadCurrentValue() {
		return _servicio.getNecesidadCurrentValue();
	}

	/**
	* Returns a map of the locales and localized necesidads of this servicio.
	*
	* @return the locales and localized necesidads of this servicio
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getNecesidadMap() {
		return _servicio.getNecesidadMap();
	}

	/**
	* Sets the necesidad of this servicio.
	*
	* @param necesidad the necesidad of this servicio
	*/
	@Override
	public void setNecesidad(java.lang.String necesidad) {
		_servicio.setNecesidad(necesidad);
	}

	/**
	* Sets the localized necesidad of this servicio in the language.
	*
	* @param necesidad the localized necesidad of this servicio
	* @param locale the locale of the language
	*/
	@Override
	public void setNecesidad(java.lang.String necesidad, java.util.Locale locale) {
		_servicio.setNecesidad(necesidad, locale);
	}

	/**
	* Sets the localized necesidad of this servicio in the language, and sets the default locale.
	*
	* @param necesidad the localized necesidad of this servicio
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setNecesidad(java.lang.String necesidad,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_servicio.setNecesidad(necesidad, locale, defaultLocale);
	}

	@Override
	public void setNecesidadCurrentLanguageId(java.lang.String languageId) {
		_servicio.setNecesidadCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized necesidads of this servicio from the map of locales and localized necesidads.
	*
	* @param necesidadMap the locales and localized necesidads of this servicio
	*/
	@Override
	public void setNecesidadMap(
		java.util.Map<java.util.Locale, java.lang.String> necesidadMap) {
		_servicio.setNecesidadMap(necesidadMap);
	}

	/**
	* Sets the localized necesidads of this servicio from the map of locales and localized necesidads, and sets the default locale.
	*
	* @param necesidadMap the locales and localized necesidads of this servicio
	* @param defaultLocale the default locale
	*/
	@Override
	public void setNecesidadMap(
		java.util.Map<java.util.Locale, java.lang.String> necesidadMap,
		java.util.Locale defaultLocale) {
		_servicio.setNecesidadMap(necesidadMap, defaultLocale);
	}

	@Override
	public boolean isNew() {
		return _servicio.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_servicio.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _servicio.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_servicio.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _servicio.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _servicio.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_servicio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _servicio.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_servicio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_servicio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_servicio.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _servicio.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _servicio.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_servicio.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_servicio.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new ServicioWrapper((Servicio)_servicio.clone());
	}

	@Override
	public int compareTo(cat.diba.oficinasvivienda.model.Servicio servicio) {
		return _servicio.compareTo(servicio);
	}

	@Override
	public int hashCode() {
		return _servicio.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<cat.diba.oficinasvivienda.model.Servicio> toCacheModel() {
		return _servicio.toCacheModel();
	}

	@Override
	public cat.diba.oficinasvivienda.model.Servicio toEscapedModel() {
		return new ServicioWrapper(_servicio.toEscapedModel());
	}

	@Override
	public cat.diba.oficinasvivienda.model.Servicio toUnescapedModel() {
		return new ServicioWrapper(_servicio.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _servicio.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _servicio.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_servicio.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicioWrapper)) {
			return false;
		}

		ServicioWrapper servicioWrapper = (ServicioWrapper)obj;

		if (Validator.equals(_servicio, servicioWrapper._servicio)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Servicio getWrappedServicio() {
		return _servicio;
	}

	@Override
	public Servicio getWrappedModel() {
		return _servicio;
	}

	@Override
	public void resetOriginalValues() {
		_servicio.resetOriginalValues();
	}

	private Servicio _servicio;
}