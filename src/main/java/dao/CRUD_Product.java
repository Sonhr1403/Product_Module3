package dao;



import Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Product {
    static Connection connection = Connect_MySql.getConnect();

    public static List<Product> getAll(){
        String sql = "Select * from products";
        List<Product> products = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String img = resultSet.getString("img");
                double price = resultSet.getDouble("price");
                String status = resultSet.getString("status");
                products.add(new Product(id,name,img, price,status));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    public static void save(Product product){
        try {
            String sql = "insert into products(name, img, price,status) value (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getImg());
            preparedStatement.setDouble(3,product.getPrice());
            preparedStatement.setString(4, product.getStatus());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(int id){
        try {
            String sql = "delete from products where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            auto_desc(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void auto_i(int id){
        try {
            String sql = "alter table products auto_increment = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void auto_desc(int id){
        try{
            String sql = "select id from products where id > " + id;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            auto_i(id);
            while (resultSet.next()){
                int idsp = resultSet.getInt("id");
                auto_des1(idsp);
                auto_i(idsp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void auto_des1(int id){
        try {
            String sql1 = "update products set id = ? where id = ?";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, (id - 1));
            preparedStatement1.setInt(2,id);
            preparedStatement1.execute();
            auto_i(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void edit(Product product){
        try {
            String sql = "update products set name = ?, img = ?, price =?,status=? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getImg());
            preparedStatement.setDouble(3,product.getPrice());
            preparedStatement.setString(4, product.getStatus());
            preparedStatement.setInt(5,product.getId());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Product findById(int id) {
        try {
            String sql = "select * from products where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String img = resultSet.getString("img");
                double price = resultSet.getDouble("price");
                String status = resultSet.getString("status");
                return new Product(id1, name,img, price,status);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
