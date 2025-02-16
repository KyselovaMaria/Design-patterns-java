package Homework1.Task1;

public class CarBuilder {

    public Car buildcar(int power, float volume, int stage,  int size, String model){
        Engine engine = new Engine(power, volume, stage);
        Wheel wheel = new Wheel(size);
        System.out.println("The car is built");
        return new Car(engine,wheel, model);
    }
}
