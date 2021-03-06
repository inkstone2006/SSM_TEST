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
    <title>查询所有用户</title>
  </head>
  <body>
      <table border="1px">
          <tr>
              <td>ID</td>
              <td>NAME</td>
              <td>AGE</td>
              <td>删除</td>
              <td>修改</td>
          </tr>
        <c:forEach items="${allUsers}" var="u">
            <tr>
              <td><c:out value="${u.id}" /></td>
              <td><c:out value="${u.name}" /></td>
              <td><c:out value="${u.age}" /></td>
              <td><a href='<c:url value="/deleteOne?uid=${u.id}" /> '>删除</a></td>
              <td><a href='<c:url value="/editOne?uid=${u.id}" /> '>修改</a></td>
            </tr>
        </c:forEach>
      </table>
  </body>
</html>
