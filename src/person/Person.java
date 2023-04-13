package person;

import java.util.Comparator;

public class Person implements Comparable<Person>,Comparator<Person> {
    private static int idTemp = 1;
    private int id;
    private String name;
    private int age;
    private Address address;

    public Person() {
        this.id = idTemp++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, int age, Address address) {
        this.id = idTemp++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.getAddress() +
                '}';
    }

    @Override
    public int compareTo(Person o) {
       return name.compareTo(o.getName());
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getId() > o2.getId()) return 1;
        if (o1.getId() < o2.getId()) return -1;
        else return 0;
    }
}
