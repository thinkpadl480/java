interface Rechargeable {
    void recharge();
}

interface Portable {
    void carry();
}

class SmartPhone implements Rechargeable, Portable {
    public void recharge() {
        System.out.println("Recharging the smartphone.");
    }

    public void carry() {
        System.out.println("Carrying the smartphone.");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.recharge();
        myPhone.carry();
    }
}
