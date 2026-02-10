import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double basicSalary;

    public Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public double calculateGross() {
        return basicSalary + (basicSalary * 0.20) + (basicSalary * 0.15);
    }

    public double calculateNet() {
        double gross = calculateGross();
        return gross - (gross * 0.12) - (gross * 0.10);
    }

    public void showPaySlip() {
        System.out.println("\n=== PAY SLIP ===");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.printf("Basic Salary: $%.2f%n", basicSalary);
        System.out.printf("Gross Salary: $%.2f%n", calculateGross());
        System.out.printf("Net Salary: $%.2f%n", calculateNet());
    }
}

public class Project4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("PAYROLL SYSTEM");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Basic Salary: $");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);
        emp.showPaySlip();

        sc.close();
    }
}
