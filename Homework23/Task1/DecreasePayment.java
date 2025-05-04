package Homework23.Task1;

public class DecreasePayment implements Visitor {
    private final int penalty;

    public DecreasePayment(int penalty) {
        this.penalty = penalty;
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(salesPerson.getSalary() - penalty);
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() - penalty);
    }

    @Override
    public void visit(ItSupport itSupport) {
        itSupport.setSalary(itSupport.getSalary() - penalty);
    }
}
