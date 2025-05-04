package Homework16.Task1;

public class Main {

    public static void main(String[] args) {

        Employee pasha = new Employee("Pasha");
        Employee karina = new Employee("Karina");
        Employee dima = new Employee("Dima");

        StaffList staffList = new StaffList();
        staffList.addEmployee(pasha);
        staffList.addEmployee(karina);
        staffList.addEmployee(dima);

        for (Employee employee : staffList){
            System.out.println(employee);
        }

    }

}