package Homework6.Task2;

import Homework6.Task2.Builders.Builder;
import Homework6.Task2.Builders.EngineBuilder;
import Homework6.Task2.Builders.TransmissionBuilder;
import Homework6.Task2.Builders.WheelBuilder;

public class Director {
    private static volatile Director instance;
    private Builder builder;

    private Director() {}

    public static Director getInstance() {
        if (instance == null) {
            synchronized (Director.class) {
                if (instance == null) {
                    instance = new Director();
                }
            }
        }
        return instance;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Car buildJeep(String color, String tires) {
        if (builder == null) {
            throw new IllegalStateException("Builder is not set!");
        }

        Car car = builder.setBodyType("Jeep")
                .setEngine(new EngineBuilder()
                        .setFuelType("Diesel")
                        .setTorque(400)
                        .setVolume(1.8)
                        .setPower(300)
                        .build())
                .setTransmission(new TransmissionBuilder()
                        .setAutomatic(false)
                        .setNumberOfGears(6)
                        .build())
                .setWheels(new WheelBuilder()
                        .setDiameter(22)
                        .setMaterial("Alloy")
                        .build())
                .setColor(color)
                .setTires(tires)
                .build();

        System.out.println("Jeep was built");
        return car;
    }

    public Car buildSedan(String color, String tires) {
        if (builder == null) {
            throw new IllegalStateException("Builder is not set!");
        }

        Car car = builder.setBodyType("Sedan")
                .setEngine(new EngineBuilder()
                        .setFuelType("Petrol")
                        .setTorque(350)
                        .setVolume(1.2)
                        .setPower(200)
                        .build())
                .setTransmission(new TransmissionBuilder()
                        .setAutomatic(false)
                        .setNumberOfGears(5)
                        .build())
                .setWheels(new WheelBuilder()
                        .setDiameter(16)
                        .setMaterial("Alloy")
                        .build())
                .setColor(color)
                .setTires(tires)
                .build();

        System.out.println("Sedan was built");
        return car;
    }
}
