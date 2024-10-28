class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    protected double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
    }
}

class Programmer extends Employee {
    private String programmingLanguage;

    public Programmer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Bob", 30, 90000, "Java");
        programmer.displayDetails();
    }
}
