package Homework23.Task2;

import java.util.Random;

public class Saboteur implements Spy{
    @Override
    public void visit(GeneralStaff generalStaff) {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("Saboteur mission success!");
            int amountOfDestroyed = random.nextInt(generalStaff.getSecretPaper()) + 1;
            int amountOfKilled = random.nextInt(generalStaff.getGenerals()) + 1;
            System.out.println("Amount of killed generals: " + amountOfKilled);
            System.out.println("Amount of destroyed secret papers: " + amountOfDestroyed);
            generalStaff.setSecretPaper(generalStaff.getSecretPaper()-amountOfDestroyed);
            generalStaff.setGenerals(generalStaff.getGenerals()-amountOfKilled);
        }else {
            System.out.println("Saboteur mission failed!");
        }
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("Saboteur mission success!");
            int amountOfDestroyedJeeps = random.nextInt(militaryBase.getJeeps()) + 1;
            int amountOfDestroyedTanks = random.nextInt(militaryBase.getTanks()) + 1;
            int amountOfKilledOfficers = random.nextInt(militaryBase.getOfficers()) + 1;
            int amountOfKilledSoldiers = random.nextInt(militaryBase.getSoldiers()) + 1;

            System.out.println("Amount of killed soldiers: " + amountOfKilledSoldiers);
            System.out.println("Amount of killed officers: " + amountOfKilledOfficers);
            System.out.println("Amount of destroyed jeeps: " + amountOfDestroyedJeeps);
            System.out.println("Amount of destroyed tanks: " + amountOfDestroyedTanks);

            militaryBase.setOfficers(militaryBase.getOfficers()-amountOfKilledOfficers);
            militaryBase.setSoldiers(militaryBase.getSoldiers()-amountOfKilledSoldiers);
            militaryBase.setJeeps(militaryBase.getJeeps()-amountOfDestroyedJeeps);
            militaryBase.setTanks(militaryBase.getTanks()-amountOfDestroyedTanks);
        }else {
            System.out.println("Saboteur mission failed!");
        }
    }
}
