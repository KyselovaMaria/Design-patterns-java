package Homework8.Task2;

public class Canvas {

    public static void main(String[] args) {

        CheckboxButton checkboxButton = new CheckboxButton(new Small());
        checkboxButton.draw();

        RadioButton radioButton = new RadioButton(new Medium());
        radioButton.draw();

        DropdownButton dropdownButton = new DropdownButton(new Large());
        dropdownButton.draw();


    }

}
