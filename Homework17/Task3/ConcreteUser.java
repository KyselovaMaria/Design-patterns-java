package Homework17.Task3;



public class ConcreteUser implements User {
    private final String userId;
    private final ChatMediator chatMediator;

    public ConcreteUser(String userId, ChatMediator chatMediator) {
        this.userId = userId;
        this.chatMediator = chatMediator;
        this.chatMediator.addUser(this);
    }

    @Override
    public void sendMessageAll(String message) {
        chatMediator.sendMessageAll(message, this);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        chatMediator.sendMessage(message, this, userTo);
    }

    @Override
    public void receiveMessage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }

    @Override
    public String getUserId() {
        return userId;
    }
}