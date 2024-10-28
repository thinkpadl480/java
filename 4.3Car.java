import java.util.Scanner;

class Car {
    private String type;
    private double mileage;
    private static final double MAINTENANCE_MILEAGE = 10000;

    public Car(String type, double mileage) {
        this.type = type;
        this.mileage = mileage;
        checkMaintenance();
    }

    private void checkMaintenance() {
        if (mileage > MAINTENANCE_MILEAGE) {
            System.out.println("Maintenance Required for " + type);
        } else {
            System.out.println(type + " is in good condition.");
        }
    }
}

public class CarMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Type: ");
        String type = scanner.nextLine();

        System.out.print("Enter Car Mileage: ");
        double mileage = scanner.nextDouble();

        new Car(type, mileage);
    }
}
