package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

public class Tea extends Drink{
    public Tea(double sugar) {
        this.ingredients.put(Ingredient.TEABAG, 1.0);
        this.ingredients.put(Ingredient.WATER, 0.3);
        this.ingredients.put(Ingredient.SUGAR, sugar);
        this.sellingPrice = 18;
    }
}
