package Animal;

public abstract class FlyableAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("im eating...");
    }
    abstract void fly();
}
