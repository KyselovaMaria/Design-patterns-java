package Homework4.Task1;

import Homework4.Task1.CarParts.Engine;
import Homework4.Task1.CarParts.Transmission;
import Homework4.Task1.CarParts.Wheel;

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
        return String.format(
                "Car{bodyType='%s', engine=%s, transmission=%s, wheels=%s, color='%s', tires='%s'}",
                bodyType, engine, transmission, wheels, color, tires
        );
    }
}
