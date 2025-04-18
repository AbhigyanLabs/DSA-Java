import java.util.*;
class removeA
{   
    
    //1-> Without using the idx variable. Just use the substring function.
    static String removeA1(String s)
    {
        //base case
        if(0 == s.length()) return "";

        //rec work
        String ans=removeA1(s.substring(1));

        //String currchar=s.charAt(0);
        //self work
        if(s.charAt(0) == 'a' || s.charAt(0) == 'A') 
        {
            return ans;
        }
        else 
        {
            return s.charAt(0)+ans; //For lasada o/p=lsd  to get dsl simply write ans+s.charAt(idx)
        }
    }


    //2-> Using the idx variable.

    static String removeA(String s, int idx)
    {
        //base case
        if(idx == s.length()) return "";

        //rec work
        String ans=removeA(s,idx+1);

        //self work
        if(s.charAt(idx) == 'a' || s.charAt(idx) == 'A') 
        {
            return ans;
        }
        else 
        {
            return s.charAt(idx)+ans; //For lasada o/p=lsd  to get dsl simply write ans+s.charAt(idx)
        }
    }

    public static void main(String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string ");
        String s=sc.nextLine();
        // System.out.print("Enter the element to be removed");
        // String remove=sc.nextString();
        System.out.println(removeA1(s));
        System.out.print(removeA(s,0));
    }
}