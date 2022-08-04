<%--
  Created by IntelliJ IDEA.
  User: 34112
  Date: 2022/7/10
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            border-collapse: collapse;
        }
        table,td,th{
            border:1px solid black;
        }
        td{
            padding: 10px;
        }
    </style>

</head>
<body>
<h3>首页</h3>
<table border="1">
    <tr>
        <th>封面</th>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
    </tr>
    <c:forEach items="${requestScope.books}" var="book">
        <tr>
            <td><img src="<%=request.getContextPath()%>/img/${book.image}" height="60"></td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
