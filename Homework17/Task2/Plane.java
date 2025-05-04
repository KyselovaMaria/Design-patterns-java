package Homework17.Task2;

public class Plane {

    private boolean isInTheAir;
    private int id;
    private Mediator mediator;

    public Plane(int id, Mediator mediator) {
        this.id = id;
        isInTheAir = false;
        this.mediator = mediator;
    }

    public void takeOff() {
        if (!isInTheAir && mediator.isRunwayAvailable()) {
            System.out.println("Plane " + id + " is taking off...");
            mediator.removePlaneOnGround(this);
            mediator.addPlaneInFlight(this);
            setIsInTheAir(true);
            mediator.setRunwayAvailability(false);
        }
    }

    public boolean getIsInTheAir() {
        return isInTheAir;
    }

    public void setIsInTheAir(boolean isInTheAir) {
        this.isInTheAir = isInTheAir;
    }

    public int getId() {
        return id;
    }
}