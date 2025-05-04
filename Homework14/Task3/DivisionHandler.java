package Homework14.Task3;

public class DivisionHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNext(OperationHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(int number1, int number2, String operation) {
        if (operation.equals("/")) {
            if (number2 != 0) {
                int result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(number1, number2, operation);
        } else {
            System.out.println("Unsupported operation: " + operation);
        }
    }
}
