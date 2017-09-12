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

import cat.diba.oficinasvivienda.model.OficinaServicioMunicipio;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OficinaServicioMunicipio in entity cache.
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipio
 * @generated
 */
public class OficinaServicioMunicipioCacheModel implements CacheModel<OficinaServicioMunicipio>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", idOficina=");
		sb.append(idOficina);
		sb.append(", idServicio=");
		sb.append(idServicio);
		sb.append(", codigoIne=");
		sb.append(codigoIne);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OficinaServicioMunicipio toEntityModel() {
		OficinaServicioMunicipioImpl oficinaServicioMunicipioImpl = new OficinaServicioMunicipioImpl();

		oficinaServicioMunicipioImpl.setId(id);
		oficinaServicioMunicipioImpl.setCompanyId(companyId);
		oficinaServicioMunicipioImpl.setGroupId(groupId);
		oficinaServicioMunicipioImpl.setIdOficina(idOficina);
		oficinaServicioMunicipioImpl.setIdServicio(idServicio);

		if (codigoIne == null) {
			oficinaServicioMunicipioImpl.setCodigoIne(StringPool.BLANK);
		}
		else {
			oficinaServicioMunicipioImpl.setCodigoIne(codigoIne);
		}

		oficinaServicioMunicipioImpl.resetOriginalValues();

		return oficinaServicioMunicipioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		idOficina = objectInput.readLong();
		idServicio = objectInput.readLong();
		codigoIne = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(idOficina);
		objectOutput.writeLong(idServicio);

		if (codigoIne == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(codigoIne);
		}
	}

	public long id;
	public long companyId;
	public long groupId;
	public long idOficina;
	public long idServicio;
	public String codigoIne;
}