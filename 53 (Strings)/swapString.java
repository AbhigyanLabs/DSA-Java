import java.util.*;
class swapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s1");
        String s1 = sc.nextLine();
        System.out.println("Enter s2");
        String s2 = sc.nextLine();
        int l1 = s1.length();

        String s3 = s1 + s2;
        s1 = s3.substring(s1.length());
        s2 = s3.substring(0, l1);

        System.out.println("s1 is now " + s1);
        System.out.println("s2 is now " + s2);
    }
}