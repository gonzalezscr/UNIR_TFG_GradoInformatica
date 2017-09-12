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
public class OficinaServicioMunicipioSoap implements Serializable {
	public static OficinaServicioMunicipioSoap toSoapModel(
		OficinaServicioMunicipio model) {
		OficinaServicioMunicipioSoap soapModel = new OficinaServicioMunicipioSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setIdOficina(model.getIdOficina());
		soapModel.setIdServicio(model.getIdServicio());
		soapModel.setCodigoIne(model.getCodigoIne());

		return soapModel;
	}

	public static OficinaServicioMunicipioSoap[] toSoapModels(
		OficinaServicioMunicipio[] models) {
		OficinaServicioMunicipioSoap[] soapModels = new OficinaServicioMunicipioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OficinaServicioMunicipioSoap[][] toSoapModels(
		OficinaServicioMunicipio[][] models) {
		OficinaServicioMunicipioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OficinaServicioMunicipioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OficinaServicioMunicipioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OficinaServicioMunicipioSoap[] toSoapModels(
		List<OficinaServicioMunicipio> models) {
		List<OficinaServicioMunicipioSoap> soapModels = new ArrayList<OficinaServicioMunicipioSoap>(models.size());

		for (OficinaServicioMunicipio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OficinaServicioMunicipioSoap[soapModels.size()]);
	}

	public OficinaServicioMunicipioSoap() {
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

	public long getIdOficina() {
		return _idOficina;
	}

	public void setIdOficina(long idOficina) {
		_idOficina = idOficina;
	}

	public long getIdServicio() {
		return _idServicio;
	}

	public void setIdServicio(long idServicio) {
		_idServicio = idServicio;
	}

	public String getCodigoIne() {
		return _codigoIne;
	}

	public void setCodigoIne(String codigoIne) {
		_codigoIne = codigoIne;
	}

	private long _id;
	private long _companyId;
	private long _groupId;
	private long _idOficina;
	private long _idServicio;
	private String _codigoIne;
}