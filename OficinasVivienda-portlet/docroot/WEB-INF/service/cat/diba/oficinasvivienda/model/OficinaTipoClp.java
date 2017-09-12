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
import cat.diba.oficinasvivienda.service.OficinaTipoLocalServiceUtil;

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
public class OficinaTipoClp extends BaseModelImpl<OficinaTipo>
	implements OficinaTipo {
	public OficinaTipoClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_oficinaTipoRemoteModel != null) {
			try {
				Class<?> clazz = _oficinaTipoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_oficinaTipoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdOficina() {
		return _idOficina;
	}

	@Override
	public void setIdOficina(long idOficina) {
		_idOficina = idOficina;

		if (_oficinaTipoRemoteModel != null) {
			try {
				Class<?> clazz = _oficinaTipoRemoteModel.getClass();

				Method method = clazz.getMethod("setIdOficina", long.class);

				method.invoke(_oficinaTipoRemoteModel, idOficina);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdTipo() {
		return _idTipo;
	}

	@Override
	public void setIdTipo(long idTipo) {
		_idTipo = idTipo;

		if (_oficinaTipoRemoteModel != null) {
			try {
				Class<?> clazz = _oficinaTipoRemoteModel.getClass();

				Method method = clazz.getMethod("setIdTipo", long.class);

				method.invoke(_oficinaTipoRemoteModel, idTipo);
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

		if (_oficinaTipoRemoteModel != null) {
			try {
				Class<?> clazz = _oficinaTipoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_oficinaTipoRemoteModel, companyId);
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

		if (_oficinaTipoRemoteModel != null) {
			try {
				Class<?> clazz = _oficinaTipoRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_oficinaTipoRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOficinaTipoRemoteModel() {
		return _oficinaTipoRemoteModel;
	}

	public void setOficinaTipoRemoteModel(BaseModel<?> oficinaTipoRemoteModel) {
		_oficinaTipoRemoteModel = oficinaTipoRemoteModel;
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

		Class<?> remoteModelClass = _oficinaTipoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oficinaTipoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OficinaTipoLocalServiceUtil.addOficinaTipo(this);
		}
		else {
			OficinaTipoLocalServiceUtil.updateOficinaTipo(this);
		}
	}

	@Override
	public OficinaTipo toEscapedModel() {
		return (OficinaTipo)ProxyUtil.newProxyInstance(OficinaTipo.class.getClassLoader(),
			new Class[] { OficinaTipo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OficinaTipoClp clone = new OficinaTipoClp();

		clone.setId(getId());
		clone.setIdOficina(getIdOficina());
		clone.setIdTipo(getIdTipo());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());

		return clone;
	}

	@Override
	public int compareTo(OficinaTipo oficinaTipo) {
		long primaryKey = oficinaTipo.getPrimaryKey();

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

		if (!(obj instanceof OficinaTipoClp)) {
			return false;
		}

		OficinaTipoClp oficinaTipo = (OficinaTipoClp)obj;

		long primaryKey = oficinaTipo.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", idOficina=");
		sb.append(getIdOficina());
		sb.append(", idTipo=");
		sb.append(getIdTipo());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("cat.diba.oficinasvivienda.model.OficinaTipo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idOficina</column-name><column-value><![CDATA[");
		sb.append(getIdOficina());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idTipo</column-name><column-value><![CDATA[");
		sb.append(getIdTipo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _idOficina;
	private long _idTipo;
	private long _companyId;
	private long _groupId;
	private BaseModel<?> _oficinaTipoRemoteModel;
	private Class<?> _clpSerializerClass = cat.diba.oficinasvivienda.service.ClpSerializer.class;
}