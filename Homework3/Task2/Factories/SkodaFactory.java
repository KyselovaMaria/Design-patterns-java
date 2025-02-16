package Homework3.Task2.Factories;

import Homework3.Task2.Transport.*;


public class SkodaFactory implements TransportFactory {
    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new SkodaBus();
    }

    @Override
    public Tram createTram() {
        return new SkodaTram(); // Исправлено: теперь возвращается SkodaTram, а не VolvoTram
    }
}
