package Product;

import java.util.Scanner;

public class ProductManage {
    private Product[] productArr;
    static Scanner scanner = new Scanner(System.in);

    public ProductManage() {
        System.out.println("Nhập vào số lượng sản phẩm bạn muốn thêm : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        Product[] products = new Product[size];
        for (int i = 0; i < products.length; i++) {
            products[i] = createNewProduct();
        }
        productArr = products;
        showAllProduct();
    }

    public Product[] getProductArr() {
        return productArr;
    }

    public void setProductArr(Product[] productArr) {
        this.productArr = productArr;
    }

    public Product createNewProduct() {
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

    public void findByName() {
        System.out.println("Mời bạn nhập vào tên bạn muốn tìm ");
        String name = scanner.nextLine();
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getName().contains(name)) {
                System.out.println("Sản phẩm tìm được : " + productArr[i].toString());
            }
        }
    }

    public void getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < productArr.length; i++) {
            sum += productArr[i].getPrice();
        }
        System.out.println("Tổng giá các sản phẩm là : " + sum + " " + Product.getTypeOfMoney());
    }

    public void addNewProduct() {
        Product newProduct = createNewProduct();
        Product[] newProductArr = new Product[productArr.length + 1];
        System.arraycopy(productArr, 0, newProductArr, 0, productArr.length);
        newProductArr[newProductArr.length - 1] = newProduct;
        productArr = newProductArr;
        showAllProduct();
    }

    public void showAllProduct() {
        for (Product product : productArr) {
            System.out.println(product);
        }
    }

    public boolean checkInputIndex(int id) {
        for (Product product : productArr) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void editProduct(int index) {
        System.out.println("Nhập vào tên mới");
        productArr[index].setName(scanner.nextLine());
        System.out.println("Nhập vào giá mới");
        productArr[index].setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập vào loại sản phẩm mới");
        productArr[index].setType(scanner.nextLine());
        showAllProduct();
    }

    public int getIndex(int editID) {
        int index = 0;
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getId() == editID) {
                index = i;
            }
        }
        return index;
    }

    public void deleteProduct(int deleteID) {
        Product[] newProductArr = new Product[productArr.length - 1];
        int j = 0;
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getId() != deleteID) {
                newProductArr[j] = productArr[i];
                j++;
            }
        }
        productArr = newProductArr;
        showAllProduct();
    }
}
