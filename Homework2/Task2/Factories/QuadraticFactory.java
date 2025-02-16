package Homework2.Task2.Factories;

import Homework2.Task2.Equations.EquationInterface;
import Homework2.Task2.Equations.LinearEquation;
import Homework2.Task2.Equations.QuadraticEquation;

import java.util.Arrays;

public class QuadraticFactory implements Factory {
    @Override
    public EquationInterface createEquation(String[] input) {
        if (input.length != 3) {
            throw new IllegalArgumentException("Incorrect input");
        }
        double[] coefficients = Arrays.stream(input)
                .mapToDouble(Double::parseDouble)
                .toArray();
        QuadraticEquation equation = new QuadraticEquation(coefficients);
        System.out.print("Quadratic equation was made: ");
        equation.printEquation();
        return equation;
    }
}
