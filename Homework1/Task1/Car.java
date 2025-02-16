package Homework1.Task1;

public class Car {

    private Engine engine;
    private Wheel wheel;

    private String model;

    public Car(Engine engine, Wheel wheel, String model) {
        this.engine = engine;
        this.wheel = wheel;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }


    public Wheel getWheel() {
        return wheel;
    }


}
