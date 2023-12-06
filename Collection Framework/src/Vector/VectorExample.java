package Vector;
import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        // Create a new Vector
        Vector<String> vector = new Vector<>();
        System.out.println("Vector is empty: " + vector.isEmpty()); // Output: false
        System.out.println("Capacity: "+vector.capacity());
        // Add elements to the vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 0: " + vector.get(0)); // Output: Apple
        System.out.println("First element: " + vector.firstElement()); // Output: Apple
        System.out.println("Last element: " + vector.lastElement()); // Output: Cherry

        // Remove an element
        vector.remove(1); // Remove "Banana"

        // Check existence and size
        System.out.println("Contains \"Apple\": " + vector.contains("Apple")); // Output: true
        System.out.println("Vector is empty: " + vector.isEmpty()); // Output: false
        System.out.println("Vector size: " + vector.size()); // Output: 2

        // Iterate over elements
        System.out.println("Elements in the vector:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Clear the vector
        vector.clear();
        System.out.println("Vector size after clearing: " + vector.size()); // Output: 0
    }
}
