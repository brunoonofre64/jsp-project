<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Usuários</title>
    <meta charset="UTF-8">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="${pageContext.request.contextPath}/css/listausuarios.css" rel="stylesheet">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

<div class="list-group">
    <p class="text-center">Lista de Usuários</p>
    <jsp:useBean id="users" scope="request" type="java.util.List"/>
    <c:forEach var="user" items="${users}">
        <a href="#" class="list-group-item">${user.email}</a>
    </c:forEach>
</div>

<%--<div class="list-group">--%>
<%--    <p style="color: black; text-align: center; margin: 0;">Lista de Usuários</p>--%>
<%--    <jsp:useBean id="users" scope="request" type="java.util.List"/>--%>
<%--    <c:forEach var="user" items="${users}">--%>
<%--        <a href="#" class="list-group-item">${user.email}</a>--%>
<%--    </c:forEach>--%>
<%--</div>--%>

</body>
</html>
