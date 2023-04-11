package Animal;

public class Dog extends UnflyableAnimal implements UnflyableInterface {
    @Override
    void swim() {
        System.out.println("Dog is swimming...");
    }

    @Override
    public void unflyable() {
        System.out.println("Dog cant fly...");
    }
}
