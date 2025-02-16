package Homework6.Task2;

import Homework6.Task2.CarParts.Engine;
import Homework6.Task2.CarParts.Transmission;
import Homework6.Task2.CarParts.Wheel;

public class Car {
    private final String bodyType;
    private final Engine engine;
    private final Transmission transmission;
    private final Wheel wheels;
    private final String color;
    private final String tires;

    public Car(String bodyType, Engine engine, Transmission transmission, Wheel wheels, String color, String tires) {
        this.bodyType = bodyType;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.tires = tires;
    }

    @Override
    public String toString() {
        return String.format("Car{bodyType='%s', %s, %s, %s, color='%s', tires='%s'}",
                bodyType, engine, transmission, wheels, color, tires);
    }
}
