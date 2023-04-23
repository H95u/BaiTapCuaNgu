import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Algorithm algorithm = new Algorithm();
        int choice;
        do {
            System.out.println("---------MENU----------");
            System.out.println("1. Giải pt bậc 1");
            System.out.println("2. Giải pt bậc 2");
            System.out.println("0. Thoát");
            System.out.println("Mời nhập vào lựa chọn");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        algorithm.ptBac1();
                        break;
                    case 2:
                        algorithm.ptBac2();
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }

        } while (true);
    }
}
