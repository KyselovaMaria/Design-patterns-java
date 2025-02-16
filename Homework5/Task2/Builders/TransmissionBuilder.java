package Homework5.Task2.Builders;

import Homework5.Task2.CarParts.Transmission;

public class TransmissionBuilder {
    private boolean isAutomatic;
    private int numberOfGears;

    public TransmissionBuilder setAutomatic(boolean automatic) {
        isAutomatic = automatic;
        return this;
    }

    public TransmissionBuilder setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        return this;
    }

    public Transmission build(){
        return  new Transmission(isAutomatic,numberOfGears);
    }
}
