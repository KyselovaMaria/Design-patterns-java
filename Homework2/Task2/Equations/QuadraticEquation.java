package Homework2.Task2.Equations;

import java.util.ArrayList;

public class QuadraticEquation extends LinearEquation{
    protected double a;

    public QuadraticEquation(double[] coefficients) {
        super(new double[]{coefficients[1],coefficients[2]});
        this.a = coefficients[0];
    }

    @Override
    public double[] solve(){
        if(a==0){
            return super.solve();
        }
        double D = b*b - 4*a*c;
        if(D<0){
            throw new ArithmeticException("The equation has zero roots");
        } else if (D==0) {
            return new double[]{-b/(2*a)};
        }else{
            return new double[]{(-b+Math.sqrt(D)/(2*a)),(-b-Math.sqrt(D)/(2*a))};
        }
    }

    @Override
    public void printEquation() {
        System.out.println(a+"x^2+"+b+"x+"+c+"=0");
    }
}
