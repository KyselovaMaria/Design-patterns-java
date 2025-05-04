package Homework15.Task3;

public class TVSimulator {
    public static void main(String[] args) {
        Device tv = new Television();

        Command onCommand = new DeviceOnCommand(tv);
        Command offCommand = new DeviceOffCommand(tv);

        RemoteController controller = new RemoteController(onCommand, offCommand);

        controller.deviceOn();
        controller.deviceOff();
    }
}