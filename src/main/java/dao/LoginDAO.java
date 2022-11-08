package dao;

import Model.Account;

import java.sql.*;

public class LoginDAO {
    public static Account login(String email, String password) {
        try {
            String sql = "select * from accounts where email = ? and password = ?";
            Connection connection = Connect_MySql.getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            Account account = null;
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String email1 = resultSet.getString("email");
                String password1 = resultSet.getString("password");
                String address = resultSet.getString("address");
                Date birthday = resultSet.getDate("birthday");
                int id_role = resultSet.getInt("id_role");
                account = new Account(id, email1, password1, address, birthday, id_role);
            }
            return account;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}
