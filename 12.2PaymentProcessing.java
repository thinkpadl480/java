import java.util.Scanner;

class InvalidCardNumberException extends Exception {
    public InvalidCardNumberException(String message) {
        super(message);
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        String cardNumber = scanner.nextLine();

        try {
            processPayment(cardNumber);
            System.out.println("Payment processed successfully.");
        } catch (InvalidCardNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void processPayment(String cardNumber) throws InvalidCardNumberException {
        if (cardNumber.length() < 5) {
            throw new InvalidCardNumberException("Credit card number must be at least 5 digits.");
        }
    }
}
