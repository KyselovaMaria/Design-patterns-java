package Homework17.Task2;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Plane plane = new Plane(123, mediator);
        mediator.addPlaneOnGround(plane);

        plane.takeOff();
    }
}