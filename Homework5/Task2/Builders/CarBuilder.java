package Homework5.Task2.Builders;

import Homework5.Task2.Car;
import Homework5.Task2.CarParts.Engine;
import Homework5.Task2.CarParts.Transmission;
import Homework5.Task2.CarParts.Wheel;

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
        return new Car(bodyType,engine,transmission,wheels,color,tires);
    }
}
