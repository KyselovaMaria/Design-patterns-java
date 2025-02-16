package Homework5.Task2;

import Homework5.Task2.CarParts.Engine;
import Homework5.Task2.CarParts.Transmission;
import Homework5.Task2.CarParts.Wheel;

public class Car {
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheels;
    private String color;

    private String tires;

    public Car(String bodyType, Engine engine, Transmission transmission, Wheel wheels, String color, String tires) {
        this.bodyType = bodyType;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.tires = tires;
    }

    public Car(Car other){
        this.bodyType = other.bodyType;
        this.engine = other.engine.clone();
        this.transmission = other.transmission.clone();
        this.wheels = other.wheels.clone();
        this.color = other.color;
        this.tires = other.tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", tires='" + tires + '\'' +
                '}';
    }

    public Car clone(){
        return new Car(this);
    }
}
