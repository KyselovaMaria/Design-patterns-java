package Homework21.Task2;

public class Task2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new Subtract());
        calculator.calculate(18.5, 13.5);

        calculator.setStrategy(new Multiply());
        calculator.calculate(7.5, 2);

        calculator.setStrategy(new Add());
        calculator.calculate(7.1, 7.9);
    }
}
