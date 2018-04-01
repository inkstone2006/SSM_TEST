<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/1
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>编辑用户</title>
  </head>
  <body>
    <form action='<c:url value="/updateOne" /> ' method="post">
        ID    : <input type="text" name="id" value='<c:out value="${user.id}" />' readonly="true"><br>
        用户名: <input type="text" name="name" value='<c:out value="${user.name}" />'><br>
        年龄  : <input type="text" name="age" value='<c:out value="${user.age}" />'><br>
        <input type="submit">
    </form>
  </body>
</html>
