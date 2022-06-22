<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 20/06/2022
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My WEB</title>
</head>
<body>
<h1>Hello erveryone , welcome to my website</h1>
<form action="/outdata" method="post">
    <input type="text" name="yourName" placeholder="input your Name">
    <input type="text" name="yourAge" placeholder="input your Age">
    <input type="submit" value="Submit">
</form>

<h5>Helloooooo  ${text1} </h5>
<h5>are you ${text2} year old ???</h5>
</body>
</html>
