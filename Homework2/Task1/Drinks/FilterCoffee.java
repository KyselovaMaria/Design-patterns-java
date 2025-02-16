package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

public class FilterCoffee extends Drink{
    public FilterCoffee(double sugar) {
        this.ingredients.put(Ingredient.FILTER, 0.8);
        this.ingredients.put(Ingredient.WATER, 0.25);
        this.ingredients.put(Ingredient.SUGAR, sugar);
        this.sellingPrice = 28;
    }
}
