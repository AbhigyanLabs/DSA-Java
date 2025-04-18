// import java.util.*;
// class wordsreverse
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the String");
//         String str=sc.nextLine();
//         str+=" ";
//         String ans="";
//         StringBuilder sb =new StringBuilder("");
//         for(int i=0;i<str.length();i++)
//         {
//             char ch=str.charAt(i);

//             if(ch != ' ')
//             {
//                 sb.append(ch);
//             }
//             else
//             {
//                 sb.reverse();
//                 ans +=sb;
//                 ans +=" ";
//                 sb = new StringBuilder("");
//             }
//         }
//         System.out.println(ans);
//     }
// }


import java.util.*;  // Importing the Scanner class for user input

class WordsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        System.out.println("Enter the String"); // Prompting the user to enter a string
        String str = sc.nextLine(); // Reading the entire line entered by the user

        String ans = ""; // Initializing an empty string to store the final result

        str += " "; // Adding a space at the end to ensure the last word is processed correctly
        String sb = ""; // Temporary string to store characters of a word

        // Looping through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Extracting the current character

            if (ch != ' ') { // Checking if the character is not a space
                sb = ch + sb; // Reversing the word by adding characters in reverse order
            } else {
                ans += sb + " "; // Adding the reversed word to the final answer
                sb = ""; // Resetting sb for the next word
            }
        }

        System.out.println(ans); // Printing the final reversed words string
        sc.close(); // Closing the Scanner to prevent resource leaks
    }
}