package Homework21.Task1;

public class Task1 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setStrategy(new ApplePay());
        customer.pay(100);

        customer.setStrategy(new BankAccount());
        customer.pay(200);

        customer.setStrategy(new PayPal());
        customer.pay(300);
    }

}
