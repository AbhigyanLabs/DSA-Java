import java.util.*;

public class arraylinearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        int e = sc.nextInt();
        int flag = -1, a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (e == arr[i]) {
                flag = 0;
                a = i + 1;
                break; // removing break will give last index of the element that is searched
            }
        }
        if (flag != -1) {
            System.out.println("Element found at index = " + a);
        } else {
            System.out.println("Element not found ");
        }
    }
}