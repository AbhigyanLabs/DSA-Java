import java.util.*;
class palindrome
{

    //optmized approach
    static boolean palindrome(String s,int b,int e)
    {
        if(b >= e) return true;
        return(s.charAt(b) == s.charAt(e) && palindrome(s,b+1,e-1));
    }

    // Reverse function
    static String rev(String s)
    {
        if(s.length()==0) return "";
        String rev=rev(s.substring(1));
        return rev+s.charAt(0);
    }
 

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string ");
        String s=sc.nextLine();

        //reverse funct use krke
        if(s.equals(rev(s)))
        System.out.println("Palindrome");
        else 
        System.out.println("Not a palindrame string");


        //palindrome
        if(palindrome(s,0,s.length()-1))           //l-1
        System.out.println("Palindrome ");
        else 
        System.out.println("Not palindrome ");
    }
}