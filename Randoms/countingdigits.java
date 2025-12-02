import java.util.*;

class CountingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // Input number
        int x = sc.nextInt();       // Digit to count

        int count = 0;
        while (n > 0) {
            int d = n % 10;
            if (d == x) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}