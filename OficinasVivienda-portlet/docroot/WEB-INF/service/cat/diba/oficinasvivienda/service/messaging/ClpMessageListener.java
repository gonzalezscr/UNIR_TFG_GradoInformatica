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

package cat.diba.oficinasvivienda.service.messaging;

import cat.diba.oficinasvivienda.service.ClpSerializer;
import cat.diba.oficinasvivienda.service.MunicipioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.OficinaTipoLocalServiceUtil;
import cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.TipoLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author gonzalezscr
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			MunicipioLocalServiceUtil.clearService();

			OficinaServicioMunicipioLocalServiceUtil.clearService();

			OficinaTipoLocalServiceUtil.clearService();

			ServicioLocalServiceUtil.clearService();

			TipoLocalServiceUtil.clearService();
		}
	}
}