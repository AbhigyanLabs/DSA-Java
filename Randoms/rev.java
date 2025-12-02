import java.util.*;

class rev {

    static int[] rev(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = { 345, 456, 345, 768, 54, 45, 87, 4 };
        int res = 0;

        while (n != 0) {
            int temp = n % 10;
            res = (res * 10) + temp;
            n = n / 10;
        }
        System.out.println("The reversed number is " + res);
        System.out.println("The reversed array is " + Arrays.toString(rev(arr)));
    }
}