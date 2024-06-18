<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 18-06-2024
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Creacion de Vuelos</title>
</head>
<h1 class="encabezado">Registro de pasajeros</h1>
<form action="registroPasajero" method="post">
    <div class="centrado">
        <label>Aerolinea:</label>
        <input type="text" name="aerolinea" class="campoTexto">
        <br>
        <label>Ciudad Origen:</label>
        <input type="text" name="origen" class="campoTexto">
        <br>
        <label>Ciudad Destino:</label>
        <input type="text" name="destino" class="campoTexto">
        <br>
        <label>Fecha salida:</label>
        <input type="text" name="fechaSalida" class="campoTexto">
        <br>
        <label>Fecha llegada:</label>
        <input type="text" name="fechaLlegada" class="campoTexto">
        <br>
        <label>Horario salida:</label>
        <input type="text" name="horarioSalida" class="campoTexto">
        <br>
        <label>Horario llegada:</label>
        <input type="text" name="horarioLlegada" class="campoTexto">
        <br>
        <label>Duracion del vuelo:</label>
        <input type="text" name="duracionVuelo" class="campoTexto">
        <br>
        <label>Tipo de Aeronave:</label>
        <input type="text" name="tipoAeronave" class="campoTexto">
        <br>
        <label>Numero de asientos:</label>
        <input type="text" name="nAsientos" class="campoTexto">
        <br>
        <label>Numero del vuelo:</label>
        <input type="text" name="nVuelo" class="campoTexto">
        <br>



        <br><br>
        <input type="submit" value="Enviar" class="boton">
    </div>
</form>
</body>
</html>
