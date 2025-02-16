package Homework2.Task1;

import Homework2.Task1.Drinks.Drink;
import Homework2.Task1.Tools.*;


import java.util.ArrayList;
import java.util.Random;

public class MechMatMall {
    private double revenue;
    private double expenses;
    private double netProfit;
    private final ArrayList<Drink> selledDrinks;
    private final CoffeeMachine coffeeMachine;
    private final Kettle kettle;
    public MechMatMall() {
        this.revenue = 0;
        this.expenses = 0;
        this.netProfit = 0;
        this.selledDrinks = new ArrayList<>();
        coffeeMachine = new CoffeeMachine();
        kettle = new Kettle();
    }

    public double randomSugar(){
        return (int)(Math.random() * 4);
    }
    public void session(int orderQuantity){
        for(int i = 0 ; i<orderQuantity;i++){
            Random random = new Random();
            if(random.nextBoolean()){
                if(random.nextBoolean()){
                    selledDrinks.add(kettle.makeDrink(KettleDrinks.FILTERCOFFEE,randomSugar()));
                }else {
                    selledDrinks.add(kettle.makeDrink(KettleDrinks.TEA,randomSugar()));
                }
            }else {
                int type = (int)(Math.random() * 4);
                if(type==0){
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.AMERICANO,randomSugar()));
                } else if (type==1) {
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.ESPRESSO,randomSugar()));
                }else if (type==2) {
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.LATTE,randomSugar()));
                }else{
                    selledDrinks.add(coffeeMachine.makeDrink(CoffeeMachineDrinks.CAPPUCCINO,randomSugar()));
                }
            }
        }

    }

    public void output(){
        System.out.println("\n\n\n");

        for(Drink drink:selledDrinks){
            revenue+=drink.getSellingPrice();
            expenses+=drink.getPrimePrice();
        }
        netProfit = revenue-expenses;
        System.out.println("Total revenue: "+ revenue);
        System.out.println("Total expenses: "+ expenses);
        System.out.println("Pure profit: " + netProfit);
    }
}
