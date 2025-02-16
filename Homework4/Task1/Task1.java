package Homework4.Task1;

import Homework4.Task1.Builders.CarBuilder;

public class Task1 {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilder());
        Car jeep = director.buildJeep("red", "winter");
        System.out.println(jeep);
        Car sedan = director.buildSedan("black", "summer");
        System.out.println(sedan);
    }
}
