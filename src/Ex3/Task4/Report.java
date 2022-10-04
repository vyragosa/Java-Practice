package Ex3.Task4;

import java.util.Scanner;

public class Report {
    private Employee[] employees;

    public Report() {
        System.out.println("Enter amount of employees:");
        Scanner scanner = new Scanner(System.in);
        employees = new Employee[scanner.nextInt()];
        System.out.println("Enter amount of employees info:");
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(scanner.next(), scanner.nextDouble());
        }
    }

    public void generateReport() {
        System.out.println("------------------------Generated report-------------------------");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%1$-32s %2$32.2f %n", employees[i].getFullName(), employees[i].getSalary());
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
