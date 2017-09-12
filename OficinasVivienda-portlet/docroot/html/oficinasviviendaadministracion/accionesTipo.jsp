
<liferay-ui:icon-menu>
		<portlet:renderURL var="editURL" >
			<portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/editarTipo.jsp" />
			<portlet:param name="<%=Parametros.FIELD_IDTIPO %>" value="<%= String.valueOf(tipo.getIdTipo()) %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>"	/>
		
		<portlet:actionURL var="deleteURL" name="eliminarTipo">
			<portlet:param name="<%=Parametros.FIELD_IDTIPO %>" value="<%= String.valueOf(tipo.getIdTipo()) %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL %>" confirmation="tipo-eliminar"/>
</liferay-ui:icon-menu>