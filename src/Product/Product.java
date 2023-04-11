package Product;

import java.util.Scanner;

public class Product {
    private int id;
    private static int idtemp = 1;
    private String name;
    private double price;
    private String type;
    static String typeOfMoney = "USD";

    public Product() {
        this.id = idtemp++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(String name, double price, String type) {
        this.id = idtemp++;
        this.name = name;
        this.price = price;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String getTypeOfMoney() {
        return typeOfMoney;
    }

    public static void setTypeOfMoney(String typeOfMoney) {
        Product.typeOfMoney = typeOfMoney;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
