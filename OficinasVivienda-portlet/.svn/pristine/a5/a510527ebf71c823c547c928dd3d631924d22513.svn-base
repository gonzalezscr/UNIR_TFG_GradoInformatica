<%@ include file="/html/oficinasviviendaadministracion/init.jsp"%>

<h2></h2>
<div class="taglib-header">
	<h3 class="header-title"><%=LanguageUtil.get(pageContext, "servicio-listado")%></h3>
</div>

<!--  ACCIONES -->
<liferay-portlet:renderURL  var="altaServicio" >
	<liferay-portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/editarServicio.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL var="cancelar" >
	<liferay-portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/view.jsp" />
</liferay-portlet:renderURL>

<div>
	<a class="btn btn-primary" href="<%=altaServicio%>"><%=LanguageUtil.get(pageContext, "servicio-nuevo")%></a>
	<a class="btn btn-cancel" href="<%=cancelar%>"><%=LanguageUtil.get(pageContext, "btn-Atras")%></a>
</div>

<liferay-portlet:renderURL varImpl="paginationURL" >
	<liferay-portlet:param name="mvcPath"
		value="/html/oficinasviviendaadministracion/listadoServicio.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL="<%=paginationURL%>"
	deltaConfigurable="true" delta="<%=Parametros.DELTA_GENERAL%>"
	emptyResultsMessage="servicio-no-resultados">

	<liferay-ui:search-container-results
		results="<%=ServicioLocalServiceUtil.obtenerServicios(	
						PortalUtil.getCompanyId(request),
						PortalUtil.getScopeGroupId(request),
						searchContainer.getStart(), searchContainer.getEnd())%>"
		total="<%=ServicioLocalServiceUtil.obtenerServiciosTotal(
						PortalUtil.getCompanyId(request),
						PortalUtil.getScopeGroupId(request))%>" />
	<liferay-ui:search-container-row
		className="cat.diba.oficinasvivienda.model.Servicio"
		keyProperty="idServicio" modelVar="servicio">
		<liferay-ui:search-container-column-text name="identificador">
			<%=servicio.getIdServicio()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="name">
			<%=servicio.getNombre(locale)%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "servicio-necesidad") %>'>
			<%=servicio.getNecesidad(locale)%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="">
			<%@include file="/html/oficinasviviendaadministracion/accionesServicio.jsp"%>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>"
		paginate="<%=true%>" />
</liferay-ui:search-container>


