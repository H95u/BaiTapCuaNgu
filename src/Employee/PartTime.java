package Employee;


public class PartTime extends Employee {
    public int workTime;

    public PartTime() {
    }

    public PartTime(int id, String name, int age, int workTime) {
        super(id, name, age);
        this.workTime = workTime;
    }

    public PartTime(Employee employee, int workTime) {
        super(employee.getId(), employee.getName(), employee.getAge());
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

}
