package Homework4.Task1.Builders;

import Homework4.Task1.Car;
import Homework4.Task1.CarParts.Engine;
import Homework4.Task1.CarParts.Transmission;
import Homework4.Task1.CarParts.Wheel;

/**
 * Interface for building a car.
 */
public interface Builder {
    Builder setBodyType(String bodyType);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setWheels(Wheel wheels);
    Builder setColor(String color);
    Builder setTires(String tires);
    Car build();
}
