package Employee;

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

    public FullTime(Employee employee, int yearOfExp) {
        super(employee.getId(),employee.getName(),employee.getAge());
        this.yearsOfExp = yearOfExp;
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

}
