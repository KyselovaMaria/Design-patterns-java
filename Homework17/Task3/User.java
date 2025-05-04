package Homework17.Task3;

public interface User {
    String getUserId();
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void receiveMessage(String message, String userFrom);
}