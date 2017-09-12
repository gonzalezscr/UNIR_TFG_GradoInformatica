<%@ include file="/html/oficinasviviendaadministracion/init.jsp"%>

<div class="taglib-header">
	<h3 class="header-title"><%=LanguageUtil.get(pageContext, "tipo-listado")%></h3>
</div>

<!--  ACCIONES -->
<liferay-portlet:renderURL  var="altaTipo" >
	<liferay-portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/editarTipo.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL var="cancelar" >
	<liferay-portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/view.jsp" />
</liferay-portlet:renderURL>

<div>
	<a class="btn btn-primary" href="<%=altaTipo%>"><%=LanguageUtil.get(pageContext, "tipo-nuevo")%></a>
	<a class="btn btn-cancel" href="<%=cancelar%>"><%=LanguageUtil.get(pageContext, "btn-Atras")%></a>
</div>

<liferay-portlet:renderURL varImpl="paginationURL" >
	<liferay-portlet:param name="mvcPath"
		value="/html/oficinasviviendaadministracion/listadoTipo.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL="<%=paginationURL%>"
	deltaConfigurable="true" delta="<%=Parametros.DELTA_GENERAL%>"
	emptyResultsMessage="tipo-no-resultados">

	<liferay-ui:search-container-results
		results="<%=TipoLocalServiceUtil.obtenerTipos(	
						PortalUtil.getCompanyId(request),
						PortalUtil.getScopeGroupId(request),
						searchContainer.getStart(), searchContainer.getEnd())%>"
		total="<%=TipoLocalServiceUtil.obtenerTiposTotal(
						PortalUtil.getCompanyId(request),
						PortalUtil.getScopeGroupId(request))%>" />
	<liferay-ui:search-container-row
		className="cat.diba.oficinasvivienda.model.Tipo"
		keyProperty="idTipo" modelVar="tipo">
		<liferay-ui:search-container-column-text name="identificador">
			<%=tipo.getIdTipo()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="name">
			<%=tipo.getNombre(locale)%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="">
			<%@include file="/html/oficinasviviendaadministracion/accionesTipo.jsp"%>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>"
		paginate="<%=true%>" />
</liferay-ui:search-container>


