<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página Principal</title>
</head>
<body>
	<!--  Teste se a variavel 'mensagem' foi incluida nessa instancia da página -->
	<c:if test="${mensagem != null}">
		<h1>${mensagem}</h1>
	</c:if>
	
	<form method="post" action="cadastrar">
	Nome:<input type="text" name="usuario.nome" >
	<br /><br />
	Email:<input type="text" name="usuario.email">
	<br /><br />
	Nome do Objeto:<input type="text" name="objeto.nome">
	<br /><br />
	Tipo do Objeto: <input type="text" name="objeto.tipo">
	<br /><br />
	
	<input type="submit">
	</form>
</body>
</html>