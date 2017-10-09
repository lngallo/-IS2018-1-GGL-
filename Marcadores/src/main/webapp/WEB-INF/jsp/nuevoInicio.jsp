<%-- 
    Document   : nuevoInicio
    Created on : Oct 2, 2017, 3:40:59 PM
    Author     : lgallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/nuevoIniciocss.css"/> ">
        <title>nuevoInicio</title>
    </head>
    <body>
        
        <div id="envoltura">
        <div id="contenedor">
 
            <div id="cabecera">
                <h2>Registro</h2>
            </div>
 
            <div id="cuerpo">
 
                <form id="form-login" action="/Marcadores/agregaUsuario" method="post" >
                    <p><label for="nickname">Nombre:</label></p>
                        <input name="nickname" type="text" id="nombre" class="nombre" placeholder="...escribe tu nombre" autofocus=""/ ></p>
                    <p><label for="correo">Correo:</label></p>
                        <input name="correo" type="text" id="correo" class="correo" placeholder="...escribe tu mail" /></p>
 
                    <p><label for="contrasena">Contraseña:</label></p>
                        <input name="pass" type="password" id="pass" class="pass" placeholder="...escribe tu contraseña"/ ></p>
 
                    <p><label for="confcontrasena">Confirmar Contraseña:</label></p>
                        <input name="confcontrasena" type="password" id="repass" class="repass" placeholder="Repite contraseña" /></p>
 
                    <p id="bot"><input name="submit" type="submit" id="boton" value="Aceptar" class="boton"/></p>
                </form>
            </div>
 
            <div id="pie">Leonardo Gallo</div>
        </div><!-- fin contenedor -->
 
    </div>
        
    </body>
</html>
