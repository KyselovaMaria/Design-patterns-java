package Homework4.Task1.Builders;

import Homework4.Task1.CarParts.Engine;

/**
 * Builder for constructing an engine.
 */
public class EngineBuilder {
    private double power;
    private double volume;
    private double torque;
    private String fuelType;

    public EngineBuilder setPower(double power) {
        this.power = power;
        return this;
    }

    public EngineBuilder setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public EngineBuilder setTorque(double torque) {
        this.torque = torque;
        return this;
    }

    public EngineBuilder setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Engine build() {
        if (fuelType == null) {
            throw new IllegalStateException("Fuel type must be set.");
        }
        return new Engine(power, volume, torque, fuelType);
    }
}
