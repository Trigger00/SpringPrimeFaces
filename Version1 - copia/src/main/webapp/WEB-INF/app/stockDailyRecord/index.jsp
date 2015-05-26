<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>stockDailyRecord</title>
    </head>
    <body>
        <h1>stockDailyRecord</h1>
       
        <hr/>

        <table>
            <tr>
                <th>Código</th>
                <th>Programa</th>
                <th>Acciones</th>
            </tr>

            <c:forEach var="i" items="${stockDailyRecords}">
                <tr>
                    <th>${i.recordId}</th>
                    <th>${i.stock.stockId}</th>
            
                   
                
                </tr>
            </c:forEach>
            
            
        </table>
    </body>
</html>

