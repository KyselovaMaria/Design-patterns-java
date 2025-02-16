package Homework4.Task1.CarParts;

public class Wheel {
    private int diameter;
    private String material;


    public Wheel(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
