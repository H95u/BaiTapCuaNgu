package Employee;

public class FullTime extends Employee {
   public int yearsOfExp;
   public double salary;

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
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
