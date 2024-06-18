<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Menu</title>
</head>
<body>
<h1 class="encabezado">Menu principal</h1>
<br/>
<form action="registroPasajero" method="get">
    <div class="centrado">
        <input type="submit" value="Registrar Pasajero" class="boton">
    </div>
</form>

<form action="ingresoPasajero" method="get">
    <div class="centrado">
        <input type="submit" value="Ingresar Pasajero" class="boton">
    </div>
</form>

<form action="mostrarPasajeros" method="get">
    <div class="centrado">
        <input type="submit" value="Mostrar Pasajeros" class="boton">
    </div>
</form>

</body>
</html>