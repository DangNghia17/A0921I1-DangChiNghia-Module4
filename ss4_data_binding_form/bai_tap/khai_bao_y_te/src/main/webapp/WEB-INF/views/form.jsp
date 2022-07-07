<%--
  Created by IntelliJ IDEA.
  User: Nghia Fuckboy
  Date: 08/07/2022
  Time: 02:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form Page</title>
    <style>
        .red {
            color: red;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
<center>
    <h3>TỜ KHAI Y TẾ</h3>
    <h3>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG
        DỊCH BỆNH TRUYỀN NHIỄM</h3>
    <h4 style="color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lí hình sự</h4>
</center>
<form:form action="/save" method="post" modelAttribute="healthDeclare">
    <table style="width: 100%">
        <tr>
            <td colspan="3">Họ tên (ghi chữ IN HOA)<span class="red">(*)</span></td>
        </tr>
        <tr>
            <td colspan="3"><form:input path="name"/></td>
        </tr>
        <tr>
            <td class="error">${error.name}</td>
        </tr>
    </table>

</form:form>
</body>
</html>
