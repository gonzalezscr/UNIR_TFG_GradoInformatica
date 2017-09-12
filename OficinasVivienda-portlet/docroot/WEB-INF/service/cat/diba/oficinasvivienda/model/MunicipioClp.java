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
import cat.diba.oficinasvivienda.service.MunicipioLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gonzalezscr
 */
public class MunicipioClp extends BaseModelImpl<Municipio> implements Municipio {
	public MunicipioClp() {
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
	public String getPrimaryKey() {
		return _codigoIne;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setCodigoIne(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _codigoIne;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

	@Override
	public String getCodigoIne() {
		return _codigoIne;
	}

	@Override
	public void setCodigoIne(String codigoIne) {
		_codigoIne = codigoIne;

		if (_municipioRemoteModel != null) {
			try {
				Class<?> clazz = _municipioRemoteModel.getClass();

				Method method = clazz.getMethod("setCodigoIne", String.class);

				method.invoke(_municipioRemoteModel, codigoIne);
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
	public void setNombre(String nombre) {
		_nombre = nombre;

		if (_municipioRemoteModel != null) {
			try {
				Class<?> clazz = _municipioRemoteModel.getClass();

				Method method = clazz.getMethod("setNombre", String.class);

				method.invoke(_municipioRemoteModel, nombre);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMunicipioRemoteModel() {
		return _municipioRemoteModel;
	}

	public void setMunicipioRemoteModel(BaseModel<?> municipioRemoteModel) {
		_municipioRemoteModel = municipioRemoteModel;
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

		Class<?> remoteModelClass = _municipioRemoteModel.getClass();

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

		Object returnValue = method.invoke(_municipioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MunicipioLocalServiceUtil.addMunicipio(this);
		}
		else {
			MunicipioLocalServiceUtil.updateMunicipio(this);
		}
	}

	@Override
	public Municipio toEscapedModel() {
		return (Municipio)ProxyUtil.newProxyInstance(Municipio.class.getClassLoader(),
			new Class[] { Municipio.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MunicipioClp clone = new MunicipioClp();

		clone.setCodigoIne(getCodigoIne());
		clone.setNombre(getNombre());

		return clone;
	}

	@Override
	public int compareTo(Municipio municipio) {
		String primaryKey = municipio.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MunicipioClp)) {
			return false;
		}

		MunicipioClp municipio = (MunicipioClp)obj;

		String primaryKey = municipio.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{codigoIne=");
		sb.append(getCodigoIne());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("cat.diba.oficinasvivienda.model.Municipio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>codigoIne</column-name><column-value><![CDATA[");
		sb.append(getCodigoIne());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _codigoIne;
	private String _nombre;
	private BaseModel<?> _municipioRemoteModel;
	private Class<?> _clpSerializerClass = cat.diba.oficinasvivienda.service.ClpSerializer.class;
}