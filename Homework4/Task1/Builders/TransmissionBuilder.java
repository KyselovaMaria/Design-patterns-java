package Homework4.Task1.Builders;

import Homework4.Task1.CarParts.Transmission;

public class TransmissionBuilder {
    private boolean isAutomatic;
    private int numberOfGears;

    public TransmissionBuilder setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
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
