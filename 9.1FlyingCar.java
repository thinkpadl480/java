interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

class FlyingCar implements Drivable, Flyable {
    public void drive() {
        System.out.println("Driving on the road.");
    }

    public void fly() {
        System.out.println("Flying in the sky.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        FlyingCar myFlyingCar = new FlyingCar();
        myFlyingCar.drive();
        myFlyingCar.fly();
    }
}
