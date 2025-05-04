package Homework8.Task1;

public class Water implements Filler{
    private final int volume;

    public Water(int volume) {
        this.volume = volume;
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getAdditive() {
        return "water";
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
