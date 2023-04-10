package Employee;

import java.util.Scanner;

public class FullTime extends Employee {
    public int yearsOfExp;


    public FullTime() {
    }

    public FullTime(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public FullTime(int id, String name, int age, int yearsOfExp) {
        super(id, name, age);
        this.yearsOfExp = yearsOfExp;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public double getSalary() {
        return getYearsOfExp() * 2000000;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "yearsOfExp=" + yearsOfExp +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static FullTime addNewFullTime() {
        System.out.println("Mời nhập vào tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập vào tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào id của nhân viên ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập vào số năm kinh nghiệm của nhân viên ");
        int yearOfExp = Integer.parseInt(scanner.nextLine());
        return new FullTime(id, name, age, yearOfExp);
    }

    static void editFullTime(Employee employee) {
        System.out.println("Mời nhập vào tên mới ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào tuổi mới ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số năm kinh nghiệm ");
        int yearOfExp = Integer.parseInt(scanner.nextLine());
        employee.setName(name);
        employee.setAge(age);
        employee.setYearsOfExp(yearOfExp);
    }
}
