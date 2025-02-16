package Homework5.Task2.CarParts;

public class Wheel implements Cloneable{
    private int diameter;
    private String material;


    public Wheel(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public Wheel(Wheel other){
        this.diameter = other.diameter;
        this.material = other.material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public Wheel clone() {
        return new Wheel(this);
    }
}
