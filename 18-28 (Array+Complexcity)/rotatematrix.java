import java.util.*;

public class rotatematrix {
    static void transpose(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverse(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            int left = 0;
            int right = c - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr, r, c);
        reverse(arr, r, c);

        System.out.println("The rotated array is ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}