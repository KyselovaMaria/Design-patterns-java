package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

public class Cappuccino extends Drink{
    public Cappuccino(double sugar) {
        this.ingredients.put(Ingredient.COFFEE, 0.018);
        this.ingredients.put(Ingredient.WATER, 0.08);
        this.ingredients.put(Ingredient.MILK, 0.15);
        this.ingredients.put(Ingredient.SUGAR, sugar);
        this.sellingPrice = 30;
    }
}
