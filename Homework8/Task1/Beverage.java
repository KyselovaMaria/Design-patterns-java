package Homework8.Task1;

public abstract class Beverage {


    protected final int sugar;
    protected final Filler additive;


    public Beverage(int sugar, Filler additive) {
        this.sugar = sugar;
        this.additive = additive;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();
}