class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Dog Breed: " + breed);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cat Color: " + color);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5, "Labrador");
        Cat cat = new Cat("Whiskers", 3, "Black");

        System.out.println("Dog Details:");
        dog.displayDetails();
        System.out.println();

        System.out.println("Cat Details:");
        cat.displayDetails();
    }
}
