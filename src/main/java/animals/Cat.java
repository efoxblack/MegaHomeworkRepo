package animals;

public class Cat extends Feline {

    @Override
    public void makeNoise() {
        System.out.println("Meow meow");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }
}
