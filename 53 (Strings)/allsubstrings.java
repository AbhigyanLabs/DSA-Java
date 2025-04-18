import java.util.Scanner;

public class allsubstrings 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
            System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}