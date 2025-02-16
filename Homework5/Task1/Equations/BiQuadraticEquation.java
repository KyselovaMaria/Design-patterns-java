package Homework5.Task1.Equations;

public class BiQuadraticEquation extends QuadraticEquation {
    private final double near_x4;
    private final double near_x3;

    public BiQuadraticEquation(double[] coefficients) {
        super(new double[]{coefficients[2], coefficients[3], coefficients[4]});
        if (coefficients.length != 5) {
            throw new IllegalArgumentException("BiQuadratic equation must have exactly 5 coefficients.");
        }
        this.near_x4 = coefficients[0];
        this.near_x3 = coefficients[1];
    }

    public BiQuadraticEquation(BiQuadraticEquation other) {
        super(other);
        this.near_x4 = other.near_x4;
        this.near_x3 = other.near_x3;
    }

    @Override
    public double[] solve() {
        if (near_x3 != 0) {
            throw new IllegalArgumentException("BiQuadratic equations must not have an x³ term.");
        }

        if (near_x4 == 0) {
            return super.solve();
        }

        double D = b * b - 4 * a * c;
        if (D < 0) {
            throw new ArithmeticException("The equation has zero roots.");
        }

        double sqrtD = Math.sqrt(D);
        double t1 = (-b + sqrtD) / (2 * a);
        double t2 = (-b - sqrtD) / (2 * a);

        return computeBiQuadraticRoots(t1, t2);
    }

    private double[] computeBiQuadraticRoots(double t1, double t2) {
        if (t1 < 0 && t2 < 0) {
            throw new ArithmeticException("The equation has zero roots.");
        }

        double[] roots;
        if (t1 >= 0 && t2 >= 0) {
            roots = new double[]{Math.sqrt(t1), -Math.sqrt(t1), Math.sqrt(t2), -Math.sqrt(t2)};
        } else if (t1 >= 0) {
            roots = new double[]{Math.sqrt(t1), -Math.sqrt(t1)};
        } else {
            roots = new double[]{Math.sqrt(t2), -Math.sqrt(t2)};
        }
        return roots;
    }

    @Override
    public void printEquation() {
        System.out.println(String.format("%.2fx⁴ + %.2fx² + %.2f = 0", near_x4, a, c));
    }

    @Override
    public EquationInterface clone() {
        return new BiQuadraticEquation(this);
    }
}
