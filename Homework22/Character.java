package Homework22;

public abstract class Character {

    /**
     * Стратегія захисту та відступу
     */

    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

    public abstract void pickUpWeapon();

    public abstract void defenseAction();

    public abstract void moveToSafety();
}
