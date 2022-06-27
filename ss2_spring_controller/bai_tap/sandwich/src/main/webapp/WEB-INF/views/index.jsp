<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 27/06/2022
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Sandwich Condiments</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
    <style>
        label {
            font-size: 20px;
        }

    </style>
</head>
<body>

<h1>Sandwich Condiments</h1>

<form action="/save" method="post">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="Lettuce">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Tomato">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Mustard">
    <label>Sprouts</label>
    <input type="checkbox" name="condiment" value="Sprouts"><br>
    <input type="submit" value="Save" class="btn btn-primary"><hr>
</form>
</body>
</html>
