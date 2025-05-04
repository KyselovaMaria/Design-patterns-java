package Homework16.Task3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class DepthFirstIterator implements Iterator<Component> {
    private final Stack<Iterator<Component>> stack = new Stack<>();
    private Component nextComponent;

    public DepthFirstIterator(Component root) {
        stack.push(Collections.singletonList(root).iterator());
        findNextComponent();
    }

    private void findNextComponent() {
        if (stack.isEmpty()) {
            nextComponent = null;
            return;
        }

        Iterator<Component> iterator = stack.peek();
        if (iterator.hasNext()) {
            Component component = iterator.next();
            stack.push(component.getChildren().iterator());
            nextComponent = component;
        } else {
            stack.pop();
            findNextComponent();
        }
    }

    @Override
    public boolean hasNext() {
        return nextComponent != null;
    }

    @Override
    public Component next() {
        Component currentComponent = nextComponent;
        findNextComponent();
        return currentComponent;
    }
}