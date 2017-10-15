<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 大森
  Date: 2017/9/2
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <title>控制台</title>
    <link rel="stylesheet" type="text/css" href="../Css/identify.css"/>
    <link rel="stylesheet" type="text/css" href="../Css/layout.css"/>
    <link rel="stylesheet" type="text/css" href="Css/account.css"/>
    <link rel="stylesheet" type="text/css" href="../Css/style.css"/>
    <link rel="stylesheet" type="text/css" href="../Css/control_index.css"/>
    <script type="text/javascript" src="../Js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="Js/layer/layer.js"></script>
    <script type="text/javascript" src="../Js/haidao.offcial.general.js"></script>
    <script type="text/javascript" src="../Js/select.js"></script>
    <script type="text/javascript" src="../Js/haidao.validate.js"></script>
</head>

<body>
<div class="view-topbar">
    <div class="topbar-console">
        <div class="tobar-head fl">
            <a href="#" class="topbar-logo fl">
                <span><img src="../Images/logo.png" width="20" height="20"/></span>
            </a>
            <a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>管理控制台</span></a>
        </div>
    </div>
    <div class="topbar-info">
        <ul class="fr">
            <li class="fl dropdown topbar-notice topbar-btn">
                <a href="#" class="dropdown-toggle">
                    <span class="icon-notice"></span>
                    <span class="topbar-num have">0</span>
                    <!--have表示有消息，没有消息去掉have-->
                </a>
            </li>
            <!-- 					<li class="fl topbar-info-item strong">
            <div class="dropdown">
                <a href="#" class="dropdown-toggle topbar-btn">
                <span class="fl">工单服务</span>
                <span class="icon-arrow-down"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">我的工单</a></li>
                    <li><a href="#">提交工单</a></li>
                </ul>
            </div>
            </li>
             -->
            <li class="fl topbar-info-item">
                <div class="dropdown">
                    <a href="#" class="topbar-btn">
                        <span class="fl text-normal">帮助与文档</span>
                        <span class="icon-arrow-down"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">模板开发手册</a></li>
                        <li><a href="#">某某数据字典</a></li>
                    </ul>
                </div>
            </li>
            <li class="fl topbar-info-item">
                <div class="dropdown">
                    <a href="#" class="topbar-btn">
                        <span class="fl text-normal">小朱</span>
                        <span class="icon-arrow-down"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="login.html">退出</a></li>
                    </ul>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="view-body">
    <div class="view-sidebar">
        <div class="sidebar-content">
            <div class="sidebar-nav">
                <div class="sidebar-title">
                    <a href="#">
                        <span class="icon"><b class="fl icon-arrow-down"></b></span>
                        <span class="text-normal">产品与服务</span>
                    </a>
                </div>
                <ul class="sidebar-trans">
                    <li>
                        <a href="task_teacher.jsp">
                            <b class="sidebar-icon"><img src="../Images/icon_author.png" width="16" height="16"/></b>
                            <span class="text-normal">任务管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="forum_list.jsp">
                            <b class="sidebar-icon"><img src="../Images/icon_message.png" width="16" height="16"/></b>
                            <span class="text-normal">技术论坛</span>
                        </a>
                    </li>
                    <!-- <li>
                        <a href="#">
                            <b class="sidebar-icon"><img src="Images/icon_market.png" width="16" height="16" /></b>
                            <span class="text-normal">云市场</span>
                        </a>
                    </li> -->
                </ul>
            </div>
            <div class="sidebar-nav">
                <div class="sidebar-title">
                    <a href="#">
                        <span class="icon"><b class="fl icon-arrow-down"></b></span>
                        <span class="text-normal">用户中心</span>
                    </a>
                </div>
                <ul class="sidebar-trans">
                    <li>
                        <a href="../show_user_information.jsp">
                            <b class="sidebar-icon"><img src="../Images/icon_cost.png" width="16" height="16"/></b>
                            <span class="text-normal">用户信息</span>
                        </a>
                    </li>
                    <li>
                        <a href="../identify.html">
                            <b class="sidebar-icon"><img src="../Images/icon_authentication.png" width="16"
                                                         height="16"/></b>
                            <span class="text-normal">图书管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="../message.html">
                            <b class="sidebar-icon"><img src="../Images/icon_news.png" width="16" height="16"/></b>
                            <span class="text-normal">失物招领</span>
                        </a>
                    </li>
                    <li>
                        <a href="../money.html">
                            <b class="sidebar-icon"><img src="../Images/icon_gold.png" width="16" height="16"/></b>
                            <span class="text-normal">金币管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="../order.html">
                            <b class="sidebar-icon"><img src="../Images/icon_order.png" width="16" height="16"/></b>
                            <span class="text-normal">订单管理</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="view-product">
        <div class="authority">
            <div class="authority-head">
                <div class="manage-head">
                    <h6 class="layout padding-left manage-head-con">任务完成情况
                        <%--<span class="fr text-small text-normal padding-top">发布时间：2016-07-08</span>
                        <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em
                                class="text-main">2.4.0.160708</em></span>--%>
                    </h6>
                </div>
            </div>
            <div class="authority-content">
                <div class="list-content show">
                    <div class="offcial-table tr-border margin-big-top clearfix">
                        <div class="tr-th clearfix">
                            <div class="th w15">
                                学号
                            </div>
                            <div class="th w10">
                                姓名
                            </div>
                            <div class="th w40">
                                任务内容
                            </div>
                            <div class="th w15">
                                发布时间
                            </div>
                            <div class="th w10">
                                完成情况
                            </div>
                            <div class="th w10">
                                操作
                            </div>
                        </div>
                        <div class="tr clearfix border-bottom-none">
                            <c:forEach var="task" items="${taskList}">
                                <div class="td w15">
                                        ${task.userid}
                                </div>
                                <div class="td w10">
                                        ${task.username}
                                </div>
                                <div class="td w40">
                                        ${task.taskcontent}
                                </div>
                                <div class="td w15">
                                        ${task.tasktime}
                                </div>
                                <div class="td w10">
                                        ${task.taskstatus}
                                </div>
                                <div class="td w10">
                                    <a href="#" msg="您是否删除此站点，如果删除会影响站点通信导致部分功能无法使用？" callback="del_site(624)"
                                       data-id=""
                                       class="button-word2 btn_ajax_confirm">新任务</a>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="show-page padding-big-right">
                    <div class="page">
                        <div class="page">
                            <ul class="offcial-page margin-top margin-big-right">
                                <li>共<em class="margin-small-left margin-small-right">1</em>条数据</li>
                                <li>每页显示<em class="margin-small-left margin-small-right">15</em>条</li>
                                <li><a class="next disable">上一页</a></li>
                                <li></li>
                                <li><a class="next disable">下一页</a></li>
                                <li><span class="fl">共<em class="margin-small-left margin-small-right">1</em>页</span>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    $(".sidebar-title").live('click', function () {
        if ($(this).parent(".sidebar-nav").hasClass("sidebar-nav-fold")) {
            $(this).next().slideDown(200);
            $(this).parent(".sidebar-nav").removeClass("sidebar-nav-fold");
        } else {
            $(this).next().slideUp(200);
            $(this).parent(".sidebar-nav").addClass("sidebar-nav-fold");
        }
    });
</script>
</body>

</html>
