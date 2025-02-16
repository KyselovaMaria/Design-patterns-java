package Homework3.Task2.Transport;

public class Bus implements Transport{
    protected int cost;
    protected int costOfTransportOperation;

    public Bus(int cost, int costOfTransportOperation) {
        this.cost = cost;
        this.costOfTransportOperation = costOfTransportOperation;
    }

    @Override
    public int distanceCalculator(int n) {
        return n * costOfTransportOperation;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public int getCostOfTransportOperation() {
        return costOfTransportOperation;
    }
}
