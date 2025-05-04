package Homework15.Task3;

public class DeviceOnCommand implements Command {
    private Device device;

    public DeviceOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}