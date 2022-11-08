package controller;

import java.io.*;

import Service.ProductService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/products")
public class ProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("sanphams", ProductService.products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/showProduct.jsp");
        dispatcher.forward(request,response);
//        RequestDispatcher dispatcher1 = request.getRequestDispatcher("/shopadmin.jsp");
//        dispatcher1.forward(request,response);
//        RequestDispatcher dispatcher2 = request.getRequestDispatcher("/shopuser.jsp");
//        dispatcher2.forward(request,response);
    }
}