package Homework23.Task2;

import java.util.Random;

public class SecretAgent implements Spy {
    @Override
    public void visit(GeneralStaff generalStaff) {
        Random random = new Random();
        if (random.nextBoolean()) {
            int amountOfStolen = random.nextInt(generalStaff.getSecretPaper()) + 1;
            System.out.println("The secret agent did it! He managed to find out about: ");
            System.out.println("Amount of generals: " + generalStaff.getGenerals());
            System.out.println("Amount of secret papers: " + generalStaff.getSecretPaper());
            generalStaff.setSecretPaper(generalStaff.getSecretPaper()-amountOfStolen);
            System.out.println("Was stolen: " + amountOfStolen);
        } else {
            System.out.println("Secret agent mission failed!");
        }
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("The secret agent did it! He managed to find out about: ");
            System.out.println("Amount of officers: " + militaryBase.getOfficers());
            System.out.println("Amount of jeeps: " + militaryBase.getJeeps());
            System.out.println("Amount of tanks: " + militaryBase.getTanks());
            System.out.println("Amount of soldiers: " + militaryBase.getSoldiers());
        }else {
            System.out.println("Secret agent mission failed!");
        }
    }
}
