package Homework4.Task1.Builders;

import Homework4.Task1.Car;
import Homework4.Task1.CarParts.Engine;
import Homework4.Task1.CarParts.Transmission;
import Homework4.Task1.CarParts.Wheel;

/**
 * Builder for constructing a car.
 */
public class CarBuilder implements Builder {
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheels;
    private String color;
    private String tires;

    @Override
    public Builder setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setWheels(Wheel wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder setTires(String tires) {
        this.tires = tires;
        return this;
    }

    @Override
    public Car build() {
        if (bodyType == null || engine == null || transmission == null || wheels == null || color == null || tires == null) {
            throw new IllegalStateException("All car parts must be initialized before building.");
        }
        return new Car(bodyType, engine, transmission, wheels, color, tires);
    }
}
