package Animal;

public abstract class UnflyableAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("im eating...");
    }
   abstract void swim();
}
