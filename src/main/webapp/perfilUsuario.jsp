<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Perfil</title>
    <script type="text/javascript">
        function togglePassword() {
            var passwordField = document.getElementById("password");
            var toggleButton = document.getElementById("toggleButton");
            var actualPassword = "<c:out value='${pasajero.getContraseña()}'/>";

            if (passwordField.innerHTML === actualPassword) {
                // Mostrar contraseña censurada
                var censoredPassword = "";
                for (var i = 0; i < actualPassword.length; i++) {
                    censoredPassword += "*";
                }
                passwordField.innerHTML = censoredPassword;
                toggleButton.value = "Mostrar Contraseña";
            } else {
                // Mostrar contraseña real
                passwordField.innerHTML = actualPassword;
                toggleButton.value = "Ocultar Contraseña";
            }
        }
    </script>
</head>
<body>
<h1 class="encabezado">Perfil</h1>
<h2 class="subtitulo">Informacion:</h2>
<form action="modificarUsuario" method="post">
    <div class="centrado">
        <br>
        <label class="campoTexto"> Nombre Completo : <c:out value="${pasajero.getNombre()}"></c:out> </label>
        <br>
        <label class="campoTexto">Correo:</label>
        <input type="email" name="correo" value="${pasajero.getCorreo()}">
        <br>
        <label class="campoTexto">Rut : <c:out value="${pasajero.getRut()}"></c:out></label>
        <br>
        <label class="campoTexto">Número Contacto : +<c:out value="${pasajero.getNumero()}"></c:out></label>
        <br>
        <label class="campoTexto">Contraseña :
            <span id="password">
                <c:forEach var="i" begin="0" end="${fn:length(pasajero.getContraseña()) - 1}">
                    *
                </c:forEach>
            </span>
        </label>
        <input type="button" id="toggleButton" value="Mostrar Contraseña" onclick="togglePassword()"/>
        <label class="campoTexto">Cambiar contraseña </label>
        <input id="password" name="contraseña">

        <br><br>
        <input type="submit" value="Guardar Cambios" class="boton"><br>
        <a class="boton" href="index.jsp">Volver</a>

    </div>
</form>
</body>
</html>