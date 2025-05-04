package Homework16.Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class StaffList implements Iterable<Employee>{

    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new StaffIterator(employees);
    }
}