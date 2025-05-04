package Homework21.Task1;

public class ApplePay implements Strategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from apple pay");
    }
}
