package Homework8.Task2;

public class ImageButton extends Button{

    public ImageButton(Size size) {
        super(size);
    }

    @Override
    void draw() {
        System.out.println("Setting size to " + size.getSize() + "...");
        System.out.println("Drawing an image button.\n");
    }
}
