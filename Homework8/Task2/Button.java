package Homework8.Task2;

public abstract class Button {
    protected final Size size;

    public Button(Size size) {
        this.size = size;
    }

    abstract void draw();
}
