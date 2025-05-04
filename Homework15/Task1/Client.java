package Homework15.Task1;

public class Client {
    public static void main(String[] args) {
        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();
        Controller controllerUniversal = new Controller();

        // Налаштування команд для кожного світильника
        Command turnOnKitchenLamp = new TurnOnCommand(kitchenLamp);
        Command turnOffKitchenLamp = new TurnOffCommand(kitchenLamp);

        Command turnOnHallLamp = new TurnOnCommand(hallLamp);
        Command turnOffHallLamp = new TurnOffCommand(hallLamp);

        Command turnOnBedroomLamp = new TurnOnCommand(bedroomLamp);
        Command turnOffBedroomLamp = new TurnOffCommand(bedroomLamp);

        Command turnOnBathroomLamp = new TurnOnCommand(bathroomLamp);
        Command turnOffBathroomLamp = new TurnOffCommand(bathroomLamp);

        // Налаштування команд для універсального контролера
        Command universalOffCommand = () -> {
            controllerKitchenLamp.setCommand(turnOffKitchenLamp);
            controllerHallLamp.setCommand(turnOffHallLamp);
            controllerBedroomLamp.setCommand(turnOffBedroomLamp);
            controllerBathroomLamp.setCommand(turnOffBathroomLamp);

            controllerKitchenLamp.executeCommand();
            controllerHallLamp.executeCommand();
            controllerBedroomLamp.executeCommand();
            controllerBathroomLamp.executeCommand();
        };

        // Виконання команд
        controllerKitchenLamp.setCommand(turnOnKitchenLamp);
        controllerHallLamp.setCommand(turnOnHallLamp);
        controllerBedroomLamp.setCommand(turnOnBedroomLamp);
        controllerBathroomLamp.setCommand(turnOnBathroomLamp);

        controllerKitchenLamp.executeCommand();
        controllerHallLamp.executeCommand();
        controllerBedroomLamp.executeCommand();
        controllerBathroomLamp.executeCommand();

        controllerKitchenLamp.setCommand(turnOffKitchenLamp);
        controllerHallLamp.setCommand(turnOffHallLamp);
        controllerBedroomLamp.setCommand(turnOffBedroomLamp);

        controllerKitchenLamp.executeCommand();
        controllerHallLamp.executeCommand();
        controllerBedroomLamp.executeCommand();

        controllerBedroomLamp.setCommand(turnOnBedroomLamp);
        controllerBathroomLamp.setCommand(turnOnBathroomLamp);

        controllerBedroomLamp.executeCommand();
        controllerBathroomLamp.executeCommand();

        controllerUniversal.setCommand(universalOffCommand);
        controllerUniversal.executeCommand();
    }
}

