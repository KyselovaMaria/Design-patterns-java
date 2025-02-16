package Homework3.Task2;

import Homework3.Task2.Factories.*;
import Homework3.Task2.Transport.*;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, TransportFactory> factories = new LinkedHashMap<>();
        factories.put("Skoda", new SkodaFactory());
        factories.put("Hyundai", new HyundaiFactory());
        factories.put("Volvo", new VolvoFactory());

        Scanner sc = new Scanner(System.in);
        System.out.print("Input N (distance in km): ");
        int n = sc.nextInt() * 1000;

        System.out.print("Input number of buses: ");
        int buses = sc.nextInt();

        System.out.print("Input number of trolleybuses: ");
        int trolleybuses = sc.nextInt();

        System.out.print("Input number of trams: ");
        int trams = sc.nextInt();

        Map<String, Integer> totalCosts = new HashMap<>();
        for (Map.Entry<String, TransportFactory> entry : factories.entrySet()) {
            String factoryName = entry.getKey();
            TransportFactory factory = entry.getValue();

            int cost = getTotalCost(createTransport(factory, buses, trams, trolleybuses), n);
            totalCosts.put(factoryName, cost);
        }

        findBestOption(totalCosts);
    }

    public static List<Transport> createTransport(TransportFactory factory, int buses, int trams, int trolleybuses) {
        List<Transport> transports = new ArrayList<>();
        for (int i = 0; i < buses; i++) transports.add(factory.createBus());
        for (int i = 0; i < trams; i++) transports.add(factory.createTram());
        for (int i = 0; i < trolleybuses; i++) transports.add(factory.createTrolleybus());

        return transports;
    }

    public static int getTotalCost(List<Transport> transports, int distance) {
        return transports.stream()
                .mapToInt(t -> t.distanceCalculator(distance) + t.getCost())
                .sum();
    }

    public static void findBestOption(Map<String, Integer> totalCosts) {
        int minCost = Collections.min(totalCosts.values());

        List<String> bestFactories = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : totalCosts.entrySet()) {
            if (entry.getValue() == minCost) {
                bestFactories.add(entry.getKey());
            }
        }

        if (bestFactories.size() == 1) {
            System.out.println(bestFactories.get(0) + " is the best!");
        } else {
            System.out.println(String.join(" and ", bestFactories) + " are equal!");
        }
    }
}
