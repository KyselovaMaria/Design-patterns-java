package Homework6.Task2;

import Homework6.Task2.Builders.CarBuilder;

public class Task2 {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        director.setBuilder(new CarBuilder());

        Car jeep = director.buildJeep("Red", "Winter");
        System.out.println("Original Jeep: " + jeep);

        Car sedan = director.buildSedan("Black", "Summer");
        System.out.println("Original Sedan: " + sedan);
    }
}
