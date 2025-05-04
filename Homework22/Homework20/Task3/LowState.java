package Homework20.Task3;

public class LowState implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on medium");
    }

    @Override
    public void turnDown(Fan fan) {
        // No change in state
        System.out.println("Fan is already on low");
    }
}