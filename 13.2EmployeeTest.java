import java.util.Scanner;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private String salary;

    public Employee(String name, String salary) throws InvalidSalaryException {
        this.name = name;
        setSalary(salary);
    }

    public void setSalary(String salary) throws InvalidSalaryException {
        if (salary.isEmpty() || !salary.matches("\\d+")) {
            throw new InvalidSalaryException("Salary must be a non-empty numeric value.");
        }
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        String salary = scanner.nextLine();

        try {
            Employee employee = new Employee(name, salary);
            employee.displayEmployeeDetails();
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
