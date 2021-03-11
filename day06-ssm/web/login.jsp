<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>ajax</title>
  <style>
    body{
      background:url(img/bg.png) repeat-x;
      min-height: 600px;
      position: relative;

    }
    *{font-family:"微软雅黑"; margin:0; padding:0; border:0; font-size:14px;color:white;}
    html,body{height:100%; width:100%;;}
    a{
      text-decoration: none;
      color: rgba(255, 255, 255,0.8);
      cursor: pointer;
    }

    .name,.pwd{
      width: 310px;
      height: 44px;
      line-height: 44px;
      padding-left: 15px;
      outline: none;
      border-radius: 20px;
      background-color: #0A3C78;
      border: 1px solid #329BE0;
    }
    .name:hover,.pwd:hover,.name:focus,.pwd:focus{

      background-color: #052b64;
    }

    #login{

      background: #3fb9ff;
      font-size: 18px;
      width: 329px;
      height: 44px;
      outline: none;
      color: rebeccapurple;
      background: -webkit-linear-gradient(#3fb9ff, #099be7, #229de3);
      background: -o-linear-gradient(#3fb9ff, #099be7, #229de3);
      background: -moz-linear-gradient(#3fb9ff, #099be7, #229de3);
      background: linear-gradient(#3fb9ff, #099be7, #229de3);
      border-radius: 20px;
    }
    #login:hover{
      background: -webkit-linear-gradient(#229de3, #099be7,#3fb9ff);
      background: -o-linear-gradient(#229de3, #099be7,#3fb9ff);
      background: -moz-linear-gradient(#229de3, #099be7,#3fb9ff);
      background: linear-gradient(#229de3, #099be7,#3fb9ff);
    }
    #head{
      height: 50px;
      padding-top: 25px;
      margin-left: 14px;
    }
    #middle{
      margin-top: 100px;
    }

    #footer a{
      color:black;
    }

    #middle li {
      list-style-type:none;
      margin-top: 15px;
    }

    #children li {
      list-style-type: none;
      height: 42px;
      line-height: 42px;
      border-bottom: 1px double rgb(5, 33, 113);

    }

    #children li a{
      color: rgba(255, 255, 255,0.8);
    }
    #children li:hover{
      background-color: #354d8d;

    }
    #cloud{
      background: url(img/cloud.png) repeat;
      width: 100%;
      height: 356px;
      position: absolute;
      bottom: 0;
      -webkit-animation: cloud 60s linear infinite alternate;
      -moz-animation: clouds 60s linear infinite alternate;


      z-index: -10;

    }

    @-webkit-keyframes cloud {
      0%{background-position:top left}
      100%{background-position:top right}
    }

    @-moz-keyframes clouds {
      0%{background-position:top left}
      100%{background-position:top right}
    }
  </style>
  <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
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
<div id="sky"></div>
<div id="head"></div>
<div id="middle">
  <form action="${pageContext.request.contextPath}/lg" method="post">
    <ul style="text-align: center;">
      <li style="font-size: 48px">用户登录界面</li>
      <li><input class="name" name="name" id="name" placeholder="请输入用户名" onblur="a1()"><span id="userInfo"></span></li>
      <li><input type="password" name="pwd" id="pwd" class="pwd" placeholder="请输入密码" onblur="a2()"><span id="pwdInfo"></span></li>
      <li><button id="login">立即登录</button></li>
    </ul>
  </form>
</div>
<div id="cloud"></div>
<%--<form action="${pageContext.request.contextPath}/lg">--%>
<%--  <p>--%>
<%--    用户名:<input type="text" id="name" name="name" onblur="a1()"/>--%>
<%--    <span id="userInfo"></span>--%>
<%--  </p>--%>
<%--  <p>--%>
<%--    密码:<input type="text" id="pwd" name="pwd" onblur="a2()"/>--%>
<%--    <span id="pwdInfo"></span>--%>
<%--  </p>--%>
<%--  <div >--%>
<%--    <input type="submit" value="登录">--%>
<%--  </div>--%>
<%--</form>--%>
</body>
</html>