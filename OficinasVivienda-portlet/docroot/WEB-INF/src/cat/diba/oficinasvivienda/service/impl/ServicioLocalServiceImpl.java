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

import cat.diba.oficinasvivienda.model.OficinaServicioMunicipio;
import cat.diba.oficinasvivienda.model.Servicio;
import cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.base.ServicioLocalServiceBaseImpl;

import com.liferay.portal.kernel.dao.orm.Conjunction;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the servicio local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link cat.diba.oficinasvivienda.service.ServicioLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gonzalezscr
 * @see cat.diba.oficinasvivienda.service.base.ServicioLocalServiceBaseImpl
 * @see cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil
 */
public class ServicioLocalServiceImpl extends ServicioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil} to access the servicio local service.
	 */
	private static Log LOG = LogFactoryUtil
			.getLog(ServicioLocalServiceImpl.class);
	
	public Servicio nuevoServicio(Servicio servicio) {

		try {
			long serveiId = counterLocalService
					.increment(Servicio.class.getName());
			servicio.setIdServicio(serveiId);
			return super.addServicio(servicio);

		} catch (Exception e) {
			return null;
		} 

	}
	
	public List<Servicio> obtenerServicios(long companyId, long groupId, int start, int end) {
		try {
			return getServicioPersistence().findBycompanyGroup(companyId, groupId, start, end);
			
		} catch (Exception e) {
			return new ArrayList<Servicio>();
		}
		
	}
	
	public int obtenerServiciosTotal(long companyId, long groupId) {
		try {
			return getServicioPersistence().countBycompanyGroup(companyId, groupId);
			
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	public List<Servicio> obtenerNecesidades(long companyId, long groupId, int start, int end) {
		try {
			
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(Servicio.class, getClassLoader());

			Conjunction funcionAnd = RestrictionsFactoryUtil.conjunction();
			Property propertyCompany = PropertyFactoryUtil.forName("companyId");
			funcionAnd.add(propertyCompany.eq(companyId));
			Property propertyGroup = PropertyFactoryUtil.forName("groupId");
			funcionAnd.add(propertyGroup.eq(groupId));
			Property property = PropertyFactoryUtil.forName("necesidad");
			funcionAnd.add(property.isNotNull());
			
			dq.add(funcionAnd);
			
			List<Servicio> resultados =  ServicioLocalServiceUtil.
					dynamicQuery(dq,start, end);
			return resultados;
			
			
		} catch (Exception e) {
			return new ArrayList<Servicio>();
		}
		
	}
}