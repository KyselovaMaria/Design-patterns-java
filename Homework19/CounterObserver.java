package Homework19;

import java.util.regex.Pattern;

public class CounterObserver implements Observer{
    private final Pattern pattern = Pattern.compile("\\s+");
    private int counter = 0;

    @Override
    public void update(String line) {
        String[] words = pattern.split(line);
        counter += words.length;
    }

    public int getCounter(){
        return counter;
    }
}
