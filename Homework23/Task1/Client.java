package Homework23.Task1;

public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new ItSupport(35000));


        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.acceptVisitor(new DecreasePayment(5000));
        System.out.println("Total amount paid to staff after decrease: " + staffList.getSalary());

        staffList.acceptVisitor(new IncreasePayment(10));
        System.out.println("Total amount paid to staff after increase: " + staffList.getSalary());
    }

}