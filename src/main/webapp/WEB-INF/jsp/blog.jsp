<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-27
  Time: 下午2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="/public/style/bootstrap.min.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/style/common.css">

    <!-- Custom styles for this template -->
    <link href="/public/style/navbar-fixed-top.css" rel="stylesheet">

    <!-- documentation styles -->
    <!--<link rel="stylesheet" type="text/css" href="/public/style/docs.css">-->
    <link rel="stylesheet" type="text/css" href="/public/style/docs.css">
    <link rel="stylesheet" type="text/css" href="/html/metro/docs/font-awesome.css">
    <!--<link rel="stylesheet" type="text/css" href="../metro/css/metro-bootstrap.css">-->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
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
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
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
                <c:if test="${user !=null}">
                    <li><a href="javascript:void(0);"><span class="text-primary"> 欢迎您：${user.nickname}</span></a></li>
                    <li><a href="${pageContext.request.contextPath}/user/logout/do"><strong>注销</strong></a></li>
                </c:if>
                <c:if test="${user ==null}">
                    <li><a href="${pageContext.request.contextPath}/user/register/ui">注册</a></li>
                    <li class="active"><a href="${pageContext.request.contextPath}/user/login/ui">登陆</a></li>
                </c:if>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>

<!-- Docs page layout -->
<!--<div class="bs-header" id="content">
    <div class="container">
        <h1>组件</h1>
        <p>无数可复用的组件，包括图标，下拉菜单，导航，警告框，弹出框等更多功能。</p>
    </div>
</div>-->


<!-- Callout for the old docs link -->
<div class="container bs-docs-container">
    <div class="row">
        <div class="col-md-3">
            <div class="bs-sidebar hidden-print affix-top" role="complementary">
                <ul class="nav bs-sidenav">
                    <li>
                        <a href="#tiles">Tiles</a>
                    </li>
                    <li>
                        <a href="#panels">Panels</a>
                    </li>
                    <li><a href="#wells">Wells</a></li>
                </ul>
            </div>
        </div>
        <div class="col-md-9" role="main">
              <!-- Tiles
              ================================================== -->
            <div class="bs-docs-section">
                <div class="page-header">
                    <h1 id="tiles">Tiles</h1>
                </div>

                <!-- Panels
                ================================================== -->
                <div class="bs-docs-section">
                    <div class="page-header">
                        <h1 id="panels">Panels</h1>
                    </div>
                </div>
                <!-- Wells
                ================================================== -->
                <div class="bs-docs-section">
                    <div class="page-header">
                        <h1 id="wells">Wells</h1>
                    </div>
                </div>
            </div>

            <!-- comments
                ================================================== -->
            <div class="well">
            Basic panel example
            ssl
            <p>ss</p>
            <h3>hh</h3>
            <button type="button">btn</button>
                <div class="well">
                    Basic panel example
                    ssl
                    <p>ss</p>
                    <h3>hh</h3>
                    <button type="button">btn</button>
                    <div class="panel panel-default">
                        <div class="panel-body">
                            Basic panel example
                            ssl
                            <p>ss</p>
                            <h3>hh</h3>
                            <button type="button">btn</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="well">
                <div class="comment-meta">
                    <div class="comment-meta-left">
                        <img src="${pageContext.request.contextPath}/random/img" alt="点击刷新" class="img-rounded" onclick="changeImg(this)">
                        <ul class="comment-name-date">
                            <li class="comment-name">
                                <label>张三</label>
                            </li>
                            <li>2013/08/11 10:39上午</li>
                        </ul>
                    </div>
                    <ul class="comment-act">
                        <li class="comment-reply"><a class="comment-reply-link" href="javacript:void(0)">回复</a></li>
                        <li class="comment-quote"><a href="javascript:void(0);" onclick="">引用</a></li>
                    </ul>
                </div>
                <div class="comment-content">
                    <p class="text-left text-primary">文章不错阿！狰狞过来吗么么么么上理论上的该叔叔婶婶！</p>
                </div>
                <div class="well">
                    <div class="comment-meta">
                        <div class="comment-meta-left">
                            <img src="${pageContext.request.contextPath}/random/img" alt="点击刷新" class="img-rounded" onclick="changeImg(this)">
                            <ul class="comment-name-date">
                                <li class="comment-name">
                                    <label>张三</label>
                                </li>
                                <li>2013/08/11 10:39上午</li>
                            </ul>
                        </div>
                        <ul class="comment-act">
                            <li class="comment-reply"><a class="comment-reply-link" href="javascript:void(0)">回复</a></li>
                            <li class="comment-quote"><a href="javascript:void(0);">引用</a></li>
                        </ul>
                    </div>
                    <div class="comment-content">
                        <p class="text-left text-primary"><span>kkkk<a href="#">kkk</a></span>文章不错阿！狰狞过来吗么么么么上理论上的该叔叔婶婶！</p>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-body">
                            Basic panel example
                            ssl
                            <p>ss</p>
                            <h3>hh</h3>
                            <button type="button">btn</button>
                        </div>
                    </div>
                </div>
            </div>

            <!-- post comment
           ================================================== -->
            <div id="comment-point"><!--定位用--></div>
            <div id="comment-panel" class="panel panel-default">
                <div class="panel-body">
                    <div class="comment-cancel"><a href="javascript:void(0)" >点击这里取消回复</a></div>
                    <form role="form">
                        <div class="form-group">
                            <label for="nickname">昵称</label>
                            <input type="password" class="form-control" id="nickname" placeholder="nickname">
                        </div>
                        <div class="form-group">
                            <label for="email">邮箱地址(不会公开)</label>
                            <input type="email" class="form-control" id="email" placeholder="email">
                        </div>
                        <div class="form-group">
                            <label for="content">评论内容</label>
                            <textarea class="form-control" id="content" rows="5"></textarea>
                        </div>
                        <button type="submit" class="btn btn-info btn-lg"> 发 表 评 论 </button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- Footer
================================================== -->
<footer class="bs-footer" role="contentinfo">
    <div class="container">
        <p>A <a href="http://twitter.com/talkslab" target="_blank">talkslab</a> production by <a href="http://twitter.com/gsferreira" target="_blank">gsferreira</a>, <a href="http://twitter.com/nelsonreis" target="_blank">nelsonreis</a> and <a href="http://twitter.com/ruimlneves" target="_blank">ruimlneves</a>.</p>
    </div>
</footer>

<!--jquery插件-->
<script src="/public/js/jquery-1.8.0.js"></script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/public/js/application.js"></script>
<!--<script src="/public/js/bootstrap.min.js"></script>-->
<script src="/html/metro/docs/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/public/js/common.js"></script>
<script>
    commentReply();
    commentQuote();
    commentCancel();

    var Cat ={
        name : "",
        color : ""
    };
    var cat1 = {};
    cat1.name="大毛";
    cat1.color = "黄色";
    var cat2 ={};
    cat2.name="二毛";
    cat2.color="黑色"

    var cat3 = new Cat();
    cat3.name = "大黄";
    cat3.color = "白色";
</script>
<!--<script src="../metro/docs/jquery.unobtrusive-ajax.js"></script>-->
<!--<script src="../metro/docs/jquery.validate.unobtrusive.js"></script>-->
<!--<script src="/public/js/metro-bootstrap/metro-docs.js"></script>-->
<!--<script src="../metro/docs/jquery.validate.js"></script>-->
<!-- Include all compiled plugins (below), or include individual files as needed -->
<!--<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>-->
</body>
</html>
