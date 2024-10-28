import java.util.Random;

class Teller extends Thread {
    private String tellerName;

    public Teller(String tellerName) {
        this.tellerName = tellerName;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) { // Each teller processes 5 transactions
            int amount = random.nextInt(1000) + 1; // Random amount between 1 and 1000
            System.out.println(tellerName + " processed transaction of $" + amount);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankTellerSystem {
    public static void main(String[] args) {
        Teller teller1 = new Teller("Teller-1");
        Teller teller2 = new Teller("Teller-2");

        teller1.start();
        teller2.start();
    }
}
