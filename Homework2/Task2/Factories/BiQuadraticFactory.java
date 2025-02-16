package Homework2.Task2.Factories;

import Homework2.Task2.Equations.BiQuadraticEquation;
import Homework2.Task2.Equations.EquationInterface;
import Homework2.Task2.Equations.QuadraticEquation;

import java.util.Arrays;

public class BiQuadraticFactory implements Factory{
    @Override
    public EquationInterface createEquation(String[] input) {
        if (input.length != 5) {
            throw new IllegalArgumentException("Incorrect input");
        }
        double[] coefficients = Arrays.stream(input)
                .mapToDouble(Double::parseDouble)
                .toArray();
        BiQuadraticEquation equation = new BiQuadraticEquation(coefficients);
        System.out.print("BiQuadratic equation was made: ");
        equation.printEquation();
        return equation;
    }
}
