package Animal;

public class Penguin extends UnflyableAnimal implements UnflyableInterface{
    @Override
    public void eat() {
        System.out.println("Penguin is eating...");
    }

    @Override
    void swim() {
        System.out.println("Penguin is swimming...");
    }

    @Override
    public void unflyable() {
        System.out.println("Penguin cant fly...");
    }
}
