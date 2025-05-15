package task10_3_1.decorators;

public class PrintableString implements Printable {
    private final String base;   // if will be public we have substitute object with another class

    public PrintableString(String base) {
        this.base = base;
    }

    public void print() {
        System.out.print(base);
    }

}
