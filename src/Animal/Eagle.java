package Animal;

public class Eagle extends FlyableAnimal implements FlyableInterface{
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying...");
    }
}
