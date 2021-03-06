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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author gonzalezscr
 * @generated
 */
public class OficinaTipoSoap implements Serializable {
	public static OficinaTipoSoap toSoapModel(OficinaTipo model) {
		OficinaTipoSoap soapModel = new OficinaTipoSoap();

		soapModel.setId(model.getId());
		soapModel.setIdOficina(model.getIdOficina());
		soapModel.setIdTipo(model.getIdTipo());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static OficinaTipoSoap[] toSoapModels(OficinaTipo[] models) {
		OficinaTipoSoap[] soapModels = new OficinaTipoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OficinaTipoSoap[][] toSoapModels(OficinaTipo[][] models) {
		OficinaTipoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OficinaTipoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OficinaTipoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OficinaTipoSoap[] toSoapModels(List<OficinaTipo> models) {
		List<OficinaTipoSoap> soapModels = new ArrayList<OficinaTipoSoap>(models.size());

		for (OficinaTipo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OficinaTipoSoap[soapModels.size()]);
	}

	public OficinaTipoSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getIdOficina() {
		return _idOficina;
	}

	public void setIdOficina(long idOficina) {
		_idOficina = idOficina;
	}

	public long getIdTipo() {
		return _idTipo;
	}

	public void setIdTipo(long idTipo) {
		_idTipo = idTipo;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	private long _id;
	private long _idOficina;
	private long _idTipo;
	private long _companyId;
	private long _groupId;
}