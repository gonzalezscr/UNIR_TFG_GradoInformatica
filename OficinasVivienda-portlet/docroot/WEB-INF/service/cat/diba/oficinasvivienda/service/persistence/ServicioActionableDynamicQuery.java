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

import cat.diba.oficinasvivienda.model.Servicio;
import cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author gonzalezscr
 * @generated
 */
public abstract class ServicioActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ServicioActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ServicioLocalServiceUtil.getService());
		setClass(Servicio.class);

		setClassLoader(cat.diba.oficinasvivienda.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("idServicio");
	}
}