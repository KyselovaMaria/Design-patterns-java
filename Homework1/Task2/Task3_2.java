package Homework1.Task2;

public class Task3_2 {
    public static void main(String[] args) {
        ConcreteCreator1 creator1 = new ConcreteCreator1();
        ConcreteCreator2 creator2 = new ConcreteCreator2();
        creator1.someOperation();
        creator2.someOperation();
    }
}
