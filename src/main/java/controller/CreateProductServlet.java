package controller;

import Model.Product;
import Service.ProductService;
import Service.StatusService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/create")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        double price = Double.parseDouble(req.getParameter("price"));
        int id_status = Integer.parseInt(req.getParameter("id_status"));
        ProductService.add(new Product(name, img, price, id_status));
        resp.sendRedirect("/products");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list_status", StatusService.liststatus);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/createProduct.jsp");
        dispatcher.forward(req,resp);
    }
}
