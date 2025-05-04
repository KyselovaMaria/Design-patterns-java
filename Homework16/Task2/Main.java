package Homework16.Task2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ShopItem pens = new ShopItem("pen", 175);
        ShopItem pencils = new ShopItem("pencil", 0);
        ShopItem paper = new ShopItem("paper", 500);

        Shop shop = new Shop();
        shop.putItem(pens);
        shop.putItem(pencils);
        shop.putItem(paper);

        Iterator<ShopItem> alphabeticalIterator = shop.getAlphabeticalIterator();
        while (alphabeticalIterator.hasNext()) {
            ShopItem item = alphabeticalIterator.next();
            System.out.println(item);
        }

        System.out.println();

        Iterator<ShopItem> quantityIterator = shop.getQuantityIterator();
        while (quantityIterator.hasNext()) {
            ShopItem item = quantityIterator.next();
            System.out.println(item);
        }

    }


}
