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
public class OficinaTipoPK implements Comparable<OficinaTipoPK>, Serializable {
	public long idOficina;
	public long idTipo;

	public OficinaTipoPK() {
	}

	public OficinaTipoPK(long idOficina, long idTipo) {
		this.idOficina = idOficina;
		this.idTipo = idTipo;
	}

	public long getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(long idOficina) {
		this.idOficina = idOficina;
	}

	public long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(long idTipo) {
		this.idTipo = idTipo;
	}

	@Override
	public int compareTo(OficinaTipoPK pk) {
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

		if (idTipo < pk.idTipo) {
			value = -1;
		}
		else if (idTipo > pk.idTipo) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof OficinaTipoPK)) {
			return false;
		}

		OficinaTipoPK pk = (OficinaTipoPK)obj;

		if ((idOficina == pk.idOficina) && (idTipo == pk.idTipo)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(idOficina) + String.valueOf(idTipo)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("idOficina");
		sb.append(StringPool.EQUAL);
		sb.append(idOficina);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("idTipo");
		sb.append(StringPool.EQUAL);
		sb.append(idTipo);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}