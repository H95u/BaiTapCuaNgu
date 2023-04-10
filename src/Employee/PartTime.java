package Employee;

import java.util.Scanner;

public class PartTime extends Employee {
    public int workTime;

    public PartTime() {
    }

    public PartTime(int id, String name, int age, int workTime) {
        super(id, name, age);
        this.workTime = workTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public double getSalary() {
        return getWorkTime() * 25000;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "workTime=" + workTime +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    static PartTime addNewPartTime(){
        System.out.println("Mời nhập vào tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập vào tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào id của nhân viên ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập vào số giờ làm của nhân viên ");
        int workTime = Integer.parseInt(scanner.nextLine());
        return new PartTime(id,name,age,workTime);
    }
    static void editPartTime(Employee employee){
        System.out.println("Mời nhập vào tên mới ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào tuổi mới ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số giờ làm ");
        int workTime = Integer.parseInt(scanner.nextLine());
        employee.setName(name);
        employee.setAge(age);
        employee.setWorkTime(workTime);
    }
}
