package animals;

public class Hippo extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("I make sounds similar to a dolphin when underwater!");
    }

    @Override
    public void eat() {
        System.out.println("I eat plants!");
    }
}
