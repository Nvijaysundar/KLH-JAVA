package Stack;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        // Create a new Stack
        Stack<Integer> stack = new Stack<>();
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        // Pop elements from the stack
        int element1 = stack.pop(); // Removes and returns 30
        int element2 = stack.pop(); // Removes and returns 20
        // Peek at the top element
        int topElement = stack.peek(); // Returns 10 without removing it
        // Check if the stack is empty
        boolean isEmpty = stack.empty(); // Returns false
        // Search for an element
        int position = stack.search(10); // Returns 1 (distance from top)
        System.out.println("Popped element 1: " + element1);
        System.out.println("Popped element 2: " + element2);
        System.out.println("Top element: " + topElement);
        System.out.println("Is stack empty? " + isEmpty);
        System.out.println("Position of element 10: " + position);
    }
}

