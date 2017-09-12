<%@page import="com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil"%>
<%@ include file="/html/oficinasviviendabuscador/init.jsp"%>

<%
	//Parametro codigoINE portlet Municipios
	String municipalityIne = renderRequest.getParameter("municipalityIne");
	//out.println("municipalityIne="+ municipalityIne);
	
	String[] municipiosSel = null;
	String disabled = StringPool.BLANK;
	if (municipalityIne == null || municipalityIne.isEmpty()) {
		municipiosSel = ParamUtil.getParameterValues(request, Parametros.FIELD_MUNICIPIOSID);
		//out.println("municipiosSel="+ StringUtil.merge(municipiosSel));
	}else{  
		//codigoINE Portlet Municipios
		municipiosSel = new String[1];
		municipiosSel[0] = municipalityIne;
		disabled = "disabled='disabled'";
		//out.println("municipiosSel[0]="+ municipiosSel[0]);
	}

	//Municipios
	List<Municipio> listaMunicipios = MunicipioLocalServiceUtil
							.getMunicipios(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	//Convertir a lista, para poder aplicar método .contains()
	List<String> municipiosSeleccionados = new ArrayList<String>();
	if (municipiosSel != null && municipiosSel.length > 0) {
		municipiosSeleccionados = Arrays.asList(municipiosSel);
	}
	
	//Servicios
	List<Servicio> listaServicios = ServicioLocalServiceUtil.obtenerNecesidades(	
						PortalUtil.getCompanyId(request),
						OficinasViviendaUtil.groupIdHUA,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	long[] serviciosSel = ParamUtil.getLongValues(request, Parametros.FIELD_SERVICIOSID);
	//out.println("serviciosSel="+ StringUtil.merge(serviciosSel));
	
	//Convertir a lista, para poder aplicar método .contains()
 	List<Long> serviciosSeleccionados = new ArrayList<Long>();
 	if (serviciosSel != null && serviciosSel.length > 0) {
 		serviciosSeleccionados = ListUtil.toList(serviciosSel);
 	}
	
	//Tipo Oficina
	List<Tipo> listaTipos = TipoLocalServiceUtil.obtenerTipos(	
						PortalUtil.getCompanyId(request),
						OficinasViviendaUtil.groupIdHUA,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	long[] tiposSel = ParamUtil.getLongValues(request, Parametros.FIELD_TIPOSID);
	//out.println("serviciosSel="+ StringUtil.merge(serviciosSel));
	
	//Convertir a lista, para poder aplicar método .contains()
 	List<Long> tiposSeleccionados = new ArrayList<Long>();
 	if (tiposSel != null && tiposSel.length > 0) {
 		tiposSeleccionados = ListUtil.toList(tiposSel);
 	}
	
	
%>

<div class="row oficina-vivienda">
<%if (municipalityIne==null) {%>
<div class="col-xs-12">
<h2><liferay-ui:message key="buscador.title"></liferay-ui:message></h2>
<%}else{ %>
<div class="col-sm-8 col-xs-12">
<h3><liferay-ui:message key="buscador.title"></liferay-ui:message></h3>
<%} %>

<p><liferay-ui:message key="buscador.parrafo1"></liferay-ui:message></p>
<p><strong><liferay-ui:message key="buscador.parrafo2"></liferay-ui:message></strong></p>
<p><liferay-ui:message key="buscador.parrafo3"></liferay-ui:message></p>

<br>
<liferay-portlet:renderURL varImpl="buscarOficinasURL">
	<portlet:param name="<%=Parametros.FIELD_MUNICIPALITYINE%>"
			value="<%=municipalityIne%>" />
</liferay-portlet:renderURL>

<form action="<%=buscarOficinasURL.toString()%>" method="get"
	class="formsubs " name="formsubs">
	<liferay-portlet:renderURLParams varImpl="buscarOficinasURL" />
	<liferay-portlet:renderURL varImpl="paginationURL">
		<portlet:param name="<%=Parametros.FIELD_MUNICIPIOSID%>"
			value="<%=StringUtil.merge(municipiosSel)%>" />
		<portlet:param name="<%=Parametros.FIELD_SERVICIOSID%>"
			value="<%=StringUtil.merge(serviciosSel)%>" />
		<portlet:param name="<%=Parametros.FIELD_TIPOSID%>"
			value="<%=StringUtil.merge(tiposSel)%>" />
		<portlet:param name="<%=Parametros.FIELD_MUNICIPALITYINE%>"
			value="<%=municipalityIne%>" />
	</liferay-portlet:renderURL>
	<div class="form-icon-box">
		<div class="form-icon-box-control">
			<div class="form-group">
				<strong><label for="<%=Parametros.FIELD_MUNICIPIOSID%>">

						<%=LanguageUtil.get(pageContext, "osm-municipos")%></label></strong><br /> <select
					data-placeholder="<%=LanguageUtil.get(pageContext, "osm-municipos")%>"
					name="<%=Parametros.FIELD_MUNICIPIOSID%>"
					id="<%=Parametros.FIELD_MUNICIPIOSID%>" multiple
					class="col-xs-12 input-sm chosen-select" <%=disabled %>>
					<%
						for (Municipio mun : listaMunicipios) {
							String selected = "";
							if (municipiosSeleccionados.contains(mun.getCodigoIne())) {
								selected = "selected";
							}
					%>
					<option value="<%=mun.getCodigoIne()%>" <%=selected%>><%=mun.getNombre()%></option>
					<%
						}
					%>
				</select>
			</div>
			<div class="form-group">
				<strong><label for="<%=Parametros.FIELD_SERVICIOSID%>">

						<%=LanguageUtil.get(pageContext, "servicio-buscador")%></label></strong><br /> <select
					data-placeholder="<%=LanguageUtil.get(pageContext, "servicio-buscador")%>"
					name="<%=Parametros.FIELD_SERVICIOSID%>"
					id="<%=Parametros.FIELD_SERVICIOSID%>" multiple
					class="col-xs-12 input-sm chosen-select">
					<%
						for (Servicio servicio : listaServicios) {
							String selected = "";
							if (serviciosSeleccionados.contains(servicio.getIdServicio())) {
								selected = "selected";
							}
					%>
					<option value="<%=servicio.getIdServicio()%>" <%=selected%>><%=servicio.getNecesidad(locale)%></option>
					<%
						}
					%>
				</select>
			</div>
			<div class="form-group">
				<strong><label for="<%=Parametros.FIELD_TIPOSID%>">

						<%=LanguageUtil.get(pageContext, "tipo-oficina")%></label></strong><br /> <select
					data-placeholder="<%=LanguageUtil.get(pageContext, "tipo-oficina")%>"
					name="<%=Parametros.FIELD_TIPOSID%>"
					id="<%=Parametros.FIELD_TIPOSID%>" multiple
					class="col-xs-12 input-sm chosen-select">
					<%
						for (Tipo tipo : listaTipos) {
							String selected = "";
							if (tiposSeleccionados.contains(tipo.getIdTipo())) {
								selected = "selected";
							}
					%>
					<option value="<%=tipo.getIdTipo()%>" <%=selected%>><%=tipo.getNombre(locale)%></option>
					<%
						}
					%>
				</select>
			</div>
		</div>
	</div>

	<div class="form-group">
		<div class="center-button">
			<button type="submit" class="btn btn-default">
				<i class="icon-ui-search"></i><%=LanguageUtil.get(pageContext, "search")%>
			</button>
		</div>
	</div>
</form>

<liferay-ui:search-container iteratorURL="<%=paginationURL%>"
	deltaConfigurable="true" delta="<%=Parametros.DELTA_BUSCADOR%>"
	emptyResultsMessage="oficina-no-resultados">

	<liferay-ui:search-container-results
		results="<%=OficinaServicioMunicipioLocalServiceUtil.
						obtenerOficinas(PortalUtil.getCompanyId(request),
								OficinasViviendaUtil.groupIdHUA,
								municipiosSel, serviciosSel, tiposSel, 
								searchContainer.getStart(), searchContainer.getEnd())%>"
		total="<%=OficinaServicioMunicipioLocalServiceUtil.
				obtenerOficinasTotal(PortalUtil.getCompanyId(request),
						OficinasViviendaUtil.groupIdHUA,
						municipiosSel, serviciosSel, tiposSel)%>" />

	<liferay-ui:search-container-row
		className="java.lang.Long" modelVar="osm">
		<%
			String contingut = StringPool.BLANK;
			JournalArticleDisplay articleDisplay = JournalArticleLocalServiceUtil
							.getArticleDisplay(
									OficinasViviendaUtil.groupIdHUA,
									String.valueOf(osm),
									OficinasViviendaUtil.obtenirTemplateKey(
											OficinasViviendaUtil.ddmTemplateName,
											OficinasViviendaUtil.groupIdHUA),
									Constants.VIEW,
									themeDisplay.getLanguageId(), themeDisplay);

			if (articleDisplay != null) {
				contingut = articleDisplay.getContent();
			}
		%>
		<liferay-ui:search-container-column-text><%=contingut%>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>"
		paginate="<%=true%>" />
</liferay-ui:search-container>

</div>
<%if (municipalityIne!=null) {%>
    <div class="col-sm-4 col-xs-12">
    <%@include file="shield.jsp" %>
    </div>
<%} %> 
</div>
 
<script type="text/javascript">
	$(document).ready(function() {
		$('.chosen-select').chosen();
		$('thead.table-columns').hide();
	});
</script>