package task18_3_1.safer;

import java.util.Stack;

public class Caretaker {

    final private Stack<Memento> history = new Stack<>();

    public void addSnapshot(Memento memento){
        history.push(memento);
    }

    public void undo(){
        if (history.empty()){
            return;
        }
        history.pop().restore();
    }

}
