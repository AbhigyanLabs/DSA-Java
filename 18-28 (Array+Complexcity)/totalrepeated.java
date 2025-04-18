import java.util.*;
public class totalrepeated
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int value=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    value++;
                }
            }
        }
        System.out.println("Reapeated element is ");
        System.out.println(value);
    }
}