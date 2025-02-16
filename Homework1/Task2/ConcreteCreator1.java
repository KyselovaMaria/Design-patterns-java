package Homework1.Task2;

public class ConcreteCreator1 extends Creator{
    @Override
    public Product createProduct(){
        return new Product1();
    }
}
