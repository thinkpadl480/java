import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        v.add(10);
        v.add("Hello");
        v.add(3.14);
        System.out.println("Vector after additions: " + v);

        v.remove(1); 
        System.out.println("Vector after removing element at index 1: " + v);

        v.add(1, "World");
        System.out.println("Vector after inserting 'World' at index 1: " + v);

        v.remove(0); // Removes 10
        System.out.println("Vector after removing element at index 0: " + v);
    }
}
