<%--
  Created by IntelliJ IDEA.
  User: free
  Date: 5/1/14
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<%@include file="/WEB-INF/jsp/navbar.jsp"%>
<div class="container">
    <table class="table table-hover <%--table-bordered--%> table-responsive">
        <thead>
        <tr>
            <th>#</th>
            <th>Username</th>
            <th>Nickname</th>
            <th>UserAge</th>
            <th>UserAddress</th>
            <th>birthday</th>
            <th>email</th>
            <th>operation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" varStatus="item" var="user">
            <tr>
                <td>${item.count}</td>
                <td>${user.username}</td>
                <td>${user.nickname}</td>
                <td>${user.userAge}</td>
                <td>${user.userAddress}</td>
                <td>${user.birthday}</td>
                <td>${user.email}</td>
                <td><a href="/user/info?id=${user.id}"> info </a>
                    <a href="/user/register"> add </a>
                    <a href="/user/update?id=${user.id}"> update </a>
                    <a href="/user/delete?id=${user.id}" onclick="return delConfirm('sure to delete?')"> delete </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
<jsp:include page="/main" flush="true"></jsp:include>
