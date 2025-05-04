package Homework15.Task2;

public class ShortcutPressCommand implements Command {
    private Shortcut shortcut;

    public ShortcutPressCommand(Shortcut shortcut) {
        this.shortcut = shortcut;
    }

    @Override
    public void execute() {
        shortcut.press();
    }
}