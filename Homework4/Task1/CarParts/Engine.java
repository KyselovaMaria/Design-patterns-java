package Homework4.Task1.CarParts;

public class Engine {
    private double power;
    private double volume;
    private double torque;
    private String fuelType;

    public Engine(double power, double volume, double torque, String fuelType) {
        this.power = power;
        this.volume = volume;
        this.torque = torque;
        this.fuelType = fuelType;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                ", torque=" + torque +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
