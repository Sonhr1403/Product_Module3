<%--
  Created by IntelliJ IDEA.
  User: My PC
  Date: 10/31/2022
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Edit Product</title>
</head>
<body >
<h2>Edit Product</h2>
<div>
  <form action="/edit" method="post">
    <table>
      <tr>
        <td>Nhập id</td>
        <td><input name="id" value="${p.id}" readonly></td>
      </tr>
      <tr>
        <td>Nhập name</td>
        <td><input name="name" value="${p.name}"></td>
      </tr>
      <tr>
        <td>Nhập img</td>
        <td><input name="img" value="${p.img}"></td>
      </tr>
      <tr>
        <td>Nhập price</td>
        <td><input name="price" value="${p.price}"></td>
      </tr><tr>
        <td>Nhập status</td>
        <td><input name="status" value="${p.status}"></td>
      </tr>
    </table>
    <button type="submit">Edit</button>
  </form>
</div>
</body>
</html>
