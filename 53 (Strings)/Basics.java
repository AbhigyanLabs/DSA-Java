import java.util.Scanner;  // Importing Scanner class for user input

class Basics {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for input

        // Declaring a string and printing it
        String str = "College Wallah";
        System.out.println(str);  // Output: College Wallah

        // Taking a full line input from the user
        System.out.println("Enter a string:");
        String a = sc.nextLine();  // Reads the entire line including spaces

        // Declaring another string
        String q = "AbhigyanSingh";

        // Printing user input
        System.out.println("You entered: " + a);

        // Printing the length of the input string
        System.out.println("Length of input string: " + a.length());

        // Handling case where input string is too short to access index 5
        if (a.length() > 5) {
            System.out.println("Character at index 5: " + a.charAt(5));  // Printing the character at index 5
        } else {
            System.out.println("String is too short to access index 5.");
        }

        // Finding and printing the index of character 'y' in string q
        System.out.println("Index of 'y' in 'AbhigyanSingh': " + q.indexOf('y'));

        // Comparing input string 'a' with "q" lexicographically
        int comparisonResult = a.compareTo("q");
        System.out.println("Lexicographical comparison with 'q': " + comparisonResult);

        // Explaining the comparison result
        if (comparisonResult < 0) {
            System.out.println("Your input comes before 'q' in dictionary order.");
        } else if (comparisonResult > 0) {
            System.out.println("Your input comes after 'q' in dictionary order.");
        } else {
            System.out.println("Your input is exactly 'q'.");
        }

        // String manipulation: Changing "Hello" to "Dello"
        String s = "Hello";
        s = "D" + s.substring(1);  // Takes substring from index 1 to end and prefixes 'D'

        System.out.println("Modified string: " + s);  // Output: Dello

    }
}