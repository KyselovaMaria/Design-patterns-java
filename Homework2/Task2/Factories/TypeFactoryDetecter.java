package Homework2.Task2.Factories;

public class TypeFactoryDetecter {
    public Factory type(String[] input){
        if(input.length==5){
            return new BiQuadraticFactory();
        } else if (input.length==3) {
            return new QuadraticFactory();
        } else if (input.length==2) {
            return new LinearFactory();
        }else{
            throw new IllegalArgumentException("Incorrect input");
        }
    }
}
