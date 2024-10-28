import java.util.Vector;

public class VectorTraversal {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }
        System.out.println("Initial Vector: " + v);
        System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

        v.add(6);
        v.add(7);
        System.out.println("After adding more elements: " + v);
        System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
    }
}
