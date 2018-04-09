<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>无标题文档</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">列表</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>添加信息</span></div>

    <form action="<%=request.getContextPath()%>/addProgress.action" method="get"
          enctype="application/x-www-form-urlencoded">
    <input  type="text" placeholder="添加进度"  name="progressName"  style="border: black;font-size: 16px"/><br /><br />
    <input type="submit" value="提交" style="font-size: 16px"/>
    </form>
</div>
</body>


</html>
