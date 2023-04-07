import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng hs :");
        int size = scanner.nextInt();
        Student[] studentArr = new Student[size];
        for (int i = 0; i < studentArr.length; i++) {
            System.out.println("Nhập vào hs thứ " + (i + 1));
            studentArr[i] = Student.createStudent();
        }
        double max = studentArr[0].getAverage();
        int index = 0;
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getAverage() > max) {
                max = studentArr[i].getAverage();
                index = i;
            }
        }
        System.out.println("Học sinh có điểm TBC cao nhất là : " + studentArr[index].toString()
                + "\nCó điểm TBC là :" + studentArr[index].getAverage());
    }
}
