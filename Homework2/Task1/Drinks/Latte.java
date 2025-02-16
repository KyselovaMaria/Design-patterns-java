package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

public class Latte extends Drink{
    public Latte(double sugar) {
        this.ingredients.put(Ingredient.COFFEE, 0.011);
        this.ingredients.put(Ingredient.WATER, 0.04);
        this.ingredients.put(Ingredient.MILK, 0.18);
        this.ingredients.put(Ingredient.SUGAR, sugar);
        this.sellingPrice = 30;
    }
}
