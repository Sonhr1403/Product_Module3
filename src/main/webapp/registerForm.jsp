<%--
  Created by IntelliJ IDEA.
  User: My PC
  Date: 11/1/2022
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background: #007bff;
            background: linear-gradient(to right, #0062E6, #33AEFF);
        }

        .card-img-left {
            width: 45%;
            /* Link to your background image using in the property below! */
            background: scroll center url('https://source.unsplash.com/WEQbe2jBg40/414x512');
            background-size: cover;
        }

        .btn-login {
            font-size: 0.9rem;
            letter-spacing: 0.05rem;
            padding: 0.75rem 1rem;
        }

        .btn-google {
            color: white !important;
            background-color: #ea4335;
        }

        .btn-facebook {
            color: white !important;
            background-color: #3b5998;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-10 col-xl-9 mx-auto">
            <div class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
                <div class="card-img-left d-none d-md-flex">
                    <!-- Background image for card set in CSS! -->
                </div>
                <div class="card-body p-4 p-sm-5">
                    <h5 class="card-title text-center mb-5 fw-light fs-5">Register</h5>
                    <form method="post" action="/register">

                        <div class="form-floating mb-3">
                            <input type="email" name="email" class="form-control" id="floatingInputEmail" placeholder="name@example.com">
                            <label for="floatingInputEmail">Email address</label>
                        </div>

                        <div class="form-floating mb-3">
                            <input type="text" name="address" class="form-control" id="floatingInputAddress" placeholder="myaddress" required autofocus>
                            <label for="floatingInputAddress">Address</label>
                        </div>

                        <div class="form-floating mb-3">
                            <input type="date" name="birthday" class="form-control" id="floatingInputBirthday" placeholder="myaddress" required autofocus>
                            <label for="floatingInputBirthday">Birthday</label>
                        </div>

                        <hr>

                        <div class="form-floating mb-3">
                            <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
                            <label for="floatingPassword">Password</label>
                        </div>

                        <div class="form-floating mb-3">
                            <input type="password" name="confirm_pass" class="form-control" id="floatingPasswordConfirm" placeholder="Confirm Password">
                            <label for="floatingPasswordConfirm">Confirm Password</label>
                        </div>

                        <div class="d-grid mb-2">
                            <button class="btn btn-lg btn-primary btn-login fw-bold text-uppercase" type="submit">Register</button>
                        </div>

                        <a class="d-block text-center mt-2 small" href="/signInForm.jsp">Have an account? Sign In</a>

                        <hr class="my-4">

                        <div class="d-grid mb-2">
                            <button class="btn btn-lg btn-google btn-login fw-bold text-uppercase" type="submit">
                                <i class="fab fa-google me-2"></i> Sign up with Google
                            </button>
                        </div>

                        <div class="d-grid">
                            <button class="btn btn-lg btn-facebook btn-login fw-bold text-uppercase" type="submit">
                                <i class="fab fa-facebook-f me-2"></i> Sign up with Facebook
                            </button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
