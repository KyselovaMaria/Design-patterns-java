package Homework6.Task2.Builders;

import Homework6.Task2.Car;
import Homework6.Task2.CarParts.Engine;
import Homework6.Task2.CarParts.Transmission;
import Homework6.Task2.CarParts.Wheel;

public interface Builder {
    /*
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheels;
    private String color;

    private String tires;

     */

    Builder setBodyType(String bodyType);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setWheels(Wheel wheels);
    Builder setColor(String color);
    Builder setTires(String tires);
    Car build();
}
