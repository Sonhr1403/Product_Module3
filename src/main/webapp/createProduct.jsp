<%--
  Created by IntelliJ IDEA.
  User: My PC
  Date: 10/31/2022
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body >
<h2>Create Product</h2>
<div>
    <form action="/create">
        <table>
            <tr>
                <td>Nhập name</td>
                <td><input name="name" placeholder="nhập name"></td>
            </tr>
            <tr>
                <td>Nhập img</td>
                <td><input name="img" placeholder="nhập img"></td>
            </tr>
            <tr>
                <td>Nhập price</td>
                <td><input name="price" placeholder="nhập price"></td>
            </tr>
        </table>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
