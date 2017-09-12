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

import cat.diba.oficinasvivienda.model.OficinaTipo;
import cat.diba.oficinasvivienda.service.base.OficinaTipoLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the oficina tipo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link cat.diba.oficinasvivienda.service.OficinaTipoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gonzalezscr
 * @see cat.diba.oficinasvivienda.service.base.OficinaTipoLocalServiceBaseImpl
 * @see cat.diba.oficinasvivienda.service.OficinaTipoLocalServiceUtil
 */
public class OficinaTipoLocalServiceImpl extends OficinaTipoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link cat.diba.oficinasvivienda.service.OficinaTipoLocalServiceUtil} to access the oficina tipo local service.
	 */
	
	public long obtenerTipoPorOficina(long companyId, long groupId, long idOficina) {
		
		try {
			OficinaTipo tipo = getOficinaTipoPersistence().findByOficinaTipo(companyId, groupId, idOficina);
			return tipo.getIdTipo();
		} catch (Exception e) {
			return -1;
		}
		
	}
	
	public OficinaTipo obtenerOficinaTipoPorOficina(long companyId, long groupId, long idOficina) {
		try {
			OficinaTipo tipo = getOficinaTipoPersistence().findByOficinaTipo(companyId, groupId, idOficina);
			return tipo;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public List<OficinaTipo> obtenerOficinaTipoPorTipo(long companyId, long groupId, long idTipo) {
		try {
			return getOficinaTipoPersistence().findByTipo(companyId, groupId, idTipo);
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public OficinaTipo nuevaOficinaTipo(OficinaTipo ofiTipo) {

		try {
			long id = counterLocalService
					.increment(OficinaTipo.class.getName());
			ofiTipo.setId(id);
			return super.addOficinaTipo(ofiTipo);

		} catch (Exception e) {
			return null;
		} 

	}
	
	
}