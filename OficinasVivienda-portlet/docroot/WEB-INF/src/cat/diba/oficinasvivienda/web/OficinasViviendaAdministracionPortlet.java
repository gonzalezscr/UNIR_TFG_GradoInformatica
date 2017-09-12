package cat.diba.oficinasvivienda.web;

import cat.diba.oficinasvivienda.model.OficinaServicioMunicipio;
import cat.diba.oficinasvivienda.model.OficinaTipo;
import cat.diba.oficinasvivienda.model.Servicio;
import cat.diba.oficinasvivienda.model.Tipo;
import cat.diba.oficinasvivienda.model.impl.OficinaServicioMunicipioImpl;
import cat.diba.oficinasvivienda.model.impl.OficinaTipoImpl;
import cat.diba.oficinasvivienda.model.impl.ServicioImpl;
import cat.diba.oficinasvivienda.model.impl.TipoImpl;
import cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.OficinaTipoLocalServiceUtil;
import cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.TipoLocalServiceUtil;
import cat.diba.oficinasvivienda.util.OficinasViviendaUtil;
import cat.diba.oficinasvivienda.util.Parametros;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleDisplay;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.mail.MailEngine;
import com.liferay.util.mail.MailEngineException;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.ProcessAction;

/**
 * Portlet implementation class OficinasViviendaAdministracionPortlet
 */
public class OficinasViviendaAdministracionPortlet extends MVCPortlet {

	private static Log LOG = LogFactoryUtil
			.getLog(OficinasViviendaAdministracionPortlet.class);

	@ProcessAction(name = "guardarServicio")
	public void guardarServicio(ActionRequest req, ActionResponse resp)
			throws Exception {
		LOG.debug("guardarServicio-INICI");

		// Recuperar valores formulario
		long idServicio = ParamUtil.getLong(req, Parametros.FIELD_IDSERVICIO,
				-1);
		LOG.debug("idServei=" + idServicio);

		Map<Locale, String> nombre = LocalizationUtil.getLocalizationMap(req,
				Parametros.FIELD_NOMBRE);
		LOG.debug("nom=" + nombre);

		Map<Locale, String> necesidad = LocalizationUtil.getLocalizationMap(
				req, Parametros.FIELD_NECESIDAD);

		Servicio servicio = null;

		if (!OficinasViviendaUtil.isMapFieldEmpty(nombre)) {
			if (idServicio == -1) { // Nuevo servicio
				servicio = new ServicioImpl();
				servicio.setNombreMap(nombre);
				servicio.setCompanyId(PortalUtil.getCompanyId(req));
				servicio.setGroupId(PortalUtil.getScopeGroupId(req));
				servicio.setNecesidadMap(necesidad);

				ServicioLocalServiceUtil.nuevoServicio(servicio);

			} else { // Actualizar servicio
				servicio = ServicioLocalServiceUtil.getServicio(idServicio);
				servicio.setNombreMap(nombre);
				servicio.setNecesidadMap(necesidad);

				ServicioLocalServiceUtil.updateServicio(servicio);
			}
		} else {
			SessionErrors.add(req, "servei-error-nom-obligatori");
		}

		PortalUtil.copyRequestParameters(req, resp);
		resp.setRenderParameter("mvcPath",
				"/html/oficinasviviendaadministracion/listadoServicio.jsp");

		LOG.debug("guardarServicio-FI");

	}

	@ProcessAction(name = "eliminarServicio")
	public void eliminarServicio(ActionRequest req, ActionResponse resp)
			throws Exception {
		LOG.debug("eliminarServicio-Inici");

		long idServicio = ParamUtil.getLong(req, Parametros.FIELD_IDSERVICIO,
				-1);

		// Eliminar servicio
		if (idServicio != -1) {
			ServicioLocalServiceUtil.deleteServicio(idServicio);
		}

		// Eliminar info relacionada
		List<OficinaServicioMunicipio> lista = OficinaServicioMunicipioLocalServiceUtil
				.obtenerInfoPorServicio(PortalUtil.getCompanyId(req),
						PortalUtil.getScopeGroupId(req), idServicio);

		for (OficinaServicioMunicipio oficina : lista) {
			LOG.debug("OficinaServicioMunicipio Eliminada=" + oficina);
			OficinaServicioMunicipioLocalServiceUtil
					.deleteOficinaServicioMunicipio(oficina);
		}

		PortalUtil.copyRequestParameters(req, resp);
		resp.setRenderParameter("mvcPath",
				"/html/oficinasviviendaadministracion/listadoServicio.jsp");

		LOG.debug("eliminarServicio-FI");

	}

	@ProcessAction(name = "guardarTipo")
	public void guardarTipo(ActionRequest req, ActionResponse resp)
			throws Exception {
		LOG.debug("guardarTipo-INICI");

		// Recuperar valores formulario
		long idTipo = ParamUtil.getLong(req, Parametros.FIELD_IDTIPO, -1);
		LOG.debug("Tipo=" + idTipo);

		Map<Locale, String> nombre = LocalizationUtil.getLocalizationMap(req,
				Parametros.FIELD_NOMBRE);
		LOG.debug("nom=" + nombre);
		Tipo tipo = null;

		if (!OficinasViviendaUtil.isMapFieldEmpty(nombre)) {
			if (idTipo == -1) { // Nuevo tipo
				tipo = new TipoImpl();
				tipo.setNombreMap(nombre);
				tipo.setCompanyId(PortalUtil.getCompanyId(req));
				tipo.setGroupId(PortalUtil.getScopeGroupId(req));

				TipoLocalServiceUtil.nuevoTipo(tipo);

			} else { // Actualizar tipo
				tipo = TipoLocalServiceUtil.getTipo(idTipo);
				tipo.setNombreMap(nombre);

				TipoLocalServiceUtil.updateTipo(tipo);
			}
		} else {
			SessionErrors.add(req, "tipo-error-nom-obligatori");
		}

		PortalUtil.copyRequestParameters(req, resp);
		resp.setRenderParameter("mvcPath",
				"/html/oficinasviviendaadministracion/listadoTipo.jsp");

		LOG.debug("guardarTipo-FI");

	}

	@ProcessAction(name = "eliminarTipo")
	public void eliminarTipo(ActionRequest req, ActionResponse resp)
			throws Exception {
		LOG.debug("eliminarTipo-Inici");

		long idTipo = ParamUtil.getLong(req, Parametros.FIELD_IDTIPO, -1);

		// Eliminar tipo
		if (idTipo != -1) {
			TipoLocalServiceUtil.deleteTipo(idTipo);
		}

		// Eliminar info relacionada
		List<OficinaTipo> lista = OficinaTipoLocalServiceUtil
				.obtenerOficinaTipoPorTipo(PortalUtil.getCompanyId(req),
						PortalUtil.getScopeGroupId(req), idTipo);

		for (OficinaTipo oficina : lista) {
			LOG.debug("OficinaTipo Eliminada=" + oficina);
			OficinaTipoLocalServiceUtil.deleteOficinaTipo(oficina);
		}

		PortalUtil.copyRequestParameters(req, resp);
		resp.setRenderParameter("mvcPath",
				"/html/oficinasviviendaadministracion/listadoTipo.jsp");

		LOG.debug("eliminarTipo-FI");

	}

	@ProcessAction(name = "guardarOficina")
	public void guardarOficina(ActionRequest req, ActionResponse resp)
			throws Exception {
		LOG.debug("guardarOficina-INICI");

		// Asignar Tipo Oficina asociado
		long idOficina = ParamUtil.getLong(req, Parametros.FIELD_IDOFICINA, -1);
		long idTipo = ParamUtil.getLong(req, Parametros.FIELD_IDTIPO, -1);

		OficinaTipo ofiTipo = OficinaTipoLocalServiceUtil
				.obtenerOficinaTipoPorOficina(PortalUtil.getCompanyId(req),
						PortalUtil.getScopeGroupId(req), idOficina);

		if (ofiTipo == null) {
			ofiTipo = new OficinaTipoImpl();
			ofiTipo.setCompanyId(PortalUtil.getCompanyId(req));
			ofiTipo.setGroupId(PortalUtil.getScopeGroupId(req));
			ofiTipo.setIdOficina(idOficina);
			ofiTipo.setIdTipo(idTipo);

			OficinaTipoLocalServiceUtil.nuevaOficinaTipo(ofiTipo);
		} else {
			ofiTipo.setIdTipo(idTipo);
			OficinaTipoLocalServiceUtil.updateOficinaTipo(ofiTipo);
		}

		// Eliminar Servicios anteriores
		List<OficinaServicioMunicipio> listaServiciosAnteriores = OficinaServicioMunicipioLocalServiceUtil
				.obtenerServiciosPorOficina(PortalUtil.getCompanyId(req),
						PortalUtil.getScopeGroupId(req), idOficina,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		if (listaServiciosAnteriores.size() > 0) {

			LOG.debug("elementos anteriores:" + listaServiciosAnteriores.size());

			for (OficinaServicioMunicipio osm : listaServiciosAnteriores) {
				OficinaServicioMunicipioLocalServiceUtil
						.deleteOficinaServicioMunicipio(osm);
			}
		}

		// Asignar Servicios
		String serviciosIds = ParamUtil.getString(req,
				Parametros.FIELD_SERVICIOSID, StringPool.BLANK);
		LOG.debug("serviciosIds:" + serviciosIds);

		if (!serviciosIds.isEmpty()) {
			String[] listaServicios = serviciosIds.split(",");
			LOG.debug("listaServicios.length:" + listaServicios.length);

			for (int i = 0; i < listaServicios.length; i++) {
				long idServicio = Long.parseLong(listaServicios[i]);
				LOG.debug("idServicio:" + idServicio);
				OficinaServicioMunicipio osm = new OficinaServicioMunicipioImpl();
				osm.setCompanyId(PortalUtil.getCompanyId(req));
				osm.setGroupId(PortalUtil.getScopeGroupId(req));
				osm.setIdOficina(idOficina);
				osm.setIdServicio(idServicio);
				osm.setCodigoIne("0");
				OficinaServicioMunicipioLocalServiceUtil.nuevaOficinaSM(osm);
			}
		}

	}

	@ProcessAction(name = "guardarMunicipios")
	public void guardarMunicipios(ActionRequest req, ActionResponse resp)
			throws Exception {
		LOG.debug("guardarMunicipios-INICI");

		// Recuperar valores formulario
		long idOficina = ParamUtil.getLong(req, Parametros.FIELD_IDOFICINA, -1);
		long idServicio = ParamUtil.getLong(req, Parametros.FIELD_IDSERVICIO,
				-1);

		if (idServicio == -1) { // Copiar municipios a todos los servicios
			List<OficinaServicioMunicipio> servicios = OficinaServicioMunicipioLocalServiceUtil
					.obtenerServiciosPorOficina(PortalUtil.getCompanyId(req),
							PortalUtil.getScopeGroupId(req), idOficina,
							QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (OficinaServicioMunicipio servicio : servicios) {
				guardarMunicipiosServicio(idOficina, servicio.getIdServicio(),
						req);
			}
		} else { // Guardar municipios de un servicio concreto
			guardarMunicipiosServicio(idOficina, idServicio, req);
		}

		PortalUtil.copyRequestParameters(req, resp);
		resp.setRenderParameter("mvcPath",
				"/html/oficinasviviendaadministracion/cerrarPopUp.jsp");
		LOG.debug("guardarMunicipios-FI");

	}

	private void guardarMunicipiosServicio(long idOficina, long idServicio,
			ActionRequest req) throws Exception {
		LOG.debug("guardarMunicipios-INICI");

		// Eliminar Municipios anteriores
		List<OficinaServicioMunicipio> listaMunicipioAnteriores = OficinaServicioMunicipioLocalServiceUtil
				.obtenerMunicipiosPorOficinaServicio(
						PortalUtil.getCompanyId(req),
						PortalUtil.getScopeGroupId(req), idOficina, idServicio);
		if (listaMunicipioAnteriores.size() > 0) {

			LOG.debug("elementos anteriores:" + listaMunicipioAnteriores.size());

			for (OficinaServicioMunicipio osm : listaMunicipioAnteriores) {
				if (!osm.getCodigoIne().equals("0")) { // Servicio -> codigoIne
														// = 0
					OficinaServicioMunicipioLocalServiceUtil
							.deleteOficinaServicioMunicipio(osm);
				}
			}
		}

		// Asignar Municipios
		String municipiosIds = ParamUtil.getString(req,
				Parametros.FIELD_MUNICIPIOSID, StringPool.BLANK);
		LOG.debug("serviciosIds:" + municipiosIds);

		if (!municipiosIds.isEmpty()) {
			String[] listaMunicipios = municipiosIds.split(",");
			LOG.debug("listaMunicipios.length:" + listaMunicipios.length);

			for (int i = 0; i < listaMunicipios.length; i++) {
				OficinaServicioMunicipio osm = new OficinaServicioMunicipioImpl();
				osm.setCompanyId(PortalUtil.getCompanyId(req));
				osm.setGroupId(PortalUtil.getScopeGroupId(req));
				osm.setIdOficina(idOficina);
				osm.setIdServicio(idServicio);
				osm.setCodigoIne(listaMunicipios[i]);
				OficinaServicioMunicipioLocalServiceUtil.nuevaOficinaSM(osm);
			}
		}

	}

	@ProcessAction(name = "enviarMailing")
	public void enviarMailing(ActionRequest req, ActionResponse resp)
			throws Exception {
		LOG.debug("enviarMailing-INICI");

		// Recuperar mail configuración (emisor)
		PortletPreferences preferencias = req.getPreferences();
		String mail = preferencias.getValue(Parametros.FIELD_CONFIG_MAIL,
				StringPool.BLANK);
		long idOficina = ParamUtil.getLong(req, Parametros.FIELD_IDOFICINA, -1);
		
		if (!mail.isEmpty()) {
			ThemeDisplay themeDisplay = (ThemeDisplay) req
					.getAttribute(WebKeys.THEME_DISPLAY);
			if (idOficina == -1) {
				// Recorrer todas las oficinas
				List<JournalArticle> oficinas = OficinasViviendaUtil
						.obtenerOficinas(PortalUtil.getScopeGroupId(req),
								QueryUtil.ALL_POS, QueryUtil.ALL_POS);

				for (JournalArticle oficina : oficinas) {
					enviarMail(req, oficina, themeDisplay, mail);
				}
			} else { 
				 //Enviar a una oficina en concreto
				JournalArticle oficina = JournalArticleLocalServiceUtil.getArticle(idOficina);
				enviarMail(req, oficina, themeDisplay, mail);
			}
		} // fin if ( !mail.isEmpty()){

	}

	private void enviarMail(ActionRequest req, JournalArticle oficina,
			ThemeDisplay themeDisplay, String mail) throws Exception {
		LOG.debug("enviarMail-INICI");

		// Obtener mail de la oficina (destino)
		String mailOficina = OficinasViviendaUtil.getValorCampEstructura(
				oficina, Parametros.FIELD_EMAIL, themeDisplay.getLocale()
						.getDisplayLanguage());

		// Obtener si es oficina de mailing
		String bMailing = OficinasViviendaUtil.getValorCampEstructura(oficina,
				Parametros.FIELD_MAILING, themeDisplay.getLocale()
						.getDisplayLanguage());

		if (!mailOficina.isEmpty() && !bMailing.isEmpty()) {

			// Obtener contenido mail
			String contingut = StringPool.BLANK;
			JournalArticleDisplay articleDisplay = JournalArticleLocalServiceUtil
					.getArticleDisplay(
							PortalUtil.getScopeGroupId(req),
							String.valueOf(oficina.getArticleId()),
							OficinasViviendaUtil
									.obtenirTemplateKey(
											OficinasViviendaUtil.ddmTemplateNameMailing,
											PortalUtil.getScopeGroupId(req)),
							Constants.VIEW, themeDisplay.getLanguageId(),
							themeDisplay);

			if (articleDisplay != null) {
				contingut = articleDisplay.getContent();
			}

			// Enviar mail
			InternetAddress from = new InternetAddress(mail);
			InternetAddress to = new InternetAddress(mailOficina);
			MailMessage message = new MailMessage(from, to, String.format(
					LanguageUtil.get(themeDisplay.getLocale(), "mail-titulo"),
					oficina.getTitle(themeDisplay.getLanguageId())), contingut,
					true);
			message.setCC(new InternetAddress(mail));
			MailEngine.send(message);

		}// fin if (!mailOficina.isEmpty() && !bMailing.isEmpty()) {
	}
}
