package Homework21.Task2;

public class Calculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(double a, double b) {
        strategy.calculate(a, b);
    }
}
