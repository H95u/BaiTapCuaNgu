package Animal;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Penguin penguin = new Penguin();
        Eagle eagle = new Eagle();
        System.out.println("Dog : ");
        dog.eat();
        dog.unflyable();
        dog.swim();
        System.out.println("Penguin :");
        penguin.eat();
        penguin.unflyable();
        penguin.swim();
        System.out.println("Eagle :");
        eagle.eat();
        eagle.fly();
    }
}
