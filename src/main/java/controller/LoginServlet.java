package controller;

import Model.Account;
import dao.LoginDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/signInForm.jsp");
        requestDispatcher.forward(req,resp);
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        Account account = LoginDAO.login(email, password);
        if (account != null) {
            HttpSession session = req.getSession();
            session.setAttribute("account",account);
            if (account.getId_role() == 1) {
                resp.sendRedirect("/admin.jsp");
            } else {
                resp.sendRedirect("/user.jsp");
            }
        } else {
            resp.sendRedirect("/login");
        }
    }
}
