package Homework5.Task1.Equations;

public class LinearEquation implements EquationInterface {
    protected final double b;
    protected final double c;

    public LinearEquation(double[] coefficients) {
        if (coefficients.length != 2) {
            throw new IllegalArgumentException("Linear equation must have exactly 2 coefficients.");
        }
        this.b = coefficients[0];
        this.c = coefficients[1];
    }

    public LinearEquation(LinearEquation other) {
        this.b = other.b;
        this.c = other.c;
    }

    @Override
    public double[] solve() {
        if (b == 0) {
            if (c == 0) {
                throw new ArithmeticException("The equation has an infinite number of roots.");
            } else {
                throw new ArithmeticException("The equation has zero roots.");
            }
        }
        return new double[]{-c / b};
    }

    @Override
    public void printEquation() {
        System.out.println(String.format("%.2fx + %.2f = 0", b, c));
    }

    @Override
    public EquationInterface clone() {
        return new LinearEquation(this);
    }
}
