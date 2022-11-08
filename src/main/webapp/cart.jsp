<%--
  Created by IntelliJ IDEA.
  User: My PC
  Date: 10/31/2022
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Sản Phẩm</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="text-center">
  <h1 class="text-primary">Giỏ hàng</h1>
</div>
<div class="container mt-3">
  <a type="button" href="/products">Quay lại sản phẩm</a>
  <table class="table table-dark table-striped">
    <thead>
    <tr>
      <th>ID</th>
      <th>NAME</th>
      <th>IMAGE</th>
      <th>PRICE</th>
      <th>DELETE</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${carts}" var="sp">
      <tr>
        <td>${sp.id}</td>
        <td>${sp.name}</td>
        <td><img src="${sp.img}" height="200" width="350" alt="car"></td>
        <td>${sp.price}</td>
<%--        <td><a type="button" href="/edit?id=${sp.id}" class="btn btn-warning">Edit</a></td>--%>
        <td><a type="button" href="#" onclick="showMess(${sp.id})" class="btn btn-danger">Delete</a></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <h2 style="color: green">Tổng giá trị giỏ hàng là: ${total}</h2>
  <button type="button" href="" class="btn btn-success">Đặt hàng</button>
</div>

</body>
<script>
  function showMess(id) {
    var option = confirm('Bạn có chắc chắn muốn xóa???');
    if (option === true) {
      window.location.href = "/cart?id=" + id + "&action=delete";
    }
  }
</script>
</html>
