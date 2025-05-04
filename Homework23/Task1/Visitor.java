package Homework23.Task1;

public interface Visitor {
    void visit(SalesPerson salesPerson);
    void visit(Manager manager);
    void visit(ItSupport itSupport);
}
