import java.util.Scanner;

class Employee {
    private String name;
    private double baseSalary;
    private static final double BONUS = 500.00; 
    private static final double PERCENTAGE = 10.0; 

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public double calculateBonus() {
        return BONUS;
    }

    public double calculateSalaryWithPercentage(boolean applyPercentage) {
        if (applyPercentage) {
            return baseSalary + (baseSalary * (PERCENTAGE / 100));
        }
        return baseSalary;
    }

    public void display() {
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Base Salary: %.2f\n", baseSalary);
        System.out.printf("Salary with Bonus: %.2f\n", calculateSalary() + calculateBonus());
        System.out.printf("Salary with Percentage: %.2f\n", calculateSalaryWithPercentage(true));
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Base Salary: ");
        double baseSalary = scanner.nextDouble();

        Employee employee = new Employee(name, baseSalary);
        employee.display();
    }
}
