<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>stocks</title>
    </head>
    <body>
        <h1>stocks</h1>
       
        <hr/>

        <table>
            <tr>
                <th>Código</th>
                <th>Programa</th>
                <th>Programa</th>
                <th>Acciones</th>
                <th>Acciones</th>
            </tr>

            <c:forEach var="i" items="${consejeros}">
                <tr>
                    <th>${i.ciclo}</th>     
                    <th>${i.profesor.pro_codigo}</th>
                 <th>${i.profesor.pro_nom}</th>
                     <th>${i.alumnos.matricula}</th>
                <%--<th>${i.alumnos.alu_nombre}</th>--%>
      
                    <%--<th>${i.stockCode}</th>
                    <th>${i.stockName}</th>
                    <th>${i.stockDetail.remark}</th>
                    <th>${i.stockDetail.compName}</th> --%>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

