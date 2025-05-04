package Homework19;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

    private ArrayList<Observer> observers;
    private final String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
        this.observers = new ArrayList<>();
        Thread thread = new Thread(this::read);
        thread.start();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        System.out.println(line);
        for(Observer observer:observers){
            observer.update(line);
        }
    }
}
