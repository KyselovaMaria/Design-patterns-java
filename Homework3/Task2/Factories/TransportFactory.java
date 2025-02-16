package Homework3.Task2.Factories;

import Homework3.Task2.Transport.Bus;
import Homework3.Task2.Transport.Tram;
import Homework3.Task2.Transport.Trolleybus;

public interface TransportFactory {
    Trolleybus createTrolleybus();
    Bus createBus();
    Tram createTram();
}
