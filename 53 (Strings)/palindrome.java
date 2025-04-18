// Class to check if a given string is a palindrome
import java.util.Scanner;

class palindrome 
{
    //function
    static boolean Palindrome(String str)
    {
        int i=0, j=str.length()-1;

        while(i<=j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) 
    {
       
        // Define the original string
        String str = "aba"; 

        // Create a StringBuilder object initialized with the given string
        StringBuilder st = new StringBuilder(str);
        
        // Reverse the string using StringBuilder's reverse() method
        st.reverse();
        
        // Convert the reversed StringBuilder back to a String
        String rev = st.toString();

        // Compare the original string with the reversed string
        if (str.equals(rev)) { 
            System.out.println("Palindrome"); // If both are equal, it's a palindrome
        } else {
            System.out.println("Not Palindrome"); // Otherwise, it's not a palindrome
        }

        //FUNCTION CALLING
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();

        if(Palindrome(s))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
