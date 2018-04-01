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
    <title>主页</title>
  </head>
  <body>
 欢迎<c:out value="${SessionScope.user.name}" />
  <a href="<c:url value="/selectAll" /> ">查询全部用户信息</a>
  </body>
</html>
