import java.util.*;

public class tripletsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++)// 1st Number
        {
            for (int j = i + 1; j < arr.length; j++)// 2nd Number
            {
                for (int k = j + 1; k < arr.length; k++)// 3rd Number
                {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.print(i + ",");
                        System.out.print(j + ",");
                        System.out.println(k);
                    }
                }
            }
        }
    }
}