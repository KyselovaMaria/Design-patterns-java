package task10_3_1.decorators;

public class BaseDecorator implements Printable{

    final private Printable wrappedString;

    public BaseDecorator(Printable wrappedString) {
        this.wrappedString = wrappedString;
    }

    @Override
    public void print() {
        wrappedString.print();
    }
}
