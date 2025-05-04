package Homework21.Task2;

public class Add implements Strategy{
    @Override
    public void calculate(double a, double b) {
        System.out.println("a + b = " + (a + b));
    }
}
