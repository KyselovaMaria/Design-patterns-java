package Homework2.Task1.Tools;

import Homework2.Task1.Drinks.Drink;

public interface Tool {
    Drink makeDrink(DrinksType drinkType, double sugar);
}
