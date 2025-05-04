package Homework16.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class StaffIterator implements Iterator<Employee> {
    private int position = 0;
    private ArrayList<Employee> employees;

    public StaffIterator(ArrayList<Employee> employees) {
        this.employees = employees;
        this.employees.sort(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER));
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        if (hasNext()) {
            return employees.get(position++);
        }
        return null;
    }
}
