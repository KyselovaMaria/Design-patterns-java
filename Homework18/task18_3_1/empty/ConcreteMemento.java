package task18_3_1.empty;

import java.util.List;

public class ConcreteMemento implements Memento{

    final private float a;
    final private float b;
    final private float c;

    public ConcreteMemento(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<Float> getState() {
        return List.of(a, b, c);
    }
}
