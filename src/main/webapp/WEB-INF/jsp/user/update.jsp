<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-28
  Time: 下午5:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 101 Template</title>
    <link href="/public/style/validate/style.css" rel="stylesheet"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <form id="update-form" class="form-register form-horizontal"  role="form" action="${pageContext.request.contextPath}/user/updateDo" method="post">
        <input type="hidden" name="id" value="${form.id}"/>
        <div class="form-group">
            <label for="username" class="col-sm-3 control-label">用户名：</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" id="username" placeholder="用户名" name="username" value="${form.username}"/>
            </div>
            <div class="col-sm-4">
                <label  class="control-label error">${form.errors.username}</label>
            </div>
        </div>
        <div class="form-group">
            <label for="nickname" class="col-sm-3 control-label">昵称：</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" id="nickname" placeholder="昵称" name="nickname" value="${form.nickname}"/>
            </div>
            <div class="col-sm-4">
                <label class="control-label error">${form.errors.nickname}</label>
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-3 control-label">密码：</label>
            <div class="col-sm-5">
                <input class="form-control" type="password" id="password" placeholder="密码" name="password" value="${form.password}"/>
            </div>
            <div class="col-sm-4">
                <label class="error">${form.errors.password}</label>
            </div>
        </div>
        <div class="form-group">
            <label for="repassword" class="col-sm-3 control-label">重复密码：</label>
            <div class="col-sm-5">
                <input class="form-control" type="password" id="repassword" placeholder="重复密码" name="repassword" value="${form.repassword}"/>
            </div>
            <div class="col-sm-4">
                <label class="control-label error">${form.errors.repassword}</label>
            </div>
        </div>
        <div class="form-group">
            <label for="birthday" class="col-sm-3 control-label">生日：</label>
            <div class="col-sm-5">
                <input class="form-control" type="text" id="birthday" placeholder="生日" name="birthday" value="${form.birthday}" />
            </div>
            <div class="col-sm-4">
                <label class="control-label error">${form.errors.birthday}</label>
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-3 control-label">邮箱：</label>
            <div class="col-sm-5">
                <input class="form-control" check-type="mail" mail-message="邮箱格式不正确！" type="text" id="email" placeholder="邮箱" name="email" value="${form.email}" />
            </div>
            <div class="col-sm-4">
                <label class="control-label error">${form.errors.email}</label>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-3 col-sm-2">
                <button type="submit" class="btn btn-primary btn-default btn-block">update</button>
            </div>
        </div>
    </form>
</div>
<%--<div class="container">
    <div class="row">
        <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3
            col-xs-6 .col-sm-3
            通过调整浏览器的宽度或在手机上即可查看这些案例的实际效果。
        </div>
        <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>

        <!-- Add the extra clearfix for only the required viewport -->
        <div class="clearfix visible-xs"></div>

        <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
        <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
    </div>
</div>--%>
</body>
</html>
<%@include file="/WEB-INF/jsp/main.jsp"%>
<script src="/public/js/validate/jquery.validate.min.js"></script>
<script src="/public/js/validate/custom.validate.js"></script>