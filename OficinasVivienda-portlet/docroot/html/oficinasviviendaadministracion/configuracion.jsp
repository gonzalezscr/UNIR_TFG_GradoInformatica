<%@ include file="/html/oficinasviviendaadministracion/init.jsp"%>

<%      
PortletPreferences preferences = renderRequest.getPreferences();
String portletResource = ParamUtil.getString(request, "portletResource");
if (Validator.isNotNull(portletResource)) {
    preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}

String mailActualizacion = preferences.getValue(Parametros.FIELD_CONFIG_MAIL, 
		StringPool.BLANK);

%>
<liferay-portlet:actionURL portletConfiguration="true" var="savePreferenceURL" />
<form name="<portlet:namespace/>fm" action="<%=savePreferenceURL%>" method="post">    
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	<aui:input inlineLabel="left" label='<%=LanguageUtil.get(pageContext, "mail-origen")%>' 
	name="preferences--mailActualizacion--" type="text" 
	value="<%= mailActualizacion %>" size="60" />
	<br>
	<aui:button name="saveButton" type="submit" value="save" />
 
</form>

