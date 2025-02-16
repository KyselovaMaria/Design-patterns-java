package Homework5.Task1;

import Homework5.Task1.Equations.BiQuadraticEquation;
import Homework5.Task1.Equations.EquationInterface;
import Homework5.Task1.Equations.LinearEquation;
import Homework5.Task1.Equations.QuadraticEquation;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<EquationInterface> equations = new ArrayList<>();

        equations.add(new LinearEquation(new double[]{4, -8}));  // 4x - 8 = 0
        equations.add(new QuadraticEquation(new double[]{1, 2, 1}));  // x^2 + 2x + 1 = 0
        equations.add(new BiQuadraticEquation(new double[]{1, 0, 0, 0, -1}));  // x^4 - 1 = 0


        ArrayList<EquationInterface> clones = new ArrayList<>();
        for (EquationInterface eq : equations) {
            clones.add(eq.clone());
        }


        equations.addAll(clones);


        for (EquationInterface eq : equations) {
            eq.printEquation();
            try {
                double[] solutions = eq.solve();
                System.out.print("Roots: ");
                for (double root : solutions) {
                    System.out.printf("%.2f ", root);
                }
                System.out.println("\n----------------------");
            } catch (ArithmeticException e) {
                System.out.println("No real solutions: " + e.getMessage());
                System.out.println("----------------------");
            }
        }
    }
}
