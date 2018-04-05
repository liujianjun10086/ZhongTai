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
            border-top: 1px dashed #ccc;
        }
        .control-group:first-child{
            border-top: none;
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
                    <form action="#" method="post" class="form-horizontal kh">
                        <div class="control-group">
                            <label for="normal" class="control-label">编号</label>
                            <div class="controls">
                                <input type="text" id="id" name="id" value="201802" class="span8 mask text" readonly="readonly">
                                 </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">姓名</label>
                            <div class="controls">
                                <input type="text" id="username" name="username" value="李四" class="span8 mask text" readonly="readonly">
                               </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">电话</label>
                            <div class="controls">
                                <input type="text" id="phone" name="phone" value="15828645026" class="span8 mask text" readonly="readonly">
                                </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">身份证</label>
                            <div class="controls">
                                <input type="text" id="idccard" name="idcard" value="5110273778338272" class="span8 mask text" readonly="readonly">
                                </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">申请金额</label>
                            <div class="controls">
                                <input type="text" id="applemoney" name="applymoney" value="50000" class="span8 mask text" readonly="readonly">
                               </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">放款机构</label>
                            <div class="controls">
                               <select name="selectType">
                                   <option>大树消费</option>
                                   <option>平安银行</option>
                                   <option>电信银行</option>
                                   <option>光大银行</option>
                               </select>
                                </div>
                        </div>
                        <div class="control-group">
                            <label for="normal" class="control-label">办理时间</label>
                            <div class="controls">
                                <input type="text" id="mask-eyeScript" name="date" value="2018-02-21 02:20:11" class="span8 mask text" readonly="readonly">
                               </div>
                        </div>
                        <div class="tools">
                                    <input type="submit" value="提交" class="sub"/>
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

<script type="text/javascript">

</script>
</body>
</html>
