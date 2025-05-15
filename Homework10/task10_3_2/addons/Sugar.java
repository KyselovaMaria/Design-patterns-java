package task10_3_2.addons;

import task10_3_2.beverage.Beverage;

public class Sugar extends Addon {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description(){
        return super.description() + " with sugar";
    }

    @Override
    public float cost() {
        return super.cost() + 0.05f;
    }

}
