package Homework8.Task1;

public class Coffee extends Beverage {
    final private boolean ifBlack;

    public Coffee(int sugar, Filler additive, boolean ifBlack) {
        super(sugar, additive);
        this.ifBlack = ifBlack;
    }

    @Override
    public void drink() {
        String result = "Drink ";
        if(ifBlack){
            result+= "black";
        }
        result += "coffee";
        if (additive.getAdditive().equals("water")) {
            System.out.println(result + "!");
        }else {
            System.out.println(result + additive.getAdditive() + "!");
        }
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        System.out.println("Put some " + additive.getAdditive() + " : " + additive.getVolume() + " ml...");
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return 10 + additive.cost();
    }
}
