package Homework23.Task1;

public class SalesPerson implements Employee {

    private int salary;

    public SalesPerson(int salary) {
        this.salary = salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }

}