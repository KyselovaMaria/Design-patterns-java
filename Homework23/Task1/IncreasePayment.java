package Homework23.Task1;

public class IncreasePayment implements Visitor {
    private final float percent;

    public IncreasePayment(int percent) {
        this.percent = percent;
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary((int)(salesPerson.getSalary() * (1 + percent / 100)));
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary((int) (manager.getSalary() * (1 + percent / 100)));
    }

    @Override
    public void visit(ItSupport itSupport) {
        itSupport.setSalary((int)(itSupport.getSalary() * (1 + percent / 100)));
    }
}
