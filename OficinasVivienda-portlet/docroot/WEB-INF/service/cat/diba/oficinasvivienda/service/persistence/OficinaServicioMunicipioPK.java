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

package cat.diba.oficinasvivienda.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author gonzalezscr
 * @generated
 */
public class OficinaServicioMunicipioPK implements Comparable<OficinaServicioMunicipioPK>,
	Serializable {
	public long idOficina;
	public long idServicio;
	public String codigoIne;

	public OficinaServicioMunicipioPK() {
	}

	public OficinaServicioMunicipioPK(long idOficina, long idServicio,
		String codigoIne) {
		this.idOficina = idOficina;
		this.idServicio = idServicio;
		this.codigoIne = codigoIne;
	}

	public long getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(long idOficina) {
		this.idOficina = idOficina;
	}

	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public String getCodigoIne() {
		return codigoIne;
	}

	public void setCodigoIne(String codigoIne) {
		this.codigoIne = codigoIne;
	}

	@Override
	public int compareTo(OficinaServicioMunicipioPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (idOficina < pk.idOficina) {
			value = -1;
		}
		else if (idOficina > pk.idOficina) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (idServicio < pk.idServicio) {
			value = -1;
		}
		else if (idServicio > pk.idServicio) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = codigoIne.compareTo(pk.codigoIne);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OficinaServicioMunicipioPK)) {
			return false;
		}

		OficinaServicioMunicipioPK pk = (OficinaServicioMunicipioPK)obj;

		if ((idOficina == pk.idOficina) && (idServicio == pk.idServicio) &&
				(codigoIne.equals(pk.codigoIne))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(idOficina) + String.valueOf(idServicio) +
		String.valueOf(codigoIne)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("idOficina");
		sb.append(StringPool.EQUAL);
		sb.append(idOficina);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("idServicio");
		sb.append(StringPool.EQUAL);
		sb.append(idServicio);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("codigoIne");
		sb.append(StringPool.EQUAL);
		sb.append(codigoIne);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}