package Service;

import Model.Product;
import dao.CRUD_Product;

import java.util.List;

public class ProductService {
    public static List<Product> products = CRUD_Product.getAll();

    public static void add(Product product){
        CRUD_Product.save(product);
        products = CRUD_Product.getAll();
    }

    public static void edit(Product product){
        CRUD_Product.edit(product);
        products = CRUD_Product.getAll();
    }

    public static void delete(int id){
        CRUD_Product.delete(id);
        products = CRUD_Product.getAll();
    }
}
