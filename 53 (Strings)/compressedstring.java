// import java.util.*;
// class compressedstring 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);        
//         System.out.println("Enter the string");
//         String str=sc.nextLine();
//         int n=str.length();
//         int count=1;
//         String ans="" + str.charAt(0);
//         for(int i=1; i<n; i++)
//         {
//             char curr=str.charAt(i);
//             char prev=str.charAt(i-1);

//             if(prev==curr)
//             {
//                 count++;
//             }
//             else
//             {
//                 if(count>1) ans+=count;
//                 count=1;
//                 ans+=curr;
//             }
//         }
//         if(count>1) ans+=count;
//         System.out.println(ans);
//     }
// }





import java.util.*; // Importing Scanner class for taking user input

class compressedstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from the user
        System.out.println("Enter the string"); // Prompting the user to enter a string
        String str = sc.nextLine(); // Reading the input string from the user
        
        int n = str.length(); // Getting the length of the input string
        int count = 1; // Initializing a counter to count occurrences of consecutive characters
        
        // Initializing the answer string with the first character of the input string
        String ans = "" + str.charAt(0); 

        // Looping through the string from the second character to the last
        for (int i = 1; i < n; i++) {
            char curr = str.charAt(i);   // Storing the current character
            char prev = str.charAt(i - 1); // Storing the previous character

            if (prev == curr) { // If the current character is the same as the previous one
                count++; // Increment the count of consecutive occurrences
            } else { // If a different character is encountered
                if (count > 1) ans += count + curr; // If previous character appeared more than once, append the count
                count = 1; // Reset the count for the new character
                //ans += curr; // Append the new character to the answer string
            }
        }
        
        // After the loop, if the last character sequence had more than one occurrence, append its count
        if (count > 1) ans += count;

        System.out.println(ans); // Printing the final compressed string
        sc.close(); // Closing the Scanner to prevent resource leaks
    }
}