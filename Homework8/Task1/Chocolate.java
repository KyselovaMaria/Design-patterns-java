package Homework8.Task1;

public class Chocolate extends Beverage {
    public Chocolate(int sugar, Filler additive) {
        super(sugar, additive);
    }


    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        System.out.println("Put some " + additive.getAdditive() + " : " + additive.getVolume() + " ml...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public void drink() {
        String result = "Drink chocolate beverage ";
        if (additive.getAdditive().equals("water")) {
            System.out.println(result +  "!");
        }else {
            System.out.println(result + "with " + additive.getAdditive() + "!");
        }
    }

    @Override
    public int cost() {
        return 15 + additive.cost();
    }
}