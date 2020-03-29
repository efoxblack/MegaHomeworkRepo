package animals;

public class Dog extends Canine {

    @Override
    public void makeNoise() {
        System.out.println("Woof woof");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }
}
