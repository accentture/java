<%-- 
    Document   : List
    Created on : 25 dic. 2021, 16:49:22
    Author     : LENOVO
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--http://java.sun.com/jsp/jstl/core : core of JSP that will allow to iterate the people that we will receive of JSP-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>People list</title>
    </head>
    <body>
        <h1>People list</h1>
        <table>
            <caption>People list</caption>
            <tr>
                <th>Id person<th>
                <th>Name<th>    
                <th>Surname<th>    
                <th>Email<th>    
                <th>Phone<th>    
            </tr>
               
            <!--iterating elements-->
            <!-- $} : expression language-->
            <c:forEach var="person" items="${people}">
                <tr>
                    <td>${person.idPerson}</td>
                    <td>${person.name}</td>
                    <td>${person.surnames}</td>
                </tr>
                
            </c:forEach>
            
        </table>
        
    </body>
</html>
