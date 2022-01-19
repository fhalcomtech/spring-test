<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Client List</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="client" items="${clients}">
                <tr>
                    <td>${client.name}</td>
                    <td>${client.lastname}</td>
                    <td>${client.email}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/client/update/${client.id}">
                            <img src="${pageContext.request.contextPath}/huguito/img/pencil.png" alt="edit"/>
                        </a>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/client/delete/${client.id}">
                            <img src="${pageContext.request.contextPath}/huguito/img/delete.png" alt="delete"/>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>