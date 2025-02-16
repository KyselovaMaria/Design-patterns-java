package Homework2.Task1.Tools;

import Homework2.Task1.Drinks.*;

public class CoffeeMachine implements Tool{

    @Override
    public Drink makeDrink(DrinksType drinkType, double sugar) {
        Drink drink;
        if(drinkType== CoffeeMachineDrinks.LATTE) {
            drink = new Latte(sugar);
            System.out.println("Latte is ready,"+ drink.getSellingPrice() +" hryvnias from you");
            return drink;
        } else if (drinkType==CoffeeMachineDrinks.AMERICANO) {
            drink = new Americano(sugar);
            System.out.println("Americano is ready,"+ drink.getSellingPrice() +" hryvnias from you");
            return drink;
        } else if (drinkType==CoffeeMachineDrinks.ESPRESSO) {
            drink = new Espresso(sugar);
            System.out.println("Espresso is ready," + drink.getSellingPrice() + " hryvnias from you");
            return drink;
        } else if (drinkType==CoffeeMachineDrinks.CAPPUCCINO) {
            drink = new Cappuccino(sugar);
            System.out.println("Cappuccino is ready," + drink.getSellingPrice() + " hryvnias from you");
            return drink;
        }else {
            throw new IllegalStateException("Unknown drink");
        }
    }
}
