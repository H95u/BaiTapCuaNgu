package Product;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private String type;
    static String typeOfMoney = "USD";

    public Product() {
    }

    public Product(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
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
    public static Product createNewProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào id :");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời nhập vào tên sản phẩm : ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào giá của sản phẩm : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vào loại sản phẩm : ");
        String type = scanner.nextLine();
        return new Product(id,name,price,type);
    }
    public static void editProduct(Product product){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào tên mới ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào giá mới ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Mời nhập vào loại sản phẩm mới ");
        String type = scanner.nextLine();
        product.setName(name);
        product.setPrice(price);
        product.setType(type);
    }
}
