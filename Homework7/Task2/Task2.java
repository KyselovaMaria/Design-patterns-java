package Homework7.Task2;

import Homework7.Task2.UkrainianCustom.Auto;
import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class Task2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);
        System.out.println(calculator.calculatePrice());

        Adapter adapter = new Adapter(38.5f,0.2f);
        Auto auto = new Auto(5, "Audi", false, 100_000);
        System.out.println("Price in UAH = "+adapter.vehiclePrice(auto));
        System.out.println("Tax = "+adapter.tax(auto));
    }
}
