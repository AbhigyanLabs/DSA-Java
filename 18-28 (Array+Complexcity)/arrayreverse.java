import java.util.*;
public class arrayreverse 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr =new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int [] ans=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            ans [j++]=arr[i];
        }
        System.out.println("The reversed arr is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( ans[i]+" " );
        }
    }   
}