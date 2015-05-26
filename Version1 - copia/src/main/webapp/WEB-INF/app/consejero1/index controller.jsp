<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EXITO333</h1>
        <form method="post" action="<%=request.getContextPath()%>/consejero1/guardar">
           
             <label> matricula </label>
            <input type="text" name="matricula" value="${consejero1.matricula}" />
            <br/>
            <br/>
        <label> proCodigo </label>
            <input type="text" name="proCodigo" value="${programa.proCodigo}" />
            <br/>
            <br/>
            <label> pregunta </label>
            <input type="text" name="pregunta" value="${programa.pregunta}"/>
            <br/>
            <br/>
             <label> respuesta </label>
            <input type="text" name="respuesta" value="${programa.respuesta}"/>
            <br/>
            <br/>
                  <label> ciclo </label>
            <input type="text" name="ciclo" value="${programa.ciclo}"/>
            <br/>
            <br/>
             <label> fechaIng </label>
            <input type="text" name="fechaIng" value="${programa.fechaIng}"/>
            <br/>
            <br/>
             <label> horaIng </label>
            <input type="text" name="horaIng" value="${programa.horaIng}"/>
            <br/>
            <br/>
           
            <input type="submit" value="Guardar" class="btn"/>
           
           
        </form>

    </body>
</html>
