package Employee;

public class TestEmployees {
    public static void main(String[] args) {
        FullTime employee1 = new FullTime(1,"Hieu",28,3);
        FullTime employee2 = new FullTime(2,"Minh",31,2);
        PartTime employee3 = new PartTime(3,"Lam",28,100);
        PartTime employee4 = new PartTime(4,"Duong",22,120);
        Employee[] employees = {employee1,employee2,employee3,employee4};

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTime){
                ((FullTime) employees[i]).salary = ((FullTime) employees[i]).getSalary();
                System.out.println(employees[i]);
            }
            if (employees[i] instanceof PartTime){
                ((PartTime) employees[i]).salary = ((PartTime) employees[i]).getSalary();
                System.out.println(employees[i]);
            }
        }
    }
}
