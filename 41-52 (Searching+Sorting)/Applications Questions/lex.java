import java.util.*;

class lex {
    
    // Method to sort the array lexicographically
    static void lexicographical(String[] fruits) {
        int n = fruits.length;
        
        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            String temp = fruits[i];
            fruits[i] = fruits[minIdx];
            fruits[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Asking for number of fruits
        System.out.print("Enter the number of fruits: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Edge case: If no fruits are entered
        if (n <= 0) {
            System.out.println("No fruits to sort.");
            return;
        }

        String[] arr = new String[n];
        
        // Input the fruit names
        System.out.println("Enter the names of fruits:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Sort the fruits array lexicographically
        lexicographical(arr);

        // Output the sorted fruit names
        System.out.println("Sorted fruits in lexicographical order: ");
        System.out.println(Arrays.toString(arr));
    }
}
