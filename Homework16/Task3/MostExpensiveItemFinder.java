package Homework16.Task3;

public class MostExpensiveItemFinder implements ItemFinder {
    private Item mostExpensiveItem;

    @Override
    public void visit(Item item) {
        if (mostExpensiveItem == null || item.getValue() > mostExpensiveItem.getValue()) {
            mostExpensiveItem = item;
        }
    }

    @Override
    public Component getResult() {
        return mostExpensiveItem;
    }
}