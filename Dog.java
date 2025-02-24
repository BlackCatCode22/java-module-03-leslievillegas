public class Dog extends Animal{
    private static int dogCount = 0;
    String name;
    int age;

    public void bark() {
        System.out.println("Woof");
    }


    public Dog() {
        super();
        dogCount++;
        System.out.println("New Dog has been created. Total animals: " + Animal.getAnimalCount());
    }


    public static int getDogCount() {
        return dogCount;
    }

}
