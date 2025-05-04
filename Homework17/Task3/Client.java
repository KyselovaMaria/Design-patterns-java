package Homework17.Task3;


public class Client {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        ConcreteUser user1 = new ConcreteUser("User1", chatMediator);
        ConcreteUser user2 = new ConcreteUser("User2", chatMediator);
        ConcreteUser user3 = new ConcreteUser("User3", chatMediator);
        ConcreteUser user4 = new ConcreteUser("User4", chatMediator);

        user1.sendMessageAll("Hello, world!");

        user2.sendMessage("Hello!", "User1");
    }
}
