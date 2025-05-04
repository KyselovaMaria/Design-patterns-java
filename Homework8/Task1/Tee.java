package Homework8.Task1;

public class Tee extends Beverage {
    public Tee(int sugar, Filler additive) {
        super(sugar, additive);
    }

    @Override
    public void drink() {
        String result = "Drink ";
        if (additive.getAdditive().equals("water")) {
            System.out.println(result + "black tee!");
        }
        else {
            System.out.println(result + "tee with " + additive.getAdditive() + "!");
        }
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
        System.out.println("Put some " + additive.getAdditive() + " : " + additive.getVolume() + " ml...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return 7 + additive.cost();
    }
}