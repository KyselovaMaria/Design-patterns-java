package Homework17.Task2;

import java.util.ArrayList;

public class Mediator {

    private boolean isRunwayAvailable;
    private ArrayList<Plane> planesInFlight;
    private ArrayList<Plane> planesOnGround;

    public Mediator() {
        isRunwayAvailable = true;
        planesInFlight = new ArrayList<>();
        planesOnGround = new ArrayList<>();
    }

    public void setRunwayAvailability(boolean isAvailable) {
        this.isRunwayAvailable = isAvailable;
    }

    public boolean isRunwayAvailable() {
        return isRunwayAvailable;
    }

    public void addPlaneInFlight(Plane plane) {
        planesInFlight.add(plane);
    }

    public void removePlaneInFlight(Plane plane) {
        planesInFlight.remove(plane);
    }

    public void addPlaneOnGround(Plane plane) {
        planesOnGround.add(plane);
    }

    public void removePlaneOnGround(Plane plane) {
        planesOnGround.remove(plane);
    }
}