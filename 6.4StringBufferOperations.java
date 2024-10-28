public class StringBufferModification {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Beautiful World");

        sb.delete(5, 15); // Delete " Beautiful"
        System.out.println("After delete: " + sb);

        sb.replace(6, 11, "Everyone"); // Replace "World" with "Everyone"
        System.out.println("After replace: " + sb);

        System.out.println("Length after modifications: " + sb.length());
    }
}
