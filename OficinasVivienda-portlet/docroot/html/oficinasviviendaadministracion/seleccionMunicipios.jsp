<%@ include file="/html/oficinasviviendaadministracion/init.jsp"%>
<%
	
	//Recuperar parmetros del formulario
	long idOficina = ParamUtil.getLong(request, Parametros.FIELD_IDOFICINA);
	String nombreOficina = ParamUtil.getString(request, Parametros.FIELD_NOMBRE);
	long idServicio = ParamUtil.getLong(request, Parametros.FIELD_IDSERVICIO, -1);
	String nombreServicio = ParamUtil.getString(request, Parametros.FIELD_NOMBRESERVICIO, StringPool.BLANK);
	
	if ( nombreServicio.isEmpty()){
		nombreServicio = LanguageUtil.get(pageContext, "osm-todos");
	}
%>

<liferay-portlet:renderURL var="cancelar">
	<liferay-portlet:param name="jspPage"
		value="/html/oficinasviviendaadministracion/editarServicioMunicipio.jsp" />
	<liferay-portlet:param name="<%=Parametros.FIELD_IDOFICINA %>"
		value="<%= String.valueOf(idOficina) %>" />
	<liferay-portlet:param name="<%=Parametros.FIELD_NOMBRE%>"
		value="<%=HtmlUtil.escapeJS(nombreOficina) %>" />
</liferay-portlet:renderURL>

<portlet:actionURL name='guardarMunicipios' var="guardarMunicipiosURL" />

<h4 class="header-title"><%=nombreOficina%> - <%=nombreServicio%></h4>

<div class="popup">
<aui:form name="fm" action="<%=guardarMunicipiosURL.toString()%>"
	method="post">
	<aui:input name="<%=Parametros.FIELD_IDOFICINA%>" type="hidden"
		value="<%=idOficina%>" />
	<aui:input name="<%=Parametros.FIELD_IDSERVICIO%>" type="hidden"
		value="<%=idServicio%>" />
	<aui:input name="<%=Parametros.FIELD_NOMBRE%>" type="hidden"
		value="<%=HtmlUtil.escape(nombreOficina)%>" />
<%
	List<Municipio> listaMunicipios = MunicipioLocalServiceUtil
					.getMunicipios(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	List<OficinaServicioMunicipio> listaServiciosSeleccionados = OficinaServicioMunicipioLocalServiceUtil
					.obtenerMunicipiosPorOficinaServicio(PortalUtil.getCompanyId(request),
							PortalUtil.getScopeGroupId(request), idOficina, idServicio );

	//Generación de listas
	List<KeyValuePair> municipiosLeftList = new ArrayList<KeyValuePair>();
	List<KeyValuePair> municipiosRightList = new ArrayList<KeyValuePair>();
	//Lista IdServicios seleccionados
	List<String> listaIdMun = new ArrayList<String>();

	for (OficinaServicioMunicipio osm : listaServiciosSeleccionados) {
		if( !osm.getCodigoIne().equals("0") ){  //Servicio -> codigoIne = 0
			Municipio mun = MunicipioLocalServiceUtil.getMunicipio(osm
							.getCodigoIne());
			municipiosLeftList.add(new KeyValuePair(String.valueOf(osm
							.getCodigoIne()), HtmlUtil.escape(mun.getNombre())));
			listaIdMun.add(osm.getCodigoIne());
		}
	}

	for (Municipio mun : listaMunicipios) {
		if (!listaIdMun.contains(mun.getCodigoIne())) {
			municipiosRightList.add(new KeyValuePair(String
							.valueOf(mun.getCodigoIne()), HtmlUtil
							.escape(mun.getNombre())));
		}
	}
	municipiosRightList = ListUtil.sort(municipiosRightList,
					new KeyValuePairComparator(false, true));
	%>
	<aui:input name="<%=Parametros.FIELD_MUNICIPIOSID %>" type="hidden" />

	<liferay-ui:input-move-boxes 
		leftTitle='<%=LanguageUtil.get(pageContext, "osm-seleccionados")%>'
		rightTitle='<%=LanguageUtil.get(pageContext, "osm-disponibles")%>'
		leftBoxName="<%=Parametros.FIELD_CURRENTMUNICIPIOSID %>"
		rightBoxName="<%=Parametros.FIELD_AVAILABLEMUNICIPIOSID %>"
		leftList="<%=municipiosLeftList%>" rightList="<%=municipiosRightList%>" />

	<aui:button name="submit" type="submit" value="save" 
		onClick='<%=renderResponse.getNamespace() + "customSubmit();" %>' />
	<aui:button href="<%=cancelar.toString()%>" type="cancel"  />
	
</aui:form>
</div>
<aui:script>
		Liferay.provide(
				window,
				'<portlet:namespace />customSubmit',
				function() {
				
 					if (document.<portlet:namespace />fm.<portlet:namespace /><%=Parametros.FIELD_MUNICIPIOSID %>) {
 						document.<portlet:namespace />fm.<portlet:namespace /><%=Parametros.FIELD_MUNICIPIOSID %>.value = Liferay.Util.listSelect(document.<portlet:namespace />fm.<portlet:namespace /><%=Parametros.FIELD_CURRENTMUNICIPIOSID %>);
 					}
					submitForm(document.<portlet:namespace />fm);
				},
				['liferay-util-list-fields']
			);
	
		
	</aui:script>