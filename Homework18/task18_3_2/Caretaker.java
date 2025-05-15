package task18_3_2;

import kotlin.Pair;
import java.util.Stack;

public class Caretaker {

    final private Triangle triangle;

    final private Stack<Triangle.Memento> history = new Stack<>();
    final private Stack<Triangle.Memento> redoHistory = new Stack<>();

    private Pair<Triangle.Memento, Float> minSquare;

    public Caretaker(Triangle triangle){
        this.triangle = triangle;
    }

    public void changeSide(String action, float value){
        Triangle.Memento memento = triangle.save(() -> {});
        switch (action) {
            case "a":
                memento = triangle.save(() -> triangle.setA(value));
                triangle.setA(value);
                break;
            case "b":
                memento = triangle.save(() -> triangle.setB(value));
                triangle.setB(value);
                break;
            case "c":
                memento = triangle.save(() -> triangle.setC(value));
                triangle.setC(value);
                break;
            case "duplicateA":
                memento = triangle.save(triangle::duplicateA);
                triangle.duplicateA();
                break;
            case "duplicateB":
                memento = triangle.save(triangle::duplicateB);
                triangle.duplicateB();
                break;
            case "duplicateC":
                memento = triangle.save(triangle::duplicateC);
                triangle.duplicateC();
                break;
            case "halfA":
                memento = triangle.save(triangle::halfA);
                triangle.halfA();
                break;
            case "halfB":
                memento = triangle.save(triangle::halfB);
                triangle.halfB();
                break;
            case "halfC":
                memento = triangle.save(triangle::halfC);
                triangle.halfC();
                break;
        }
        history.push(memento);
        redoHistory.clear();
        if (minSquare == null || triangle.square() < minSquare.getSecond()){
            minSquare = new Pair<>(memento, triangle.square());
        }
    }

    public void undo(){
        if (history.empty()){
            return;
        }
        Triangle.Memento snapshot = history.pop();
        triangle.restore(snapshot);
        redoHistory.push(snapshot);
    }

    public void redo(){
        if (redoHistory.empty()){
            return;
        }
        triangle.redo(redoHistory.pop());
    }

    public void restoreMinSquare(){
        triangle.restore(minSquare.getFirst());
    }


}
