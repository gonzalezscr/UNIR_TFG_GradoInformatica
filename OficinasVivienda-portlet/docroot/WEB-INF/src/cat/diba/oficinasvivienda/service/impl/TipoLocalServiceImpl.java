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

package cat.diba.oficinasvivienda.service.impl;

import java.util.List;

import cat.diba.oficinasvivienda.model.Servicio;
import cat.diba.oficinasvivienda.model.Tipo;
import cat.diba.oficinasvivienda.service.base.TipoLocalServiceBaseImpl;

/**
 * The implementation of the tipo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link cat.diba.oficinasvivienda.service.TipoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gonzalezscr
 * @see cat.diba.oficinasvivienda.service.base.TipoLocalServiceBaseImpl
 * @see cat.diba.oficinasvivienda.service.TipoLocalServiceUtil
 */
public class TipoLocalServiceImpl extends TipoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link cat.diba.oficinasvivienda.service.TipoLocalServiceUtil} to access the tipo local service.
	 */
	
	public Tipo nuevoTipo(Tipo tipo) {

		try {
			long tipoId = counterLocalService
					.increment(Servicio.class.getName());
			tipo.setIdTipo(tipoId);
			return super.addTipo(tipo);

		} catch (Exception e) {
			return null;
		} 

	}
	
	public List<Tipo> obtenerTipos(long companyId, long groupId, int start, int end) {
		try {
			return getTipoPersistence().findBycompanyGroup(companyId, groupId, start, end);
			
		} catch (Exception e) {
			return null;
		}
	}
	
	public int obtenerTiposTotal(long companyId, long groupId) {
		try {
			return getTipoPersistence().countBycompanyGroup(companyId, groupId);
			
		} catch (Exception e) {
			return 0;
		}
		
	}
		
}