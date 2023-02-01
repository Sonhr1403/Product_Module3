package Model;

public class Product {
    private int id;
    private String name;
    private String img;
    private double price;
    private int id_status;
    private String status_name;

    public Product(int id,String name, String img, double price, String status_name) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.status_name = status_name;
    }

    public Product(int id, String name, String img, double price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public Product(String name, String img, double price) {
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public Product(String name, String img, double price, int id_status) {
        this.name = name;
        this.img = img;
        this.price = price;
        this.id_status = id_status;
    }

    public Product(int id, String name, String img, double price, int id_status) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.id_status = id_status;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStatus() {
        return id_status;
    }

    public void setStatus(int id_status) {
        this.id_status = id_status;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }
}
