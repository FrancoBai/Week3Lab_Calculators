<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2020, 9:42:34 AM
    Author     : 829942
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="./arithmetic">
        <div>
            First:
            <input name="first" type="text"/>
        </div>
        <div>
            Second
            <input name="second" type="text"/>
        </div>
        <div>
            <input name="submit" type="submit" value="+"/>
            <input name="submit" type="submit" value="-"/>
            <input name="submit" type="submit" value="*"/>
            <input name="submit" type="submit" value="%"/>
        </div>
        <div>
            Result: <p>${message}</p>
        </div>
        <div>
            <a href="">Age Calculator</a>
        </div>
        </form>
    </body>
</html>
