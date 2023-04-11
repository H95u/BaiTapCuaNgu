package Product;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManage productManage = new ProductManage();
        System.out.println("Menu");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Tìm sản phẩm theo tên ");
            System.out.println("2. Tính tổng giá các sản phẩm ");
            System.out.println("3. Sửa sản phẩm theo mã ");
            System.out.println("4. Xóa sản phẩm theo mã ");
            System.out.println("5. Thêm sản phẩm mới ");
            System.out.println("6. Hiển thị tất cả sản phẩm ");
            System.out.println("0. Thoát ");
            System.out.println("Mời nhập vào lựa chọn của bạn : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    productManage.findByName();
                    break;
                case 2:
                    productManage.getTotalPrice();
                    break;
                case 3:
                    System.out.println("Mời nhập vào ID bạn muốn sửa :");
                    int editID = Integer.parseInt(scanner.nextLine());
                    boolean checkEditID = productManage.checkInputIndex(editID);
                    if (checkEditID) {
                        int indexEdit = productManage.getIndex(editID);
                        productManage.editProduct(indexEdit);
                    } else {
                        System.out.println("Không tìm thấy id này");
                    }
                    break;
                case 4:
                    System.out.println("Mời bạn nhập vào mã ID sản phẩm mà bạn muốn xóa : ");
                    int deleteID = scanner.nextInt();
                    boolean checkDeleteID = productManage.checkInputIndex(deleteID);
                    if (checkDeleteID) {
                        productManage.deleteProduct(deleteID);
                    } else {
                        System.out.println("Không tìm thấy id này");
                    }
                    break;
                case 5:
                    productManage.addNewProduct();
                    break;
                case 6:
                    productManage.showAllProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
