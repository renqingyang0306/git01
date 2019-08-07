<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>用户注册</h2>
<hr>
<form action="/register" method="post">
    <input type="text" placeholder="请输入用户名" name="username"><br>
    <input type="text" placeholder="请输入密码" name="password"><br>
    <input type="text" placeholder="请输入出生日期" name="birthday"><br>
    <input type="text" placeholder="请输入sex" name="sex"><br>
    <input type="text" placeholder="请输入address" name="address"><br>
    <input type="submit">
</form>
</body>
</html>
