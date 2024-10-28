class Vehicle {
    public final String getRegistrationStatus() {
        return "Registered.";
    }

    public void printRegistrationDetails(String registrationNumber) {
        System.out.println("Registration Number: " + registrationNumber);
    }
}

class ElectricVehicle extends Vehicle {
    @Override
    public void printRegistrationDetails(String registrationNumber) {
        System.out.println("Electric Vehicle Registration Number: " + registrationNumber);
        System.out.println("Battery Status: Fully Charged");
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        System.out.println(ev.getRegistrationStatus());
        ev.printRegistrationDetails("EV12345");
    }
}
