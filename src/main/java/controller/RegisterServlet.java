package controller;

import Model.Account;
import Service.AccountService;
import dao.CRUD_Account;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/registerForm.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String birthDay = req.getParameter("birthday");
        String password = req.getParameter("password");
        String password1 = req.getParameter("confirm_password");
        AccountService.add(email,password,address,birthDay);
        resp.sendRedirect("/signInForm.jsp");
    }
}
