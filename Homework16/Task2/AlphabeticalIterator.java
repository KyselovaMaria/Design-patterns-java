package Homework16.Task2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class AlphabeticalIterator implements Iterator<ShopItem> {

    private final Iterator<ShopItem> iterator;

    public AlphabeticalIterator(Map<String, ShopItem> items) {
        TreeMap<String, ShopItem> sortedItems = new TreeMap<>(items);
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
