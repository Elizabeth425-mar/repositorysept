<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- IMPORT TAGS(ETIQUETAS) STRUTS Y JAVASCRIPT -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head/>
<sx:head/>
<body>
<sx:tabbedpanel id="formAlta">
	<sx:div label="VALIDACION HTA">
		<s:form action="alta.action" method="post">
		<s:textfield key="nombre" label="NOMBRE"/>
		<s:textfield key="correo" label="CORREO"/>
		<s:textarea key="comentario" label="COMENTARIO" />
		<s:submit value="Aceptar" />
		</s:form>
	</sx:div>
</sx:tabbedpanel>
</body>
</html>