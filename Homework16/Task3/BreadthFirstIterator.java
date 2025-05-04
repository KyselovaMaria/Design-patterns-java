package Homework16.Task3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstIterator implements Iterator<Component> {
    private final Queue<Component> queue = new LinkedList<>();
    private Component nextComponent;

    public BreadthFirstIterator(Component root) {
        queue.add(root);
        findNextComponent();
    }

    private void findNextComponent() {
        if (queue.isEmpty()) {
            nextComponent = null;
            return;
        }

        Component component = queue.poll();
        nextComponent = component;
        if (component instanceof Box) {
            List<Component> children = ((Box) component).getChildren();
            queue.addAll(children);
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
