package Service;

import Model.Product;
import Model.Status;
import dao.CRUD_Product;
import dao.StatusDAO;

import java.util.List;

public class StatusService {
    public static List<Status> liststatus = StatusDAO.getAll();
}
