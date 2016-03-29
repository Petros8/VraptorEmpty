<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista</title>
</head>
<body>
	
	<h2>Objetos Referentes ao usuario de id: ${id_usuario}</h2>
	<br /><br /><br />
	<table style="width:60%;" border="1">
		<thead>
		<tr>
		<td align="center">Nome</td>
		<td align="center">Tipo</td>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${objetos}" var="item">
		<tr>
			<td ><label style="margin-left:15px;">${item.nome}</label></td>
			<td><label style="margin-left:15px;">${item.tipo}</label></td>
		</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>