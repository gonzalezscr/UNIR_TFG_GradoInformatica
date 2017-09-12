
<liferay-ui:icon-menu>
		<portlet:renderURL var="editURL">
			<portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/editarOficina.jsp" />
			<portlet:param name="<%=Parametros.FIELD_IDOFICINA %>" value="<%= String.valueOf(oficina.getArticleId()) %>" />
			<portlet:param name="<%=Parametros.FIELD_NOMBRE %>" value="<%= String.valueOf(oficina.getTitle(locale)) %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" message='<%=LanguageUtil.get(pageContext, "oficina-asignarTipoServicio")%>' url="<%= editURL %>"	/>
		
		<portlet:renderURL var="editMunURL">
			<portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/editarServicioMunicipio.jsp" />
			<portlet:param name="<%=Parametros.FIELD_IDOFICINA %>" value="<%= String.valueOf(oficina.getArticleId()) %>" />
			<portlet:param name="<%=Parametros.FIELD_NOMBRE %>" value="<%= String.valueOf(oficina.getTitle(locale)) %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" message='<%=LanguageUtil.get(pageContext, "oficina-asignarMunicipioServicio")%>' url="<%= editMunURL %>"	/>
		
		<portlet:actionURL name='enviarMailing' var="enviarMailingOficinaURL"  >
			<portlet:param name="<%=Parametros.FIELD_IDOFICINA %>" value="<%= String.valueOf(oficina.getId()) %>" />
		</portlet:actionURL>
		<liferay-ui:icon image="news" message='<%=LanguageUtil.get(pageContext, "oficina-enviarMailing")%>' url="<%= enviarMailingOficinaURL %>"	/>
</liferay-ui:icon-menu>