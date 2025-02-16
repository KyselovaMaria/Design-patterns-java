package Homework1.Task2;
import java.util.Random;


public class Creator {
    public void someOperation() {
        Product product = createProduct();
        product.doSomething();
    }

    protected Product createProduct(){
        Random random = new Random();
        if(random.nextBoolean()){
            return new Product1();
        }else {
            return new Product2();
        }
    }
}
