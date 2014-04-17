<%--
  Created by IntelliJ IDEA.
  User: free
  Date: 14-3-2
  Time: 下午4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link href="/html/bootstrap/dist/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/public/style/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="/html/bootstrap/docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">
    <%--<form class="form-signin" role="form">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" placeholder="Email address" required autofocus>
        <input type="password" class="form-control" placeholder="Password" required>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>--%>
    <form action="${pageContext.request.contextPath}/user/login/do" method="post" class="form-signin" role="form">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" name="username" value="${user.username}" class="form-control" placeholder="用户名" required autofocus />
        <input type="text" name="password" value="${user.password}" class="form-control" placeholder="密码" required/>
        <%--<input type="submit" value="登陆"><input type="button" onclick="location.href='${pageContext.request.contextPath}/user/register/ui'" value="注册"/>--%>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
</div> <!-- /container -->
<!-- Bootstrap core JavaScript
================================================== -->
<!--jquery插件-->
<script src="/public/js/jquery-1.8.0.js"></script>
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>

