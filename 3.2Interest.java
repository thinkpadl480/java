import java.util.Scanner;

class Interest {
    private double principal;
    private double rate;
    private int period;

    public Interest(double principal, double rate, int period) {
        this.principal = principal;
        this.rate = rate;
        this.period = period;
    }

    public void display() {
        double simpleInterest = (principal * rate * period) / 100;
        double compoundInterest = principal * Math.pow(1 + (rate / 100), period) - principal;

        System.out.printf("Principal: %.2f\n", principal);
        System.out.printf("Rate of Interest: %.2f%%\n", rate);
        System.out.printf("Period: %d years\n", period);
        System.out.printf("Simple Interest: %.2f\n", simpleInterest);
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        int period = scanner.nextInt();

        Interest interest = new Interest(principal, rate, period);
        interest.display();
    }
}
