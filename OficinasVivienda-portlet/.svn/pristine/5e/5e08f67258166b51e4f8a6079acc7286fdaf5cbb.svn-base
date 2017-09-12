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

import com.liferay.portal.kernel.dao.orm.Conjunction;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portlet.journal.model.JournalArticle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import cat.diba.oficinasvivienda.model.OficinaServicioMunicipio;
import cat.diba.oficinasvivienda.model.OficinaTipo;
import cat.diba.oficinasvivienda.model.Servicio;
import cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.OficinaTipoLocalService;
import cat.diba.oficinasvivienda.service.OficinaTipoLocalServiceUtil;
import cat.diba.oficinasvivienda.service.base.OficinaServicioMunicipioLocalServiceBaseImpl;
import cat.diba.oficinasvivienda.web.OficinasViviendaAdministracionPortlet;

/**
 * The implementation of the oficina servicio municipio local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author gonzalezscr
 * @see cat.diba.oficinasvivienda.service.base.OficinaServicioMunicipioLocalServiceBaseImpl
 * @see cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil
 */
public class OficinaServicioMunicipioLocalServiceImpl extends
		OficinaServicioMunicipioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * cat.diba.oficinasvivienda
	 * .service.OficinaServicioMunicipioLocalServiceUtil} to access the oficina
	 * servicio municipio local service.
	 */

	private static Log LOG = LogFactoryUtil
			.getLog(OficinaServicioMunicipioLocalServiceImpl.class);
	
	public List<OficinaServicioMunicipio> obtenerMunicipiosPorOficinaServicio(
			long companyId, long groupId, long idOficina, long idServicio) {
		try {
			return getOficinaServicioMunicipioPersistence()
					.findByOficinaServicio(companyId, groupId, idOficina, idServicio);

		} catch (Exception e) {
			return new ArrayList<OficinaServicioMunicipio>();
		}

	}

	public List<OficinaServicioMunicipio> obtenerMunicipiosPorOficina(
			long companyId, long groupId, long idOficina, int start, int end) {
		try {
			return getOficinaServicioMunicipioPersistence().findByOficina(
					companyId, groupId, idOficina, start, end);

		} catch (Exception e) {
			return new ArrayList<OficinaServicioMunicipio>();
		}

	}

	public int obtenerMunicipiosPorOficinaTotal(long companyId, long groupId, long idOficina) {
		try {
			return getOficinaServicioMunicipioPersistence().countByOficina(
					companyId, groupId, idOficina);

		} catch (Exception e) {
			return 0;
		}

	}

	public List<OficinaServicioMunicipio> obtenerServiciosPorOficina(
			long companyId, long groupId, long idOficina, int start, int end) {
		try {
			return getOficinaServicioMunicipioPersistence().findByOficinaIne(
					companyId, groupId, idOficina, "0", start, end);

		} catch (Exception e) {
			return new ArrayList<OficinaServicioMunicipio>();
		}

	}

	public int obtenerServiciosPorOficinaTotal(long companyId, long groupId, long idOficina) {
		try {
			return getOficinaServicioMunicipioPersistence().countByOficinaIne(
					companyId, groupId, idOficina, "0");

		} catch (Exception e) {
			return 0;
		}

	}

	public OficinaServicioMunicipio nuevaOficinaSM(OficinaServicioMunicipio osm) {

		try {
			long Id = counterLocalService.increment(Servicio.class.getName());
			osm.setId(Id);
			return super.addOficinaServicioMunicipio(osm);

		} catch (Exception e) {
			return null;
		}

	}

	public List<OficinaServicioMunicipio> obtenerInfoPorServicio(long companyId, long groupId, long idServicio) {
		try {
			return getOficinaServicioMunicipioPersistence().findByServicio(
					companyId, groupId, idServicio);

		} catch (Exception e) {
			return new ArrayList<OficinaServicioMunicipio>();
		}

	}

	public List<Long> obtenerOficinas(
			long companyId, long groupId,
			String[] municipiosId, long[] serviciosId, long[] tipoOficina,
			int start, int end) {
		try {

			//Obtener la consulta de seleccion
			DynamicQuery dq = obtenerQueryOficinas(companyId, groupId, municipiosId, 
					serviciosId, tipoOficina);
			
			List<Long> resultados =  OficinaServicioMunicipioLocalServiceUtil.
					dynamicQuery(dq,start, end);
			return resultados;

		} catch (Exception e) {
			return new ArrayList<Long>();
		}
		
	}
	
	public int obtenerOficinasTotal(long companyId, long groupId,
			String[] municipiosId, long[] serviciosId, long[] tipoOficina) {
		try {
			
			//Obtener la consulta de seleccion
			DynamicQuery dq = obtenerQueryOficinas(companyId, groupId, municipiosId, 
					serviciosId, tipoOficina);
			//dynamicQueryCount NO FUNCIONA con DISTINCT
			List<Long> resultados =  OficinaServicioMunicipioLocalServiceUtil.
					dynamicQuery(dq, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return resultados.size();
			
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	private DynamicQuery obtenerQueryOficinas(long companyId, long groupId,
			String[] municipiosId, long[] serviciosId, long[] tipoOficina) throws SystemException{
		
		//Definir la consulta de seleccion
		DynamicQuery dq = DynamicQueryFactoryUtil
				.forClass(OficinaServicioMunicipio.class, getClassLoader());
		dq.setProjection(ProjectionFactoryUtil
				.distinct(ProjectionFactoryUtil.property("idOficina")));
		//dq.setProjection(ProjectionFactoryUtil.property("idOficina"));
		Conjunction funcionAnd = RestrictionsFactoryUtil.conjunction();
		Property propertyCompany = PropertyFactoryUtil.forName("companyId");
		funcionAnd.add(propertyCompany.eq(companyId));
		Property propertyGroup = PropertyFactoryUtil.forName("groupId");
		funcionAnd.add(propertyGroup.eq(groupId));
			
		//Filtro municipios
		if (municipiosId != null && municipiosId.length > 0) {
			Property property = PropertyFactoryUtil.forName("codigoIne");
			funcionAnd.add(property.in(municipiosId));
		}
		
		//Filtro servicios
		if (serviciosId != null && serviciosId.length > 0) {
			Property propertyServicios = PropertyFactoryUtil.forName("idServicio");
			funcionAnd.add(propertyServicios.in(serviciosId));
		}
		
		if (tipoOficina != null && tipoOficina.length > 0) {
			//Filtro Tipo Oficina
			DynamicQuery dqTipo = DynamicQueryFactoryUtil.forClass(
					OficinaTipo.class, getClassLoader());
			dqTipo.setProjection(ProjectionFactoryUtil.property("idOficina"));
			Conjunction funcionAndTipo = RestrictionsFactoryUtil.conjunction();
			Property propertyCompanyTipo = PropertyFactoryUtil.forName("companyId");
			funcionAndTipo.add(propertyCompanyTipo.eq(companyId));
			Property propertyGroupTipo = PropertyFactoryUtil.forName("groupId");
			funcionAndTipo.add(propertyGroupTipo.eq(groupId));
			Property propertyTipos = PropertyFactoryUtil.forName("idTipo");
			funcionAndTipo.add(propertyTipos.in(tipoOficina));
			dqTipo.add(funcionAndTipo);
			//List<OficinaTipo> lista = OficinaTipoLocalServiceUtil.dynamicQuery(dqTipo);
			
			
			Property propertyOficinas = PropertyFactoryUtil.forName("idOficina");
			funcionAnd.add(propertyOficinas.in(dqTipo));
		
		}
		
		return dq.add(funcionAnd);
	}
}