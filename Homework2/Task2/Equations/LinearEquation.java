package Homework2.Task2.Equations;

import java.util.ArrayList;

public class LinearEquation implements EquationInterface{
    protected double b;
    protected double c;

    public LinearEquation(double[] coefficients) {
        this.b = coefficients[0];
        this.c = coefficients[1];
    }


    @Override
    public double[] solve() {
        if(b==0 && c==0){
            throw new ArithmeticException("The equation has an infinite number of roots");
        } else if (b == 0) {
            throw new ArithmeticException("The equation has zero roots");
        }else{
            return new double[]{-c/b};
        }


    }

    @Override
    public void printEquation() {
        System.out.println(b+"x+"+c+"=0");
    }
}
