package task10_3_2.addons;

import task10_3_2.beverage.Beverage;

public class Cream extends Addon{

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description(){
        return super.description() + " with cream";
    }

    @Override
    public float cost(){
        return super.cost() + 0.2f;
    }

}
