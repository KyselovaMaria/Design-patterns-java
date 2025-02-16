package Homework4.Task1;

import Homework4.Task1.Builders.Builder;
import Homework4.Task1.Builders.EngineBuilder;
import Homework4.Task1.Builders.TransmissionBuilder;
import Homework4.Task1.Builders.WheelBuilder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Car buildJeep(String color, String tires) {
        Car car = builder.setBodyType("Jeep")
                .setEngine(new EngineBuilder()
                        .setFuelType("Diesel")
                        .setTorque(400)
                        .setVolume(1.8) 
                        .setPower(300)
                        .build())
                .setTransmission(new TransmissionBuilder()
                        .setIsAutomatic(false)
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
        Car car = builder.setBodyType("Sedan")
                .setEngine(new EngineBuilder()
                        .setFuelType("Petrol")
                        .setTorque(350)
                        .setVolume(1.2) 
                        .setPower(200)
                        .build())
                .setTransmission(new TransmissionBuilder()
                        .setIsAutomatic(false)
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
