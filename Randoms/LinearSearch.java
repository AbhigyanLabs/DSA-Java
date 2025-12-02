import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3, 4, 5, 6, 7 },
                { 8, 88, 34, 56, 56 },
                { 24, 67, 34, 67 }
        };
        int target = 67;
        int[] result = search(arr, target);

        if (result[0] != -1) {
            System.out.println("Found at row " + result[0] + ", column " + result[1]);
        } else {
            System.out.println("Not found");
        }
    }

    static int[] search(int[][] arr, int target) {
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    if(arr[i][j] == target){
                        return new int[] {i,j};
                    }
                }
            }
        return new int[] {-1, -1};
        }
}