package Homework3.Task2.Factories;

import Homework3.Task2.Transport.*;


public class HyundaiFactory implements TransportFactory {
    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }
}
