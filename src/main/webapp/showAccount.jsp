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
    <h1 class="text-primary">Sản phẩm của chúng tôi</h1>
    <a type="button" href="/" class="btn btn-success">Create new Product</a>
</div>
<div class="container mt-3">
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>IMAGE</th>
            <th>PRICE</th>
            <th>STATUS</th>
            <th>EDIT</th>
            <th>DELETE</th>
            <th>ADD TO CART</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${accounts}" var="acc">
            <tr>
                <td>${acc.id}</td>
                <td>${acc.email}</td>
                <td>${acc.password}"</td>
                <td>${acc.address}</td>
                <td>${acc.birthday}</td>
                <td><a type="button" href="/editacc?id=${sp.id}" class="btn btn-warning">Edit</a></td>
                <td><a type="button" href="#" onclick="showMess(${acc.id})" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
<script>
    function showMess(id) {
        var option = confirm('Bạn có chắc chắn muốn xóa???');
        if (option === true) {
            window.location.href = "/delete?id=" + id;
        }
    }
</script>
</html>
