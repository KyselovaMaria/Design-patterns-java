package task10_3_2.addons;

import task10_3_2.beverage.Beverage;

public class MilkCream extends Addon{

    public MilkCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description(){
        return super.description() + " with milkcream";
    }

    @Override
    public float cost(){
        return super.cost() + 0.3f;
    }

}
