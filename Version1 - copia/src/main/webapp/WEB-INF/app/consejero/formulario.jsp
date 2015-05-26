<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Programa</h1>

        <form method="post" action="<%=request.getContextPath()%>/consejero/guardar">
            

		

            <label> alumnos </label>
            <input type="text" name="alumnos.matricula" value="${consejero.alumnos.matricula}" />
            <br/>
            <br/>
            <label> coConsejeria </label>
            <input type="text" name="coConsejeria" value="${consejero.coConsejeria}" />
            <br/>
            <br/>
            <label> ciclo </label>
            <input type="text" name="ciclo" value="${consejero.ciclo}"/>
            <br/>
            <br/>
             <label> profesor </label>
            <input type="text" name="profesor.pro_codigo" value="${consejero.profesor.pro_codigo}" />
            <br/>
            <br/>
           
            
            <input type="submit" value="Guardar" class="btn"/>
        </form>
    </body>
</html>
