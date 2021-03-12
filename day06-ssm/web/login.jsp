<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录</title>
  <link rel="icon" href="imgs/logo.ico" type="image/x-icon">
<%--  <link type="text/css" rel="stylesheet" href="css/denglu.css">--%>
<%--  <script src="text/javascript" src="js/js1.js"></script>--%>
  <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
  <style>
    body{
      background: url("imgs/jianbian2.jpg");
      background-size: cover;
    }
    div{
      width: 500px;
      height: 500px;
      background-color: #fff;
      position: relative;
      left: 35%;
      top: 20%;
      border: 1px solid #fff;
      border-radius: 20px;
    }
    table{
      margin: 50px auto;
    }
    tr{
      line-height: 60px;
    }
    .name{
      background: url("imgs/name.png");
      /*background-size: 100% 50px;*/
      background-position: 10px -13px;

    }
    .pwd{
      background: url("imgs/mima.png");
      background-position: 10px -13px;
    }
    input{
      text-indent: 5em;
      background-color: #F2F2F2;
      border: 0;
      width: 300px;
      height: 30px;
      /*line-height: 50px;*/
      border-radius: 50px;
      margin-bottom: 20px;
    }
    input:focus{
      outline: none;
    }
    .submit{
      text-indent: 0;
      background-color: #00B6ED;
      color: #fff;
      font-weight: bold;
      height: 50px;
    }
    td img{
      margin-left: 50px;
    }
  </style>
  <script>
    function a1(){
      $.post({
        url:"${pageContext.request.contextPath}/a3",
        data:{'name':$("#name").val()},
        success:function (data) {
          if (data.toString()==='OK'){
            $("#userInfo").css("color","green");
          }else {
            $("#userInfo").css("color","red");
          }
          $("#userInfo").html(data);
        }
      });
    }
    function a2(){
      $.post({
        url:"${pageContext.request.contextPath}/a3",
        data:{'pwd':$("#pwd").val(),'name':$("#name").val()},
        success:function (data) {
          if (data.toString()==='OK'){
            $("#pwdInfo").css("color","green");
          }else {
            $("#pwdInfo").css("color","red");
          }
          $("#pwdInfo").html(data);
        }
      });
    }
  </script>

</head>
<body>
<%--<div id="sky"></div>--%>
<%--<div id="head"></div>--%>
<%--<div id="middle">--%>
<%--  <form action="${pageContext.request.contextPath}/lg" method="post">--%>
<%--    <ul style="text-align: center;">--%>
<%--      <li style="font-size: 48px">用户登录界面</li>--%>
<%--      <li><input class="name" name="name" id="name" placeholder="请输入用户名" onblur="a1()"><span id="userInfo"></span></li>--%>
<%--      <li><input type="password" name="pwd" id="pwd" class="pwd" placeholder="请输入密码" onblur="a2()"><span id="pwdInfo"></span></li>--%>
<%--      <li><button id="login">立即登录</button></li>--%>
<%--    </ul>--%>
<%--  </form>--%>
<%--</div>--%>
<%--<div id="cloud"></div>--%>
<div class="denglu">
  <form action="${pageContext.request.contextPath}/lg" method="post" >
    <table>
      <tr><th>用户登录</th></tr>
      <tr><td><label for="name"></label><input type="text" autofocus class="name" id="name" placeholder="请输入用户名" onblur="a1()" ><span id="userInfo"></span></td></tr>
      <tr><td><label for="pwd"></label><input type="password" class="pwd" id="pwd" placeholder="请输入密码" onblur="a2()" ><span id="pwdInfo"></span></td></tr>
      <tr><td><input type="submit" value="立即登录" id="login" formtarget="_blank"  class="submit"></td></tr>
      <tr><td><img src="imgs/xuan.gif"></td></tr>
    </table>
  </form>
</div>
</body>
</html>