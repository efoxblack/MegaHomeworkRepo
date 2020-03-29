package animals;

public class Wolf extends Canine {

    @Override
    public void makeNoise() {
        System.out.println("Howl!");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }
}
