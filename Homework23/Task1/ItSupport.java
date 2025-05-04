package Homework23.Task1;

public class ItSupport implements Employee {
    private int salary;

    public ItSupport(int salary) {
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
