<%--
  Created by IntelliJ IDEA.
  User: 肖志睿
  Date: 2019/3/19
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>登录</title>
<style>
    .body{
        width: 300px;
        margin: 10px auto;
        border: 1px solid blue;
        padding: 40px;
    }
    input{
        margin-top: 10px;
        margin-bottom: 10px;
    }
    .input{
        text-align: center;
    }
</style>
</head>
<body>
<div style="text-align: center;margin-top: 140px;font-size: larger;font-family: 微软雅黑">登 录</div>
<div class="body">
    <form action="login.do" method="post" >
        <div class="input">账 户：<input type="text" name="username" value="admin"/><br/></div>
        <div class="input">密 码：<input type="password" name="password" value="admin"/><br/></div>
        <div class="input">时间：<input type="date" name="date"/><br/></div>
        <div class="input"><input type="submit"  value="&nbsp;提&nbsp;&nbsp;&nbsp;&nbsp;交&nbsp;"/></div>
    </form>
</div>
</body>
</html>
