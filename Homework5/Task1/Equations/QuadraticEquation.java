package Homework5.Task1.Equations;

public class QuadraticEquation extends LinearEquation {
    protected final double a;

    public QuadraticEquation(double[] coefficients) {
        super(new double[]{coefficients[1], coefficients[2]});
        if (coefficients.length != 3) {
            throw new IllegalArgumentException("Quadratic equation must have exactly 3 coefficients.");
        }
        this.a = coefficients[0];
    }

    public QuadraticEquation(QuadraticEquation other) {
        super(other);
        this.a = other.a;
    }

    @Override
    public double[] solve() {
        if (a == 0) {
            return super.solve();
        }

        double D = b * b - 4 * a * c;
        if (D < 0) {
            throw new ArithmeticException("The equation has zero roots.");
        } else if (D == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            double sqrtD = Math.sqrt(D);
            return new double[]{
                    (-b + sqrtD) / (2 * a),
                    (-b - sqrtD) / (2 * a)
            };
        }
    }

    @Override
    public void printEquation() {
        System.out.println(String.format("%.2fx² + %.2fx + %.2f = 0", a, b, c));
    }

    @Override
    public EquationInterface clone() {
        return new QuadraticEquation(this);

    }}