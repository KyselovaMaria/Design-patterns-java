package Homework20.Task3;

public class Fan {

    private State state;

    public Fan() {
        state = new LowState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }
}