import java.util.*;
import java.text.DecimalFormat;

public class WaterResource {

    static double TWO_PI = 6.2831;
    static int n;
    static int[] A, B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];
        B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        List<Double> peaks = findPeaks();
        if (peaks.size() < 2) {
            System.out.println(1);
            sc.close();
            return;
        }
        double maxWidth = -1;
        int valleyIndex = 1;
        for (int i = 0; i < peaks.size() - 1; i++) {
            double width = peaks.get(i + 1) - peaks.get(i);
            if (width > maxWidth) {
                maxWidth = width;
                valleyIndex = i + 1;
            }
        }
        System.out.println(valleyIndex);
        sc.close();
    }

    static double func(double x) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.sin(A[i] * x + B[i]);
        }
        return sum;
    }

    static List<Double> findPeaks() {
        List<Double> peaks = new ArrayList<>();
        double step = 0.0001;
        double prev = func(0);
        double curr = func(step);
        double next;
        for (double x = step * 2; x <= TWO_PI + step; x += step) {
            next = func(x);
            if (curr > prev && curr > next) {
                peaks.add(round4(x - step));
            }
            prev = curr;
            curr = next;
        }
        return peaks;
    }

    static double round4(double val) {
        return Math.round(val * 10000.0) / 10000.0;
    }
}