package Homework2.Task2.Factories;

import Homework2.Task2.Equations.EquationInterface;

public interface Factory {
    EquationInterface createEquation(String[] input);
}
