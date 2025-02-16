package Homework1.Task1;

public class CarSimulator {
    private final CarBuilder carBuilder;
    private Car car;

    public CarSimulator() {
        this.carBuilder = new CarBuilder();
    }

    public void buildCar(int power, float volume, int stage,  int size, String model){
        car = carBuilder.buildcar(power, volume, stage,  size, model);
    }

    @Override
    public String toString() {
        return "Car " + car.getModel() + " has engine: power = " + car.getEngine().getPower() +
                ", volume = " + car.getEngine().getVolume() + ", stage = " + car.getEngine().getStage() + "; wheel size = " + car.getWheel().getSize();
    }
}
