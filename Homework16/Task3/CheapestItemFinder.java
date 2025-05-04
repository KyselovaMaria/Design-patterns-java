package Homework16.Task3;

public class CheapestItemFinder implements ItemFinder {
    private Item cheapestItem;

    @Override
    public void visit(Item item) {
        if (cheapestItem == null || item.getValue() < cheapestItem.getValue()) {
            cheapestItem = item;
        }
    }

    @Override
    public Component getResult() {
        return cheapestItem;
    }
}