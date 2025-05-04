package Homework15.Task2;

public class MenuItemSelectCommand implements Command {
    private MenuItem menuItem;

    public MenuItemSelectCommand(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void execute() {
        menuItem.select();
    }
}