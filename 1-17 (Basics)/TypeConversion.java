import java.util.*;
class TypeConversion {
    public static void main(String[] args) {
        // Casting BEFORE division (correct floating-point division)
        float a = (float) 34 / 7;   // 34.0f / 7 → 4.857142857
        System.out.println("Casting before division: " + a);

        // Casting AFTER division (integer division first)
        float b = (float) (34 / 7); // 34 / 7 = 4 (int division), then 4 → 4.0f
        System.out.println("Casting after division: " + b);

        // For comparison using double
        double c = 34.0 / 7;        // double division → more precision
        System.out.println("Using double: " + c);
    }
}