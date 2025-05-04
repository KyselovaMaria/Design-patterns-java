package Homework15.Task2;

public class TextEditor {
    private Document document;

    private final Button saveButton;
    private final Button printButton;

    private final MenuItem saveMenuItem;
    private final MenuItem printMenuItem;
    private final MenuItem showInfoMenuItem;

    private final Shortcut saveShortcut;
    private final Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button();
        printButton = new Button();

        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();

        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();
    }

    public void newDocument(String name) {
        document = new Document(name);
    }

    public void clickSaveButton() {
        Command command = new ButtonClickCommand(saveButton);
        command.execute();
    }

    public void clickPrintButton() {
        Command command = new ButtonClickCommand(printButton);
        command.execute();
    }

    public void selectSaveMenuItem() {
        Command command = new MenuItemSelectCommand(saveMenuItem);
        command.execute();
    }

    public void selectPrintMenuItem() {
        Command command = new MenuItemSelectCommand(printMenuItem);
        command.execute();
    }

    public void selectShowInfoMenuItem() {
        Command command = new MenuItemSelectCommand(showInfoMenuItem);
        command.execute();
    }

    public void pressSaveShortcut() {
        Command command = new ShortcutPressCommand(saveShortcut);
        command.execute();
    }

    public void pressPrintShortcut() {
        Command command = new ShortcutPressCommand(printShortcut);
        command.execute();
    }
}
