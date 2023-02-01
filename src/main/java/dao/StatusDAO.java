package dao;

import Model.Product;
import Model.Status;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatusDAO {
    static Connection connection = Connect_MySql.getConnect();

    public static List<Status> getAll(){
        String sql = "Select * from status";
        List<Status> liststatus = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt("id_status");
                String name = resultSet.getString("name");
                liststatus.add(new Status(id, name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return liststatus;
    }
}
