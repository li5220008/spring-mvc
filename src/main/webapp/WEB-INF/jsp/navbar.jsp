<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-24
  Time: 上午10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Fixed navbar -->
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/blog/ui">About</a></li>
                <li><a href="${pageContext.request.contextPath}/user/list">Users</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li class="dropdown-header">Nav header</li>
                        <li><a href="#">Separated link</a></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">search</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <c:if test="${account !=null}">
                    <li><a href="javascript:void(0);"><span class="text-primary"> 欢迎您：${account.nickname}</span></a></li>
                    <li><a href="${pageContext.request.contextPath}/user/logout"><strong>注销</strong></a></li>
                </c:if>
                <c:if test="${account ==null}">
                    <li><a href="${pageContext.request.contextPath}/user/register">注册</a></li>
                    <li class="active"><a href="${pageContext.request.contextPath}/user/login">登陆</a></li>
                </c:if>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>
