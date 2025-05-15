package task10_3_2;

import task10_3_2.addons.Cream;
import task10_3_2.addons.Milk;
import task10_3_2.addons.MilkCream;
import task10_3_2.addons.Sugar;
import task10_3_2.beverage.Beverage;
import task10_3_2.beverage.DarkRoast;
import task10_3_2.beverage.Decaf;
import task10_3_2.beverage.Espresso;

public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Sugar(new Sugar(new Espresso()));
        System.out.println(espresso);

        Beverage darkRoast = new Sugar(new Sugar(new MilkCream(new DarkRoast())));
        System.out.println(darkRoast);

        Beverage darkRoast2 = new Sugar(new Cream(new DarkRoast()));
        System.out.println(darkRoast2);

        Beverage decaf = new Sugar(new Sugar(new Milk(new Decaf())));
        System.out.println(decaf);

    }
}
