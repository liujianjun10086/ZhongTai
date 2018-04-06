<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/5 0005
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>无标题</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />


    <link
            href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css"
            rel="stylesheet"
    />

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script
            src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

    <script language="javascript">
        $(function(){
            //导航切换
            $(".imglist li").click(function(){
                $(".imglist li.selected").removeClass("selected")
                $(this).addClass("selected");
            })
        })
    </script>
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
    <style>
        .rightinfo{
            width:100%;
        }
     .frm{

         border:1px solid #ccc;
         border-top:none;
     }
      h5{
          width:100%;
          background-color: #c1e2b3;
          height:40px;
          line-height: 40px;
          margin-bottom: 0px;
          font-weight: bold;
          text-indent: 10px;
      }
        .kh{
            padding:10px;
        }
        .controls{
            margin-top:5px;
        }
        .sub{
            width:100%;
            height:30px;
            background-color: #c1e2b3;
            font-weight: bold;
            font-size: 18px;
            margin-top:10px;
        }
        .control-group{
            margin-top:5px ;
            border-top: 1px dashed #ccc;

        }
        .control-group:first-child{
            border-top: none;
        }
        input{
            border:1px solid #ccc;
            width:100%;
            height:30px;
            border-radius: 4px;
        }
        .select{
            width:100%;
        }
    </style>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">审批添加</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="view">
        <div class="span6">
            <div class="widget-box">
                <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                    <h5>客户信息</h5>
                </div>
                <div class="widget-content nopadding  frm">
                    <form action="${pageContext.request.contextPath}/apply" method="post" role="form" class="form-horizontal kh">
                        <div class="control-group">
                            <label for="normal" class="control-label">姓名</label>
                            <div class="controls">
                                <input type="text" id="username" name="username" class="span8 mask text input-xlarge">
                               </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">电话</label>
                            <div class="controls">
                                <input type="text" id="phone" name="phone" class="span8 mask text input-xlarge" >
                                </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">身份证</label>
                            <div class="controls">
                                <input type="text" id="idcard" name="idcard"  class="span8 mask text">
                                </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">申请金额</label>
                            <div class="controls">
                                <input type="text" id="applemoney" name="applymoney" class="input-xlarge span8 mask text">
                               </div>
                </div>
                        <div class="control-group ">
                            <label for="normal" class="control-label" style="left:0px;">放款机构</label>
                            <div class="controls form-group" style="display:inline-block;width:100%;">
                               <select name="selectType" style="margin-left:15px;width:100%;height: 30px;margin-bottom: -12px;" class="form-control select">
                                  <c:forEach var="organizeList" items="${organizeList}">
                                      <option value="${organizeList.organizeId}">${organizeList.organizeName}</option>
                                  </c:forEach>
                               </select>
                                </div>
                        </div>
                        <div class="control-group " >
                            <label for="normal" class="control-label">审批进度</label>
                            <div class="controls form-group" style="display:inline-block;width:100%;">
                                <select name="progress" style="margin-left:15px;width:100%;height: 30px;margin-bottom: -12px;" class="form-control select">
                                   <c:forEach var="progressList" items="${progressList}">
                                       <option value="${progressList.progressId}">${progressList.progressName}</option>
                                   </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">推荐人</label>
                            <div class="controls">
                                <input type="text" id="referee" name="referee" class="input-xlarge span8 mask text">
                            </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">办理时间</label>
                            <div class="controls">
                                <input type="text" id="mask-eyeScript" name="date"  class="input-xlarge span8 mask text">
                               </div>
                        </div>
                        <div class="tools">
                                    <input id="submit" type="submit" value="提交" class="sub"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

<div class="tip">
    <div class="tiptop"><span>提示信息</span><a></a></div>

    <div class="tipinfo">
        <span><img src="${pageContext.request.contextPath}/images/ticon.png" /></span>
        <div class="tipright">
            <p>是否确认对信息的添加 ？</p>
            <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
        </div>
    </div>

    <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
    </div>

</div>
</div>
</body>
</html>
<script type="text/javascript">
   $(function () {
           var res ="<%=session.getAttribute("result")%>";
           if(res!=null){
               if(res==1){
                   alert("添加成功");
               }
           }
   });

</script>
