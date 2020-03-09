<%-- 
    Document   : adicionar
    Created on : 05/03/2020, 14:05:56
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Adicionar</title>
    </head>
    <body>
         <h1>Cadastrar Contatos</h1>
        <form action="FrontController?action=GravarContato" method="post">
            Nome
            <input type="text" name="textNome"/><br/>
            Email
            <input type="text" name="textEmail"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
