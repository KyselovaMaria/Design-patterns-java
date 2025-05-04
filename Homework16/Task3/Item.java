package Homework16.Task3;

import java.util.Collections;
import java.util.List;

class Item implements Component {

    private final String name;
    private final int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void execute() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public List<Component> getChildren() {
        return Collections.emptyList();
    }

    public int getValue() {
        return value;
    }
}