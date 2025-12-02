import java.util.*;
class palindrome {
    
    // static String Rev(String s){
    //     StringBuilder sb = new StringBuilder(s);
    //     sb.reverse();
    //     return sb.toString();
    // }

    static String Rev(String s) {
        String rev="";
        for(int i=s.length()-1; i>=0; i--) {
            rev=rev+s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.equals(Rev(s))) {
            System.out.println("Palindrome");
        }
            else {
                System.out.println("Not Palindrome");
        }
    }
}
