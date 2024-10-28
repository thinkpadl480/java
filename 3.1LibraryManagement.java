import java.util.Scanner;

class Library {
    private String personID;
    private String libraryCardNumber;
    private String bookName;
    private String bookAuthor;
    private int duration; // in days
    private final double borrowingFee = 2.00; // fee per day
    private final double lateFee = 1.00; // late fee per day

    public Library(String personID, String libraryCardNumber, String bookName, String bookAuthor, int duration) {
        this.personID = personID;
        this.libraryCardNumber = libraryCardNumber;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.duration = duration;
    }

    public void calculateFees(int actualDuration) {
        double totalFee = borrowingFee * duration;
        double lateFeeAmount = (actualDuration > duration) ? (actualDuration - duration) * lateFee : 0;

        System.out.printf("Person ID: %s\n", personID);
        System.out.printf("Library Card Number: %s\n", libraryCardNumber);
        System.out.printf("Book Name: %s\n", bookName);
        System.out.printf("Author: %s\n", bookAuthor);
        System.out.printf("Duration: %d days\n", duration);
        System.out.printf("Total Borrowing Fee: %.2f\n", totalFee);
        System.out.printf("Total Late Fee: %.2f\n", lateFeeAmount);
        System.out.printf("Total Fee Due: %.2f\n", totalFee + lateFeeAmount);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Person ID: ");
        String personID = scanner.nextLine();

        System.out.print("Enter Library Card Number: ");
        String libraryCardNumber = scanner.nextLine();

        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Enter Duration (in days): ");
        int duration = scanner.nextInt();

        System.out.print("Enter Actual Duration (in days): ");
        int actualDuration = scanner.nextInt();

        Library library = new Library(personID, libraryCardNumber, bookName, bookAuthor, duration);
        library.calculateFees(actualDuration);
    }
}
