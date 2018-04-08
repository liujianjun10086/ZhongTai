<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2018/4/6
  Time: 1:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>申请列表</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>
    <style type="text/css">
        input{
            border-bottom: 1px black solid;
        }
    </style>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">审批列表</a></li>
    </ul>
</div>

<div class="rightinfo">
    <div class="tools">
        <div class="toolbar">
            <form action="${pageContext.request.contextPath}/application/searchapply" method="post">
                客户姓名：<input name="cname" type="text"/>&nbsp;&nbsp;
                客户联系电话：<input name="cphone" type="tel"/>&nbsp;&nbsp;
                客户身份证：<input name="cnumber" type="text"/>&nbsp;&nbsp;
                <button type="submit">搜索</button>
            </form>
        </div>
    </div>
    <table class="tablelist">
        <thead>
        <tr>
            <th>编号<i class="sort"><img src="${pageContext.request.contextPath}/images/px.gif" /></i></th>
            <th>姓名</th>
            <th>电话</th>
            <th>身份证</th>
            <th>申请金额</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${applyList}" var="apply">
        <tr>
            <td>${apply.applicationId}</td>
            <td>${apply.applicationUsername}</td>
            <td>${apply.applicationPhone}</td>
            <td>${apply.applicationNumber}</td>
            <td>${apply.applicationMoney}</td>
            <td><a href="${pageContext.request.contextPath}/application/addApply?id=${apply.applicationId}" class="tablelink">添加审批</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>


    <div class="pagin">
        <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
            <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
            <li class="paginItem"><a href="javascript:;">1</a></li>
            <li class="paginItem current"><a href="javascript:;">2</a></li>
            <li class="paginItem"><a href="javascript:;">3</a></li>
            <li class="paginItem"><a href="javascript:;">4</a></li>
            <li class="paginItem"><a href="javascript:;">5</a></li>
            <li class="paginItem more"><a href="javascript:;">...</a></li>
            <li class="paginItem"><a href="javascript:;">10</a></li>
            <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>
</div>
</body>
</html>
