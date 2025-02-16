package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

public class Americano extends Drink{
    public Americano(double sugar) {
        this.ingredients.put(Ingredient.COFFEE, 0.010);
        this.ingredients.put(Ingredient.WATER, 0.15);
        this.ingredients.put(Ingredient.SUGAR, sugar);
        this.sellingPrice = 22;
    }
}
