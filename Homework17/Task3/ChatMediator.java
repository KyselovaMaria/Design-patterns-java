package Homework17.Task3;


import java.util.ArrayList;
import java.util.List;

public class ChatMediator {
    private final List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessageAll(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message, sender.getUserId());
            }
        }
    }

    public void sendMessage(String message, User sender, String userTo) {
        for (User user : users) {
            if (user.getUserId().equals(userTo)) {
                user.receiveMessage(message, sender.getUserId());
                break;
            }
        }
    }
}
