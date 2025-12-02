
import java.util.*;

public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operator (+, -, *, /, %, x to exit): ");
            char opr = sc.next().trim().charAt(0);

            if (opr == 'x' || opr == 'X') {
                System.out.println("Exiting calculator...");
                break;
            }

            if (opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%') {
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int ans = 0;

                if (opr == '+') {
                    ans = num1 + num2;
                } else if (opr == '-') {
                    ans = num1 - num2;
                } else if (opr == '*') {
                    ans = num1 * num2;
                } else if (opr == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                } else if (opr == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Answer: " + ans);
            } else {
                System.out.println("Invalid operator.");
            }
        }
    }
}