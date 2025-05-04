package Homework14.Task1;

public abstract class AuthenticationHandler {
    private AuthenticationHandler nextHandler;

    public AuthenticationHandler setNext(AuthenticationHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public void authenticate(Account account) {
        if (canHandle(account)) {
            handleAuthentication(account);
        } else if (nextHandler != null) {
            nextHandler.authenticate(account);
        } else {
            System.out.println("Access denied: " + account.getLogin());
        }
    }

    protected abstract boolean canHandle(Account account);
    protected abstract void handleAuthentication(Account account);
}
