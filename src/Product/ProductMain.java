package Product;

import java.util.Scanner;

public class ProductMain {
    static Scanner scanner = new Scanner(System.in);

    public static Product createNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào tên sản phẩm : ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào giá của sản phẩm : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vào loại sản phẩm : ");
        String type = scanner.nextLine();
        return new Product(name, price, type);
    }

    public static void editProduct(Product[] productArr, int index) {
        System.out.println("Nhập vào tên mới");
        productArr[index].setName(scanner.nextLine());
        System.out.println("Nhập vào giá mới");
        productArr[index].setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập vào loại sản phẩm mới");
        productArr[index].setName(scanner.nextLine());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩm bạn muốn thêm : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        Product[] productArr = new Product[size];
        for (int i = 0; i < productArr.length; i++) {
            productArr[i] = createNewProduct();
        }
        for (Product product : productArr) {
            System.out.println(product.toString());
        }
        System.out.println("Menu");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Tìm sản phẩm theo tên ");
            System.out.println("2. Tính tổng giá các sản phẩm ");
            System.out.println("3. Sửa sản phẩm theo mã ");
            System.out.println("4. Xóa sản phẩm theo mã ");
            System.out.println("5. Thêm sản phẩm mới ");
            System.out.println("0. Thoát ");
            System.out.println("Mời nhập vào lựa chọn của bạn : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập vào tên bạn muốn tìm ");
                    String name = scanner.nextLine();
                    for (int i = 0; i < productArr.length; i++) {
                        if (productArr[i].getName().equalsIgnoreCase(name)) {
                            System.out.println("Sản phẩm tìm được : " + productArr[i].toString());
                        }
                    }
                    break;
                case 2:
                    double sum = 0;
                    for (int i = 0; i < productArr.length; i++) {
                        sum += productArr[i].getPrice();
                    }
                    System.out.println("Tổng giá các sản phẩm là : " + sum + " " + Product.getTypeOfMoney());
                    break;
                case 3:
                    System.out.println("Mời bạn nhập vào mã ID sản phẩm mà bạn muốn sửa : ");
                    int editID = scanner.nextInt();
                    int editIndex = 0;
                    for (int i = 0; i < productArr.length; i++) {
                        if (editID == productArr[i].getId()) {
                            editIndex = i;
                        }
                    }
                    editProduct(productArr, editIndex);
                    for (int i = 0; i < productArr.length; i++) {
                        System.out.println(productArr[i].toString());
                    }
                    break;
                case 4:
                    System.out.println("Mời bạn nhập vào mã ID sản phẩm mà bạn muốn xóa : ");
                    int deleteID = scanner.nextInt();
                    Product[] newProductArr = new Product[productArr.length - 1];
                    int j = 0;
                    for (int i = 0; i < productArr.length; i++) {
                        if (productArr[i].getId() != deleteID) {
                            newProductArr[j] = productArr[i];
                            j++;
                        }
                    }
                    productArr = newProductArr;
                    System.out.println("Danh sách sản phẩm sau khi xóa : ");
                    for (int i = 0; i < productArr.length; i++) {
                        System.out.println(productArr[i].toString());
                    }
                    break;
                case 5:
                    Product[] addProductArr = new Product[productArr.length + 1];
                    System.arraycopy(productArr, 0, addProductArr, 0, productArr.length);
                    addProductArr[addProductArr.length - 1] = createNewProduct();
                    productArr = addProductArr;
                    for (Product product : productArr) {
                        System.out.println(product);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
