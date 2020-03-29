package animals;

public class AnimalPolyMorphism {
    public static void main(String[] args) {
        // Dog myDog = new Dog();
        // Animal myDog = new Dog();
        // These two initializations do the same thing

        Animal[] animals = new Animal[5];
        animals [0] = new Dog();
        animals [1] = new Cat();
        animals [2] = new Wolf();
        animals [3] = new Hippo();
        animals [4] = new Lion();

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();

            animals[i].roam();
        }
    }
}
