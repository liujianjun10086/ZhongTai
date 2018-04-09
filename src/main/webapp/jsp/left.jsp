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
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">

	<div class="lefttop"><span></span>通讯录</div>
    
    <dl class="leftmenu">
        
    <%--<dd>--%>
    <%--<div class="title">--%>
    <%--<span><img src="${pageContext.request.contextPath}/images/leftico01.png" /></span>审批管理--%>
    <%--</div>--%>
    	<%--<ul class="menuson">--%>
        <%--<li class="active"><cite></cite><a href="${pageContext.request.contextPath}/jsp/right.jsp" target="rightFrame">查看审批列表</a><i></i></li>--%>
        <%--<li><cite></cite><a href="${pageContext.request.contextPath}/jsp/imgtable.jsp" target="rightFrame">个人审批列表</a><i></i></li>--%>
            <%--<li><cite></cite><a href="${pageContext.request.contextPath}/jsp/imgtable.jsp" target="rightFrame">小组审批列表</a><i></i></li>--%>
            <%--<li><cite></cite><a href="${pageContext.request.contextPath}/jsp/imgtable.jsp" target="rightFrame">部门审批列表</a><i></i></li>--%>
            <%--<li><cite></cite><a href="${pageContext.request.contextPath}/application/addApply" target="rightFrame">审批添加</a><i></i></li>--%>
            <%--<li><cite></cite><a href="${pageContext.request.contextPath}/jsp/imgtable.jsp" target="rightFrame">待审批列表</a><i></i></li>--%>
        <%--<li><cite></cite><a href="${pageContext.request.contextPath}/jsp/form.jsp" target="rightFrame">机构添加</a><i></i></li>--%>
        <%--<li><cite></cite><a href="${pageContext.request.contextPath}/jsp/imglist.jsp" target="rightFrame">进度添加</a><i></i></li>--%>
        <%--</ul>    --%>
    <%--</dd>--%>
    <%----%>
    <%--<dd><div class="title"><span><img src="${pageContext.request.contextPath}/images/leftico03.png" /></span>申请管理</div>--%>
    <%--<ul class="menuson">--%>
        <%--<li><cite></cite><a href="#">申请列表</a><i></i></li>--%>
        <%--</ul>     --%>
    <%--</dd>--%>
    <%----%>
    <%--<dd><div class="title"><span><img src="${pageContext.request.contextPath}/images/leftico02.png" /></span>客户管理</div>--%>
    <%--<ul class="menuson">--%>
        <%--<li><cite></cite><a href="#">客户列表</a><i></i></li>--%>
    <%--</ul>    --%>
    <%--</dd>--%>
     <c:forEach var="moduleList" items="${moduleList}" varStatus="i">
        <dd><div class="title"><span><img src="${pageContext.request.contextPath}/images/leftico02.png" /></span>${moduleList.moduleName}</div>
            <ul class="menuson">
                <%--<li><cite></cite><a href="#">客户列表</a><i></i></li>--%>
                    <c:forEach var="powerList" items="${powerList}">
                        <%--${powerList.module.moduleId}--%>
                        <c:if test="${moduleList.moduleId eq powerList.moduleid}">
                        <li><cite></cite><a href="${powerList.powerUrl}" target="rightFrame">${powerList.powerItem}</a><i></i></li>
                        </c:if>
                    </c:forEach>

            </ul>
        </dd>
      </c:forEach>
    </dl>
</body>
</html>
