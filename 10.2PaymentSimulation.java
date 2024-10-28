abstract class Payment {
    public abstract void makePayment(double amount);
    
    public void printReceipt() {
        System.out.println("Payment receipt generated.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Credit Card payment of " + amount + " made.");
    }
}

class PayPalPayment extends Payment {
    public void makePayment(double amount) {
        System.out.println("PayPal payment of " + amount + " made.");
    }
}

public class PaymentSimulation {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        creditCard.makePayment(100.50);
        creditCard.printReceipt();

        System.out.println();

        paypal.makePayment(75.25);
        paypal.printReceipt();
    }
}
