<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CATALOGO DE CIUDADES</title>
</head>
<body>
<center><h1>STRUTS 2.0: CATALOGO, AUTENTICACION DE USUARIO, VALIDACION DE DATOS</h1></center>
<br>
<form action="catalogo.action" method="post">
	<button type="submit" class="btn btn-primary">CATALOGO CIUDAD</button>
</form>
<br>
<br>
<form action="formautentica.jsp" method="post">
	<button type="submit" class="btn btn-dark">AUTENTICACION DE CUENTA</button>
</form>
<br>
<br>
<form action="formalta.jsp" method="post">
	<button type="submit" class="btn btn-info">GUARDA HTA</button>
</form>

</body>
</html>