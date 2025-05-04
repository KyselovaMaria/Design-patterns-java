package Homework9.Task1;

public class ExpensesClient {
    public static void main(String[] args) {
        Manager manager = new Manager("Jane", 4000);
        SalesTeam team = new SalesTeam();

        team.addEmployee(manager);
        team.addEmployee(new Salesperson("Bob", 3000, manager));
        team.addEmployee(new Salesperson("Saul", 3500, manager));
        team.addEmployee(new Salesperson("Alice", 2700, manager));
        team.addEmployee(new Salesperson("Alex", 2500, manager));

        payTeam(team);
    }

    private static void payTeam(SalesTeam team) {
        System.out.println("Expenses have been requested");
        team.payExpenses();
        System.out.println("Expenses have been paid\n");
    }

}
