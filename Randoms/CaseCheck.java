// import java.util.Scanner;
// public class CaseCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().trim().charAt(0);
//         if(ch>64 && ch<91)
//         {
//             System.out.println("Capital Letter");
//         }
//         else{
//             System.out.println("Small Letter");
//         }
//     }
// }

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Letter");
        } else {
            System.out.println("Not a letter");
        }
    }
}
