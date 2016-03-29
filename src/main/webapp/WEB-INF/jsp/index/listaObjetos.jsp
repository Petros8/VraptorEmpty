<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Objetos</title>
</head>
<body>

	<table style="width:100%;" border="1">
		<thead>
		<tr>
		<td align="center">Nome</td>
		<td align="center">Tipo</td>
		<td align="center">Id do Dono</td>
		<td align="center">Nome do Dono</td>
		<td align="center">Email do Dono</td>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${objetos}" var="item">
		<tr>
			<td ><label style="margin-left:15px;">${item.nome}</label></td>
			<td><label style="margin-left:15px;">${item.tipo}</label></td>
			<td><label style="margin-left:15px;">${item.donoDoObjeto.id}</label></td>
			<td><label style="margin-left:15px;">${item.donoDoObjeto.nome}</label></td>
			<td><label style="margin-left:15px;">${item.donoDoObjeto.email}</label></td>
		</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>