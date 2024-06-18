
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro Pasajero</title>
</head>
<body>
<h1 class="encabezado">Registro de pasajeros</h1>
<h2 class="subtitulo">DocumentoID Ya Registrado</h2>
<form action="registroPasajero" method="post">
    <div class="centrado">
        <label>Nombre Completo:</label>
        <input type="text" name="nombre" class="campoTexto">
        <br>
        <label>Contraseña:</label>
        <input type="text" name="contraseña" class="campoTexto">
        <br>
        <label>Numero de Documento:</label>
        <input type="text" name="documentoID" class="campoTexto">
        <br>
        <label>Número contacto:</label>
        <input type="text" name="numero" class="campoTexto">
        <br>
        <label>Correo:</label>
        <input type="text" name="correo" class="campoTexto">
        <br>
        <label>Fecha Nacimiento:</label>
        <input type="text" name="fechaNac" class="campoTexto">
        <br>
        <label>Nacionalidad:</label>
        <input type="text" name="nacionalidad" class="campoTexto">



        <br><br>
        <input type="submit" value="Enviar" class="boton">
    </div>
</form>
</body>
</html>