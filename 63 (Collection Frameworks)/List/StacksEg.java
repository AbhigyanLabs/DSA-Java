import java.util.Stack;

public class StacksEg {
    public static void main(String[] args) {
        // 1. Creating a Stack
        Stack<String> stack = new Stack<>();
        System.out.println("Stack Created: " + stack);

        // 2. Pushing elements onto the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("After pushing elements: " + stack);

        // 3. Peeking at the top element
        System.out.println("Top element (peek): " + stack.peek());

        // 4. Popping elements from the Stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After popping: " + stack);

        // 5. Searching for an element
        System.out.println("Position of 'Apple': " + stack.search("Apple")); // Position from top (1-based index)
        System.out.println("Position of 'Cherry': " + stack.search("Cherry")); // -1 (not found)

        // 6. Checking if the Stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 7. Checking the size of the Stack
        System.out.println("Stack size: " + stack.size());

        // 8. Iterating through the Stack using forEach
        System.out.println("Iterating over Stack:");
        stack.forEach(System.out::println);

        // 9. Clearing all elements
        stack.clear();
        System.out.println("After clearing: " + stack);
    }
}
