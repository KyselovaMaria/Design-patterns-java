package Homework2.Task1.Ingredients;

public enum Ingredient {
    COFFEE(250.0),
    WATER(1.2),
    MILK(15.0),
    SUGAR(1.5),
    TEABAG(3.0),
    FILTER(10.0);

    private final double price;
    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

}
