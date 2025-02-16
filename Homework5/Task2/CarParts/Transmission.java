package Homework5.Task2.CarParts;

public class Transmission implements Cloneable{

    private boolean isAutomatic;
    private int numberOfGears;

    public Transmission(boolean isAutomatic, int numberOfGears) {
        this.isAutomatic = isAutomatic;
        this.numberOfGears = numberOfGears;
    }

    public Transmission(Transmission other){
        this.isAutomatic = other.isAutomatic;
        this.numberOfGears = other.numberOfGears;
    }
    @Override
    public String toString() {
        return "Transmission{" +
                "isAutomatic=" + isAutomatic +
                ", numberOfGears=" + numberOfGears +
                '}';
    }

    @Override
    public Transmission clone() {
        return new Transmission(this);
    }
}
