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
import cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the OficinaServicioMunicipio service. Represents a row in the &quot;OfiVi_OficinaServicioMunicipio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OficinaServicioMunicipioImpl}.
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaServicioMunicipioImpl
 * @see cat.diba.oficinasvivienda.model.OficinaServicioMunicipio
 * @generated
 */
public abstract class OficinaServicioMunicipioBaseImpl
	extends OficinaServicioMunicipioModelImpl
	implements OficinaServicioMunicipio {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a oficina servicio municipio model instance should use the {@link OficinaServicioMunicipio} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OficinaServicioMunicipioLocalServiceUtil.addOficinaServicioMunicipio(this);
		}
		else {
			OficinaServicioMunicipioLocalServiceUtil.updateOficinaServicioMunicipio(this);
		}
	}
}