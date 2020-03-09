<%-- 
    Document   : deletar
    Created on : 05/03/2020, 14:06:14
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Deletar</title>
    </head>
    <body>
          <h1>Deletar</h1>
         <form action="FrontController?action=ApagarContato" method="post">
            Use email
            <input type="text" name="textEmail"/><br/>
            <input type="submit"/>
        </form>      
    </body>
</html>
