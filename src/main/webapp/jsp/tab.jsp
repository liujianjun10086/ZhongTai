<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/select-ui.min.js"></script>
<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 200
	});
	$(".select2").uedSelect({
		width : 167
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script>
</head>

<body style="background-image: url(${pageContext.request.contextPath}/images/logo.png);">

	<div class="place">
        <span>位置：</span>
        <ul class="placeul">
        <li><a href="#">审批列表</a></li>
        <li><a href="#">审批修改</a></li>
        </ul>
    </div>

    <div class="formbody">
        <div id="usual1" class="usual">
            <div class="formtext">请选择需要修改的信息！</div>
            <form>
                <ul class="forminfo">

                <li><label>客户姓名<b>*</b></label>
                    <input name="name" type="text" class="dfinput" placeholder="请填写客户姓名"  style="width:200px;"/>
                </li>
                <li><label>客户电话<b>*</b></label>
                    <input name="phone" type="text" class="dfinput" placeholder="请填写客户电话"  style="width:200px;"/>
                </li>
                <li><label>身份证号<b>*</b></label>
                    <input name="number" type="text" class="dfinput" placeholder="请填写客户身份证号码"  style="width:200px;"/>
                </li>
                <li><label>放款机构<b>*</b></label>
                    <div class="vocation">
                        <select class="select1" name="orgunizeId">
                            <c:forEach items="${requestScope.orgList}" var="organize">
                                <option value="${organize.id }">${organize.name }</option>
                            </c:forEach>
                        </select>
                    </div>
                </li>
                <li><label>薪资待遇<b>*</b></label>
                    <input name="number" type="text" class="dfinput" placeholder="请填写客户身份证号码"  style="width:200px;"/>
                </li>
                <li><label>工作地点<b>*</b></label>

                <div class="usercity">
                    <div class="cityleft">
                        <select name="progressId" id="progress" class="form-control">
                            <c:forEach items="${requestScope.proList}" var="progress">
                                <option value="${progress.id }">${progress.message }</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                </li>
                <li><label>通知内容<b>*</b></label>


                <textarea id="content7" name="content" style="width:700px;height:250px;visibility:hidden;"></textarea>

                </li>
                <li><label>&nbsp;</label><input name="" type="button" class="btn" value="马上发布"/></li>
                </ul>
            </form>
        </div>
    </div>
</body>
</html>
