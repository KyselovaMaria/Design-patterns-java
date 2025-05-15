package task18_3_1.inner;

import kotlin.Pair;
import java.util.HashMap;
import java.util.Stack;

public class Caretaker {

    final private Triangle triangle;
    final private Stack<Triangle.Memento> history = new Stack<>();
    private Pair<Triangle.Memento, Float> maxSquare;

    public Caretaker(Triangle triangle){
        this.triangle = triangle;
    }

    public void changeSide(String side, float value){
        Triangle.Memento memento = triangle.save();
        history.push(memento);
        if (maxSquare == null || triangle.square() > maxSquare.getSecond()){
            maxSquare = new Pair<>(memento, triangle.square());
        }
        switch (side) {
            case "a":
                triangle.setA(value);
                break;
            case "b":
                triangle.setB(value);
                break;
            case "c":
                triangle.setC(value);
                break;
        }
    }

    public void undo(){
        if (history.empty()){
            return;
        }
        triangle.restore(history.pop());
    }

    public void restoreMaxSquare(){
        triangle.restore(maxSquare.getFirst());
    }


}
