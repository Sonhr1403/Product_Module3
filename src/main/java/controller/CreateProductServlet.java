package controller;

import Model.Product;
import Service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/create")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        double price = Double.parseDouble(req.getParameter("price"));
        ProductService.add(new Product(name, img, price, "còn hàng"));
        resp.sendRedirect("/products");
    }
}
