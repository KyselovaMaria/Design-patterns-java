package task10_3_2.addons;

import task10_3_2.beverage.Beverage;

public class Milk extends Addon{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description(){
        return super.description() + " with milk";
    }

    @Override
    public float cost(){
        return super.cost() + 0.25f;
    }

}
