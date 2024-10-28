import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    private String lastTransaction;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public BankAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount;
        lastTransaction = "Deposited: " + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            lastTransaction = "Withdrawn: " + amount;
        } else {
            lastTransaction = "Withdrawal failed: Insufficient funds";
        }
    }

    public void display() {
        System.out.printf("Account Holder: %s\n", accountHolder);
        System.out.printf("Current Balance: %.2f\n", balance);
        System.out.println("Last Transaction: " + lastTransaction);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name);
        account.deposit(1000);
        account.withdraw(500);
        account.display();
    }
}
