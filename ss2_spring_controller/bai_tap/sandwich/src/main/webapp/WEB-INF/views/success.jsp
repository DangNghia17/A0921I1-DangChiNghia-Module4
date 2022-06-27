<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 27/06/2022
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Success</title>
</head>
<body>
<%--    item nhớ ${}      --%>
<c:forEach items="${condimentArray}" var="item">
    <h3>${item}</h3>
</c:forEach>
</body>
</html>
