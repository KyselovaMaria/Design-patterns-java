package Homework9.Task1;

import java.util.ArrayList;

public class SalesTeam {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void payExpenses() {
        for (Employee employee : employees) {
            employee.payExpenses();
        }
    }
}
