package Model;

public class Product {
    private int id;
    private String name;
    private String img;
    private double price;
    private String status;

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

    public Product(String name, String img, double price, String status) {
        this.name = name;
        this.img = img;
        this.price = price;
        this.status = status;
    }

    public Product(int id, String name, String img, double price, String status) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
