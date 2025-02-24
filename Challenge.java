public class Challenge {
    public static void main(String[] args) {
            DrinkOrder option1 = new DrinkOrder();
            option1.drinkName = "Peach Rebel";
            option1.drinkBase = "energy drink";
            option1.cost = 7.6;
            option1.sugarFree = true;
            option1.iced = true;


            DrinkOrder option2 = new DrinkOrder();
            option2.drinkName = "Strawberry Mocha Latte";
            option2.drinkBase = "coffee";
            option2.cost = 7.8;
            option2.sugarFree = false;
            option2.iced = true;


            System.out.println(option1.drinkName);
    }
}