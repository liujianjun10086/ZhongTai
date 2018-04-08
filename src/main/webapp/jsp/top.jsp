<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
})	
</script>


</head>

<body style="background:url(${pageContext.request.contextPath}/images/topbg.gif) repeat-x;">

    <div class="topleft">
    <a href="main.jsp" target="_parent"><img src="${pageContext.request.contextPath}/images/logo.png" title="系统首页" /></a>
    </div>
        
    <ul class="nav">
    <li><a href="<%=request.getContextPath()%>/recordList" target="rightFrame" class="selected"><img width="45px" height="45px" src="${pageContext.request.contextPath}/images/icon01.png" title="审批列表" /><h2>审批列表</h2></a></li>
    <li><a href="${pageContext.request.contextPath}/jsp/getSelectRecordByRecord_staff.jsp" target="rightFrame"><img src="${pageContext.request.contextPath}/images/icon05.png" width="45px" height="45px" title="审批添加" /><h2>审批添加</h2></a></li>
    <li><a href="${pageContext.request.contextPath}/jsp/imglist.jsp"  target="rightFrame"><img src="${pageContext.request.contextPath}/images/icon03.png" title="申请列表" /><h2>申请列表</h2></a></li>
    <li><a href="${pageContext.request.contextPath}/jsp/tools.jsp"  target="rightFrame"><img src="${pageContext.request.contextPath}/images/icon04.png" title="客户列表" /><h2>客户列表</h2></a></li>
    <li><a href="${pageContext.request.contextPath}/jsp/tab.jsp"  target="rightFrame"><img src="${pageContext.request.contextPath}/images/icon06.png" title="系统设置" /><h2>系统设置</h2></a></li>
        <c:forEach var="powerList" items="${powerList}">
            <li><a href="${powerList.powerUrl}"  target="rightFrame"><img src="${pageContext.request.contextPath}/images/icon06.png" title="${powerList.powerItem}" /><h2>${powerList.powerItem}</h2></a></li>
        </c:forEach>
    </ul>
            
    <div class="topright">    
    <ul>
    <li><span><img src="${pageContext.request.contextPath}/images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    <li><a href="${pageContext.request.contextPath}/jsp/index.jsp" target="_parent">退出</a></li>
    </ul>
     
    <div class="user">
    <span>${staff.staffName}</span>
    <i>申请消息</i>
    <b>5</b>
    </div>    
    
    </div>
</body>
</html>
