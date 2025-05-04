package Homework8.Task2;

public class RadioButton extends Button{

    public RadioButton(Size size) {
        super(size);
    }

    @Override
    void draw() {
        System.out.println("Setting size to " + size.getSize() + "...");
        System.out.println("Drawing a radio button.\n");
    }
}
