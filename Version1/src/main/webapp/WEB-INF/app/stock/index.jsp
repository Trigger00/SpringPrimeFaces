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
                <th>Acciones</th>
            </tr>

            <c:forEach var="i" items="${stocks}">
                <tr>
                    <th>${i.stockId}</th>
                    <th>${i.stockName}</th>
                    
                    <%--<th>${i.stockCode}</th>
                    <th>${i.stockName}</th>
                    <th>${i.stockDetail.remark}</th>
                    <th>${i.stockDetail.compName}</th> --%>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

