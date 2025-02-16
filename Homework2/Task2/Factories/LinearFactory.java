package Homework2.Task2.Factories;

import Homework2.Task2.Equations.EquationInterface;
import Homework2.Task2.Equations.LinearEquation;

import java.util.Arrays;

public class LinearFactory implements Factory {
    @Override
    public EquationInterface createEquation(String[] input) {
        if (input.length != 2) {
            throw new IllegalArgumentException("Incorrect input");
        }
        double[] coefficients = Arrays.stream(input)
                .mapToDouble(Double::parseDouble)
                .toArray();
        LinearEquation equation = new LinearEquation(coefficients);
        System.out.print("Linear equation was made: ");
        equation.printEquation();
        return equation;
    }
}
