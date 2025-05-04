package Homework14.Task1;

public class GuestAuthenticationHandler extends AuthenticationHandler {
    private static final String GUEST_USERNAME = "guest";

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.Guest;
    }

    @Override
    protected void handleAuthentication(Account account) {
        System.out.println("Guest access provided!");
    }
}
