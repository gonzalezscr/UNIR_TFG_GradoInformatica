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

import cat.diba.oficinasvivienda.service.ClpSerializer;
import cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author gonzalezscr
 */
public class ServicioClp extends BaseModelImpl<Servicio> implements Servicio {
	public ServicioClp() {
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
	public long getPrimaryKey() {
		return _idServicio;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdServicio(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idServicio;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getIdServicio() {
		return _idServicio;
	}

	@Override
	public void setIdServicio(long idServicio) {
		_idServicio = idServicio;

		if (_servicioRemoteModel != null) {
			try {
				Class<?> clazz = _servicioRemoteModel.getClass();

				Method method = clazz.getMethod("setIdServicio", long.class);

				method.invoke(_servicioRemoteModel, idServicio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_servicioRemoteModel != null) {
			try {
				Class<?> clazz = _servicioRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_servicioRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_servicioRemoteModel != null) {
			try {
				Class<?> clazz = _servicioRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_servicioRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNombre() {
		return _nombre;
	}

	@Override
	public String getNombre(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getNombre(languageId);
	}

	@Override
	public String getNombre(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getNombre(languageId, useDefault);
	}

	@Override
	public String getNombre(String languageId) {
		return LocalizationUtil.getLocalization(getNombre(), languageId);
	}

	@Override
	public String getNombre(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getNombre(), languageId,
			useDefault);
	}

	@Override
	public String getNombreCurrentLanguageId() {
		return _nombreCurrentLanguageId;
	}

	@Override
	public String getNombreCurrentValue() {
		Locale locale = getLocale(_nombreCurrentLanguageId);

		return getNombre(locale);
	}

	@Override
	public Map<Locale, String> getNombreMap() {
		return LocalizationUtil.getLocalizationMap(getNombre());
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;

		if (_servicioRemoteModel != null) {
			try {
				Class<?> clazz = _servicioRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_servicioRemoteModel, nombre);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setNombre(String nombre, Locale locale) {
		setNombre(nombre, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setNombre(String nombre, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(nombre)) {
			setNombre(LocalizationUtil.updateLocalization(getNombre(),
					"Nombre", nombre, languageId, defaultLanguageId));
		}
		else {
			setNombre(LocalizationUtil.removeLocalization(getNombre(),
					"Nombre", languageId));
		}
	}

	@Override
	public void setNombreCurrentLanguageId(String languageId) {
		_nombreCurrentLanguageId = languageId;
	}

	@Override
	public void setNombreMap(Map<Locale, String> nombreMap) {
		setNombreMap(nombreMap, LocaleUtil.getDefault());
	}

	@Override
	public void setNombreMap(Map<Locale, String> nombreMap, Locale defaultLocale) {
		if (nombreMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setNombre(LocalizationUtil.updateLocalization(nombreMap,
					getNombre(), "Nombre",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public String getNecesidad() {
		return _necesidad;
	}

	@Override
	public String getNecesidad(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getNecesidad(languageId);
	}

	@Override
	public String getNecesidad(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getNecesidad(languageId, useDefault);
	}

	@Override
	public String getNecesidad(String languageId) {
		return LocalizationUtil.getLocalization(getNecesidad(), languageId);
	}

	@Override
	public String getNecesidad(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getNecesidad(), languageId,
			useDefault);
	}

	@Override
	public String getNecesidadCurrentLanguageId() {
		return _necesidadCurrentLanguageId;
	}

	@Override
	public String getNecesidadCurrentValue() {
		Locale locale = getLocale(_necesidadCurrentLanguageId);

		return getNecesidad(locale);
	}

	@Override
	public Map<Locale, String> getNecesidadMap() {
		return LocalizationUtil.getLocalizationMap(getNecesidad());
	}

	@Override
	public void setNecesidad(String necesidad) {
		_necesidad = necesidad;

		if (_servicioRemoteModel != null) {
			try {
				Class<?> clazz = _servicioRemoteModel.getClass();

				Method method = clazz.getMethod("setNecesidad", String.class);

				method.invoke(_servicioRemoteModel, necesidad);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setNecesidad(String necesidad, Locale locale) {
		setNecesidad(necesidad, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setNecesidad(String necesidad, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(necesidad)) {
			setNecesidad(LocalizationUtil.updateLocalization(getNecesidad(),
					"Necesidad", necesidad, languageId, defaultLanguageId));
		}
		else {
			setNecesidad(LocalizationUtil.removeLocalization(getNecesidad(),
					"Necesidad", languageId));
		}
	}

	@Override
	public void setNecesidadCurrentLanguageId(String languageId) {
		_necesidadCurrentLanguageId = languageId;
	}

	@Override
	public void setNecesidadMap(Map<Locale, String> necesidadMap) {
		setNecesidadMap(necesidadMap, LocaleUtil.getDefault());
	}

	@Override
	public void setNecesidadMap(Map<Locale, String> necesidadMap,
		Locale defaultLocale) {
		if (necesidadMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setNecesidad(LocalizationUtil.updateLocalization(necesidadMap,
					getNecesidad(), "Necesidad",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	public BaseModel<?> getServicioRemoteModel() {
		return _servicioRemoteModel;
	}

	public void setServicioRemoteModel(BaseModel<?> servicioRemoteModel) {
		_servicioRemoteModel = servicioRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _servicioRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_servicioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServicioLocalServiceUtil.addServicio(this);
		}
		else {
			ServicioLocalServiceUtil.updateServicio(this);
		}
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> nombreMap = getNombreMap();

		for (Map.Entry<Locale, String> entry : nombreMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> necesidadMap = getNecesidadMap();

		for (Map.Entry<Locale, String> entry : necesidadMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getNombre();

		if (xml == null) {
			return StringPool.BLANK;
		}

		Locale defaultLocale = LocaleUtil.getDefault();

		return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		prepareLocalizedFieldsForImport(null);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		Locale defaultLocale = LocaleUtil.getDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String nombre = getNombre(defaultLocale);

		if (Validator.isNull(nombre)) {
			setNombre(getNombre(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setNombre(getNombre(defaultLocale), defaultLocale, defaultLocale);
		}

		String necesidad = getNecesidad(defaultLocale);

		if (Validator.isNull(necesidad)) {
			setNecesidad(getNecesidad(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setNecesidad(getNecesidad(defaultLocale), defaultLocale,
				defaultLocale);
		}
	}

	@Override
	public Servicio toEscapedModel() {
		return (Servicio)ProxyUtil.newProxyInstance(Servicio.class.getClassLoader(),
			new Class[] { Servicio.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServicioClp clone = new ServicioClp();

		clone.setIdServicio(getIdServicio());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setNombre(getNombre());
		clone.setNecesidad(getNecesidad());

		return clone;
	}

	@Override
	public int compareTo(Servicio servicio) {
		long primaryKey = servicio.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicioClp)) {
			return false;
		}

		ServicioClp servicio = (ServicioClp)obj;

		long primaryKey = servicio.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{idServicio=");
		sb.append(getIdServicio());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", necesidad=");
		sb.append(getNecesidad());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("cat.diba.oficinasvivienda.model.Servicio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idServicio</column-name><column-value><![CDATA[");
		sb.append(getIdServicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>necesidad</column-name><column-value><![CDATA[");
		sb.append(getNecesidad());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _idServicio;
	private long _companyId;
	private long _groupId;
	private String _nombre;
	private String _nombreCurrentLanguageId;
	private String _necesidad;
	private String _necesidadCurrentLanguageId;
	private BaseModel<?> _servicioRemoteModel;
	private Class<?> _clpSerializerClass = cat.diba.oficinasvivienda.service.ClpSerializer.class;
}