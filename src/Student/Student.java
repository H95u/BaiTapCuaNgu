import java.util.Scanner;

public class Student {
    String name;
    int age;
    double mathPoint;
    double physicPoint;
    double chemPoint;
    static Scanner scanner = new Scanner(System.in);

    public Student() {
    }

    public Student(String name, int age, double mathPoint, double physicPoint, double chemPoint) {
        this.name = name;
        this.age = age;
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemPoint = chemPoint;
    }

    public static Student createStudent() {
        System.out.println("Nhập vào tên của hs :");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi của hs :");
        int age = scanner.nextInt();
        System.out.println("Nhập vào điểm toán :");
        double mathPoint = scanner.nextDouble();
        System.out.println("Nhập vào điểm lý :");
        double physicPoint = scanner.nextDouble();
        System.out.println("Nhập vào điểm hóa :");
        double chemPoint = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, mathPoint, physicPoint, chemPoint);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysicPoint() {
        return physicPoint;
    }

    public void setPhysicPoint(double physicPoint) {
        this.physicPoint = physicPoint;
    }

    public double getChemPoint() {
        return chemPoint;
    }

    public void setChemPoint(double chemPoint) {
        this.chemPoint = chemPoint;
    }

    public double getAverage() {
        return (mathPoint + chemPoint + physicPoint) / 3;
    }

    @Override
    public String toString() {
        return "Họ và tên : '" + name + '\'' +
                ", Tuổi : " + age +
                ", mathPoint=" + mathPoint +
                ", physicPoint=" + physicPoint +
                ", chemPoint=" + chemPoint;
    }
}
