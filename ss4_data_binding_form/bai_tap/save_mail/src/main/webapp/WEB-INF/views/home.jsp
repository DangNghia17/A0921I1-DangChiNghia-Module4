<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 08/07/2022
  Time: 00:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Home Page</title>
</head>
<body>
<form:form action="/update" method="post" modelAttribute="createEmail">
    <fieldset>
        <legend>Email</legend>
    <table>
        <tr>
            <td><form:label path="language">Languages : </form:label></td>
            <td><form:select path="language" items="${language}"></form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size </form:label></td>
            <td><form:label path="pageSize">Show</form:label>
                <form:select path="pageSize" items="${language}"></form:select>
                <form:label path="pageSize">emails per page</form:label></td>
        </tr>

        <tr>
            <td><form:label path="spamFilter">Spam Filter</form:label></td>
            <td><form:checkbox path="spamFilter" ></form:checkbox>
                <form:label path="spamFilter">Enable spams filter</form:label></td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature </form:label></td>
            <td><form:textarea path="signature" rows="5"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update">
                <button type="button"><a href="/display">Cancel</a></button>
            </td>
        </tr>
    </table>
    </fieldset>
</form:form>

</body>
</html>
