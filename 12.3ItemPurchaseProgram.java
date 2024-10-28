import java.util.Scanner;

public class ItemPurchaseProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items to purchase: ");
        try {
            int items = Integer.parseInt(scanner.nextLine());
            System.out.println("You are purchasing " + items + " items.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } finally {
            System.out.println("System is ready for the next customer.");
            scanner.close();
        }
    }
}
