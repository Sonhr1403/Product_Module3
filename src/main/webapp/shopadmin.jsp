<!DOCTYPE html>
<html lang="en">
<head>
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>Contact</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <!-- Responsive-->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- fevicon -->
    <link rel="icon" href="images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <!-- owl stylesheets -->
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
</head>
<body>
<!-- header section start -->
<div class="header_section">
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="logo"><a href="/admin.jsp"><img src="images/logo.png"></a></div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/admin.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/services.jsp">services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/about.jsp">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/products">Shop</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/contact.jsp">Contact</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <h1 class="call_text">Call Us : +01 1234567890</h1>
                </form>
                <div class="search_icon">
                    <ul>
                        <li><a href="#"><img src="images/search-icon.png"></a></li>
                        <li><a href="#">Hello Admin</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</div>
<!-- header section end -->
<!-- furnitures section start -->
<div class="text-center">
    <h1 class="text-primary">Our Products</h1>
    <a type="button" href="/createProduct.jsp" class="btn btn-success">Create new Product</a>
</div>
<div class="container mt-3">
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>IMAGE</th>
            <th>PRICE</th>
            <th>EDIT</th>
            <th>DELETE</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sanphams}" var="sp">
            <tr>
                <td>${sp.id}</td>
                <td>${sp.name}</td>
                <td><img src="${sp.img}" height="200" width="350" alt="car"></td>
                <td>${sp.price}</td>
                <td><a type="button" href="/edit?id=${sp.id}" class="btn btn-warning">Edit</a></td>
                <td><a type="button" href="#" onclick="showMess(${sp.id})" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<!-- furnitures section end -->
<!-- footer section start -->
<div class="footer_section layout_padding">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-sm-6">
                <div class="fooer_logo"><img src="images/footer-logo.png"></div>
                <p class="footer_lorem_text">There are many variat
                    ions of passages of L
                    orem Ipsum available
                    , but the majority h
                    ave suffered altera
                    tion in some form, by
                </p>
            </div>
            <div class="col-lg-3 col-sm-6">
                <h1 class="customer_text">LET US HELP YOU</h1>
                <p class="footer_lorem_text">There are many variat
                    ions of passages of L
                    orem Ipsum available
                    , but the majority h
                    ave suffered altera
                    tion in some form, by
                </p>
            </div>
            <div class="col-lg-3 col-sm-6">
                <h1 class="customer_text">INFORMATION</h1>
                <p class="footer_lorem_text1">About Us<br>
                    Careers<br>
                    Sell on shopee<br>
                    Press & News<br>
                    Competitions<br>
                    Terms & Conditions
                </p>
            </div>
            <div class="col-lg-3 col-sm-6">
                <h1 class="customer_text">OUR Design</h1>
                <p class="footer_lorem_text">There are many variat
                    ions of passages of L
                    orem Ipsum available
                    , but the majority h
                    ave suffered altera
                    tion in some form, by
                </p>
            </div>
        </div>
        <div class="input-group mb-3">
            <input type="text" class="form-control" placeholder="Enter your email" aria-label="Enter your email" aria-describedby="basic-addon2">
            <div class="input-group-append">
                <span class="input-group-text" id="basic-addon2"><a href="#">Subscribe</a></span>
            </div>
        </div>
    </div>
</div>
<!--  footer section end -->
<!-- copyright section start -->
<div class="copyright_section">
    <div class="container">
        <div class="social_icon">
            <ul>
                <li><a href="#"><img src="images/fb-icon.png"></a></li>
                <li><a href="#"><img src="images/twitter-icon.png"></a></li>
                <li><a href="#"><img src="images/instagram-icon.png"></a></li>
                <li><a href="#"><img src="images/linkedin-icon.png"></a></li>
            </ul>
        </div>
        <p class="copyright_text">2020 All Rights Reserved. Design by <a href="https://html.design">Free html  Templates</a></p>
    </div>
</div>
    <!-- copyright section end -->
    <!-- Javascript files-->
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
    <script src="js/jquery-3.0.0.min.js"></script>
    <script src="js/plugin.js"></script>
    <!-- sidebar -->
    <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/custom.js"></script>
    <!-- javascript -->
    <script src="js/owl.carousel.js"></script>
    <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
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