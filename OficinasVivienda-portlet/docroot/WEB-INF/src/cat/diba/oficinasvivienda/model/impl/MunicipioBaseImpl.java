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
import cat.diba.oficinasvivienda.service.MunicipioLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Municipio service. Represents a row in the &quot;OfiVi_Municipio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MunicipioImpl}.
 * </p>
 *
 * @author gonzalezscr
 * @see MunicipioImpl
 * @see cat.diba.oficinasvivienda.model.Municipio
 * @generated
 */
public abstract class MunicipioBaseImpl extends MunicipioModelImpl
	implements Municipio {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a municipio model instance should use the {@link Municipio} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MunicipioLocalServiceUtil.addMunicipio(this);
		}
		else {
			MunicipioLocalServiceUtil.updateMunicipio(this);
		}
	}
}