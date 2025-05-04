package Homework15.Task2;

public class ButtonClickCommand implements Command {
    private Button button;

    public ButtonClickCommand(Button button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
}
