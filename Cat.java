public class Cat extends Animal{
    public static final int MAX_LIVES = 9;
    private static int catCount =0;
    String name;
    int age;
    int livesRemaining;

    public void meow(){
        System.out.println("Meow");
    }


    public Cat(){
        super();
        catCount++;
        livesRemaining = MAX_LIVES;
        System.out.println("A new Cat has been created. Total animals: " + Animal.getAnimalCount());
    }


    public static int getCatCount(){
        return catCount;
    }
}
