package Homework5.Task2.CarParts;

public class Engine implements Cloneable {
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

    public Engine(Engine other){
        this.power = other.power;
        this.volume = other.volume;
        this.torque = other.torque;
        this.fuelType = other.fuelType;
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

    @Override
    public Engine clone() {
        return new Engine(this);
    }
}
