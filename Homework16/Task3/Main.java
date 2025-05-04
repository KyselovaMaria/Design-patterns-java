package Homework16.Task3;

import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Box root = createBoxHierarchy();

        System.out.println("Depth-First Traversal:");
        Iterator<Component> depthFirstIterator = root.getDepthFirstIterator();
        while (depthFirstIterator.hasNext()) {
            Component component = depthFirstIterator.next();
            component.execute();
        }

        System.out.println();

        System.out.println("Breadth-First Traversal:");
        Iterator<Component> breadthFirstIterator = root.getBreadthFirstIterator();
        while (breadthFirstIterator.hasNext()) {
            Component component = breadthFirstIterator.next();
            component.execute();
        }

        System.out.println();

        Component cheapestItem = root.findCheapestItem();
        System.out.println("Cheapest Item: " + cheapestItem);

        Component mostExpensiveItem = root.findMostExpensiveItem();
        System.out.println("Most Expensive Item: " + mostExpensiveItem);
    }

    private static Box createBoxHierarchy() {
        Random random = new Random();
        Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {
                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                Item item = new Item(name, value);
                box.add(item);
            }
        }

        return root;
    }
}
