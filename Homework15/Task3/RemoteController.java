package Homework15.Task3;

public class RemoteController {
    private Command onCommand;
    private Command offCommand;

    public RemoteController(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void deviceOn() {
        onCommand.execute();
    }

    public void deviceOff() {
        offCommand.execute();
    }
}
