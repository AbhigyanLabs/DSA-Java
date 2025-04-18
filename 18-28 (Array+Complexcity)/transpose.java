import java.util.*;

public class transpose {

    // Transpose any matrix (works for both square and rectangular)
    // Returns a new matrix with dimensions [c][r] (columns become rows)
    static int[][] transpose(int[][] arr, int r, int c) {
        int ans[][] = new int[c][r]; // Transposed matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = arr[i][j]; // Swap row and column indices
            }
        }
        return ans;
    }

    // In-place transpose (works only for square matrices)
    static void inplacetranspose(int[][] arr, int r, int c) {
        // Check for square matrix
        if (r != c) {
            System.out.println("In-place transpose only works on square matrices.");
            return;
        }

        // Swap elements across the diagonal (upper triangle with lower)
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Print the in-place transposed matrix
        System.out.println("The transposed array by swap is ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.println("Enter the dimensions of the array");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Input elements
        System.out.println("Enter the elements of the array");
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print original matrix
        System.out.println("The original array is ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose using new matrix
        int ans[][] = transpose(arr, r, c);
        System.out.println("The transposed array by iteration is ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose in-place (for square matrix only)
        inplacetranspose(arr, r, c);
    }
}