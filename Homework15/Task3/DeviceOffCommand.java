package Homework15.Task3;

public class DeviceOffCommand implements Command {
    private Device device;

    public DeviceOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}