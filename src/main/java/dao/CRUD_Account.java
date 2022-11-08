package dao;

import Model.Account;
import Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CRUD_Account {
    static Connection connection = Connect_MySql.getConnect();

    public static List<Account> getAll(){
        String sql = "Select * from accounts";
        List<Account> accounts = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String address = resultSet.getString("address");
                Date birthday = resultSet.getDate("birthday");
                accounts.add(new Account(id,email,password,address, (java.sql.Date) birthday));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return accounts;
    }

    public static void addAccount(String email, String password, String address, String birthday) {
        String sql = "insert into accounts(email, password, address, birthday,id_role) value(?,?,?,?,2)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, birthday);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
            String sql = "update products set name = ?, img = ?, price =? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getImg());
            preparedStatement.setDouble(3,product.getPrice());
            preparedStatement.setInt(4,product.getId());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
