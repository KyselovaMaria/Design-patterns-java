package Homework1.Task1;

public class Engine {
    private  int power;
    private float volume;
    private int stage;

    public Engine(int power, float volume, int stage) {
        this.power = power;
        this.volume = volume;
        this.stage = stage;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
