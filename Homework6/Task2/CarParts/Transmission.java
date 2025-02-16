package Homework6.Task2.CarParts;

public class Transmission {

    private boolean isAutomatic;
    private int numberOfGears;

    public Transmission(boolean isAutomatic, int numberOfGears) {
        this.isAutomatic = isAutomatic;
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "isAutomatic=" + isAutomatic +
                ", numberOfGears=" + numberOfGears +
                '}';
    }
}
