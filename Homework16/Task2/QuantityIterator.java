package Homework16.Task2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class QuantityIterator implements Iterator<ShopItem> {

    private final Iterator<ShopItem> iterator;

    public QuantityIterator(Map<String, ShopItem> items) {
        TreeMap<Integer, ShopItem> sortedItems = new TreeMap<>((a, b) -> b - a);
        for (ShopItem item : items.values()) {
            sortedItems.put(item.getQuantity(), item);
        }
        iterator = sortedItems.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public ShopItem next() {
        return iterator.next();
    }
}