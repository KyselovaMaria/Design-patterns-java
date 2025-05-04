package Homework16.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Component {

    private final int id;
    private final List<Component> children = new ArrayList<>();

    public Box(int id) {
        this.id = id;
    }

    public void add(Component child) {
        children.add(child);
    }

    public void remove(Component child) {
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        System.out.println("Box: " + id);
        for (Component child : children) {
            child.execute();
        }
    }

    public Iterator<Component> getDepthFirstIterator() {
        return new DepthFirstIterator(this);
    }

    public Iterator<Component> getBreadthFirstIterator() {
        return new BreadthFirstIterator(this);
    }

    public Component findCheapestItem() {
        return findItem(new CheapestItemFinder());
    }

    public Component findMostExpensiveItem() {
        return findItem(new MostExpensiveItemFinder());
    }

    private Component findItem(ItemFinder itemFinder) {
        for (Component child : children) {
            if (child instanceof Item) {
                itemFinder.visit((Item) child);
            } else if (child instanceof Box) {
                Component item = ((Box) child).findItem(itemFinder);
                if (item != null) {
                    return item;
                }
            }
        }
        return itemFinder.getResult();
    }
}