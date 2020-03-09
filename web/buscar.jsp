<%-- 
    Document   : buscar
    Created on : 05/03/2020, 14:06:07
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Buscar</title>
    </head>
    <body>
       <h1>Buscar</h1>
        <form action="FrontController?action=LerContato" method="post">
            Entre com seu email
            <input type="text" name="textEmail"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
