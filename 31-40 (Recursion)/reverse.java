import java.util.*;
class reverse
{
    static String reverse(String s)
    {
        if(s.length()==0) return "";
        String rev=reverse(s.substring(1));
        return rev+s.charAt(0);
    }

    static String reverse2(String s, int idx)
    {
        if(s.length()==0) return "";
        String rev=reverse2(s, idx+1);
        return rev + s.charAt(idx);

    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string ");
        String s=sc.nextLine();
        System.out.print(reverse(s));
        System.out.print(reverse2(s,0));
    }
}