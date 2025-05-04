package Homework8.Task1;

public class Milk implements  Filler{
    private final int volume;

    public Milk(int volume) {
        this.volume = volume;
    }

    @Override
    public int cost() {
        return (int) (volume / 20.0);
    }

    @Override
    public String getAdditive() {
        return "milk";
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
