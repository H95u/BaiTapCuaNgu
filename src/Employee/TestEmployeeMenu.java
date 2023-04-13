package Employee;

import java.util.Arrays;
import java.util.Scanner;

public class TestEmployeeMenu {
    public static Employee addNewEmployee(Scanner scanner) {
        System.out.println("Mời nhập vào id của nhân viên ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập vào tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vào tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        return new Employee(id, name, age);
    }

    public static Employee[] addNewFullTime(Scanner scanner, Employee[] employeesArr) {
        Employee employee = addNewEmployee(scanner);
        System.out.println("Mời nhập vào số năm kinh nghiệm của nhân viên ");
        int yearOfExp = Integer.parseInt(scanner.nextLine());
        Employee newEmployee = new FullTime(employee, yearOfExp);
        Employee[] newEmployeeArr = new Employee[employeesArr.length + 1];
        System.arraycopy(employeesArr, 0, newEmployeeArr, 0, employeesArr.length);
        newEmployeeArr[newEmployeeArr.length - 1] = newEmployee;
        return newEmployeeArr;
    }

    public static void editFullTime(Employee employee, Scanner scanner) {
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

    public static Employee[] addNewPartTime(Scanner scanner, Employee[] employeesArr) {
        Employee employee = addNewEmployee(scanner);
        System.out.println("Mời nhập vào số giờ làm của nhân viên ");
        int workTime = Integer.parseInt(scanner.nextLine());
        Employee newEmployee = new PartTime(employee, workTime);
        Employee[] newEmployeeArr = new Employee[employeesArr.length + 1];
        System.arraycopy(employeesArr, 0, newEmployeeArr, 0, employeesArr.length);
        newEmployeeArr[newEmployeeArr.length - 1] = newEmployee;
        return newEmployeeArr;
    }

    public static void editPartTime(Employee employee, Scanner scanner) {
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

    public static void showFullTime(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee instanceof FullTime) {
                System.out.println(employee);
            }
        }
    }

    public static void showPartTime(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee instanceof PartTime) {
                System.out.println(employee);
            }
        }
    }

    public static void showAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static boolean checkInputID(int ID, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getId() == ID) {
                return true;
            }
        }
        return false;
    }

    public static Employee[] deleteEmployee(int ID, Employee[] employees) {
        Employee[] deleteArr = new Employee[employees.length - 1];
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() != ID) {
                deleteArr[index] = employees[i];
                index++;
            }
        }
        return deleteArr;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FullTime employee1 = new FullTime(1, "Hieu", 28, 3);
        FullTime employee2 = new FullTime(2, "Minh", 31, 2);
        PartTime employee3 = new PartTime(3, "Lam", 28, 100);
        PartTime employee4 = new PartTime(4, "Duong", 22, 120);
        Employee[] employeesArr = {employee1, employee2, employee3, employee4};
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1.Hiển thị nhân viên fulltime");
            System.out.println("2.Hiển thị nhân viên parttime");
            System.out.println("3.Thêm nhân viên mới ");
            System.out.println("4.Xóa nhân viên ");
            System.out.println("5.Sửa nhân viên ");
            System.out.println("6.Sắp xếp nhân viên ");
            System.out.println("0.Thoát");
            System.out.println(" Mời nhập vào lựa chọn của bạn : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showFullTime(employeesArr);
                    break;
                case 2:
                    showPartTime(employeesArr);
                    break;
                case 3:
                    int myChoice;
                    do {
                        System.out.println("1.Thêm nhân viên fulltime");
                        System.out.println("2.Thêm nhân viên parttime");
                        System.out.println("0.Back");
                        myChoice = Integer.parseInt(scanner.nextLine());
                        switch (myChoice) {
                            case 1:
                                employeesArr = addNewFullTime(scanner, employeesArr);
                                showAllEmployee(employeesArr);
                                break;
                            case 2:
                                employeesArr = addNewPartTime(scanner, employeesArr);
                                showAllEmployee(employeesArr);
                                break;
                        }
                    } while (myChoice != 0);
                    break;
                case 4:
                    System.out.println("Mời nhập vào id employee bạn muốn xóa");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    boolean check = checkInputID(deleteID, employeesArr);
                    if (check) {
                        employeesArr = deleteEmployee(deleteID, employeesArr);
                        showAllEmployee(employeesArr);
                    } else {
                        showAllEmployee(employeesArr);
                    }
                    break;
                case 5:
                    System.out.println("Mời nhập vào id employee mà bạn muốn sửa :");
                    int editID = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeesArr.length; i++) {
                        if (employeesArr[i].getId() == editID) {
                            if (employeesArr[i] instanceof FullTime) {
                                editFullTime(employeesArr[i], scanner);
                            } else {
                                editPartTime(employeesArr[i], scanner);
                            }
                        }
                    }
                    showAllEmployee(employeesArr);
                    break;
                case 6:
                    Arrays.sort(employeesArr);
                    for (Employee employee : employeesArr) {
                        System.out.println(employee);
                    }
                    break;
            }
        } while (choice != 0);
    }
}
