package Homework5.Task2;

import Homework5.Task2.Builders.CarBuilder;

public class Task2 {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilder());

        Car jeep = director.buildJeep("Red", "Winter");
        System.out.println("Original Jeep: " + jeep);

        Car jeepClone = jeep.clone();
        System.out.println("Cloned Jeep: " + jeepClone);

        System.out.println("Is the same object? " + (jeep == jeepClone));
        System.out.println("Is the same engine? " + (jeep.clone() == jeepClone.clone()));
    }
}
