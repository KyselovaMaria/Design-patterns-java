package Homework3.Task2.Factories;

import Homework3.Task2.Transport.*;


public class VolvoFactory implements TransportFactory {
    @Override
    public Trolleybus createTrolleybus() {
        return new VolvoTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new VolvoBus();
    }

    @Override
    public Tram createTram() {
        return new VolvoTram();
    }
}
