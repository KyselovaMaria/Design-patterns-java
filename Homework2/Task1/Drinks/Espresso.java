package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

import java.util.Map;

public class Espresso extends Drink{

    public Espresso(double sugar) {
        this.ingredients.put(Ingredient.COFFEE, 0.010);
        this.ingredients.put(Ingredient.WATER, 0.025);
        this.ingredients.put(Ingredient.SUGAR, sugar);
        this.sellingPrice = 22;
    }


    @Override
    public double getPrimePrice() {
        double price = 0;
        for (Map.Entry<Ingredient, Double> entry: ingredients.entrySet()){
            price += entry.getKey().getPrice()*entry.getValue();
        }
        return price;
    }
}
