import java.util.*;
class toggle
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string");
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);

            if(Character.isUpperCase(ch))
            {
                str.setCharAt(i, Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
                str.setCharAt(i, Character.toUpperCase(ch));;
            }
        }
        System.out.println("Toggled String "+ str.toString());
    }
}