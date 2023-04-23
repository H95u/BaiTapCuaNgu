import java.util.Scanner;

public class Algorithm {
    static Scanner scanner = new Scanner(System.in);

    public void ptBac1() {
        try {
            System.out.println("Nhập a");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập b");
            double b = Double.parseDouble(scanner.nextLine());
            if (a != 0) {
                double x = -b / a;
                System.out.println("pt co nghiem là " + x);
            } else if (b != 0) System.out.println("pt vô nghiệm");
            else System.out.println("Pt vô số nghiệm");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi :" + e.getMessage());
        }
    }

    public void ptBac2() {
        try {
            System.out.println("Nhập a");
            double a = Double.parseDouble(scanner.nextLine());
            if (a == 0) {
                throw new Exception("Phải nhập a khác 0");
            }
            System.out.println("Nhập b");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập c");
            double c = Double.parseDouble(scanner.nextLine());
            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Pt vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Pt có nghiệm kép " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta) / (2 * a));
                double x2 = (-b - Math.sqrt(delta) / (2 * a));
                System.out.println("Pt có 2 nghiệm x1 = " + x1 + ", x2 = " + x2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
