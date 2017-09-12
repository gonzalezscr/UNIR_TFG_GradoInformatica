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
public class MunicipioSoap implements Serializable {
	public static MunicipioSoap toSoapModel(Municipio model) {
		MunicipioSoap soapModel = new MunicipioSoap();

		soapModel.setCodigoIne(model.getCodigoIne());
		soapModel.setNombre(model.getNombre());

		return soapModel;
	}

	public static MunicipioSoap[] toSoapModels(Municipio[] models) {
		MunicipioSoap[] soapModels = new MunicipioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MunicipioSoap[][] toSoapModels(Municipio[][] models) {
		MunicipioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MunicipioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MunicipioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MunicipioSoap[] toSoapModels(List<Municipio> models) {
		List<MunicipioSoap> soapModels = new ArrayList<MunicipioSoap>(models.size());

		for (Municipio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MunicipioSoap[soapModels.size()]);
	}

	public MunicipioSoap() {
	}

	public String getPrimaryKey() {
		return _codigoIne;
	}

	public void setPrimaryKey(String pk) {
		setCodigoIne(pk);
	}

	public String getCodigoIne() {
		return _codigoIne;
	}

	public void setCodigoIne(String codigoIne) {
		_codigoIne = codigoIne;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	private String _codigoIne;
	private String _nombre;
}