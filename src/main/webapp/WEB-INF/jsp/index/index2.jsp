<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrando Usuario</title>
</head>
<body>
	
	<select style="width:15%;" onchange="showInfo(this)" >
		<option disabled selected>Escolha Um</option>
		<c:forEach var="item" items="${usuarios}" >
		<option value='{"nome":"${item.nome}","email":"${item.email}"}'>${item.id}</option>	
		</c:forEach>
	</select>
	<br /><br />
	<h3>Informações:</h3>
	<br /><br />
	Nome: <input  style="width:15%;" id="nome" value="" type="text" >
	<br /><br />
	Email: <input  style="width:15%;" id="email" value="" type="text" >
</body>
<script>
	function showInfo(source){
		var selecionado = source.options[source.selectedIndex].value;
		var objetoJavaScript = JSON.parse(selecionado);
		document.getElementById("nome").value = objetoJavaScript.nome;
		document.getElementById("email").value = objetoJavaScript.email;
	}
</script>
</html>

