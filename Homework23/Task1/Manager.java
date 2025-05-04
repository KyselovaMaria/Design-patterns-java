package Homework23.Task1;

public class Manager implements Employee {

    private int salary;

    public Manager(int salary) {
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