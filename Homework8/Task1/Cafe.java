package Homework8.Task1;

public class Cafe {

    public static void main(String[] args) {
        Chocolate blackChocolate = new Chocolate(3, new Water(200));
        Coffee blackCoffee = new Coffee(3, new Water(200), true);
        Tee blackTee = new Tee(0, new Water(300));

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTee);

        Chocolate milkChocolate = new Chocolate(3, new Milk(200));
        Coffee coffeeWithMilk = new Coffee(3, new Milk(200),false);
        Tee teeWithMilk = new Tee(2, new Milk(300));

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}