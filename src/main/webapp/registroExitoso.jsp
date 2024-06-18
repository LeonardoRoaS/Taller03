<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 17-06-2024
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro Exitoso</title>
</head>
<body>
<h1 class="encabezado"> Registro de pasajeros</h1>
<div class="centrado">
    <p class="subtitulo">Registro exitoso</p> <br>
    <label class="campoTexto"> Pasajero : <c:out value="${pasajero.getNombre()}"></c:out> </label>
    <br>
    <label class="campoTexto">Correo : <c:out value="${pasajero.getCorreo()}"></c:out></label>
    <br>
    <label class="campoTexto">Número Contacto : +<c:out value="${pasajero.getNumero()}"></c:out></label>
    <br>
    <label class="campoTexto">DocumentoID : <c:out value="${pasajero.getDocumentoID()}"></c:out></label>
    <br>
    <a class="boton" href="ingresoPasajero">Ingresar</a>
</div>

</body>
</html>
