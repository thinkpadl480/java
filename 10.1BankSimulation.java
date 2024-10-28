abstract class BankAccount {
    protected String accountHolderName;
    protected String accountNumber;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public double calculateInterest() {
        return 1000 * INTEREST_RATE; // Example balance
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public double calculateInterest() {
        return 0;
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Alice", "SA123");
        CurrentAccount currentAccount = new CurrentAccount("Bob", "CA456");

        savingsAccount.displayAccountDetails();
        System.out.println("Interest: " + savingsAccount.calculateInterest());
        
        System.out.println();

        currentAccount.displayAccountDetails();
        System.out.println("Interest: " + currentAccount.calculateInterest());
    }
}
