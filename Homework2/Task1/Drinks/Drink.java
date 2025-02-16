package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

import java.util.HashMap;
import java.util.Map;

public abstract class Drink implements Product {
    protected double sellingPrice;
    protected final HashMap<Ingredient, Double> ingredients = new HashMap<>();

    @Override
    public double getPrimePrice() {
        double price = 0;
        for (Map.Entry<Ingredient, Double> entry : ingredients.entrySet()) {
            price += entry.getKey().getPrice() * entry.getValue();
        }
        return price;
    }

    @Override
    public double getSellingPrice() {
        return sellingPrice;
    }

}
