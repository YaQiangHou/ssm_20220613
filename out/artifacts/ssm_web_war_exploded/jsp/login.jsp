<%--
  Created by IntelliJ IDEA.
  User: 34112
  Date: 2022/7/10
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>用户登录</h3>
<form action="<%=request.getContextPath()%>/login" method="post">
    username:<input type="text" name="loginname" value=""/>
    <br/>
    password:<input type="password" name="password"/>
    <br/>
    <input type="submit" value="登录"/>
</form>
<span style="color:red">${requestScope.message}</span>
</body>
</html>
