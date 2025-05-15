package task18_3_1.safer;

public class ConcreteMemento implements Memento{

    final private Triangle triangle;
    final private float a;
    final private float b;
    final private float c;

    public ConcreteMemento(Triangle triangle, float a, float b, float c){
        this.triangle = triangle;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void restore() {
        triangle.setState(a, b, c);
    }
}
