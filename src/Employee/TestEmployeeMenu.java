package Employee;

import java.util.Scanner;

public class TestEmployeeMenu {
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
                    Employee[] newEmployeeArr = new Employee[employeesArr.length + 1];
                    int indexAdd = 0;
                    for (int i = 0; i < employeesArr.length; i++) {
                        newEmployeeArr[indexAdd] = employeesArr[i];
                        indexAdd++;
                    }
                    int myChoice;
                    do {
                        System.out.println("1.Thêm nhân viên fulltime");
                        System.out.println("2.Thêm nhân viên parttime");
                        System.out.println("3.Back");
                        myChoice = Integer.parseInt(scanner.nextLine());
                        switch (myChoice) {
                            case 1:
                                newEmployeeArr[newEmployeeArr.length - 1] = FullTime.addNewFullTime();
                                for (Employee employee : newEmployeeArr) {
                                    System.out.println(employee);
                                }
                                myChoice = 3;
                                break;
                            case 2:
                                newEmployeeArr[newEmployeeArr.length - 1] = PartTime.addNewPartTime();
                                for (Employee employee : newEmployeeArr) {
                                    System.out.println(employee);
                                }
                                myChoice = 3;
                                break;
                        }
                    } while (myChoice != 3);
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
                                FullTime.editFullTime(employeesArr[i]);
                            } else {
                                PartTime.editPartTime(employeesArr[i]);
                            }
                        }
                    }
                    showAllEmployee(employeesArr);
                    break;
            }
        } while (choice != 0);
    }
}
