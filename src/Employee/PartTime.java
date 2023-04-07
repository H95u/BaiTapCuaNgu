package Employee;

public class PartTime extends Employee {
    public int workTime;
    public double salary;

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
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
