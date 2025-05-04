package Homework14.Task3;

public class SubtractionHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNext(OperationHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(int number1, int number2, String operation) {
        if (operation.equals("-")) {
            int result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(number1, number2, operation);
        } else {
            System.out.println("Unsupported operation: " + operation);
        }
    }
}
