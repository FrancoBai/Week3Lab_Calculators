<%-- 
    Document   : agecalculator
    Created on : Sep 25, 2020, 9:22:38 AM
    Author     : 829942
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="./age">
            <div>
                Enter your age:
                <input name="age" type="text"/>              
            </div>
            <div>
                <input name="submit" type="submit" value="Age next birthday"/>
            </div>
        </form>
        <div>
            <p>${message}</p>
        </div>
        <div>
            <a href="arithmeticcalculator.jsp">Arithmetic Calculator</a>
        </div>
    </body>
</html>
