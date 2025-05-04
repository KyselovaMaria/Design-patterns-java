package Homework15.Task2;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.newDocument("blank.txt");

        textEditor.clickSaveButton();
        textEditor.clickPrintButton();
        textEditor.selectSaveMenuItem();
        textEditor.selectPrintMenuItem();
        textEditor.selectShowInfoMenuItem();
        textEditor.pressSaveShortcut();
        textEditor.pressPrintShortcut();
    }
}