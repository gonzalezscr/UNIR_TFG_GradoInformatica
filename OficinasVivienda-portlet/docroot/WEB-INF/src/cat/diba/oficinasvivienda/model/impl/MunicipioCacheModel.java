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

package cat.diba.oficinasvivienda.model.impl;

import cat.diba.oficinasvivienda.model.Municipio;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Municipio in entity cache.
 *
 * @author gonzalezscr
 * @see Municipio
 * @generated
 */
public class MunicipioCacheModel implements CacheModel<Municipio>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{codigoIne=");
		sb.append(codigoIne);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Municipio toEntityModel() {
		MunicipioImpl municipioImpl = new MunicipioImpl();

		if (codigoIne == null) {
			municipioImpl.setCodigoIne(StringPool.BLANK);
		}
		else {
			municipioImpl.setCodigoIne(codigoIne);
		}

		if (nombre == null) {
			municipioImpl.setNombre(StringPool.BLANK);
		}
		else {
			municipioImpl.setNombre(nombre);
		}

		municipioImpl.resetOriginalValues();

		return municipioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		codigoIne = objectInput.readUTF();
		nombre = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (codigoIne == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(codigoIne);
		}

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}
	}

	public String codigoIne;
	public String nombre;
}