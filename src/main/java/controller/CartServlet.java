package controller;

import Model.Product;
import dao.CRUD_Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/cart")
public class CartServlet extends HttpServlet {
    List<Product> productsCart;

    @Override
    public void init() {
        productsCart = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        int id = Integer.parseInt(req.getParameter("id"));

        if (action == null){
            action = "";
        }
        switch (action) {
            case "delete":
                for(int i = 0; i<productsCart.size(); i++) {
                    if (productsCart.get(i).getId() ==  id){
                        productsCart.remove(i);
                        break;
                    }
                }
                req.setAttribute("carts", productsCart);
                req.setAttribute("total", getTotal());
                RequestDispatcher dispatcher1 = req.getRequestDispatcher("/cart.jsp");
                dispatcher1.forward(req,resp);
                break;
            default:
                Product product = CRUD_Product.findById(id);
                if(product != null){
                    if (product.getStatus() == 1){
                        productsCart.add(product);
                    }
                }
                req.setAttribute("carts", productsCart);
                req.setAttribute("total", getTotal());
                RequestDispatcher dispatcher = req.getRequestDispatcher("/cart.jsp");
                dispatcher.forward(req,resp);
        }
    }

    public double getTotal(){
        double sum = 0;
        for (Product p: productsCart) {
            sum += p.getPrice();
        }
        return sum;
    }
}
