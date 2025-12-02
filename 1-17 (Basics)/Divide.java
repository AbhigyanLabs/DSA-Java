import java.util.*;
class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        float result = (float) num1 / num2;
        System.out.println("The result of division is: " + result);
    }
}