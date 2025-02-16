package Homework2.Task2;

import Homework2.Task2.Equations.EquationInterface;
import Homework2.Task2.Factories.Factory;
import Homework2.Task2.Factories.TypeFactoryDetecter;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<EquationInterface,double[]> one_root = new HashMap<>();

        ArrayList<String[]> inputs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of file in db: ");
        String filename = sc.next();
        try {
            File file = new File("src/Homework2/Task2/db/"+filename);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] input = line.trim().split("\\s+");
                System.out.println(input);
                inputs.add(input);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Information from file was read!");
        TypeFactoryDetecter detecter = new TypeFactoryDetecter();
        for(String[] str:inputs) {
            System.out.println("\n");
            try {
                Factory factory = detecter.type(str);
                EquationInterface equation = factory.createEquation(str);
                System.out.println("Equation has: " + equation.solve().length + " roots: " + Arrays.toString(equation.solve()));
                if (equation.solve().length == 1) {
                    one_root.put(equation, equation.solve());
                }
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n\n\n\n");
        printMax(one_root);
        printMin(one_root);

    }

    public static void printMax(HashMap<EquationInterface,double[]> oneRoot){
        double max = 0;
        for (Map.Entry<EquationInterface, double[]> set :
                oneRoot.entrySet()) {
            double value = set.getValue()[0];
            if(value>max){
                max = value;
            }
        }
        System.out.println("Max value: "+ max);
    }

    public static void printMin(HashMap<EquationInterface,double[]> oneRoot){
        double min = 999999;
        for (Map.Entry<EquationInterface, double[]> set :
                oneRoot.entrySet()) {
            double value = set.getValue()[0];
            if(value<min){
                min = value;
            }
        }
        System.out.println("Min value: "+ min);
    }
}
