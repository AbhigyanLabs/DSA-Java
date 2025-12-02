import java.util.*; 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String result = userInput.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(result);
    }
}