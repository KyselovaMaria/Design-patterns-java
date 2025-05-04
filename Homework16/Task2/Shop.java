package Homework16.Task2;

import java.util.HashMap;
import java.util.Iterator;

class Shop {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item) {
        items.put(item.getName(), item);
    }

    public Iterator<ShopItem> getAlphabeticalIterator() {
        return new AlphabeticalIterator(items);
    }

    public Iterator<ShopItem> getQuantityIterator() {
        return new QuantityIterator(items);
    }
}