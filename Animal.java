public class Animal {
    protected static int animalCount = 0;

    public Animal() {
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }

    public static void main(String[] args) {
        System.out.println("Initial number of animals: " + Animal.getAnimalCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println(Cat.MAX_LIVES);

        Dog myDog = new Dog();
        myDog.bark();
        myDog.name = "Rexy";
        myDog.age = 13;

        System.out.println("Final number of animals: " + Animal.getAnimalCount());
    }
}