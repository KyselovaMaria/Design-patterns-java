package Homework20.Task3;

public class HighState implements State {
    @Override
    public void turnUp(Fan fan) {
        // No change in state
        System.out.println("Fan is already on high");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on medium");
    }
}
