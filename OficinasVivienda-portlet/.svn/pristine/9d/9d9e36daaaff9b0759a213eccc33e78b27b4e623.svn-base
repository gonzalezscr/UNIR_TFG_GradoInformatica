
<liferay-ui:icon-menu>
		<portlet:renderURL var="editURL" >
			<portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/editarServicio.jsp" />
			<portlet:param name="idServicio" value="<%= String.valueOf(servicio.getIdServicio()) %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>"	/>
		
		<portlet:actionURL var="deleteURL" name="eliminarServicio">
			<portlet:param name="idServicio" value="<%= String.valueOf(servicio.getIdServicio()) %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL %>" confirmation="servicio-eliminar"/>
</liferay-ui:icon-menu>