<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profesor</title>
    </head>
    <body>
        <h1>Profesor</h1>
       
        <hr/>

        <table>
            <tr>
                <th>Código</th>
                <th>Programa</th>
                <th>Acciones</th>
            </tr>

            <c:forEach var="i" items="${profesores}">
                <tr>
                    <th>${i.pro_codigo}</th>
                 <th>${i.pro_codigo}</th>
                 <th>${i.pro_materno}</th>
                 <th>${i.pro_nom}</th>
                 <th>${i.pro_nombre}</th>
                 <th>${i.sexo}</th>
                 <th>${i.dep_codigo}</th>
                 <th>${i.ubigeo}</th>
                 <th>${i.direccion}</th>
                 <th>${i.telefono}</th>
                 <th>${i.email}</th>
                 <th>${i.activo}</th>
                 <th>${i.email_unalm}</th>
                 <th>${i.perso}</th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

