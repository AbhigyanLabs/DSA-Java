import java.util.*;

public class pascalstriangle {

    // Function to generate Pascal's Triangle up to 'n' rows
    static int[][] pascal(int n) {
        int[][] ans = new int[n][]; // Create a jagged array with 'n' rows

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];       // Each row has i+1 elements
            ans[i][0] = ans[i][i] = 1;     // First and last elements of each row are 1

            // Fill the inner elements using values from the previous row
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1]; // sum of two values above
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.println("Enter the no. of rows of pascals triangle");
        int n = sc.nextInt();

        // Generate Pascal's Triangle
        int[][] arr = pascal(n);

        // Display the result
        System.out.println("The pascals triangle of " + n + " length is ");
        for (int i = 0; i < n; i++) {
            // Use arr[i].length to handle jagged array (rows of varying length)
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}