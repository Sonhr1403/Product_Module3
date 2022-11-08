package Service;

import Model.Account;
import Model.Product;
import dao.CRUD_Account;
import dao.CRUD_Product;

import java.util.List;

public class AccountService {
    public static List<Account> accounts = CRUD_Account.getAll();

    public static void add(String email, String password, String address, String birthday){
        CRUD_Account.addAccount(email,password,address,birthday);
        accounts = CRUD_Account.getAll();
    }

    public static void edit(Product product){
        CRUD_Account.edit(product);
        accounts = CRUD_Account.getAll();
    }

    public static void delete(int id){
        CRUD_Account.delete(id);
        accounts = CRUD_Account.getAll();
    }
}
