

<%@page import="cat.diba.portal.municipalitiesdirectory.bussiness.model.Municipality"%>
<%@page import="cat.diba.oficinasvivienda.util.FormatterUtil"%>

<%@page import="cat.diba.portal.municipalitiesdirectory.bussiness.service.MunicipalityLocalServiceUtil"%>
<%@page import="cat.diba.oficinasvivienda.util.UrlUtil"%>

<%--
   -- Pinta, en la columna derecha, la información relacionada con el municipio (escudo+info)
   -- cuando se llama desde el portlet de Municipio
--%>
<%
	
	final Municipality mun = MunicipalityLocalServiceUtil.getBasicInfo(municipalityIne);
	

	String shieldImgUrl = null;	
	String shieldName = "";
	
	if( mun != null ) {
		final String munIne = mun.getMun_ine();
		
		shieldImgUrl = UrlUtil.getShieldUrl(renderRequest, munIne);
		
		String[] splitShieldImgUrl = shieldImgUrl.split("/");
		shieldName = splitShieldImgUrl[splitShieldImgUrl.length - 1];
		String shieldNameLower = shieldName.toLowerCase();
		
		shieldImgUrl = shieldImgUrl.replace(shieldName,shieldNameLower);
	}

	pageContext.setAttribute( "mun", mun );
	pageContext.setAttribute( "shieldImgUrl", shieldImgUrl);
%>

<c:if test="${not empty mun}">
    <c:set var="ens_inf" value="${mun.ens_inf}" />
    
	<div class="media">
	<div class="text-center">
			<c:if test="${not empty shieldImgUrl}">
		       		<img src="<%=shieldImgUrl %>" style="width: auto;margin: 0 auto;" 
		       		alt="<%=LanguageUtil.get(pageContext, "shield-escudo")%>" class="img-responsive"/>
		    </c:if>
	    	</br>
	        <h2><c:out value="${mun.mun_nom2_part} ${mun.mun_nom2}" /></h2>
	    	
			<c:set var="phone" value="${ens_inf.egi_telefon}" />
			<%
			   final String phone = (String)pageContext.getAttribute( "phone" );
			
			   pageContext.setAttribute( "formattedPhone", FormatterUtil.formatPhone(phone) );
			%>
			 <p><abbr lang="es" xml:lang="es" title="<%=LanguageUtil.get(pageContext, "shield-telefono")%>">T. </abbr><c:out value="${formattedPhone}" /></p>
			 
			<c:if test="${not empty ens_inf.egi_email_propi}">
			  <p><a href="mailto:<c:out value='${ens_inf.egi_email_propi}' />" ><%=LanguageUtil.get(pageContext, "shield-mail")%></a></p>
			</c:if>    
			
			  
			<c:if test="${empty ens_inf.egi_email_propi}">		
			<c:if test="${not empty ens_inf.egi_email}">
			  <p><a href="mailto:<c:out value='${ens_inf.egi_email}' />" ><%=LanguageUtil.get(pageContext, "shield-mail")%></a></p>		
			</c:if>
			</c:if>
			
			<c:if test="${not empty ens_inf.egi_web}">
			  <p><a href="http://<c:out value='${ens_inf.egi_web}' />" title="<%=LanguageUtil.get(pageContext, "shield-enlace")%>"><%=LanguageUtil.get(pageContext, "shield-web")%></a></p>
			</c:if>
		</div>
	</div>
</c:if>

