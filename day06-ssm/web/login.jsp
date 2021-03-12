<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>ajax</title>
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
      <tr><td><input type="text" autofocus class="name" id="name" placeholder="请输入用户名" onblur="a1()"><span id="userInfo"></span></td></tr>
      <tr><td><input type="password" class="pwd" id="pwd" placeholder="请输入密码" onblur="a2()"><span id="pwdInfo"></span></td></tr>
      <tr><td><input type="submit" value="立即登录" id="login" formtarget="_blank"  class="submit" onclick="return denhlu()"></td></tr>
      <tr><td><img src="../imgs/xuan.gif"></td></tr>
    </table>
  </form>
</div>
</body>
</html>