package Homework7.Task2;

import Homework7.Task2.UkrainianCustom.Auto;
import Homework7.Task2.UkrainianCustom.Customs;
import com.vehiclecalculator.*;

import static java.lang.Float.parseFloat;


public class Adapter implements Customs {

    private float currencyRate;
    private float taxRate;

    public Adapter(float currencyRate, float taxRate) {
        this.currencyRate = currencyRate;
        this.taxRate = taxRate;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle vehicle;
        VehicleCalculator vehicleCalculator;
        if(auto.model.equals("truck")){
            vehicle = new Truck(auto.age, auto.mileage);
            vehicleCalculator = new TruckCalculator();

        }else{
            float damaged=0.2f;
            if(auto.damaged){
                damaged=0.8f;
            }
            vehicle = new Car(auto.age, auto.model, damaged);
            vehicleCalculator = new CarCalculator();
        }
        vehicleCalculator.setVehicle(vehicle);
        String priceInUsd = vehicleCalculator.calculatePrice();
        priceInUsd = priceInUsd.substring(0,priceInUsd.length()-3);
        return parseFloat(priceInUsd)*currencyRate;
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto)*taxRate;
    }
}
