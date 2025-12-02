import java.util.*;
class KthMissing {
    static int findKthPositive(int[] arr, int k) {
        int ans = 0;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 1; k > 0; i++) {
            if (!set.contains(i)) {
                ans = i;
                k--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.err.println(findKthPositive(arr, k));
    }
}