//A very important program because we are building the map to use the function, calling the function in a for 
//loop, converting the charater into the number and vice versa.
//Do a dry run for a better understanding.
import java.util.*;
class keypad
{
    static void combination(String dig,String[]kp,String res)
    {
        if(dig.length() == 0)
        {
            System.out.print(res+" ");
            return ;
        }

        int currnum=dig.charAt(0)-'0';
        String currchoice=kp[currnum];

        for(int i=0; i<currchoice.length(); i++)
        {
            combination(dig.substring(1),kp,res+currchoice.charAt(i));
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        String dig=sc.nextLine();
        String []kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String res=new String();
        combination(dig,kp,res);
    }
}