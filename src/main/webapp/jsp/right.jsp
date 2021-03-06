<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>网站后台管理系统HTML模板--模板之家 www.cssmoban.com</title>
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
    
    	<ul class="toolbar">
        <li class="click"><span><img src="${pageContext.request.contextPath}/images/t01.png" /></span><a href="#">添加</a></li>
        </ul>
    </div>
    <table class="tablelist">
    	<thead>
    	<tr>
        <th>编号<i class="sort"><img src="${pageContext.request.contextPath}/images/px.gif" /></i></th>
        <th>姓名</th>
        <th>电话</th>
        <th>身份证</th>
        <th>申请金额</th>
        <th>放款机构</th>
        <th>审批进度</th>
        <th>办理人</th>
        <th>推荐人</th>
        <th>办理时间</th>
        <th>操作</th>
        </tr>
        </thead>
        <c:forEach var="list" items="${personalList}">
        <tbody>
        <tr>
            <td>${list.recordId}</td>
            <td>${list.recordCustomerName}</td>
            <td>${list.recordCustomerPhone}</td>
            <td>${list.recordCustomerNum}</td>
            <td>${list.recordApply}</td>
            <td>${list.organize.organizeName}</td>
            <td>${list.progress.progressName}</td>
            <td>${list.recordStaff}</td>
            <td>${list.recordReferee}</td>
            <td>${list.recordDatetime}</td>
            <td><a href="#" class="tablelink">修改</a></td>
        </tr>
        </tbody>
        </c:forEach>
    </table>
    
   
    <div class="pagin">
    	<div class="message">共<i class="blue">X</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
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
    
    
    <div class="tip">
    	<div class="tiptop"><span>提示信息</span><a></a></div>
        
      <div class="tipinfo">
        <span><img src="${pageContext.request.contextPath}/images/ticon.png" /></span>
        <div class="tipright">
        <p>是否确认对信息的修改 ？</p>
        <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
        </div>
        </div>
        
        <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
    
    </div>
    

    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>
