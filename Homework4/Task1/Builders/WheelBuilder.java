package Homework4.Task1.Builders;

import Homework4.Task1.CarParts.Wheel;

/**
 * Builder for constructing a wheel.
 */
public class WheelBuilder {
    private int diameter;
    private String material;

    public WheelBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public WheelBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Wheel build() {
        if (material == null) {
            throw new IllegalStateException("Material must be set.");
        }
        return new Wheel(diameter, material);
    }
}
