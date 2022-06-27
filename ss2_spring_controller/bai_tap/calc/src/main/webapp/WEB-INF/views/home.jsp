<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 27/06/2022
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home Casio</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
</head>
<body>
<h1>Casio Page</h1>

<form action="/home" method="post">
    <label>Number 1</label>
    <input type="number" name="number1">
    <label>Number 2</label>
    <input type="number" name="number2">
    <hr>
    <div class="row">
        <div class="col-md-3">
            <input type="submit" name="calculator" value="+" class="btn btn-primary btn-lg" style="width: 30px">
        </div>
        <div class="col-md-3">
            <input type="submit" name="calculator" value="-" class="btn btn-primary btn-lg" style="width: 30px">
        </div>
        <div class="col-md-3">
            <input type="submit" name="calculator" value="*" class="btn btn-primary btn-lg" style="width: 30px">
        </div>
        <div class="col-md-3">
            <input type="submit" name="calculator" value="/" class="btn btn-primary btn-lg" style="width: 30px">
        </div>
    </div>
</form>

<h3>Your result : ${result}</h3>
</body>
</html>
