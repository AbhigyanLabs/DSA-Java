import java.util.*;
class countpalindrome
    {
        static boolean palindrome(String str)
        {
            int i=0;
            int j=str.length()-1;
            while(i<=j)
            {
                if(str.charAt(i) != str.charAt(j)) return false;

                i++;
                j--;
            }
            return true;
        }

        public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length();i++)
        {
            for(int j=i+1; j<=s.length(); j++)
            {
                if(palindrome(s.substring(i,j)))
                {
                    System.out.print(s.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.print(count);
    }
}