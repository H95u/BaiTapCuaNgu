package phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBookManage phoneBookManage = new PhoneBookManage();
        int choice;
        do {
            System.out.println("MENU-------------");
            System.out.println("1. Display all contact");
            System.out.println("2. Insert contact");
            System.out.println("3. Remove contact");
            System.out.println("4. Update contact");
            System.out.println("5. Search contact by name");
            System.out.println("6. Sort contact by name");
            System.out.println("0. Exit");
            System.out.println("Mời nhập vào lựa chọn của bạn ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    phoneBookManage.displayAll();
                    break;
                case 2:
                    phoneBookManage.insertPhone();
                    break;
                case 3:
                    System.out.println("Mời nhập vào tên");
                    String name = scanner.nextLine();
                    phoneBookManage.removePhone(name);
                    break;
                case 4:
                    System.out.println("Mời nhập vào vị trí muốn sửa ");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.println("mời nhập vào tên");
                    String nameUpdate = scanner.nextLine();
                    System.out.println("mời nhập vào phone");
                    String phone = scanner.nextLine();
                    phoneBookManage.updatePhone(index,nameUpdate,phone);
                    break;
                case 5:
                    System.out.println("Mời nhập vào tên");
                    String nameSearch = scanner.nextLine();
                    phoneBookManage.searchPhone(nameSearch);
                    break;
                case 6:
                    phoneBookManage.sort();
                    phoneBookManage.displayAll();
                    break;
            }
        } while (choice != 0);
    }
}
