package animals;

public class Tiger extends Feline {

    @Override
    public void makeNoise() {
        System.out.println("Roar!");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }
}
