import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Substring (from index 2): " + input.substring(2));
        System.out.println("Character at index 3: " + input.charAt(3));
        System.out.println("First occurrence of 'a': " + input.indexOf('a'));
        System.out.println("Replaced 'a' with 'o': " + input.replace('a', 'o'));
        
        String[] words = input.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
