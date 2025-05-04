package Homework15.Task1;

public class Lamp {
    private String name;
    private boolean isLightOn;

    public Lamp(String name) {
        this.name = name;
        this.isLightOn = false;
    }

    public void lightOn() {
        if (isLightOn) {
            return;
        }
        System.out.println(name + ": Light is on");
        isLightOn = true;
    }

    public void lightOff() {
        if (!isLightOn) {
            return;
        }
        System.out.println(name + ": Light is off");
        isLightOn = false;
    }
}
