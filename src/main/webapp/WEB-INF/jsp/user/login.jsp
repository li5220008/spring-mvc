<%--
  Created by IntelliJ IDEA.
  User: free
  Date: 14-3-2
  Time: 下午4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <%--<link rel="shortcut icon" href="/html/bootstrap/docs-assets/ico/favicon.png">--%>

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/public/style/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/public/style/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="/html/bootstrap/docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <script src="/public/js/common.js"></script>
    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
        
        /*.img{
            width:300px;
            height: 40px;            
        }*/
    </style>
</head>

<body>

<div class="container">
    <%--SpringMvc会自动绑定数据--%>
    <form:form action="${pageContext.request.contextPath}/user/loginDo" method="post" commandName="loginForm" cssClass="form-signin" role="form">
        <form:errors path="*" cssClass="errorblock" element="div" />

        <h2 class="form-signin-heading">Please sign in</h2>
        <form:input path="username" type="text" cssClass="form-control" placeholder="用户名" />
        <form:errors path="username" cssClass="error"/>
        <form:input path="password" autocomplete="off" type="text" cssClass="form-control" placeholder="密码" />
        <form:errors path="password" cssClass="error"/>
        <img src="${pageContext.request.contextPath}/randomImg" alt="点击刷新" class="img-rounded img" style="cursor: pointer" onclick="changeImg(this)">
        <input class="form-control" type="text" id="checkcode" placeholder="认证码" name="checkcode" value="${form.checkcode}"/>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form:form>
</div> <!-- /container -->
<!-- Bootstrap core JavaScript
================================================== -->
<!--jquery插件-->
<script src="/public/js/jquery-1.8.0.js"></script>
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>

